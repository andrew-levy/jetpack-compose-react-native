package com.jetpackcomposereactnative.codegen.extractor

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getVisibility
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.KSTypeParameter
import com.google.devtools.ksp.symbol.KSValueParameter
import com.google.devtools.ksp.symbol.Nullability
import com.google.devtools.ksp.symbol.Origin
import com.google.devtools.ksp.symbol.Visibility
import com.google.devtools.ksp.symbol.Variance
import com.google.gson.Gson
import com.google.gson.JsonParser
import java.io.File

class ComposeApiExtractorProvider : SymbolProcessorProvider {
  override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
    val inventory = File(environment.options.getValue("inventoryPath")).reader().use {
      JsonParser.parseReader(it).asJsonObject
    }
    fun packages(key: String) = inventory.getAsJsonArray(key).map { it.asString }
    return ComposeApiExtractor(
      environment.codeGenerator, environment.logger, packages("composePackages"), packages("modifierPackages")
    )
  }
}

private class ComposeApiExtractor(
  private val generator: CodeGenerator,
  private val logger: KSPLogger,
  private val packages: List<String>,
  private val modifierPackages: List<String>
) : SymbolProcessor {
  private var generated = false
  private var valueTypes = emptyMap<String, ValueType>()
  private lateinit var structuredValues: StructuredValueResolver

  @OptIn(KspExperimental::class)
  override fun process(resolver: Resolver): List<KSAnnotated> {
    if (generated) return emptyList()
    generated = true

    valueTypes = discoverValues(resolver)
    structuredValues = StructuredValueResolver(
      resolver,
      valueKinds + componentValueKinds + modifierValueKinds,
      valueTypes.mapValues { (_, value) -> value.name },
      isDeprecated = { it.isDeprecated() },
      optIns = { it.optInMarkers() },
      accepts = { fn, arguments -> accepts(fn, arguments) },
    )
    val functions = declarationsInPackages(resolver, packages)
    val declarations = functions
      .filter { it.qualifiedName != null && it.getVisibility() == Visibility.PUBLIC }
      .filter { fn -> fn.annotations.any { it.annotationType.resolve().name == COMPOSABLE } }
      .sortedBy { it.signature() }
    val coverage = mutableListOf<Coverage>()
    val modifierDeclarations = declarationsInPackages(resolver, modifierPackages).filter {
      it.extensionReceiver?.resolve()?.name == MODIFIER && it.returnType?.resolve()?.name == MODIFIER
    }
    val discovered = declarations.map { it.discovered("component") } +
      modifierDeclarations.map { it.discovered("modifier") }
    val components = declarations.groupBy { it.simpleName.asString() }.toSortedMap()
      .flatMap { (_, overloads) ->
        val competing = overloads.groupBy { it.qualifiedName!!.asString() }
        val candidates = overloads.mapNotNull { fn ->
          describe(fn, competing.getValue(fn.qualifiedName!!.asString()), coverage)
        }.sortedWith(compareBy(
          // A scoped overload must never claim a JSX call that also works without a native owner.
          { it.component.ownerScope != null }, { it.declaration.parentDeclaration != null },
          { 0 !in it.masks }, { it.component.parameters.count { p -> !p.optional } },
          { -it.component.parameters.size }, { it.declaration.parameters.size }, { it.declaration.signature() }))
        val claimedForms = mutableSetOf<Pair<Boolean, List<String>>>()
        candidates.mapNotNull { candidate ->
          val component = candidate.component
          val masks = candidate.masks.filter { mask ->
            claimedForms.add(component.children to component.passed(mask).map { "${it.name}:${it.kind.inputType()}" }.sorted())
          }
          val shadowed = candidate.masks.filterNot { it in masks }
          val omittedForms = candidate.blocked.map {
            OmittedForm(component.passed(it).map { p -> p.name }, "Kotlin selects another overload or the call is ambiguous")
          } + shadowed.map {
            OmittedForm(component.passed(it).map { p -> p.name }, "Another overload has the same JavaScript argument shape")
          }
          coverage += Coverage(
            candidate.declaration.signature(),
            if (masks.isEmpty()) "skipped" else "generated",
            if (masks.isEmpty()) "All forms are shadowed by another overload" else null,
            candidate.omitted, omittedForms, budgetOmittedForms = candidate.budgetOmittedForms.takeIf { it > 0 }
          )
          if (masks.isEmpty()) null else component.copy(masks = masks)
        }
      }

    if (components.isEmpty()) {
      logger.error("No bridgeable @Composable declarations found in " + packages.joinToString())
      return emptyList()
    }

    val modifiers = discoverModifiers(modifierDeclarations, coverage)
    val factories = discoverFactories(resolver)
    val styleProperties = discoverStyleProperties(resolver)
    val usedKinds = (components.flatMap { it.parameters } + modifiers.flatMap { it.parameters } + styleProperties)
      .map { it.kind }.toSet()
    val records = structuredValues.recordsFor(usedKinds)
    val enums = structuredValues.enumsFor(usedKinds + records.flatMap { record ->
      (record.fields + record.factories.flatMap { it.fields }).map { it.kind }
    })
    val manifest = Manifest(4, components, modifiers, valueTypes.values.toList() + enums, factories, records, styleProperties,
      discoverIcons(resolver),
      discovered.sortedWith(compareBy({ it.kind }, { it.signature })),
      coverage.sortedWith(compareBy({ it.kind }, { it.signature })))
    generator.createNewFile(Dependencies(aggregating = true), "", "compose-api-manifest", "json")
      .bufferedWriter().use { Gson().toJson(manifest, it) }
    logger.info("Discovered ${components.size} composable overloads and ${modifiers.size} modifier overloads")
    return emptyList()
  }

  @OptIn(KspExperimental::class)
  private fun discoverIcons(resolver: Resolver): List<MaterialIcon> {
    val root = "androidx.compose.material.icons"
    return listOf("Filled", "Outlined", "Rounded", "Sharp", "TwoTone").flatMap { style ->
      listOf(false, true).flatMap { mirrored ->
        val theme = if (mirrored) "AutoMirrored.$style" else style
        val namespace = (if (mirrored) "$root.automirrored" else root) + "." + style.lowercase()
        resolver.getDeclarationsFromPackage(namespace).filterIsInstance<KSPropertyDeclaration>()
          .filter { property ->
            property.getVisibility() == Visibility.PUBLIC &&
              property.extensionReceiver?.resolve()?.name == "$root.Icons.$theme" &&
              property.type.resolve().name == "androidx.compose.ui.graphics.vector.ImageVector"
          }
          .map { property ->
            val name = property.simpleName.asString()
            MaterialIcon(
              (if (mirrored) "autoMirrored" + style else style.replaceFirstChar { it.lowercaseChar() }),
              name, "$namespace.$name", theme,
            )
          }.toList()
      }
    }.sortedWith(compareBy({ it.style }, { it.name }))
  }

  private fun discoverStyleProperties(resolver: Resolver): List<Parameter> {
    val scope = resolver.getClassDeclarationByName(
      resolver.getKSNameFromString("androidx.compose.foundation.style.StyleScope"),
    ) ?: return emptyList()
    val overloads = scope.getAllFunctions().filter { function ->
      function.getVisibility() == Visibility.PUBLIC && !function.isDeprecated() &&
        function.typeParameters.isEmpty() && function.returnType?.resolve()?.name == "kotlin.Unit"
    }.mapNotNull { function ->
      val param = function.parameters.singleOrNull() ?: return@mapNotNull null
      val type = param.type.resolve()
      if (param.isVararg || type.isMarkedNullable) return@mapNotNull null
      val kind = valueKinds[type.name]?.takeIf { it in styleFieldKinds } ?: drawingValueKinds[type.name]
        ?: valueTypes[type.name]?.name ?: structuredValues.kind(type) ?: return@mapNotNull null
      Parameter(function.simpleName.asString(), kind, optional = true, nullable = false)
    }.toList()
    // Keep dimensions in dp and prefer color for the simple background/foreground form.
    val preferred = listOf("dp", "color")
    return overloads.groupBy { it.name }.toSortedMap().values.mapNotNull { options ->
      val distinct = options.distinct()
      distinct.singleOrNull() ?: preferred.firstNotNullOfOrNull { kind -> distinct.singleOrNull { it.kind == kind } }
    }
  }

  private fun describe(
    fn: KSFunctionDeclaration,
    overloads: List<KSFunctionDeclaration>,
    coverage: MutableList<Coverage>
  ): Candidate? {
    fun omit(status: String, reason: String, parameters: List<OmittedParameter> = emptyList()): Candidate? {
      coverage += Coverage(fn.signature(), status, reason, parameters)
      return null
    }
    val function = fn.qualifiedName!!.asString()
    if (fn.isDeprecated() && (fn.isHiddenOrErrorDeprecated() || overloads.any { !it.isDeprecated() })) {
      return omit("skipped", "Deprecated Kotlin declaration")
    }
    if (fn.isComposableTarget("androidx.compose.ui.UiComposable").not()) {
      return omit("unsupported", "Composable targets a different native applier")
    }
    if (fn.simpleName.asString().firstOrNull()?.isUpperCase() != true) {
      return omit("skipped", "Composable does not use a JSX component name")
    }
    val owner = fn.parentDeclaration as? KSClassDeclaration
    val receiver = fn.extensionReceiver?.resolve()?.name
    // An unqualified call never competes with an extension overload on a native receiver.
    val ownerScope = owner?.qualifiedName?.asString()?.takeIf { it in scopes }
      ?: receiver?.takeIf { it in scopedExtensionReceivers }
    if (fn.parentDeclaration != null && owner?.classKind != ClassKind.OBJECT && ownerScope == null) {
      return omit("adapterRequired", "Member composable requires a native owner")
    }
    if (fn.extensionReceiver != null && ownerScope == null) {
      return omit("adapterRequired", "Extension receiver requires a native scope")
    }
    val indexedContent = fn.indexedContentScope()
    if (fn.typeParameters.isNotEmpty() && indexedContent == null) return omit("unsupported", "Generic composable")
    if (fn.returnType?.resolve()?.name != "kotlin.Unit") return omit("unsupported", "Composable returns a value")
    val optIns = fn.optInMarkers()
    if (optIns.any { it.getVisibility() != Visibility.PUBLIC }) {
      return omit("unsupported", "Opt-in marker is not public")
    }

    val supported = mutableListOf<Parameter>()
    val omitted = mutableListOf<OmittedParameter>()
    var childrenScope: String? = null
    var childrenParameter: String? = null
    for (parameter in fn.parameters) {
      val name = parameter.name?.asString() ?: return omit("unsupported", "Unnamed parameter")
      val type = parameter.type.resolve()
      val actionItems = type.actionItemKind().takeIf { name == "content" }
      val overflowScope = type.contentScope()?.takeIf { name == "overflowIndicator" && it in overflowMenuScopes }
      val decorator = parameter.decoratorScope(type)
      val isSlot = actionItems == null &&
        (decorator != null || parameter.isContentSlot(type) || name == "content" && indexedContent != null)
      if ((name == "content" || type.indexedSlotScope() != null) && isSlot && type.nullability == Nullability.NOT_NULL) {
        childrenParameter = name
        childrenScope = indexedContent ?: type.contentScope()
        continue
      }
      val publicName = when {
        actionItems != null -> "items"
        name == "style" && type.name == "androidx.compose.ui.text.TextStyle" -> "composeTextStyle"
        name == "style" && type.name == "androidx.compose.foundation.style.Style" -> "composeStyle"
        else -> name
      }
      val kind = when {
        parameter.isVararg || publicName in reservedProps -> null
        isSlot -> "slot"
        actionItems != null -> actionItems
        name == "targetState" && indexedContent != null -> "int"
        else -> valueKinds[type.name] ?: componentValueKinds[type.name]
          ?: drawingValueKinds[type.name] ?: parameter.eventKind(type) ?: valueTypes[type.name]?.name
          ?: type.rangeKind() ?: type.animationKind() ?: parameter.producerKind(type)
          ?: type.drawingKind() ?: type.contentTransitionKind()
          ?: "gridConfig".takeIf { type.name == "kotlin.Function1" &&
            type.arguments.first().type?.resolve()?.name == "androidx.compose.foundation.layout.GridConfigurationScope" &&
            type.arguments.last().type?.resolve()?.name == "kotlin.Unit" }
          ?: structuredValues.kind(type) ?: structuredValues.defaultsKind(type)
      }
      if (kind == null) {
        omitted += OmittedParameter(name, type.signatureName(), when {
          parameter.isVararg -> "Vararg"
          name in reservedProps -> "Reserved React prop"
          else -> "Unsupported bridge type"
        }, !parameter.hasDefault && !parameter.isVararg)
        continue
      }
      val nullable = type.nullability == Nullability.NULLABLE && !(name == "targetState" && indexedContent != null)
      supported += Parameter(publicName, kind, parameter.hasDefault || overflowScope != null, nullable,
        scope = if (isSlot) decorator ?: type.contentScope() else null, nativeName = name.takeIf { it != publicName })
    }
    if (omitted.any { it.required }) return omit("adapterRequired", "Required parameter cannot cross the bridge", omitted)

    val types = fn.parameters.associate { it.name!!.asString() to it.type.resolve() }
    val parameters = supported
    val component = Component(fn.signature(), fn.simpleName.asString(), function, parameters, childrenParameter != null, childrenScope,
      optIns.mapNotNull { it.qualifiedName?.asString() }.sorted(), emptyList(),
      childrenParameter = childrenParameter?.takeUnless { it == "content" }, ownerScope = ownerScope,
      scopedExtension = if (receiver != null) true else null)
    val optional = parameters.filter { it.optional && it.kind != "modifier" }
    val newlyBridgeable = parameters.any { !it.optional && (it.kind in expandedBridgeKinds || it.kind in extendedCapabilityKinds || it.kind in textAdapterKinds) } ||
      childrenScope == PADDING_VALUES || childrenScope in lazyBuilderScopes
    val forms = callForms(optional, newlyBridgeable)
    val (masks, blocked) = forms.masks.partition { mask ->
      val passed = component.passed(mask).associate { parameter ->
        val name = parameter.nativeName ?: parameter.name
        name to types.getValue(name)
      }.toMutableMap()
      childrenParameter?.let { passed[it] = types.getValue(it) }
      overloads.none { other ->
        other != fn && !other.isDeprecated() && other.extensionReceiver?.resolve()?.name == receiver &&
          other.parameters.size <= fn.parameters.size && accepts(other, passed)
      }
    }
    if (masks.isEmpty()) return omit("unsupported", "No unambiguous Kotlin call forms", omitted)
    return Candidate(fn, component, masks, blocked, omitted, forms.omittedCount)
  }

  @OptIn(KspExperimental::class)
  private fun discoverFactories(resolver: Resolver): List<ValueFactory> =
    factoryTypes.flatMap { type ->
      val declaration = resolver.getClassDeclarationByName(resolver.getKSNameFromString(type)) ?: return@flatMap emptyList()
      val properties = declaration.getAllProperties()
        .filter { it.getVisibility() == Visibility.PUBLIC && it.type.resolve().name == COLOR }
        .map { it.simpleName.asString() }.toSet()
      val copyFields = declaration.getAllFunctions()
        .filter { it.simpleName.asString() == "copy" && it.getVisibility() == Visibility.PUBLIC && !it.isDeprecated() }
        .map { copy -> copy.parameters.mapNotNull { it.name?.asString() }.toSet() }
        .firstOrNull { it == properties } ?: return@flatMap emptyList()
      val functions = resolver.getDeclarationsFromPackage(declaration.packageName.asString())
        .filterIsInstance<KSFunctionDeclaration>()
      functions.filter { fn ->
        fn.getVisibility() == Visibility.PUBLIC && fn.returnType?.resolve()?.name == type &&
          fn.extensionReceiver == null && !fn.isDeprecated() &&
          fn.optInMarkers().all { it.getVisibility() == Visibility.PUBLIC } &&
          fn.annotations.none { it.annotationType.resolve().name == COMPOSABLE } &&
          fn.parameters.all { it.hasDefault && it.type.resolve().name == COLOR && it.name?.asString() in copyFields }
      }.groupBy { it.qualifiedName!!.asString() }.toSortedMap().mapNotNull { (name, overloads) ->
        val factory = overloads.singleOrNull() ?: return@mapNotNull null
        ValueFactory(factory.simpleName.asString(), name, type, factory.parameters.map { it.name!!.asString() },
          factory.optInMarkers().mapNotNull { it.qualifiedName?.asString() }.sorted())
      }
    }

  @OptIn(KspExperimental::class)
  private fun declarationsInPackages(resolver: Resolver, packages: List<String>): List<KSFunctionDeclaration> =
    packages.flatMap { packageName ->
      resolver.getDeclarationsFromPackage(packageName).flatMap { it.publicFunctions() }.toList()
    }

  private fun KSDeclaration.publicFunctions(): Sequence<KSFunctionDeclaration> {
    if (qualifiedName == null || getVisibility() != Visibility.PUBLIC) return emptySequence()
    return when (this) {
      is KSFunctionDeclaration -> sequenceOf(this)
      is KSClassDeclaration -> declarations.flatMap { it.publicFunctions() }
      else -> emptySequence()
    }
  }

  private fun discoverModifiers(
    functions: List<KSFunctionDeclaration>,
    coverage: MutableList<Coverage>
  ): List<ModifierOverload> =
    functions.groupBy { it.qualifiedName!!.asString() }.toSortedMap().flatMap { (qualifiedName, declarations) ->
      val available = declarations.filterNot { it.isDeprecated() }
      declarations.sortedBy { it.signature() }.mapNotNull { fn ->
        val omitted = mutableListOf<OmittedParameter>()
        fun omit(status: String, reason: String): ModifierOverload? {
          coverage += Coverage(fn.signature(), status, reason, omitted, kind = "modifier")
          return null
        }
        if (fn.isDeprecated()) return@mapNotNull omit("skipped", "Deprecated Kotlin declaration")
        val owner = fn.parentDeclaration as? KSClassDeclaration
        val staticOwner = owner?.takeIf { it.classKind == ClassKind.OBJECT }?.qualifiedName?.asString()
        val receiver = owner?.qualifiedName?.asString()?.takeUnless { it == staticOwner }
        if (receiver != null && receiver !in scopes) {
          return@mapNotNull omit("adapterRequired", "Modifier requires a native owner: $receiver")
        }
        val optIns = fn.optInMarkers()
        if (fn.typeParameters.isNotEmpty() && !fn.hasSpecializedModifierTypes()) {
          return@mapNotNull omit("adapterRequired", "Generic modifier")
        }
        if (optIns.any { it.getVisibility() != Visibility.PUBLIC }) {
          return@mapNotNull omit("unsupported", "Opt-in marker is not public")
        }
        val composable = fn.annotations.any { it.annotationType.resolve().name == COMPOSABLE }

        val parameters = mutableListOf<Parameter>()
        for (parameter in fn.parameters) {
          val name = parameter.name?.asString() ?: return@mapNotNull omit("unsupported", "Unnamed parameter")
          val type = parameter.type.resolve()
          val kind = when {
            qualifiedName == "androidx.compose.ui.input.pointer.pointerInput" && type.name == "kotlin.Any" ->
              if (parameter.isVararg) "pointerKeys" else "string"
            parameter.isVararg -> modifierVarargKinds[type.name]
            qualifiedName == "androidx.compose.ui.layout.layoutId" && name == "layoutId" && type.name == "kotlin.Any" -> "string"
            else -> modifierValueKinds[type.name] ?: valueKinds[type.name] ?: valueTypes[type.name]?.name
              ?: type.rangeKind() ?: type.animationKind() ?: parameter.eventKind(type) ?: type.modifierReceiverKind()
              ?: type.drawingKind() ?: parameter.producerKind(type)
              ?: structuredValues.kind(type)
          }
          if (kind == null || kind == "modifier") {
            val reason = if (parameter.isVararg) "Vararg" else "Unsupported bridge type"
            omitted += OmittedParameter(name, type.signatureName(), reason, !parameter.hasDefault && !parameter.isVararg)
          } else {
            parameters += Parameter(name, kind, parameter.hasDefault, !parameter.isVararg && type.nullability == Nullability.NULLABLE)
          }
        }
        if (omitted.any { it.required }) return@mapNotNull omit("adapterRequired", "Required parameter cannot cross the bridge")

        val optional = parameters.filter { it.optional }
        val forms = callForms(optional, parameters.any {
          !it.optional && (it.kind in expandedBridgeKinds || it.kind in extendedCapabilityKinds || it.kind in textAdapterKinds)
        })
        val parameterTypes = fn.parameters.associate { it.name!!.asString() to it.type.resolve() }
        fun passed(mask: Int) = parameters.filter { !it.optional || (mask and (1 shl optional.indexOf(it))) != 0 }
        val (masks, blocked) = forms.masks.partition { mask ->
          val arguments = passed(mask).associate { it.name to parameterTypes.getValue(it.name) }
          available.none { other ->
            other != fn && other.parameters.size <= fn.parameters.size && accepts(other, arguments)
          }
        }
        if (masks.isEmpty()) return@mapNotNull omit("unsupported", "No unambiguous Kotlin call forms")
        coverage += Coverage(fn.signature(), "generated", null, omitted, blocked.map { mask ->
          OmittedForm(passed(mask).map { it.name }, "Kotlin selects another overload or the call is ambiguous")
        }, kind = "modifier", budgetOmittedForms = forms.omittedCount.takeIf { it > 0 })
        ModifierOverload(fn.signature(), fn.simpleName.asString(), qualifiedName, parameters, masks, receiver,
          optIns.mapNotNull { it.qualifiedName?.asString() }.sorted(), composable.takeIf { it }, staticOwner)
      }.sortedBy { overload -> overload.parameters.joinToString { "${it.name}:${it.kind}" } }
    }

  private fun KSFunctionDeclaration.hasSpecializedModifierTypes(): Boolean {
    val genericTypes = parameters.map { it.type.resolve() }.filter { type ->
      type.declaration is KSTypeParameter || type.arguments.any { it.type?.resolve()?.declaration is KSTypeParameter }
    }
    return genericTypes.isNotEmpty() && genericTypes.all { it.name in specializedModifierTypes }
  }

  private fun KSFunctionDeclaration.discovered(kind: String): Discovery = Discovery(
    kind, signature(), origin == Origin.KOTLIN_LIB,
    parameters.map { parameter ->
      val type = parameter.type.resolve()
      DiscoveredParameter(parameter.name?.asString().orEmpty(), type.signatureName(), parameter.hasDefault, parameter.isVararg)
    },
    returnType?.resolve()?.signatureName(),
    optInMarkers().mapNotNull { it.qualifiedName?.asString() }.sorted()
  )

  private fun callForms(optional: List<Parameter>, newlyBridgeable: Boolean): CallForms {
    val runtime = optional.filter { it.kind in newRuntimeKinds || it.scope?.startsWith("decoration:") == true }
    if (runtime.isNotEmpty()) {
      return extendCallForms(optional, runtime, newlyBridgeable, 128, 5)
    }
    val inferred = optional.filter { it.isInferredValue() || it.kind.startsWith("eventTuple:") }
    if (inferred.isNotEmpty()) {
      // First build the previous surface with the new types removed. Applying
      // the budgets in the opposite order can drop existing prop combinations.
      return extendCallForms(optional, inferred, newlyBridgeable, 128, 5)
    }
    val textParameters = optional.filter { it.kind in textAdapterKinds }
    if (textParameters.isNotEmpty()) {
      return extendCallForms(optional, textParameters, newlyBridgeable, 128, 4, combineAdded = true)
    }
    val newParameters = optional.filter { it.kind in extendedCapabilityKinds }
    if (newParameters.isNotEmpty()) {
      return extendCallForms(optional, newParameters, newlyBridgeable, 128, 4)
    }
    val added = optional.filter { it.kind in capabilityBridgeKinds || it.kind.startsWith("record:") || it.nativeName != null }
    if (added.isEmpty()) return previousCallForms(optional, newlyBridgeable)
    return extendCallForms(optional, added, newlyBridgeable)
  }

  private fun extendCallForms(
    optional: List<Parameter>,
    added: List<Parameter>,
    newlyBridgeable: Boolean,
    exhaustiveLimit: Int = 1024,
    coreLimit: Int = 6,
    combineAdded: Boolean = false,
  ): CallForms {
    val old = optional - added.toSet()
    val previous = callForms(old, newlyBridgeable)
    require(optional.size < Int.SIZE_BITS - 1) { "Too many optional parameters for a Compose call mask" }
    val total = 1 shl optional.size
    if (total <= exhaustiveLimit) return CallForms((0 until total).toList(), 0)

    fun bit(parameter: Parameter) = 1 shl optional.indexOf(parameter)
    val previousMasks = previous.masks.map { mask ->
      old.filterIndexed { index, _ -> mask and (1 shl index) != 0 }.sumOf(::bit)
    }
    val established = old.filterNot { it.isInferredValue() }
    val preferred = if (combineAdded) established.filter { it.name in textFieldControlProps }
      else established.filter { it.kind in preferredComponentKinds }.take(4)
    val core = (preferred.toSet() + established + old).take(coreLimit)
    fun subsets(parameters: List<Parameter>) =
      parameters.fold(listOf(0)) { masks, parameter -> masks + masks.map { it or bit(parameter) } }
    val coreMasks = subsets(core)
    val addedBits = if (combineAdded) subsets(added).drop(1) else added.map(::bit)
    val newMasks = addedBits.flatMap { mask -> coreMasks.map { it or mask } }
    val pairedMasks = if (exhaustiveLimit < 1024 && !combineAdded) added.flatMapIndexed { index, first ->
      added.drop(index + 1).map { second -> bit(first) or bit(second) }
    } else emptyList()
    // Keep the complete established form available as more optional value
    // types become inferable. Combine small sets of options so adding a
    // decorator or SDK value cannot silently remove a working JSX call.
    val explicitFull = established.sumOf(::bit)
    val inferred = old - established.toSet()
    val fullForms = if (inferred.size <= 4) {
      subsets(inferred).map { explicitFull or it }
    } else listOf(explicitFull, old.sumOf(::bit))
    val addedFullForms = if (exhaustiveLimit < 1024 && added.size <= 5) {
      subsets(added)
    } else added.filter {
      it.kind in extendedCapabilityKinds || it.kind in textAdapterKinds || it.kind in newRuntimeKinds ||
        it.scope?.startsWith("decoration:") == true
    }.map(::bit)
    val completeForms = fullForms.flatMap { base -> addedFullForms.map { base or it } }
    val considered = (previousMasks + newMasks + pairedMasks + completeForms + (total - 1))
      .distinct().sorted()
    return CallForms(considered, total - considered.size)
  }

  private fun Parameter.isInferredValue() = kind == "char" || structuredValues.isInferredKind(kind)

  private fun previousCallForms(optional: List<Parameter>, newlyBridgeable: Boolean): CallForms {
    require(optional.size < Int.SIZE_BITS - 1) { "Too many optional parameters for a Compose call mask" }
    val total = 1 shl optional.size
    if (total <= if (newlyBridgeable) 128 else 1024) return CallForms((0 until total).toList(), 0)

    // Leave room for added bridge types without dropping previously accepted argument combinations.
    val established = optional.filterNot { it.kind in expandedBridgeKinds }
    fun masks(parameters: List<Parameter>): List<Int> = parameters.fold(listOf(0)) { masks, parameter ->
      val bit = 1 shl optional.indexOf(parameter)
      masks + masks.map { it or bit }
    }
    // New signatures keep all core combinations, each additional prop and the full form.
    if (newlyBridgeable) {
      val core = optional.filter { it.kind in preferredComponentKinds }.take(4).toSet()
      val coreParameters = (core + optional).take(4)
      val coreMasks = masks(coreParameters)
      val extra = (optional - coreParameters.toSet()).map { 1 shl optional.indexOf(it) }
      val considered = (coreMasks + extra.flatMap { bit -> coreMasks.map { it or bit } } + (total - 1))
        .distinct().sorted()
      return CallForms(considered, total - considered.size)
    }
    val preferred = established.filter { it.kind in preferredComponentKinds }.take(4).toSet()
    val constants = established.filter { parameter -> valueTypes.values.any { it.name == parameter.kind } }
    val core = (preferred + constants + established).take(7)
    val coreMasks = masks(core)
    val previousMasks = if (established.size <= 10) masks(established) else {
      val extra = (established - core.toSet()).map { 1 shl optional.indexOf(it) }
      coreMasks + extra.flatMap { bit -> coreMasks.map { it or bit } } + established.sumOf { 1 shl optional.indexOf(it) }
    }
    val newProps = (optional - established.toSet()).map { 1 shl optional.indexOf(it) }
    val considered = (previousMasks + newProps.flatMap { bit -> coreMasks.map { it or bit } } + (total - 1))
      .distinct().sorted()
    return CallForms(considered, total - considered.size)
  }

  private fun accepts(fn: KSFunctionDeclaration, passed: Map<String, KSType>): Boolean {
    val parameters = fn.parameters.associateBy { it.name?.asString() }
    if (parameters.values.any { !it.hasDefault && !it.isVararg && it.name?.asString() !in passed }) return false
    return passed.all { (name, type) ->
      parameters[name]?.type?.resolve()?.isAssignableFrom(type) == true
    }
  }

  private fun discoverValues(resolver: Resolver): Map<String, ValueType> =
    valueSources.mapNotNull { (typeName, source) ->
      val declaration = resolver.getClassDeclarationByName(resolver.getKSNameFromString(typeName))
        ?: return@mapNotNull null
      val expected = declaration.asStarProjectedType()
      val properties = source.owners.flatMap { ownerName ->
        val owner = resolver.getClassDeclarationByName(resolver.getKSNameFromString(ownerName))
          ?: return@flatMap emptyList()
        val holders = listOf(owner) + owner.declarations.filterIsInstance<KSClassDeclaration>()
          .filter { it.isCompanionObject }.toList()
        val enumCases = if (owner.classKind == ClassKind.ENUM_CLASS && expected.isAssignableFrom(owner.asStarProjectedType())) {
          owner.declarations.filterIsInstance<KSClassDeclaration>().filter { it.classKind == ClassKind.ENUM_ENTRY }
            .map { entry ->
              val name = entry.simpleName.asString()
              ValueCase(name.replaceFirstChar { it.lowercaseChar() }, "$ownerName.$name")
            }.toList()
        } else emptyList()
        val objectCases = owner.declarations.filterIsInstance<KSClassDeclaration>()
          .filter { it.classKind == ClassKind.OBJECT && !it.isCompanionObject &&
            it.getVisibility() == Visibility.PUBLIC && !it.isDeprecated() &&
            expected.isAssignableFrom(it.asStarProjectedType()) }
          .map { entry ->
            val name = entry.simpleName.asString()
            ValueCase(name.replaceFirstChar { it.lowercaseChar() }, "$ownerName.$name")
          }.toList()
        enumCases + objectCases + holders.filter { it.classKind == ClassKind.OBJECT }.flatMap { holder ->
          holder.declarations.filterIsInstance<KSPropertyDeclaration>()
            .filter { it.getVisibility() == Visibility.PUBLIC && expected.isAssignableFrom(it.type.resolve()) }
            .filter { property -> property.annotations.none { it.annotationType.resolve().name == "kotlin.Deprecated" } }
            .map { property ->
              val name = property.simpleName.asString()
              ValueCase(name.replaceFirstChar { it.lowercaseChar() }, "$ownerName.$name")
            }.toList()
        }
      }.distinctBy { it.name }.sortedBy { it.name }
      val optIns = declaration.optInMarkers().mapNotNull { it.qualifiedName?.asString() }.sorted()
      if (properties.isEmpty()) null else typeName to ValueType(source.name, typeName, properties, optIns)
    }.toMap()

  private fun KSFunctionDeclaration.signature(): String = buildString {
    append(qualifiedName!!.asString())
    extensionReceiver?.let { append(" [receiver: ${it.resolve().signatureName()}]") }
    append(parameters.joinToString(prefix = "(", postfix = ")") { parameter ->
      val vararg = if (parameter.isVararg) "vararg " else ""
      "$vararg${parameter.name?.asString()}: ${parameter.type.resolve().signatureName()}"
    })
  }

  private fun KSType.signatureName(): String = buildString {
    append(if (declaration is KSTypeParameter) declaration.simpleName.asString() else name ?: declaration.simpleName.asString())
    if (arguments.isNotEmpty()) append(arguments.joinToString(prefix = "<", postfix = ">") {
      if (it.variance == Variance.STAR) "*" else it.type?.resolve()?.signatureName() ?: "*"
    })
    if (isMarkedNullable) append("?")
  }

  private fun KSDeclaration.isDeprecated(): Boolean =
    annotations.any { it.annotationType.resolve().name == "kotlin.Deprecated" }

  private fun KSDeclaration.isHiddenOrErrorDeprecated(): Boolean =
    annotations.filter { it.annotationType.resolve().name == "kotlin.Deprecated" }
      .flatMap { it.arguments }.filter { it.name?.asString() == "level" }
      .any { argument -> argument.value.toString().substringAfterLast('.') in setOf("ERROR", "HIDDEN") }

  private fun KSFunctionDeclaration.isComposableTarget(expected: String): Boolean =
    annotations.all { annotation ->
      val type = annotation.annotationType.resolve()
      when {
        type.name == "androidx.compose.runtime.ComposableTarget" ->
          annotation.arguments.singleOrNull()?.value == expected
        type.declaration.annotations.any { it.annotationType.resolve().name == "androidx.compose.runtime.ComposableTargetMarker" } ->
          type.name == expected
        else -> true
      }
    }

  private fun KSDeclaration.optInMarkers(): Set<KSDeclaration> {
    val parents = generateSequence(this) { it.parentDeclaration }
    val signatureTypes = if (this is KSFunctionDeclaration) {
      parameters.asSequence().map { it.type.resolve() } + listOfNotNull(extensionReceiver?.resolve(), returnType?.resolve()).asSequence()
    } else emptySequence()
    val annotated = parents + signatureTypes.flatMap { it.declarationsInType() }
    return annotated.flatMap { it.annotations }.map { it.annotationType.resolve().declaration }
      .filter { marker -> marker.annotations.any { it.annotationType.resolve().name == "kotlin.RequiresOptIn" } }
      .toSet()
  }

  private fun KSType.declarationsInType(): Sequence<KSDeclaration> =
    sequenceOf(declaration) + arguments.asSequence().mapNotNull { it.type?.resolve() }
      .flatMap { it.declarationsInType() }

  private fun KSValueParameter.isContentSlot(type: KSType): Boolean {
    if (name?.asString() != "content" && type.indexedSlotScope() == null &&
      (this.type.annotations + type.annotations).none { it.annotationType.resolve().name == COMPOSABLE }) return false
    if (type.arguments.lastOrNull()?.type?.resolve()?.name != "kotlin.Unit") return false
    return when (type.name) {
      "kotlin.Function0" -> true
      "kotlin.Function1" -> type.contentScope() != null
      "kotlin.Function2" -> type.indexedSlotScope() != null
      else -> false
    }
  }

  private fun KSValueParameter.decoratorScope(type: KSType): String? = when {
    type.name == "androidx.compose.foundation.text.input.TextFieldDecorator" -> "decoration:textField"
    (this.type.annotations + type.annotations).none { it.annotationType.resolve().name == COMPOSABLE } -> null
    type.name == "kotlin.Function1" && type.arguments.last().type?.resolve()?.name == "kotlin.Unit" &&
      type.arguments.first().type?.resolve()?.let { inner ->
        inner.name == "kotlin.Function0" && inner.arguments.single().type?.resolve()?.name == "kotlin.Unit" &&
          inner.annotations.any { it.annotationType.resolve().name == COMPOSABLE }
      } == true -> "decoration:lambda"
    else -> null
  }

  // Specialize target-state animations to a child index, retaining native Compose transitions.
  private fun KSFunctionDeclaration.indexedContentScope(): String? {
    val state = typeParameters.singleOrNull() ?: return null
    if (state.bounds.any { it.resolve().name != "kotlin.Any" }) return null
    val target = parameters.firstOrNull { it.name?.asString() == "targetState" } ?: return null
    if (target.hasDefault || target.type.resolve().declaration != state) return null
    val content = parameters.firstOrNull { it.name?.asString() == "content" } ?: return null
    val type = content.type.resolve()
    if ((content.type.annotations + type.annotations).none { it.annotationType.resolve().name == COMPOSABLE }) return null
    val arguments = type.arguments.map { it.type?.resolve() }
    if (arguments.lastOrNull()?.name != "kotlin.Unit" || arguments.getOrNull(arguments.lastIndex - 1)?.declaration != state) return null
    if (type.name == "kotlin.Function1") return "indexed:"
    if (type.name != "kotlin.Function2") return null
    val scope = arguments.first()?.name?.takeIf { it in scopes } ?: return null
    return "indexed:$scope"
  }

  private fun KSType.rangeKind(): String? =
    if (name == "kotlin.ranges.ClosedFloatingPointRange" &&
      arguments.singleOrNull()?.type?.resolve()?.name == "kotlin.Float") "floatRange" else null

  private fun KSType.animationKind(): String? {
    if (name != "androidx.compose.animation.core.AnimationSpec" &&
      name != "androidx.compose.animation.core.FiniteAnimationSpec") return null
    return when (arguments.singleOrNull()?.type?.resolve()?.name) {
      "kotlin.Float" -> "animationSpec"
      "androidx.compose.ui.unit.IntSize" -> "animationSpec:size"
      "androidx.compose.ui.unit.IntOffset" -> "animationSpec:offset"
      else -> null
    }
  }

  private fun KSType.indexedSlotScope(): String? {
    if (name != "kotlin.Function2" || arguments[1].type?.resolve()?.name != "kotlin.Int" ||
      arguments[2].type?.resolve()?.name != "kotlin.Unit") return null
    return arguments[0].type?.resolve()?.name?.takeIf { it in indexedSlotScopes }
  }

  private fun KSType.contentTransitionKind(): String? =
    "contentTransition".takeIf {
      name == "kotlin.Function1" &&
        arguments.first().type?.resolve()?.name == "androidx.compose.animation.AnimatedContentTransitionScope" &&
        arguments.last().type?.resolve()?.name == "androidx.compose.animation.ContentTransform"
    }

  private fun KSType.actionItemKind(): String? {
    if (name != "kotlin.Function1" || arguments.last().type?.resolve()?.name != "kotlin.Unit") return null
    return when (arguments.first().type?.resolve()?.name) {
      "androidx.compose.material3.ButtonGroupScope" -> "buttonGroupItems"
      "androidx.compose.material3.AppBarRowScope", "androidx.compose.material3.AppBarColumnScope" -> "appBarItems"
      else -> null
    }
  }

  private fun KSType.contentScope(): String? = when {
    indexedSlotScope() != null -> indexedSlotScope()
    name == "kotlin.Function1" -> arguments.first().type?.resolve()?.name?.takeIf {
      it in scopes || it in lazyBuilderScopes || it in overflowMenuScopes || it == PADDING_VALUES
    }
    else -> null
  }

  private fun KSValueParameter.eventKind(type: KSType): String? {
    val parameter = name?.asString().orEmpty()
    if (type.arguments.lastOrNull()?.type?.resolve()?.name != "kotlin.Unit") return null
    if (!parameter.startsWith("on") && parameter != "callback" && parameter != "watcher" &&
      !parameter.endsWith("Listener")) return null
    if (type.name == "kotlin.Function2" && type.arguments[0].type?.resolve()?.name == "androidx.compose.ui.unit.Density") {
      val provider = type.arguments[1].type?.resolve()
      if (provider?.name == "kotlin.Function0" &&
        provider.arguments.singleOrNull()?.type?.resolve()?.name == "androidx.compose.ui.text.TextLayoutResult") {
        return "eventTextLayoutProvider"
      }
    }
    if (type.name in callbackTupleTypes && (this.type.annotations + type.annotations).none {
      it.annotationType.resolve().name in setOf(COMPOSABLE, "kotlin.ExtensionFunctionType")
    }) {
      val arguments = type.arguments.dropLast(1).map { argument ->
        val value = argument.type?.resolve() ?: return null
        val qualified = value.name?.takeIf { it in callbackTupleValues } ?: return null
        qualified + if (value.isMarkedNullable) "?" else ""
      }
      return "eventTuple:" + arguments.joinToString(",")
    }
    // The other adapters carry one payload and retain their established JS signatures.
    if (parameter.endsWith("Listener") && !parameter.startsWith("on")) return null
    if (type.name == "kotlin.coroutines.SuspendFunction2" &&
      type.arguments[0].type?.resolve()?.name == "kotlinx.coroutines.CoroutineScope") {
      return when (type.arguments[1].type?.resolve()?.name) {
        "kotlin.Float" -> "eventFloat"
        "androidx.compose.ui.geometry.Offset" -> "eventOffset"
        else -> null
      }
    }
    val argument = type.arguments.firstOrNull()?.type?.resolve()
    return when (type.name) {
      "kotlin.Function0" -> "event"
      "kotlin.Function1" -> when (argument?.name) {
        "kotlin.String" -> "eventString"
        "kotlin.Boolean" -> "eventBoolean"
        "kotlin.Float" -> "eventFloat"
        "androidx.compose.ui.geometry.Offset" -> "eventOffset"
        "androidx.compose.ui.unit.Velocity" -> "eventVelocity"
        "androidx.compose.ui.unit.DpSize" -> "eventDpSize"
        "android.view.MotionEvent" -> "eventMotion"
        "kotlin.Double" -> "eventDouble"
        "kotlin.Int" -> "eventInt"
        "androidx.compose.ui.unit.IntSize" -> "eventLayoutSize"
        "androidx.compose.ui.spatial.RelativeLayoutBounds" -> "eventLayoutBounds"
        "androidx.compose.ui.layout.LayoutCoordinates" ->
          if (argument.isMarkedNullable) "eventNullableLayoutPosition" else "eventLayoutPosition"
        "androidx.compose.ui.focus.FocusState" -> "eventFocusState"
        "androidx.compose.ui.text.input.TextFieldValue" -> "eventTextFieldValue"
        "androidx.compose.ui.text.TextLayoutResult" -> "eventTextLayout"
        else -> if (argument?.rangeKind() == "floatRange") "eventFloatRange" else null
      }
      else -> null
    }
  }

  private fun KSType.drawingKind(): String? {
    if (name != "kotlin.Function1") return null
    return when (arguments[0].type?.resolve()?.name to arguments[1].type?.resolve()?.name) {
      "androidx.compose.ui.graphics.drawscope.DrawScope" to "kotlin.Unit" -> "drawing"
      "androidx.compose.ui.graphics.drawscope.ContentDrawScope" to "kotlin.Unit" -> "contentDrawing"
      "androidx.compose.ui.draw.CacheDrawScope" to "androidx.compose.ui.draw.DrawResult" -> "cachedDrawing"
      else -> null
    }
  }

  private fun KSType.modifierReceiverKind(): String? {
    if (name == "kotlin.Function3" && arguments.map { it.type?.resolve()?.name } == layoutMeasureTypes) {
      return "layoutModifierMeasure"
    }
    if (name != "kotlin.Function1") return null
    val argument = arguments.first().type?.resolve()?.name
    val result = arguments.last().type?.resolve()?.name
    if (result == "kotlin.Boolean") {
      return when (argument) {
        "androidx.compose.ui.input.key.KeyEvent" -> "keyPolicy"
        "androidx.compose.ui.input.rotary.RotaryScrollEvent" -> "rotaryPolicy"
        "android.view.MotionEvent" -> "touchPolicy"
        "androidx.compose.ui.draganddrop.DragAndDropEvent" -> "dragTypePolicy"
        else -> null
      }
    }
    if (argument == "androidx.compose.ui.unit.Density" && result == "androidx.compose.ui.geometry.Offset") return "dpPoint"
    if (argument == "androidx.compose.ui.geometry.Offset" && result == "androidx.compose.ui.draganddrop.DragAndDropTransferData") return "dragTransfer"
    if (result != "kotlin.Unit") return null
    return when (argument) {
      "androidx.compose.foundation.layout.WindowInsets" -> "eventInsets"
      "androidx.compose.ui.focus.FocusProperties" -> "focusProperties"
      "androidx.compose.ui.semantics.SemanticsPropertyReceiver" -> "semantics"
      else -> null
    }
  }

  private fun KSValueParameter.producerKind(type: KSType): String? =
    if (type.name != "kotlin.Function0") null else when (type.arguments.singleOrNull()?.type?.resolve()?.name) {
      "androidx.compose.foundation.layout.WindowInsets" -> "windowInsetsProducer"
      "kotlin.Float" -> if ((this.type.annotations + type.annotations).none {
        it.annotationType.resolve().name == COMPOSABLE
      }) "floatProducer" else null
      else -> null
    }

  private val KSType.name: String? get() = declaration.qualifiedName?.asString()
}

