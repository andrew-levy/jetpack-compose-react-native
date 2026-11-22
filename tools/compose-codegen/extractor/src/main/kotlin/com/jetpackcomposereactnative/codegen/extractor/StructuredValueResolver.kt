package com.jetpackcomposereactnative.codegen.extractor

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getVisibility
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.Modifier
import com.google.devtools.ksp.symbol.Visibility

internal data class RecordValue(val name: String, val kotlinType: String, val fields: List<Parameter>)

internal class StructuredValueResolver(
  private val resolver: Resolver,
  private val adapters: Map<String, String>,
  private val namedValues: Map<String, String>,
  private val isDeprecated: (KSDeclaration) -> Boolean,
  private val hasOptIns: (KSDeclaration) -> Boolean,
  private val accepts: (KSFunctionDeclaration, Map<String, KSType>) -> Boolean,
) {
  private val records = mutableMapOf<String, RecordValue>()
  private val enums = mutableMapOf<String, ValueType>()
  private val factoriesByPackage = mutableMapOf<String, Map<String, List<KSFunctionDeclaration>>>()
  private val visiting = mutableSetOf<String>()
  private val rejectedRoots = mutableSetOf<String>()
  private val typeNames = mutableMapOf<String, String>()

  fun kind(type: KSType): String? = resolve(type, field = false)

  private fun resolve(type: KSType, field: Boolean): String? {
    val declaration = type.declaration as? KSClassDeclaration ?: return null
    val qualified = declaration.qualifiedName?.asString() ?: return null
    if (field) {
      namedValues[qualified]?.let { return it }
      adapters[qualified]?.let { return it.takeIf(fieldAdapters::contains) }
    } else if (qualified in namedValues || qualified in adapters) {
      return null
    }
    if (type.arguments.isNotEmpty() || !hasBridgeVisibility(declaration)) return null
    if (declaration.packageName.asString().let { it == "kotlin" || it.startsWith("kotlin.") }) return null
    records[qualified]?.let { return "record:" + it.name }
    enums[qualified]?.let { return it.name }
    if (qualified in rejectedRoots || !visiting.add(qualified)) return null

    val name = legacyNames[qualified] ?: "Compose" +
      qualified.removePrefix(declaration.packageName.asString() + ".").replace(".", "") +
      if (declaration.classKind == ClassKind.ENUM_CLASS) "Option" else "Value"
    try {
      val owner = typeNames[name]
      if (owner != null && owner != qualified) return null
      val result = when (declaration.classKind) {
        ClassKind.ENUM_CLASS -> enumValue(declaration, qualified, name)?.let {
          enums[qualified] = it
          name
        }
        ClassKind.CLASS, ClassKind.INTERFACE -> recordValue(declaration, qualified, name)?.let {
          records[qualified] = it
          "record:" + name
        }
        else -> null
      }
      if (result != null) typeNames[name] = qualified
      if (result == null && !field) rejectedRoots += qualified
      return result
    } finally {
      visiting.remove(qualified)
    }
  }

  private fun enumValue(declaration: KSClassDeclaration, qualified: String, name: String): ValueType? {
    val cases = declaration.declarations.filterIsInstance<KSClassDeclaration>()
      .filter { it.classKind == ClassKind.ENUM_ENTRY && !isDeprecated(it) && !hasOptIns(it) }
      .map { entry ->
        val label = entry.simpleName.asString()
        ValueCase(label.replaceFirstChar { it.lowercaseChar() }, "$qualified.`$label`")
      }.sortedBy { it.name }.toList()
    if (cases.isEmpty() || cases.distinctBy { it.name }.size != cases.size) return null
    return ValueType(name, qualified, cases, emptyList())
  }

  @OptIn(KspExperimental::class)
  private fun recordValue(type: KSClassDeclaration, qualified: String, name: String): RecordValue? {
    if (Modifier.INNER in type.modifiers) return null
    val alternatives = factoriesByPackage.getOrPut(type.packageName.asString()) {
      resolver.getDeclarationsFromPackage(type.packageName.asString()).filterIsInstance<KSFunctionDeclaration>()
        .filter { it.extensionReceiver == null && it.getVisibility() == Visibility.PUBLIC }
        .groupBy { it.qualifiedName?.asString().orEmpty() }
    }[qualified].orEmpty()
    val factories = alternatives.filter { it.returnType?.resolve()?.let { result ->
      !result.isMarkedNullable && result.declaration == type
    } == true }
    val constructors = if (Modifier.ABSTRACT in type.modifiers || type.classKind != ClassKind.CLASS) emptyList()
      else type.declarations.filterIsInstance<KSFunctionDeclaration>()
        .filter { it.simpleName.asString() == "<init>" && it.getVisibility() == Visibility.PUBLIC }.toList()
    val immutableFields = type.getAllProperties()
      .filter { it.getVisibility() == Visibility.PUBLIC && !it.isMutable }
      .map { it.simpleName.asString() }.toSet()
    val primary = type.primaryConstructor?.takeIf {
      type.classKind == ClassKind.CLASS && Modifier.ABSTRACT !in type.modifiers &&
        it.parameters.all { parameter -> parameter.name?.asString() in immutableFields }
    }
    val candidates = (factories + listOfNotNull(primary)).mapNotNull { fn ->
      val parameters = fn.parameters
      if (!hasBridgeVisibility(fn) || parameters.isEmpty() || parameters.any { it.isVararg }) return@mapNotNull null
      // Keep decoding bounded while calling Kotlin for the actual default expressions.
      if (parameters.count { it.hasDefault } > 5) return@mapNotNull null
      val fields = parameters.map { parameter ->
        val label = parameter.name?.asString() ?: return@mapNotNull null
        val value = parameter.type.resolve()
        val kind = resolve(value, field = true) ?: return@mapNotNull null
        Parameter(label, kind, parameter.hasDefault, value.isMarkedNullable)
      }
      val required = parameters.filterNot { it.hasDefault }.associate {
        it.name!!.asString() to it.type.resolve()
      }
      val candidateTypes = parameters.associate { it.name!!.asString() to it.type.resolve() }
      val competitors = (constructors + alternatives).filterNot { it == fn }
      if (competitors.any { other ->
          // If an overload can accept the required fields plus some of the supplied
          // optional fields, there is at least one call form we cannot resolve safely.
          val passed = required + other.parameters.filterNot { it.hasDefault || it.isVararg }
            .mapNotNull { parameter ->
              val label = parameter.name?.asString()
              val value = candidateTypes[label]
              if (label == null || value == null) null else label to value
            }.toMap()
          accepts(other, passed)
        }) return@mapNotNull null
      RecordValue(name, qualified, fields)
    }.distinct()
    val widest = candidates.maxOfOrNull { it.fields.size } ?: return null
    return candidates.singleOrNull { it.fields.size == widest }
  }

  private fun hasBridgeVisibility(declaration: KSDeclaration): Boolean =
    generateSequence(declaration) { it.parentDeclaration }.all {
      it.getVisibility() == Visibility.PUBLIC && !isDeprecated(it) && !hasOptIns(it)
    }

  fun recordsFor(kinds: Set<String>): List<RecordValue> {
    val byKind = records.values.associateBy { "record:" + it.name }
    val used = mutableSetOf<RecordValue>()
    fun include(kind: String) {
      val record = byKind[kind] ?: return
      if (used.add(record)) record.fields.forEach { include(it.kind) }
    }
    kinds.forEach(::include)
    return used.sortedBy { it.kotlinType }
  }

  fun isInferredKind(kind: String): Boolean {
    val name = kind.removePrefix("record:")
    return name in typeNames && name !in legacyNames.values
  }

  fun enumsFor(kinds: Set<String>): List<ValueType> =
    enums.values.filter { it.name in kinds }.sortedBy { it.kotlinType }

  private companion object {
    val fieldAdapters = setOf("string", "boolean", "int", "long", "float", "double", "dp", "sp", "color")
    // These names were exported before value discovery became transitive.
    val legacyNames = mapOf(
      "androidx.compose.ui.geometry.Offset" to "ComposeOffset",
      "androidx.compose.ui.graphics.TransformOrigin" to "ComposeTransformOrigin",
      "androidx.compose.ui.unit.DpOffset" to "ComposeDpOffset",
      "androidx.compose.ui.unit.IntOffset" to "ComposeIntOffset",
    )
  }
}
