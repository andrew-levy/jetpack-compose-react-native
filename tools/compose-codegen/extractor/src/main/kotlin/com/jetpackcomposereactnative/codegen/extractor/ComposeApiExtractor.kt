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
import com.google.devtools.ksp.symbol.KSValueParameter
import com.google.devtools.ksp.symbol.Nullability
import com.google.devtools.ksp.symbol.Visibility
import com.google.gson.Gson

class ComposeApiExtractorProvider : SymbolProcessorProvider {
  override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor =
    ComposeApiExtractor(
      environment.codeGenerator,
      environment.logger,
      environment.packages("composePackages"),
      environment.packages("modifierPackages")
    )
}

private fun SymbolProcessorEnvironment.packages(key: String): List<String> =
  options.getValue(key).split(';').map(String::trim).filter(String::isNotEmpty).distinct()

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
    val functions = packages.flatMap { resolver.getDeclarationsFromPackage(it).toList() }
      .filterIsInstance<KSFunctionDeclaration>()
    val declarations = functions
      .filter { it.qualifiedName != null && it.getVisibility() == Visibility.PUBLIC }
      .filter { fn -> fn.annotations.any { it.annotationType.resolve().name == COMPOSABLE } }
      .sortedBy { it.signature() }
    val coverage = mutableListOf<Coverage>()
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
            candidate.omitted, omittedForms
          )
          if (masks.isEmpty()) null else component.copy(masks = masks)
        }
      }

    if (components.isEmpty()) {
      logger.error("No bridgeable @Composable declarations found in " + packages.joinToString())
      return emptyList()
    }

    val modifiers = discoverModifiers(resolver)
    val factories = discoverFactories(resolver, functions)
    val manifest = Manifest(3, components, modifiers, valueTypes.values.toList(), factories, coverage.sortedBy { it.signature })
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
    if (fn.extensionReceiver != null) return omit("unsupported", "Extension receiver requires a native scope")
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
    if (omitted.any { it.required }) return omit("unsupported", "Required parameter cannot cross the bridge", omitted)

    // Bound generated call sites while keeping the established primitive and slot props first.
    val optional = supported.filter { it.optional && it.kind != "modifier" }
    val established = optional.filter { it.kind in preferredComponentKinds }.take(4).toSet()
    val constants = optional.filter { parameter -> valueTypes.values.any { it.name == parameter.kind } }
    val prioritized = (established + constants + optional).toList()
    val overBudget = prioritized.drop(MAX_COMPONENT_OPTIONALS).map { it.name }.toSet()
    val types = fn.parameters.associate { it.name!!.asString() to it.type.resolve() }
    omitted += overBudget.map { OmittedParameter(it, types.getValue(it).signatureName(), "Kotlin default-argument call budget", false) }
    val parameters = supported.filterNot { it.name in overBudget }
    val component = Component(fn.simpleName.asString(), function, parameters, children, childrenScope,
      optIns.mapNotNull { it.qualifiedName?.asString() }.sorted(), emptyList())
    val optionalCount = parameters.count { it.optional && it.kind != "modifier" }
    val (masks, blocked) = (0 until (1 shl optionalCount)).partition { mask ->
      val passed = component.passed(mask).associate { it.name to types.getValue(it.name) }.toMutableMap()
      if (children) passed["content"] = types.getValue("content")
      overloads.none { other ->
        other != fn && !other.isDeprecated() && other.parameters.size <= fn.parameters.size && accepts(other, passed)
      }
    }
    if (masks.isEmpty()) return omit("unsupported", "No unambiguous Kotlin call forms", omitted)
    return Candidate(fn, component, masks, blocked, omitted)
  }

  private fun discoverFactories(resolver: Resolver, functions: List<KSFunctionDeclaration>): List<ValueFactory> =
    factoryTypes.flatMap { type ->
      val declaration = resolver.getClassDeclarationByName(resolver.getKSNameFromString(type)) ?: return@flatMap emptyList()
      val properties = declaration.getAllProperties()
        .filter { it.getVisibility() == Visibility.PUBLIC && it.type.resolve().name == COLOR }
        .map { it.simpleName.asString() }.toSet()
      val copyFields = declaration.getAllFunctions()
        .filter { it.simpleName.asString() == "copy" && it.getVisibility() == Visibility.PUBLIC && !it.isDeprecated() }
        .map { copy -> copy.parameters.mapNotNull { it.name?.asString() }.toSet() }
        .firstOrNull { it == properties } ?: return@flatMap emptyList()
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
  private fun discoverModifiers(resolver: Resolver): List<ModifierOverload> {
    val topLevel = modifierPackages.flatMap { resolver.getDeclarationsFromPackage(it).toList() }
      .filterIsInstance<KSFunctionDeclaration>()
    val scoped = scopes.filter { it.substringBeforeLast('.') in modifierPackages }.flatMap { scope ->
      resolver.getClassDeclarationByName(resolver.getKSNameFromString(scope))
        ?.declarations?.filterIsInstance<KSFunctionDeclaration>()?.toList().orEmpty()
    }
    return (topLevel + scoped)
      .filter {
        it.getVisibility() == Visibility.PUBLIC && it.qualifiedName != null &&
          it.extensionReceiver?.resolve()?.name == MODIFIER && it.returnType?.resolve()?.name == MODIFIER
      }
      .groupBy { it.qualifiedName!!.asString() }
      .toSortedMap()
      .flatMap { (qualifiedName, declarations) ->
        val available = declarations.filter { fn ->
          fn.annotations.none { it.annotationType.resolve().name == "kotlin.Deprecated" }
        }
        available.mapNotNull { fn ->
          val optIns = fn.optInMarkers()
          if (fn.typeParameters.isNotEmpty() || optIns.any { it.getVisibility() != Visibility.PUBLIC } ||
            fn.annotations.any { it.annotationType.resolve().name == COMPOSABLE }
          ) return@mapNotNull null

          val parameters = mutableListOf<Parameter>()
          for (parameter in fn.parameters) {
            val name = parameter.name?.asString() ?: return@mapNotNull null
            val type = parameter.type.resolve()
            val kind = if (parameter.isVararg) null else
              modifierValueKinds[type.name] ?: valueKinds[type.name] ?: valueTypes[type.name]?.name ?: parameter.eventKind(type)
            if (kind == null || kind == "modifier") {
              if (!parameter.hasDefault) return@mapNotNull null
            } else if (!parameter.hasDefault || parameters.count { it.optional } < MAX_OPTIONAL_VALUES) {
              parameters += Parameter(name, kind, parameter.hasDefault, type.nullability == Nullability.NULLABLE)
            }
          }

          val optional = parameters.filter { it.optional }
          val parameterTypes = fn.parameters.associate { it.name!!.asString() to it.type.resolve() }
          val masks = (0 until (1 shl optional.size)).filter { mask ->
            val passed = parameters.filter { !it.optional || (mask and (1 shl optional.indexOf(it))) != 0 }
              .associate { it.name to parameterTypes.getValue(it.name) }
            available.none { other ->
              other != fn && other.parameters.size <= fn.parameters.size && accepts(other, passed)
            }
          }
          if (masks.isEmpty()) return@mapNotNull null
          val receiver = (fn.parentDeclaration as? KSClassDeclaration)?.qualifiedName?.asString()
          ModifierOverload(fn.simpleName.asString(), qualifiedName, parameters, masks, receiver,
            optIns.mapNotNull { it.qualifiedName?.asString() }.sorted())
        }.distinct().sortedBy { overload ->
          overload.parameters.joinToString { "${it.name}:${it.kind}" }
        }
      }
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
    append(name ?: declaration.simpleName.asString())
    if (arguments.isNotEmpty()) append(arguments.joinToString(prefix = "<", postfix = ">") {
      it.type?.resolve()?.signatureName() ?: "*"
    })
    if (nullability == Nullability.NULLABLE) append("?")
  }

  private fun KSDeclaration.isDeprecated(): Boolean =
    annotations.any { it.annotationType.resolve().name == "kotlin.Deprecated" }

  private fun KSDeclaration.isHiddenOrErrorDeprecated(): Boolean =
    annotations.filter { it.annotationType.resolve().name == "kotlin.Deprecated" }
      .flatMap { it.arguments }.filter { it.name?.asString() == "level" }
      .any { argument -> argument.value.toString().substringAfterLast('.') in setOf("ERROR", "HIDDEN") }

  private fun KSFunctionDeclaration.isComposableTarget(expected: String): Boolean =
    annotations.filter { it.annotationType.resolve().name == "androidx.compose.runtime.ComposableTarget" }
      .all { it.arguments.singleOrNull()?.value == expected }

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
    if (type.name == "kotlin.Function0" && type.arguments.singleOrNull()?.type?.resolve()?.name == "kotlin.Float" &&
      (this.type.annotations + type.annotations).none { it.annotationType.resolve().name == COMPOSABLE }
    ) "floatProducer" else null

  private val KSType.name: String? get() = declaration.qualifiedName?.asString()
}