private fun String.inputType(): String = when {
  this in setOf("int", "long", "float", "double", "dp", "sp", "floatProducer") -> "number"
  this == "char" || this == "color" || startsWith("Compose") -> "string"
  this in setOf("floatRange", "buttonGroupItems", "appBarItems", "pointerKeys") -> "tuple"
  this in setOf("alignmentLine", "visibilityScope", "lookaheadScope") -> "string"
  startsWith("record:") -> "object"
  this in objectKinds || this in textAdapterKinds ||
    (this in capabilityBridgeKinds || this in extendedCapabilityKinds) && !startsWith("event") -> "object"
  startsWith("event") -> "function"
  else -> this
}

private val objectKinds = setOf("colorScheme", "paddingValues", "windowInsets", "windowInsetsProducer",
  "sheetState", "dpSize", "annotatedString", "textStyle", "painter", "datePickerState", "dateRangePickerState",
  "timePickerState", "swipeToDismissState", "bottomSheetScaffoldState", "scrollState", "gridCells", "staggeredGridCells",
  "lazyListState", "lazyGridState", "lazyStaggeredGridState", "pagerState", "textFieldState", "focusProperties", "semantics", "searchBarState", "basicTooltipState", "tooltipState",
  "popupPosition", "dateFormatter", "snackbarHostState", "topAppBarScrollBehavior", "contentTransition")

