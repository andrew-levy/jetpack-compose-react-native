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
    val declarations = packages.flatMap { resolver.getDeclarationsFromPackage(it).toList() }
      .filterIsInstance<KSFunctionDeclaration>()
      .filter { it.simpleName.asString().firstOrNull()?.isUpperCase() == true }
      .filter { it.qualifiedName != null && it.getVisibility() == Visibility.PUBLIC }
      .filter { it.extensionReceiver == null && it.typeParameters.isEmpty() }
      .filter { fn -> fn.annotations.any { it.annotationType.resolve().name == COMPOSABLE } }

    val components = declarations.groupBy { it.qualifiedName!!.asString() }
      .values.mapNotNull { overloads ->
        overloads.mapNotNull(::describe)
          .sortedWith(compareBy({ it.component.parameters.count { p -> !p.optional } },
            { -it.component.parameters.size }, { it.declaration.parameters.size }, { it.signature }))
          .firstOrNull { candidate -> overloads.none { it != candidate.declaration && conflicts(candidate, it) } }
          ?.component
      }
      .groupBy { it.name }.values.filter { it.size == 1 }.flatten().sortedBy { it.name }

    if (components.isEmpty()) {
      logger.error("No bridgeable @Composable declarations found in " + packages.joinToString())
      return emptyList()
    }

    val modifiers = discoverModifiers(resolver)
    generator.createNewFile(Dependencies(aggregating = true), "", "compose-api-manifest", "json")
      .bufferedWriter().use { Gson().toJson(Manifest(2, components, modifiers, valueTypes.values.toList()), it) }
    logger.info("Discovered ${components.size} composables and ${modifiers.size} modifier overloads")
    return emptyList()
  }

  private fun describe(fn: KSFunctionDeclaration): Candidate? {
    val annotations = fn.annotations.mapNotNull { it.annotationType.resolve().name }.toList()
    if (annotations.any { it == "kotlin.Deprecated" || it.substringAfterLast('.').startsWith("Experimental") }) return null
    if (fn.returnType?.resolve()?.name != "kotlin.Unit") return null

    val parameters = mutableListOf<Parameter>()
    val extraValues = mutableListOf<Parameter>()
    val passed = mutableMapOf<String, KSType>()
    var children = false
    var childrenScope: String? = null
    var optionalValues = 0
    for (parameter in fn.parameters) {
      val name = parameter.name?.asString() ?: return null
      val type = parameter.type.resolve()
      val isSlot = parameter.isContentSlot(type)
      if (name == "content" && isSlot && type.nullability == Nullability.NOT_NULL) {
        children = true
        childrenScope = type.contentScope()
        passed[name] = type
        continue
      }
      val kind = when {
        parameter.isVararg -> null
        isSlot -> "slot"
        else -> valueKinds[type.name] ?: componentValueKinds[type.name]
          ?: parameter.eventKind(type) ?: valueTypes[type.name]?.name
      }
      if (kind == null) {
        if (!parameter.hasDefault) return null
        continue
      }
      if (parameter.hasDefault && type.name in valueTypes) {
        extraValues += Parameter(name, kind, optional = true, type.nullability == Nullability.NULLABLE)
        continue
      }
      // Each optional value adds a branch so Kotlin can apply its own default.
      if (parameter.hasDefault && kind != "modifier" && ++optionalValues > MAX_OPTIONAL_VALUES) continue
      parameters += Parameter(name, kind, parameter.hasDefault, type.nullability == Nullability.NULLABLE,
        scope = if (isSlot) type.contentScope() else null)
      if (!parameter.hasDefault || kind == "modifier") passed[name] = type
    }

    // Preserve the existing scalar props when adding reusable Compose value types.
    parameters += extraValues.take(MAX_COMPONENT_OPTIONALS - optionalValues.coerceAtMost(MAX_OPTIONAL_VALUES))
    val function = fn.qualifiedName!!.asString()
    val component = Component(fn.simpleName.asString(), function, parameters, children, childrenScope)
    val signature = fn.parameters.joinToString { it.type.resolve().toString() }
    return Candidate(fn, component, passed, signature)
  }

  @OptIn(KspExperimental::class)
  private fun discoverModifiers(resolver: Resolver): List<ModifierOverload> {
    val topLevel = modifierPackages.flatMap { resolver.getDeclarationsFromPackage(it).toList() }
      .filterIsInstance<KSFunctionDeclaration>()
    val scoped = scopes.filter { it.substringBeforeLast('.') in modifierPackages }.flatMap { scope ->
      resolver.getClassDeclarationByName(resolver.getKSNameFromString(scope))
        ?.takeUnless { it.requiresOptIn() }
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
          if (fn.typeParameters.isNotEmpty() || fn.requiresOptIn() ||
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
          ModifierOverload(fn.simpleName.asString(), qualifiedName, parameters, masks, receiver)
        }.distinct().sortedBy { overload ->
          overload.parameters.joinToString { "${it.name}:${it.kind}" }
        }
      }
  }

  private fun accepts(fn: KSFunctionDeclaration, passed: Map<String, KSType>): Boolean {
    val parameters = fn.parameters.associateBy { it.name?.asString() }
    if (parameters.values.any { !it.hasDefault && it.name?.asString() !in passed }) return false
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

  private fun conflicts(candidate: Candidate, other: KSFunctionDeclaration): Boolean {
    if (other.annotations.any { it.annotationType.resolve().name == "kotlin.Deprecated" }) return false
    val otherParameters = other.parameters.associateBy { it.name?.asString() }
    if (otherParameters.values.any { !it.hasDefault && it.name?.asString() !in candidate.passed }) return false
    return candidate.passed.all { (name, type) ->
      val otherType = otherParameters[name]?.type?.resolve()
      otherType != null && otherType.isAssignableFrom(type)
    }
  }

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

  private fun KSAnnotated.requiresOptIn(): Boolean = annotations.any { annotation ->
    val type = annotation.annotationType.resolve()
    type.name?.substringAfterLast('.')?.startsWith("Experimental") == true ||
      type.declaration.annotations.any { it.annotationType.resolve().name == "kotlin.RequiresOptIn" }
  }

  private fun KSType.contentScope(): String? =
    if (name == "kotlin.Function1") arguments.first().type?.resolve()?.name?.takeIf { it in scopes } else null

  private fun KSValueParameter.eventKind(type: KSType): String? {
    if (!name?.asString().orEmpty().startsWith("on")) return null
    if (type.arguments.lastOrNull()?.type?.resolve()?.name != "kotlin.Unit") return null
    return when (type.name) {
      "kotlin.Function0" -> "event"
      "kotlin.Function1" -> when (type.arguments.first().type?.resolve()?.name) {
        "kotlin.String" -> "eventString"
        "kotlin.Boolean" -> "eventBoolean"
        "kotlin.Float" -> "eventFloat"
        "kotlin.Double" -> "eventDouble"
        "kotlin.Int" -> "eventInt"
        else -> null
      }
      else -> null
    }
  }

  private val KSType.name: String? get() = declaration.qualifiedName?.asString()
}

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
  "androidx.compose.ui.graphics.Color" to "color"
)
private data class Manifest(
  val schemaVersion: Int,
  val components: List<Component>,
  val modifiers: List<ModifierOverload>,
  val values: List<ValueType>
)
private data class ModifierOverload(
  val name: String,
  val kotlinFunction: String,
  val parameters: List<Parameter>,
  val masks: List<Int>,
  val scope: String?
)
private data class ValueSource(val name: String, val owners: List<String>)
private data class ValueType(val name: String, val kotlinType: String, val cases: List<ValueCase>)
private data class ValueCase(val name: String, val expression: String)
private data class Component(
  val name: String, val kotlinFunction: String, val parameters: List<Parameter>,
  val children: Boolean, val childrenScope: String?
)
private data class Parameter(
  val name: String, val kind: String, val optional: Boolean, val nullable: Boolean, val scope: String? = null
)
private data class Candidate(
  val declaration: KSFunctionDeclaration,
  val component: Component,
  val passed: Map<String, KSType>,
  val signature: String
)