private fun String.inputType(): String = when {
  this in setOf("int", "float", "double", "dp", "sp", "floatProducer") -> "number"
  this == "color" || startsWith("Compose") -> "string"
  this == "colorScheme" || this == "floatRange" -> "object"
  startsWith("event") -> "function"
  else -> this
}

private const val COLOR = "androidx.compose.ui.graphics.Color"
private val factoryTypes = setOf("androidx.compose.material3.ColorScheme")
private val reservedProps = setOf("children", "key", "ref", "style", "testID", "modifiers")
private val preferredComponentKinds = setOf("int", "float", "double", "dp", "sp", "string", "boolean", "color",
  "colorScheme", "slot", "event", "eventString", "eventBoolean", "eventFloat", "eventInt", "eventDouble")

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
private const val MAX_OPTIONAL_VALUES = 4
private const val MAX_COMPONENT_OPTIONALS = 7
private val scopes = setOf(
  "androidx.compose.foundation.layout.RowScope",
  "androidx.compose.foundation.layout.ColumnScope",
  "androidx.compose.foundation.layout.BoxScope",
  "androidx.compose.foundation.layout.FlowRowScope",
  "androidx.compose.foundation.layout.FlowColumnScope"
)
private val componentValueKinds = mapOf("androidx.compose.material3.ColorScheme" to "colorScheme")
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
  val coverage: List<Coverage>
)
private data class ModifierOverload(
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
  val omitted: List<OmittedParameter>
)
private data class Coverage(
  val signature: String, val status: String, val reason: String?,
  val omittedParameters: List<OmittedParameter>, val omittedForms: List<OmittedForm> = emptyList()
)
private data class OmittedParameter(val name: String, val kotlinType: String, val reason: String, val required: Boolean)
private data class OmittedForm(val props: List<String>, val reason: String)
private data class ValueFactory(
  val name: String, val kotlinFunction: String, val kotlinType: String,
  val fields: List<String>, val optIns: List<String>
)