private val newRuntimeKinds = setOf(
  "topAppBarScrollBehavior", "contentTransition", "scrollState", "eventTextLayout", "eventTextLayoutProvider",
)
private val callbackTupleTypes = setOf("kotlin.Function2", "kotlin.Function3", "kotlin.Function4")
private val callbackTupleValues = setOf(
  "kotlin.String", "kotlin.Boolean", "kotlin.Int", "kotlin.Long", "kotlin.Float", "kotlin.Double",
  "androidx.compose.ui.unit.IntSize", "androidx.compose.ui.unit.DpSize",
  "androidx.compose.ui.geometry.Offset", "androidx.compose.ui.unit.Velocity",
)
private val recordFieldKinds = setOf("float", "double", "int", "dp", "sp", "boolean")
private val styleFieldKinds = recordFieldKinds + setOf("color", "textStyle")

private const val COLOR = "androidx.compose.ui.graphics.Color"
private val factoryTypes = setOf("androidx.compose.material3.ColorScheme")
private val expandedBridgeKinds = setOf(
  "dpSize", "annotatedString", "textStyle", "painter", "gridCells", "staggeredGridCells", "datePickerState",
  "dateRangePickerState", "timePickerState", "swipeToDismissState", "bottomSheetScaffoldState", "scrollState",
  "lazyListState", "lazyGridState", "lazyStaggeredGridState", "pagerState", "textFieldState",
  "searchBarState", "basicTooltipState", "tooltipState", "popupPosition", "dateFormatter", "snackbarHostState",
  "alignmentLine", "focusProperties", "semantics", "ComposePointerIcon", "ComposeDisplayMode", "long",
  "eventLayoutSize", "eventLayoutBounds", "eventLayoutPosition", "eventNullableLayoutPosition", "eventFocusState",
  "ComposeToggleableState", "ComposeOrientation", "ComposeIntrinsicSize", "ComposeContentScale"
)
private val capabilityBridgeKinds = setOf(
  "animationSpec", "animationSpec:size", "animationSpec:offset", "enterTransition", "exitTransition",
  "focusRequester", "bringIntoViewRequester",
  "nestedScrollConnection", "keyPolicy", "textFieldValue", "eventTextFieldValue", "foundationStyle",
  "foundationStyleState", "interactionSource"
)
private val layoutMeasureTypes = listOf("androidx.compose.ui.layout.MeasureScope", "androidx.compose.ui.layout.Measurable",
  "androidx.compose.ui.unit.Constraints", "androidx.compose.ui.layout.MeasureResult")
