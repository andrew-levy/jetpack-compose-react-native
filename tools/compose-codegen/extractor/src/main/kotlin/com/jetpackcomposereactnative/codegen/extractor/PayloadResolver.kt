package com.jetpackcomposereactnative.codegen.extractor

import com.google.devtools.ksp.getAllSuperTypes
import com.google.devtools.ksp.getVisibility
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.Variance
import com.google.devtools.ksp.symbol.Visibility

// A named type that Compose hands to a callback. `value` names a discovered enum, which crosses as its case
// name. Otherwise the type crosses as a snapshot of its public properties (`fields`).
internal data class PayloadType(
  val kotlinType: String, val name: String, val value: Boolean, val fields: List<PayloadField>, val optIns: List<String>,
)
internal data class PayloadField(val name: String, val type: String)

// Describes a value that Kotlin passes to JavaScript. A payload kind is the Kotlin type expression itself, such
// as `kotlin.collections.List<androidx.compose.material3.TabPosition>` or `kotlin.Pair<kotlin.Int,kotlin.String?>`,
// so a published callback keeps its kind. Generators derive the JSON encoder and the TypeScript type from it.
internal class PayloadResolver(
  // Types with a hand-written `toComposeSnapshot()` encoder (snapshots.json).
  private val snapshots: Set<String>,
  private val enumName: (KSType) -> String?,
  private val isVisible: (KSDeclaration) -> Boolean,
  private val optIns: (KSDeclaration) -> Set<KSDeclaration>,
) {
  private val named = mutableMapOf<String, PayloadType>()
  private val rejected = mutableSetOf<String>()
  private val visiting = mutableSetOf<String>()
  private val owners = mutableMapOf<String, String>()

  fun kind(type: KSType): String? {
    val declaration = type.declaration as? KSClassDeclaration ?: return null
    val qualified = declaration.qualifiedName?.asString() ?: return null
    val nullable = if (type.isMarkedNullable) "?" else ""
    if (qualified in scalars || qualified in snapshots) return (qualified + nullable).takeIf { type.arguments.isEmpty() }
    containers[qualified]?.let { arity ->
      if (type.arguments.size != arity) return null
      val elements = type.arguments.map { argument ->
        if (argument.variance == Variance.STAR) return null
        kind(argument.type?.resolve() ?: return null) ?: return null
      }
      return "$qualified<${elements.joinToString(",")}>$nullable"
    }
    if (type.arguments.isNotEmpty()) return null
    return named(declaration, qualified, type)?.let { qualified + nullable }
  }

  // The named types that `kinds` reach, including through snapshot fields.
  fun typesFor(kinds: Collection<String>): List<PayloadType> {
    val used = mutableMapOf<String, PayloadType>()
    fun include(kind: String) {
      for (name in identifier.findAll(kind).map { it.value }) {
        val type = named[name] ?: continue
        if (used.put(name, type) == null) type.fields.forEach { include(it.type) }
      }
    }
    kinds.forEach(::include)
    return used.values.sortedBy { it.kotlinType }
  }

  private fun named(declaration: KSClassDeclaration, qualified: String, type: KSType): PayloadType? {
    named[qualified]?.let { return it }
    if (qualified in rejected || !visiting.add(qualified)) return null
    try {
      // Only an enum is a closed set of cases. Other types with named constants (FontWeight.Bold) can hold
      // values outside them, so they cross as snapshots.
      val result = if (declaration.classKind == ClassKind.ENUM_CLASS) {
        enumName(type.makeNotNullable())?.let { PayloadType(qualified, it, true, emptyList(), emptyList()) }
      } else snapshot(declaration, qualified)
      if (result == null) rejected += qualified else named[qualified] = result
      return result
    } finally {
      visiting.remove(qualified)
    }
  }

  private fun snapshot(declaration: KSClassDeclaration, qualified: String): PayloadType? {
    if (declaration.classKind != ClassKind.CLASS && declaration.classKind != ClassKind.INTERFACE) return null
    if (declaration.typeParameters.isNotEmpty() || !isVisible(declaration) ||
      !declaration.packageName.asString().startsWith("androidx.compose.")) return null
    // Draw, measure and composition scopes are Density. They are receivers that are only valid during a call.
    if (qualified == DENSITY || declaration.getAllSuperTypes().any { it.declaration.qualifiedName?.asString() == DENSITY }) {
      return null
    }
    val name = "Compose" + qualified.removePrefix(declaration.packageName.asString() + ".").replace(".", "") + "Snapshot"
    if (owners[name]?.let { it != qualified } == true) return null
    val properties = declaration.getAllProperties().filter { property ->
      property.extensionReceiver == null && property.getVisibility() == Visibility.PUBLIC && isVisible(property) &&
        (property.annotations + property.getter?.annotations.orEmpty()).none {
          it.annotationType.resolve().declaration.qualifiedName?.asString() == COMPOSABLE_ANNOTATION
        }
    }.sortedBy { it.simpleName.asString() }.toList()
    // A property that cannot cross (a lambda, a native handle, a cycle back to this type) is left out.
    val fields = properties.mapNotNull { property ->
      kind(property.type.resolve())?.let { property to PayloadField(property.simpleName.asString(), it) }
    }
    if (fields.isEmpty() || fields.size > MAX_FIELDS) return null
    owners[name] = qualified
    val markers = (optIns(declaration) + fields.flatMap { (property) -> optIns(property) })
      .mapNotNull { it.qualifiedName?.asString() }.distinct().sorted()
    return PayloadType(qualified, name, false, fields.map { it.second }, markers)
  }

  private companion object {
    const val DENSITY = "androidx.compose.ui.unit.Density"
    const val COMPOSABLE_ANNOTATION = "androidx.compose.runtime.Composable"
    const val MAX_FIELDS = 24
    val identifier = Regex("[A-Za-z_][\\w.]*")
    val scalars = setOf(
      "kotlin.String", "kotlin.Char", "kotlin.Boolean", "kotlin.Byte", "kotlin.Short", "kotlin.Int", "kotlin.Long",
      "kotlin.Float", "kotlin.Double", "kotlin.ranges.IntRange", "kotlin.ranges.LongRange",
      "androidx.compose.ui.unit.Dp", "androidx.compose.ui.graphics.Color",
    )
    // Generic containers and their number of type arguments.
    val containers = mapOf(
      "kotlin.collections.List" to 1, "kotlin.collections.Set" to 1, "kotlin.collections.Collection" to 1,
      "kotlin.Pair" to 2, "kotlin.Triple" to 3,
      "kotlin.ranges.ClosedRange" to 1, "kotlin.ranges.ClosedFloatingPointRange" to 1,
    )
  }
}
