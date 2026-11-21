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
        }.sortedWith(compareBy({ 0 !in it.masks }, { it.component.parameters.count { p -> !p.optional } },
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
    if (fn.parentDeclaration != null) return omit("adapterRequired", "Member composable requires a native owner")
    if (fn.extensionReceiver != null) return omit("adapterRequired", "Extension receiver requires a native scope")
    if (fn.typeParameters.isNotEmpty()) return omit("unsupported", "Generic composable")
    if (fn.returnType?.resolve()?.name != "kotlin.Unit") return omit("unsupported", "Composable returns a value")
    val optIns = fn.optInMarkers()
    if (optIns.any { it.getVisibility() != Visibility.PUBLIC }) {
      return omit("unsupported", "Opt-in marker is not public")
    }

    val supported = mutableListOf<Parameter>()
    val omitted = mutableListOf<OmittedParameter>()
    var childrenScope: String? = null
    var children = false
    for (parameter in fn.parameters) {
      val name = parameter.name?.asString() ?: return omit("unsupported", "Unnamed parameter")
      val type = parameter.type.resolve()
      val isSlot = parameter.isContentSlot(type)
      if (name == "content" && isSlot && type.nullability == Nullability.NOT_NULL) {
        children = true
        childrenScope = type.contentScope()
        continue
      }
      val kind = when {
        parameter.isVararg || name in reservedProps -> null
        isSlot -> "slot"
        else -> valueKinds[type.name] ?: componentValueKinds[type.name]
          ?: modifierValueKinds[type.name] ?: parameter.eventKind(type) ?: valueTypes[type.name]?.name
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
    val component = Component(fn.signature(), fn.simpleName.asString(), function, parameters, children, childrenScope,
      optIns.mapNotNull { it.qualifiedName?.asString() }.sorted(), emptyList())
    val optional = parameters.filter { it.optional && it.kind != "modifier" }
    val forms = callForms(optional)
    val (masks, blocked) = forms.masks.partition { mask ->
      val passed = component.passed(mask).associate { it.name to types.getValue(it.name) }.toMutableMap()
      if (children) passed["content"] = types.getValue("content")
      overloads.none { other ->
        other != fn && !other.isDeprecated() && other.parameters.size <= fn.parameters.size && accepts(other, passed)
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
          val kind = if (parameter.isVararg) null else
            modifierValueKinds[type.name] ?: valueKinds[type.name] ?: valueTypes[type.name]?.name
              ?: parameter.eventKind(type)?.takeUnless { it == "eventFloatRange" }
          if (kind == null || kind == "modifier") {
            val reason = if (parameter.isVararg) "Vararg" else "Unsupported bridge type"
            omitted += OmittedParameter(name, type.signatureName(), reason, !parameter.hasDefault && !parameter.isVararg)
          } else {
            parameters += Parameter(name, kind, parameter.hasDefault, type.nullability == Nullability.NULLABLE)
          }
        }
        if (omitted.any { it.required }) return@mapNotNull omit("adapterRequired", "Required parameter cannot cross the bridge")

        val optional = parameters.filter { it.optional }
        val forms = callForms(optional)
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

  private fun callForms(optional: List<Parameter>): CallForms {
    require(optional.size < Int.SIZE_BITS - 1) { "Too many optional parameters for a Compose call mask" }
    val total = 1 shl optional.size
    if (total <= 1024) return CallForms((0 until total).toList(), 0)

    // Keep the previous public set, then combine every extra prop with every subset of that set.
    // Also support the full call. The report accounts for the remaining combinations.
    val established = optional.filter { it.kind in preferredComponentKinds }.take(4).toSet()
    val constants = optional.filter { parameter -> valueTypes.values.any { it.name == parameter.kind } }
    val core = (established + constants + optional).take(7)
    val extra = (optional - core.toSet()).map { 1 shl optional.indexOf(it) }
    val coreMasks = core.fold(listOf(0)) { masks, parameter ->
      val bit = 1 shl optional.indexOf(parameter)
      masks + masks.map { it or bit }
    }
    val masks = (coreMasks + extra.flatMap { bit -> coreMasks.map { it or bit } } + (total - 1)).sorted()
    return CallForms(masks, total - masks.size)
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
        holders.filter { it.classKind == ClassKind.OBJECT }.flatMap { holder ->
          holder.declarations.filterIsInstance<KSPropertyDeclaration>()
            .filter { it.getVisibility() == Visibility.PUBLIC && expected.isAssignableFrom(it.type.resolve()) }
            .filter { property -> property.annotations.none { it.annotationType.resolve().name == "kotlin.Deprecated" } }
            .map { property ->
              val name = property.simpleName.asString()
              ValueCase(name.replaceFirstChar { it.lowercaseChar() }, "$ownerName.$name")
            }.toList()
        }
      }.distinctBy { it.name }.sortedBy { it.name }
      if (properties.isEmpty()) null else typeName to ValueType(source.name, typeName, properties)
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
    if (name?.asString() != "content" &&
      (this.type.annotations + type.annotations).none { it.annotationType.resolve().name == COMPOSABLE }) return false
    if (type.arguments.lastOrNull()?.type?.resolve()?.name != "kotlin.Unit") return false
    return when (type.name) {
      "kotlin.Function0" -> true
      "kotlin.Function1" -> type.contentScope() != null
      else -> false
    }
  }

  private fun KSType.rangeKind(): String? =
    if (name == "kotlin.ranges.ClosedFloatingPointRange" &&
      arguments.singleOrNull()?.type?.resolve()?.name == "kotlin.Float") "floatRange" else null

  private fun KSType.contentScope(): String? =
    if (name == "kotlin.Function1") arguments.first().type?.resolve()?.name?.takeIf { it in scopes } else null

  private fun KSValueParameter.eventKind(type: KSType): String? {
    if (!name?.asString().orEmpty().startsWith("on")) return null
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
        else -> if (argument?.rangeKind() == "floatRange") "eventFloatRange" else null
      }
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
  this in setOf("int", "float", "double", "dp", "sp", "floatProducer") -> "number"
  this == "color" || startsWith("Compose") -> "string"
  this in setOf("colorScheme", "floatRange", "paddingValues", "windowInsets", "windowInsetsProducer", "sheetState") -> "object"
  startsWith("event") -> "function"
  else -> this
}

private const val COLOR = "androidx.compose.ui.graphics.Color"
private val factoryTypes = setOf("androidx.compose.material3.ColorScheme")
private val preferredComponentKinds = setOf("int", "float", "double", "dp", "sp", "string", "boolean", "color",
  "colorScheme", "slot", "event", "eventString", "eventBoolean", "eventInt", "eventDouble")
private val reservedProps = setOf("children", "key", "ref", "style", "testID", "modifiers")

private const val MODIFIER = "androidx.compose.ui.Modifier"
private val modifierValueKinds = mapOf(
  "androidx.compose.ui.graphics.Shape" to "shape",
  "androidx.compose.ui.graphics.Brush" to "brush"
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
  "androidx.compose.ui.semantics.Role" to ValueSource("ComposeRole", listOf("androidx.compose.ui.semantics.Role"))
)
private const val COMPOSABLE = "androidx.compose.runtime.Composable"
private val scopes = setOf(
  "androidx.compose.foundation.layout.RowScope",
  "androidx.compose.foundation.layout.ColumnScope",
  "androidx.compose.foundation.layout.BoxScope",
  "androidx.compose.foundation.layout.BoxWithConstraintsScope",
  "androidx.compose.foundation.layout.FlowRowScope",
  "androidx.compose.foundation.layout.FlowColumnScope"
)
private val componentValueKinds = mapOf(
  "androidx.compose.material3.ColorScheme" to "colorScheme",
  "androidx.compose.foundation.layout.PaddingValues" to "paddingValues",
  "androidx.compose.foundation.layout.WindowInsets" to "windowInsets",
  "androidx.compose.material3.SheetState" to "sheetState"
)
private val valueKinds = mapOf(
  "kotlin.String" to "string",
  "kotlin.Boolean" to "boolean",
  "kotlin.Int" to "int",
  "kotlin.Float" to "float",
  "kotlin.Double" to "double",
  "androidx.compose.ui.Modifier" to "modifier",
  "androidx.compose.ui.unit.Dp" to "dp",
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
private data class ValueType(val name: String, val kotlinType: String, val cases: List<ValueCase>)
private data class ValueCase(val name: String, val expression: String)
private data class Component(
  val signature: String,
  val name: String, val kotlinFunction: String, val parameters: List<Parameter>,
  val children: Boolean, val childrenScope: String?, val optIns: List<String>, val masks: List<Int>
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