private val textAdapterKinds = setOf("inputTransformation", "outputTransformation", "visualTransformation")
private val textFieldControlProps = setOf("keyboardOptions", "lineLimits", "keyboardActions", "onKeyboardAction", "singleLine")
private val extendedCapabilityKinds = setOf(
  "keyboardOptions", "textFieldLineLimits", "pageSize", "ComposeSnapPosition", "ComposeMenuAnchorType",
  "ComposeTimePickerDisplayMode", "shadowValue", "gridConfig", "flexBoxConfig", "flexConfig",
  "sliderState", "rangeSliderState", "layoutBoundsHolder", "pullToRefreshState",
  "dragState", "drag2DState", "scrollableState", "scrollable2DState", "transformableState", "anchoredDragState",
  "eventOffset", "eventVelocity", "drawing", "contentDrawing", "cachedDrawing", "borderStroke",
  "carouselState", "overscrollEffect", "flingBehavior", "ComposeAutofillContentType",
  "sharedContentState", "boundsTransform", "visibilityScope", "lookaheadScope",
  "rotaryPolicy", "touchPolicy", "receiveContent", "indication", "rectRulers", "dpPoint", "keyboardActions",
  "eventKeyboardAction", "eventDpSize", "eventMotion", "ComposeFrameRateCategory", "pointerPolicy",
  "dragTypePolicy", "dragTransfer", "dragTarget", "eventInsets", "layoutMeasurePolicy", "layoutModifierMeasure"
)
private val preferredComponentKinds = setOf("int", "float", "double", "dp", "sp", "string", "boolean", "color",
  "colorScheme", "slot", "event", "eventString", "eventBoolean", "eventInt", "eventDouble")
