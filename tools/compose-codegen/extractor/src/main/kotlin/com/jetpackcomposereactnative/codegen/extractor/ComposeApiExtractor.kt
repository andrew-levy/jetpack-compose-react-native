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

  @OptIn(KspExperimental::class)
  override fun process(resolver: Resolver): List<KSAnnotated> {
    if (generated) return emptyList()
    generated = true

    valueTypes = discoverValues(resolver)
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
        }.sortedWith(compareBy({ it.declaration.parentDeclaration != null }, { 0 !in it.masks }, { it.component.parameters.count { p -> !p.optional } },
          { -it.component.parameters.size }, { it.declaration.parameters.size }, { it.declaration.signature() }))
        val claimedForms = mutableSetOf<List<String>>()
        candidates.mapNotNull { candidate ->
          val component = candidate.component
          val masks = candidate.masks.filter { mask ->
            claimedForms.add(component.passed(mask).map { "${it.name}:${it.kind.inputType()}" }.sorted())
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
    val manifest = Manifest(4, components, modifiers, valueTypes.values.toList(), factories,
      discovered.sortedWith(compareBy({ it.kind }, { it.signature })),
      coverage.sortedWith(compareBy({ it.kind }, { it.signature })))
    generator.createNewFile(Dependencies(aggregating = true), "", "compose-api-manifest", "json")
      .bufferedWriter().use { Gson().toJson(manifest, it) }
    logger.info("Discovered ${components.size} composable overloads and ${modifiers.size} modifier overloads")
    return emptyList()
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
    if (fn.typeParameters.isNotEmpty()) return omit("unsupported", "Generic composable")
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
      val isSlot = parameter.isContentSlot(type)
      if ((name == "content" || type.isPagerContent()) && isSlot && type.nullability == Nullability.NOT_NULL) {
        childrenParameter = name
        childrenScope = type.contentScope()
        continue
      }
      val kind = when {
        parameter.isVararg || name in reservedProps -> null
        isSlot -> "slot"
        else -> valueKinds[type.name] ?: componentValueKinds[type.name]
          ?: drawingValueKinds[type.name] ?: parameter.eventKind(type) ?: valueTypes[type.name]?.name
          ?: type.rangeKind() ?: parameter.producerKind(type)
      }
      if (kind == null) {
        omitted += OmittedParameter(name, type.signatureName(), when {
          parameter.isVararg -> "Vararg"
          name in reservedProps -> "Reserved React prop"
          else -> "Unsupported bridge type"
        }, !parameter.hasDefault && !parameter.isVararg)
        continue
      }
      supported += Parameter(name, kind, parameter.hasDefault, type.nullability == Nullability.NULLABLE,
        scope = if (isSlot) type.contentScope() else null)
    }
    if (omitted.any { it.required }) return omit("adapterRequired", "Required parameter cannot cross the bridge", omitted)

    val types = fn.parameters.associate { it.name!!.asString() to it.type.resolve() }
    val parameters = supported
    val component = Component(fn.signature(), fn.simpleName.asString(), function, parameters, childrenParameter != null, childrenScope,
      optIns.mapNotNull { it.qualifiedName?.asString() }.sorted(), emptyList(),
      childrenParameter = childrenParameter?.takeUnless { it == "content" }, ownerScope = ownerScope,
      scopedExtension = if (receiver != null) true else null)
    val optional = parameters.filter { it.optional && it.kind != "modifier" }
    val newlyBridgeable = parameters.any { !it.optional && it.kind in expandedBridgeKinds } ||
      childrenScope == PADDING_VALUES || childrenScope in lazyBuilderScopes
    val forms = callForms(optional, newlyBridgeable)
    val (masks, blocked) = forms.masks.partition { mask ->
      val passed = component.passed(mask).associate { it.name to types.getValue(it.name) }.toMutableMap()
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
        val receiver = (fn.parentDeclaration as? KSClassDeclaration)?.qualifiedName?.asString()
        if (receiver != null && receiver !in scopes) {
          return@mapNotNull omit("adapterRequired", "Modifier requires a native owner: $receiver")
        }
        val optIns = fn.optInMarkers()
        if (fn.typeParameters.isNotEmpty()) return@mapNotNull omit("adapterRequired", "Generic modifier")
        if (optIns.any { it.getVisibility() != Visibility.PUBLIC }) {
          return@mapNotNull omit("unsupported", "Opt-in marker is not public")
        }
        if (fn.annotations.any { it.annotationType.resolve().name == COMPOSABLE }) {
          return@mapNotNull omit("adapterRequired", "Modifier must run in composition")
        }

        val parameters = mutableListOf<Parameter>()
        for (parameter in fn.parameters) {
          val name = parameter.name?.asString() ?: return@mapNotNull omit("unsupported", "Unnamed parameter")
          val type = parameter.type.resolve()
          val kind = when {
            parameter.isVararg -> null
            qualifiedName == "androidx.compose.ui.layout.layoutId" && name == "layoutId" && type.name == "kotlin.Any" -> "string"
            else -> modifierValueKinds[type.name] ?: valueKinds[type.name] ?: valueTypes[type.name]?.name
              ?: type.rangeKind() ?: parameter.eventKind(type) ?: type.modifierReceiverKind()
          }
          if (kind == null || kind == "modifier") {
            val reason = if (parameter.isVararg) "Vararg" else "Unsupported bridge type"
            omitted += OmittedParameter(name, type.signatureName(), reason, !parameter.hasDefault && !parameter.isVararg)
          } else {
            parameters += Parameter(name, kind, parameter.hasDefault, type.nullability == Nullability.NULLABLE)
          }
        }
        if (omitted.any { it.required }) return@mapNotNull omit("adapterRequired", "Required parameter cannot cross the bridge")

        val optional = parameters.filter { it.optional }
        val forms = callForms(optional, parameters.any { !it.optional && it.kind in expandedBridgeKinds })
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
          optIns.mapNotNull { it.qualifiedName?.asString() }.sorted())
      }.sortedBy { overload -> overload.parameters.joinToString { "${it.name}:${it.kind}" } }
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
        enumCases + holders.filter { it.classKind == ClassKind.OBJECT }.flatMap { holder ->
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
    if (name?.asString() != "content" && !type.isPagerContent() &&
      (this.type.annotations + type.annotations).none { it.annotationType.resolve().name == COMPOSABLE }) return false
    if (type.arguments.lastOrNull()?.type?.resolve()?.name != "kotlin.Unit") return false
    return when (type.name) {
      "kotlin.Function0" -> true
      "kotlin.Function1" -> type.contentScope() != null
      "kotlin.Function2" -> type.isPagerContent()
      else -> false
    }
  }

  private fun KSType.rangeKind(): String? =
    if (name == "kotlin.ranges.ClosedFloatingPointRange" &&
      arguments.singleOrNull()?.type?.resolve()?.name == "kotlin.Float") "floatRange" else null

  private fun KSType.isPagerContent(): Boolean = name == "kotlin.Function2" &&
    arguments[0].type?.resolve()?.name == PAGER_SCOPE && arguments[1].type?.resolve()?.name == "kotlin.Int" &&
    arguments[2].type?.resolve()?.name == "kotlin.Unit"

  private fun KSType.contentScope(): String? = when {
    isPagerContent() -> PAGER_SCOPE
    name == "kotlin.Function1" -> arguments.first().type?.resolve()?.name?.takeIf {
      it in scopes || it in lazyBuilderScopes || it == PADDING_VALUES
    }
    else -> null
  }

  private fun KSValueParameter.eventKind(type: KSType): String? {
    val parameter = name?.asString().orEmpty()
    if (!parameter.startsWith("on") && parameter != "callback") return null
    if (type.arguments.lastOrNull()?.type?.resolve()?.name != "kotlin.Unit") return null
    val argument = type.arguments.firstOrNull()?.type?.resolve()
    return when (type.name) {
      "kotlin.Function0" -> "event"
      "kotlin.Function1" -> when (argument?.name) {
        "kotlin.String" -> "eventString"
        "kotlin.Boolean" -> "eventBoolean"
        "kotlin.Float" -> "eventFloat"
        "kotlin.Double" -> "eventDouble"
        "kotlin.Int" -> "eventInt"
        "androidx.compose.ui.unit.IntSize" -> "eventLayoutSize"
        "androidx.compose.ui.spatial.RelativeLayoutBounds" -> "eventLayoutBounds"
        "androidx.compose.ui.layout.LayoutCoordinates" ->
          if (argument.isMarkedNullable) "eventNullableLayoutPosition" else "eventLayoutPosition"
        "androidx.compose.ui.focus.FocusState" -> "eventFocusState"
        else -> if (argument?.rangeKind() == "floatRange") "eventFloatRange" else null
      }
      else -> null
    }
  }

  private fun KSType.modifierReceiverKind(): String? {
    if (name != "kotlin.Function1" || arguments.last().type?.resolve()?.name != "kotlin.Unit") return null
    return when (arguments.first().type?.resolve()?.name) {
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
  this == "color" || startsWith("Compose") -> "string"
  this == "floatRange" -> "tuple"
  this == "alignmentLine" -> "string"
  this in objectKinds -> "object"
  startsWith("event") -> "function"
  else -> this
}

private val objectKinds = setOf("colorScheme", "paddingValues", "windowInsets", "windowInsetsProducer",
  "sheetState", "dpSize", "annotatedString", "textStyle", "painter", "datePickerState", "dateRangePickerState",
  "timePickerState", "swipeToDismissState", "bottomSheetScaffoldState", "scrollState", "gridCells", "staggeredGridCells",
  "lazyListState", "lazyGridState", "lazyStaggeredGridState", "pagerState", "textFieldState", "focusProperties", "semantics", "searchBarState", "basicTooltipState", "tooltipState",
  "popupPosition", "dateFormatter", "snackbarHostState")

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
private val preferredComponentKinds = setOf("int", "float", "double", "dp", "sp", "string", "boolean", "color",
  "colorScheme", "slot", "event", "eventString", "eventBoolean", "eventInt", "eventDouble")
private val reservedProps = setOf("children", "key", "ref", "style", "testID", "modifiers")

private const val PAGER_SCOPE = "androidx.compose.foundation.pager.PagerScope"
private val lazyBuilderScopes = setOf(
  "androidx.compose.foundation.lazy.LazyListScope",
  "androidx.compose.foundation.lazy.grid.LazyGridScope",
  "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope"
)
private const val PADDING_VALUES = "androidx.compose.foundation.layout.PaddingValues"
private const val MODIFIER = "androidx.compose.ui.Modifier"
private val drawingValueKinds = mapOf(
  "androidx.compose.ui.graphics.Shape" to "shape",
  "androidx.compose.ui.graphics.Brush" to "brush"
)
private val modifierValueKinds = drawingValueKinds + mapOf(
  "androidx.compose.foundation.ScrollState" to "scrollState",
  "androidx.compose.ui.layout.AlignmentLine" to "alignmentLine",
  "androidx.compose.ui.layout.HorizontalAlignmentLine" to "alignmentLine"
)
private val valueSources = mapOf(
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
  "androidx.compose.animation.SharedTransitionScope",
  "androidx.compose.material3.ExposedDropdownMenuBoxScope",
  "androidx.compose.material3.FloatingActionButtonMenuScope",
  "androidx.compose.material3.ToggleFloatingActionButtonScope",
  "androidx.compose.material3.MultiChoiceSegmentedButtonRowScope",
  "androidx.compose.material3.SingleChoiceSegmentedButtonRowScope",
  "androidx.compose.material3.TooltipScope",
  "androidx.compose.ui.layout.LookaheadScope",
  "androidx.compose.foundation.lazy.LazyItemScope",
  "androidx.compose.foundation.lazy.grid.LazyGridItemScope",
  "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope",
  PAGER_SCOPE
)
private val scopedExtensionReceivers = setOf(
  "androidx.compose.material3.TooltipScope",
  "androidx.compose.material3.MultiChoiceSegmentedButtonRowScope",
  "androidx.compose.material3.SingleChoiceSegmentedButtonRowScope"
)
private val componentValueKinds = mapOf(
  "androidx.compose.material3.ColorScheme" to "colorScheme",
  "androidx.compose.material3.SheetState" to "sheetState",
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
  "kotlin.Boolean" to "boolean",
  "kotlin.Int" to "int",
  "kotlin.Long" to "long",
  "kotlin.Float" to "float",
  "kotlin.Double" to "double",
  "androidx.compose.ui.Modifier" to "modifier",
  "androidx.compose.ui.unit.Dp" to "dp",
  "androidx.compose.ui.unit.DpSize" to "dpSize",
  "androidx.compose.foundation.layout.PaddingValues" to "paddingValues",
  "androidx.compose.foundation.layout.WindowInsets" to "windowInsets",
  "androidx.compose.ui.text.AnnotatedString" to "annotatedString",
  "androidx.compose.ui.text.TextStyle" to "textStyle",
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
  val discovered: List<Discovery>,
  val coverage: List<Coverage>
)
private data class ModifierOverload(
  val signature: String,
  val name: String,
  val kotlinFunction: String,
  val parameters: List<Parameter>,
  val masks: List<Int>,
  val scope: String?,
  val optIns: List<String>
)
private data class ValueSource(val name: String, val owners: List<String>)
private data class ValueType(val name: String, val kotlinType: String, val cases: List<ValueCase>, val optIns: List<String>)
private data class ValueCase(val name: String, val expression: String)
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
private data class Parameter(
  val name: String, val kind: String, val optional: Boolean, val nullable: Boolean, val scope: String? = null
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
