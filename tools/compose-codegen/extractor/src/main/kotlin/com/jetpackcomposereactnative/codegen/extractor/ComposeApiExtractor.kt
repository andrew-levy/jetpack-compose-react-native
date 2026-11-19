package com.jetpackcomposereactnative.codegen.extractor

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getVisibility
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
      environment.options.getValue("composePackages").split(';').map(String::trim).filter(String::isNotEmpty)
    )
}

private class ComposeApiExtractor(
  private val generator: CodeGenerator,
  private val logger: KSPLogger,
  private val packages: List<String>
) : SymbolProcessor {
  private var generated = false

  @OptIn(KspExperimental::class)
  override fun process(resolver: Resolver): List<KSAnnotated> {
    if (generated) return emptyList()
    generated = true

    val declarations = packages.distinct().flatMap { resolver.getDeclarationsFromPackage(it).toList() }
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

    generator.createNewFile(Dependencies(aggregating = true), "", "compose-api-manifest", "json")
      .bufferedWriter().use { Gson().toJson(Manifest(1, components), it) }
    logger.info("Discovered ${components.size} Compose components from ${packages.joinToString()}")
    return emptyList()
  }

  private fun describe(fn: KSFunctionDeclaration): Candidate? {
    val annotations = fn.annotations.mapNotNull { it.annotationType.resolve().name }.toList()
    if (annotations.any { it == "kotlin.Deprecated" || it.substringAfterLast('.').startsWith("Experimental") }) return null
    if (fn.returnType?.resolve()?.name != "kotlin.Unit") return null

    val parameters = mutableListOf<Parameter>()
    val passed = mutableMapOf<String, KSType>()
    var children = false
    var optionalValues = 0
    for (parameter in fn.parameters) {
      val name = parameter.name?.asString() ?: return null
      val type = parameter.type.resolve()
      val isSlot = parameter.isContentSlot(type)
      if (name == "content" && isSlot && type.nullability == Nullability.NOT_NULL) {
        children = true
        passed[name] = type
        continue
      }
      val kind = when {
        parameter.isVararg -> null
        isSlot -> "slot"
        else -> valueKinds[type.name] ?: parameter.eventKind(type)
      }
      if (kind == null) {
        if (!parameter.hasDefault) return null
        continue
      }
      // Each optional value adds a branch so Kotlin can apply its own default.
      if (parameter.hasDefault && kind != "modifier" && ++optionalValues > MAX_OPTIONAL_VALUES) continue
      parameters += Parameter(name, kind, parameter.hasDefault, type.nullability == Nullability.NULLABLE)
      if (!parameter.hasDefault || kind == "modifier") passed[name] = type
    }

    val function = fn.qualifiedName!!.asString()
    val component = Component(fn.simpleName.asString(), function, parameters, children)
    val signature = fn.parameters.joinToString { it.type.resolve().toString() }
    return Candidate(fn, component, passed, signature)
  }

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
      "kotlin.Function1" -> type.arguments.first().type?.resolve()?.name in scopes
      else -> false
    }
  }

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

private const val COMPOSABLE = "androidx.compose.runtime.Composable"
private const val MAX_OPTIONAL_VALUES = 4
private val scopes = setOf(
  "androidx.compose.foundation.layout.RowScope",
  "androidx.compose.foundation.layout.ColumnScope",
  "androidx.compose.foundation.layout.BoxScope",
  "androidx.compose.foundation.layout.FlowRowScope",
  "androidx.compose.foundation.layout.FlowColumnScope"
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
  "androidx.compose.ui.graphics.Color" to "color"
)
private data class Manifest(val schemaVersion: Int, val components: List<Component>)
private data class Component(
  val name: String, val kotlinFunction: String, val parameters: List<Parameter>, val children: Boolean
)
private data class Parameter(val name: String, val kind: String, val optional: Boolean, val nullable: Boolean)
private data class Candidate(
  val declaration: KSFunctionDeclaration,
  val component: Component,
  val passed: Map<String, KSType>,
  val signature: String
)