private val reservedProps = setOf("children", "key", "ref", "style", "testID", "modifiers")

private const val PAGER_SCOPE = "androidx.compose.foundation.pager.PagerScope"
private const val CAROUSEL_SCOPE = "androidx.compose.material3.carousel.CarouselItemScope"
private val indexedSlotScopes = setOf(PAGER_SCOPE, CAROUSEL_SCOPE)
private val lazyBuilderScopes = setOf(
  "androidx.compose.foundation.lazy.LazyListScope",
  "androidx.compose.foundation.lazy.grid.LazyGridScope",
  "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope"
)
private val overflowMenuScopes = setOf(
  "androidx.compose.material3.ButtonGroupMenuState",
  "androidx.compose.material3.AppBarMenuState",
)
private const val PADDING_VALUES = "androidx.compose.foundation.layout.PaddingValues"
private const val MODIFIER = "androidx.compose.ui.Modifier"
private val drawingValueKinds = mapOf(
  "androidx.compose.ui.graphics.Shape" to "shape",
  "androidx.compose.ui.graphics.Brush" to "brush"
)
private val specializedModifierTypes = mapOf(
  "androidx.compose.foundation.gestures.AnchoredDraggableState" to "anchoredDragState"
)
private val modifierValueKinds = drawingValueKinds + specializedModifierTypes + mapOf(
  "androidx.compose.ui.input.pointer.PointerInputEventHandler" to "pointerPolicy",
  "androidx.compose.foundation.content.ReceiveContentListener" to "receiveContent",
  "androidx.compose.ui.draganddrop.DragAndDropTarget" to "dragTarget",
  "androidx.compose.ui.layout.RectRulers" to "rectRulers",
  "androidx.compose.animation.SharedTransitionScope.SharedContentState" to "sharedContentState",
  "androidx.compose.animation.BoundsTransform" to "boundsTransform",
  "androidx.compose.animation.AnimatedVisibilityScope" to "visibilityScope",
  "androidx.compose.ui.layout.LookaheadScope" to "lookaheadScope",
  "androidx.compose.foundation.gestures.DraggableState" to "dragState",
  "androidx.compose.foundation.gestures.Draggable2DState" to "drag2DState",
  "androidx.compose.foundation.gestures.ScrollableState" to "scrollableState",
  "androidx.compose.foundation.gestures.Scrollable2DState" to "scrollable2DState",
  "androidx.compose.foundation.gestures.TransformableState" to "transformableState",
  "androidx.compose.foundation.ScrollState" to "scrollState",
  "androidx.compose.foundation.relocation.BringIntoViewRequester" to "bringIntoViewRequester",
  "androidx.compose.ui.layout.AlignmentLine" to "alignmentLine",
  "androidx.compose.ui.layout.HorizontalAlignmentLine" to "alignmentLine"
)
private val modifierVarargKinds = mapOf("androidx.compose.foundation.style.Style" to "foundationStyles")
private val valueSources = mapOf(
  "androidx.compose.ui.FrameRateCategory" to ValueSource("ComposeFrameRateCategory", listOf("androidx.compose.ui.FrameRateCategory")),
  "androidx.compose.ui.autofill.ContentType" to ValueSource("ComposeAutofillContentType", listOf("androidx.compose.ui.autofill.ContentType")),
  "androidx.compose.foundation.gestures.snapping.SnapPosition" to ValueSource("ComposeSnapPosition", listOf("androidx.compose.foundation.gestures.snapping.SnapPosition")),
  "androidx.compose.material3.ExposedDropdownMenuAnchorType" to ValueSource("ComposeMenuAnchorType", listOf("androidx.compose.material3.ExposedDropdownMenuAnchorType")),
  "androidx.compose.material3.TimePickerDisplayMode" to ValueSource("ComposeTimePickerDisplayMode", listOf("androidx.compose.material3.TimePickerDisplayMode")),
  "androidx.compose.ui.Alignment" to ValueSource("ComposeAlignment", listOf("androidx.compose.ui.Alignment")),
  "androidx.compose.ui.Alignment.Horizontal" to ValueSource("ComposeHorizontalAlignment", listOf("androidx.compose.ui.Alignment")),
  "androidx.compose.ui.Alignment.Vertical" to ValueSource("ComposeVerticalAlignment", listOf("androidx.compose.ui.Alignment")),
  "androidx.compose.foundation.layout.Arrangement.Horizontal" to ValueSource("ComposeHorizontalArrangement", listOf("androidx.compose.foundation.layout.Arrangement")),
  "androidx.compose.foundation.layout.Arrangement.Vertical" to ValueSource("ComposeVerticalArrangement", listOf("androidx.compose.foundation.layout.Arrangement")),
  "androidx.compose.ui.text.style.TextAlign" to ValueSource("ComposeTextAlign", listOf("androidx.compose.ui.text.style.TextAlign")),
  "androidx.compose.ui.text.style.TextOverflow" to ValueSource("ComposeTextOverflow", listOf("androidx.compose.ui.text.style.TextOverflow")),
  "androidx.compose.ui.text.font.FontWeight" to ValueSource("ComposeFontWeight", listOf("androidx.compose.ui.text.font.FontWeight")),
  "androidx.compose.ui.state.ToggleableState" to ValueSource("ComposeToggleableState", listOf("androidx.compose.ui.state.ToggleableState")),
  "androidx.compose.foundation.gestures.Orientation" to ValueSource("ComposeOrientation", listOf("androidx.compose.foundation.gestures.Orientation")),
  "androidx.compose.foundation.layout.IntrinsicSize" to ValueSource("ComposeIntrinsicSize", listOf("androidx.compose.foundation.layout.IntrinsicSize")),
  "androidx.compose.ui.layout.ContentScale" to ValueSource("ComposeContentScale", listOf("androidx.compose.ui.layout.ContentScale")),
  "androidx.compose.ui.input.pointer.PointerIcon" to ValueSource("ComposePointerIcon", listOf("androidx.compose.ui.input.pointer.PointerIcon")),
  "androidx.compose.material3.DisplayMode" to ValueSource("ComposeDisplayMode", listOf("androidx.compose.material3.DisplayMode")),
  "androidx.compose.ui.semantics.Role" to ValueSource("ComposeRole", listOf("androidx.compose.ui.semantics.Role"))
)
private const val COMPOSABLE = "androidx.compose.runtime.Composable"
private val scopes = setOf(
  "androidx.compose.foundation.layout.RowScope",
  "androidx.compose.foundation.layout.ColumnScope",
  "androidx.compose.foundation.layout.BoxScope",
  "androidx.compose.foundation.layout.BoxWithConstraintsScope",
  "androidx.compose.foundation.layout.FlowRowScope",
  "androidx.compose.foundation.layout.FlowColumnScope",
  "androidx.compose.animation.AnimatedVisibilityScope",
  "androidx.compose.animation.AnimatedContentScope",
  "androidx.compose.animation.SharedTransitionScope",
  "androidx.compose.material3.ExposedDropdownMenuBoxScope",
  "androidx.compose.material3.FloatingActionButtonMenuScope",
  "androidx.compose.material3.ToggleFloatingActionButtonScope",
  "androidx.compose.material3.MultiChoiceSegmentedButtonRowScope",
  "androidx.compose.material3.SingleChoiceSegmentedButtonRowScope",
  "androidx.compose.material3.TooltipScope",
  "androidx.compose.material3.TabIndicatorScope",
  "androidx.compose.foundation.layout.GridScope",
  "androidx.compose.foundation.layout.FlexBoxScope",
  "androidx.compose.ui.layout.LookaheadScope",
  "androidx.compose.foundation.lazy.LazyItemScope",
  "androidx.compose.foundation.lazy.grid.LazyGridItemScope",
  "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope",
  PAGER_SCOPE,
  CAROUSEL_SCOPE
)
private val scopedExtensionReceivers = setOf(
  "androidx.compose.foundation.layout.RowScope",
  "androidx.compose.material3.FloatingActionButtonMenuScope",
  "androidx.compose.material3.TooltipScope",
  "androidx.compose.material3.MultiChoiceSegmentedButtonRowScope",
  "androidx.compose.material3.SingleChoiceSegmentedButtonRowScope"
)
private val componentValueKinds = mapOf(
  "androidx.compose.material3.ColorScheme" to "colorScheme",
  "androidx.compose.foundation.ScrollState" to "scrollState",
  "androidx.compose.material3.SheetState" to "sheetState",
  "androidx.compose.material3.TopAppBarScrollBehavior" to "topAppBarScrollBehavior",
  "androidx.compose.material3.DatePickerState" to "datePickerState",
  "androidx.compose.material3.DateRangePickerState" to "dateRangePickerState",
  "androidx.compose.material3.TimePickerState" to "timePickerState",
  "androidx.compose.material3.SwipeToDismissBoxState" to "swipeToDismissState",
  "androidx.compose.material3.BottomSheetScaffoldState" to "bottomSheetScaffoldState",
  "androidx.compose.foundation.lazy.LazyListState" to "lazyListState",
  "androidx.compose.foundation.lazy.grid.LazyGridState" to "lazyGridState",
  "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState" to "lazyStaggeredGridState",
  "androidx.compose.foundation.lazy.grid.GridCells" to "gridCells",
  "androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells" to "staggeredGridCells",
  "androidx.compose.foundation.pager.PagerState" to "pagerState",
  "androidx.compose.material3.carousel.CarouselState" to "carouselState",
  "androidx.compose.foundation.text.input.TextFieldState" to "textFieldState",
  "androidx.compose.material3.SearchBarState" to "searchBarState",
  "androidx.compose.foundation.BasicTooltipState" to "basicTooltipState",
  "androidx.compose.material3.TooltipState" to "tooltipState",
  "androidx.compose.ui.window.PopupPositionProvider" to "popupPosition",
  "androidx.compose.material3.DatePickerFormatter" to "dateFormatter",
  "androidx.compose.material3.SnackbarHostState" to "snackbarHostState"
)
private val valueKinds = mapOf(
  "kotlin.String" to "string",
  "kotlin.Char" to "char",
  "kotlin.Boolean" to "boolean",
  "kotlin.Int" to "int",
  "kotlin.Long" to "long",
  "kotlin.Float" to "float",
  "kotlin.Double" to "double",
  "androidx.compose.ui.Modifier" to "modifier",
  "androidx.compose.foundation.text.KeyboardOptions" to "keyboardOptions",
  "androidx.compose.foundation.text.KeyboardActions" to "keyboardActions",
  "androidx.compose.foundation.text.input.KeyboardActionHandler" to "eventKeyboardAction",
  "androidx.compose.foundation.Indication" to "indication",
  "androidx.compose.foundation.BorderStroke" to "borderStroke",
  "androidx.compose.foundation.OverscrollEffect" to "overscrollEffect",
  "androidx.compose.foundation.gestures.FlingBehavior" to "flingBehavior",
  "androidx.compose.foundation.text.input.TextFieldLineLimits" to "textFieldLineLimits",
  "androidx.compose.ui.layout.MeasurePolicy" to "layoutMeasurePolicy",
  "androidx.compose.foundation.text.input.InputTransformation" to "inputTransformation",
  "androidx.compose.foundation.text.input.OutputTransformation" to "outputTransformation",
  "androidx.compose.ui.text.input.VisualTransformation" to "visualTransformation",
  "androidx.compose.foundation.pager.PageSize" to "pageSize",
  "androidx.compose.ui.graphics.shadow.Shadow" to "shadowValue",
  "androidx.compose.foundation.layout.FlexBoxConfig" to "flexBoxConfig",
  "androidx.compose.foundation.layout.FlexConfig" to "flexConfig",
  "androidx.compose.material3.SliderState" to "sliderState",
  "androidx.compose.material3.RangeSliderState" to "rangeSliderState",
  "androidx.compose.material3.pulltorefresh.PullToRefreshState" to "pullToRefreshState",
  "androidx.compose.ui.layout.LayoutBoundsHolder" to "layoutBoundsHolder",
  "androidx.compose.ui.unit.Dp" to "dp",
  "androidx.compose.ui.unit.DpSize" to "dpSize",
  "androidx.compose.foundation.layout.PaddingValues" to "paddingValues",
  "androidx.compose.foundation.layout.WindowInsets" to "windowInsets",
  "androidx.compose.ui.text.AnnotatedString" to "annotatedString",
  "androidx.compose.ui.text.TextStyle" to "textStyle",
  "androidx.compose.ui.text.input.TextFieldValue" to "textFieldValue",
  "androidx.compose.ui.focus.FocusRequester" to "focusRequester",
  "androidx.compose.foundation.interaction.InteractionSource" to "interactionSource",
  "androidx.compose.foundation.interaction.MutableInteractionSource" to "interactionSource",
  "androidx.compose.ui.input.nestedscroll.NestedScrollConnection" to "nestedScrollConnection",
  "androidx.compose.foundation.style.Style" to "foundationStyle",
  "androidx.compose.foundation.style.StyleState" to "foundationStyleState",
  "androidx.compose.animation.EnterTransition" to "enterTransition",
  "androidx.compose.animation.ExitTransition" to "exitTransition",
  "androidx.compose.ui.graphics.painter.Painter" to "painter",
  "androidx.compose.ui.unit.TextUnit" to "sp",
  COLOR to "color"
)
private data class Manifest(
  val schemaVersion: Int,
  val components: List<Component>,
  val modifiers: List<ModifierOverload>,
  val values: List<ValueType>,
  val factories: List<ValueFactory>,
  val records: List<RecordValue>,
  val styleProperties: List<Parameter>,
  val icons: List<MaterialIcon>,
  val discovered: List<Discovery>,
  val coverage: List<Coverage>
)
private data class MaterialIcon(val style: String, val name: String, val property: String, val theme: String)
private data class ModifierOverload(
  val signature: String,
  val name: String,
  val kotlinFunction: String,
  val parameters: List<Parameter>,
  val masks: List<Int>,
  val scope: String?,
  val optIns: List<String>,
  val composable: Boolean? = null,
  val staticOwner: String? = null
)
private data class ValueSource(val name: String, val owners: List<String>)
internal data class ValueType(val name: String, val kotlinType: String, val cases: List<ValueCase>, val optIns: List<String>)
internal data class ValueCase(val name: String, val expression: String)
private data class Component(
  val signature: String,
  val name: String, val kotlinFunction: String, val parameters: List<Parameter>,
  val children: Boolean, val childrenScope: String?, val optIns: List<String>, val masks: List<Int>,
  val childrenParameter: String?, val ownerScope: String?, val scopedExtension: Boolean?
) {
  fun passed(mask: Int): List<Parameter> {
    var bit = 0
    return parameters.filter { !it.optional || it.kind == "modifier" || (mask and (1 shl bit++)) != 0 }
  }
}
internal data class Parameter(
  val name: String, val kind: String, val optional: Boolean, val nullable: Boolean, val scope: String? = null,
  val nativeName: String? = null
)
private data class Candidate(
  val declaration: KSFunctionDeclaration,
  val component: Component,
  val masks: List<Int>,
  val blocked: List<Int>,
  val omitted: List<OmittedParameter>,
  val budgetOmittedForms: Int
)
private data class CallForms(val masks: List<Int>, val omittedCount: Int)
private data class Coverage(
  val signature: String, val status: String, val reason: String?,
  val omittedParameters: List<OmittedParameter>, val omittedForms: List<OmittedForm> = emptyList(),
  val kind: String = "component", val budgetOmittedForms: Int? = null
)
private data class Discovery(
  val kind: String, val signature: String, val binary: Boolean, val parameters: List<DiscoveredParameter>,
  val returnType: String?, val optIns: List<String>
)
private data class DiscoveredParameter(val name: String, val type: String, val optional: Boolean, val vararg: Boolean)
private data class OmittedParameter(val name: String, val kotlinType: String, val reason: String, val required: Boolean)
private data class OmittedForm(val props: List<String>, val reason: String)
private data class ValueFactory(
  val name: String, val kotlinFunction: String, val kotlinType: String,
  val fields: List<String>, val optIns: List<String>
)
