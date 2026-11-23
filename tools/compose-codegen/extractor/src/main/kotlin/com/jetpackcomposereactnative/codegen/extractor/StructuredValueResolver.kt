package com.jetpackcomposereactnative.codegen.extractor

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getConstructors
import com.google.devtools.ksp.getVisibility
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.Modifier
import com.google.devtools.ksp.symbol.Visibility

internal data class RecordValue(
  val name: String, val kotlinType: String, val fields: List<Parameter>, val optIns: List<String>,
  val factories: List<RecordFactory> = emptyList(),
  // Set for a configuration block: a `Scope.() -> Unit` parameter whose decoder returns a lambda that
  // assigns each supplied field to the scope's settable property of the same name.
  val block: Boolean? = null,
  // Set for a wide value type decoded by chained one-argument `copy` calls from its all-default constructor.
  val copy: Boolean? = null,
)
internal data class RecordFactory(
  val name: String, val function: String, val fields: List<Parameter>, val composable: Boolean,
)

internal class StructuredValueResolver(
  private val resolver: Resolver,
  private val adapters: Map<String, String>,
  private val namedValues: Map<String, String>,
  private val isDeprecated: (KSDeclaration) -> Boolean,
  private val optIns: (KSDeclaration) -> Set<KSDeclaration>,
  private val accepts: (KSFunctionDeclaration, Map<String, KSType>) -> Boolean,
) {
  private val records = mutableMapOf<String, RecordValue>()
  private val enums = mutableMapOf<String, ValueType>()
  private val factoriesByPackage = mutableMapOf<String, Map<String, List<KSFunctionDeclaration>>>()
  private val defaultsByPackage = mutableMapOf<String, Map<String, List<KSFunctionDeclaration>>>()
  private val visiting = mutableSetOf<String>()
  private val rejectedRoots = mutableSetOf<String>()
  private val rejectedDefaults = mutableSetOf<String>()
  private val rejectedBlocks = mutableSetOf<String>()
  private val typeNames = mutableMapOf<String, String>()

  fun kind(type: KSType): String? = resolve(type, field = false)

  @OptIn(KspExperimental::class)
  fun defaultsKind(type: KSType, allowComposable: Boolean = true, forced: Boolean = false): String? {
    val declaration = type.declaration as? KSClassDeclaration ?: return null
    val qualified = declaration.qualifiedName?.asString() ?: return null
    val namespace = declaration.packageName.asString()
    if (!namespace.startsWith("androidx.compose.") || type.arguments.isNotEmpty() ||
      !forced && (qualified in namedValues || qualified in adapters) || !hasBridgeVisibility(declaration)) return null
    fun isUsable(record: RecordValue) = allowComposable || record.factories.none { it.composable }
    records[qualified]?.let { return if (isUsable(it)) "record:" + it.name else null }
    if (qualified in rejectedDefaults) return null

    val name = "Compose" + qualified.removePrefix("$namespace.").replace(".", "") + "Value"
    if (typeNames[name]?.let { it != qualified } == true) return null
    val candidates = defaultsByPackage.getOrPut(namespace) {
      resolver.getDeclarationsFromPackage(namespace).filterIsInstance<KSClassDeclaration>()
        .filter { it.classKind == ClassKind.OBJECT && it.simpleName.asString().endsWith("Defaults") }
        .flatMap { it.declarations.filterIsInstance<KSFunctionDeclaration>() }
        .filter { it.extensionReceiver == null && it.typeParameters.isEmpty() && hasBridgeVisibility(it) }
        .groupBy { it.returnType?.resolve()?.declaration?.qualifiedName?.asString().orEmpty() }
    }[qualified].orEmpty()

    val companionFactories = declaration.declarations.filterIsInstance<KSClassDeclaration>()
      .filter { it.isCompanionObject }
      .flatMap { it.declarations.filterIsInstance<KSFunctionDeclaration>() }
      .filter {
        it.extensionReceiver == null && it.typeParameters.isEmpty() && hasBridgeVisibility(it) &&
          it.returnType?.resolve()?.declaration == declaration
      }.toList()
    val resolved = (candidates + companionFactories).groupBy { it.qualifiedName?.asString() }
      .flatMap { (function, overloads) ->
        if (function == null) return@flatMap emptyList()
        // Zero-argument overloads can provide the same factory's empty form.
        // Keep the branches with fields when a parameterized overload exists.
        val decoded = (overloads.filter { it.parameters.isNotEmpty() }.ifEmpty { overloads }).mapNotNull { fn ->
          if (fn.returnType?.resolve()?.isMarkedNullable != false) return@mapNotNull null
          decodeFields(fn, maxDefaults = 6)?.let { fields -> fn to fields }
        }
        val label = function.removePrefix("$namespace.").replace(".Companion.", ".")
        distinguishable(decoded).map { (fn, fields) ->
          val composable = fn.annotations.any {
            it.annotationType.resolve().declaration.qualifiedName?.asString() == "androidx.compose.runtime.Composable"
          }
          RecordFactory(label, function, fields, composable) to fn
        }
      } + nestedFactories(declaration)
    if (resolved.isEmpty()) {
      rejectedDefaults += qualified
      return null
    }
    val record = RecordValue(name, qualified, emptyList(),
      markers(optIns(declaration) + resolved.flatMap { (_, fn) -> optIns(fn) }),
      resolved.map { (factory, _) -> factory }.sortedBy { it.name })
    records[qualified] = record
    typeNames[name] = qualified
    return if (isUsable(record)) "record:$name" else null
  }

  // Overloads of one factory share its JavaScript label. Each kept overload needs a field the others do not
  // declare, so the decoder can select it from the fields JavaScript supplies (records.mjs).
  private fun distinguishable(
    overloads: List<Pair<KSFunctionDeclaration, List<Parameter>>>,
  ): List<Pair<KSFunctionDeclaration, List<Parameter>>> {
    if (overloads.size <= 1) return overloads
    return overloads.filter { (fn, fields) ->
      fields.any { field -> overloads.none { (other, otherFields) -> other != fn && otherFields.any { it.name == field.name } } }
    }
  }

  // A configuration block such as `blur { blurRadiusSpec = ...; edgeTreatment = ... }`: JavaScript passes the
  // scope's settable properties as an object, and native code assigns the supplied ones inside the block.
  fun blockKind(type: KSType): String? {
    if (type.declaration.qualifiedName?.asString() != "kotlin.Function1" || type.arguments.size != 2) return null
    if (type.arguments[1].type?.resolve()?.declaration?.qualifiedName?.asString() != "kotlin.Unit") return null
    val scope = type.arguments[0].type?.resolve() ?: return null
    val declaration = scope.declaration as? KSClassDeclaration ?: return null
    val qualified = declaration.qualifiedName?.asString() ?: return null
    if (scope.arguments.isNotEmpty() || scope.isMarkedNullable || !hasBridgeVisibility(declaration) ||
      !declaration.packageName.asString().startsWith("androidx.compose.") ||
      declaration.classKind !in setOf(ClassKind.INTERFACE, ClassKind.CLASS)) return null
    val key = "$qualified#block"
    records[key]?.let { return "record:" + it.name }
    if (qualified in rejectedBlocks || !visiting.add(key)) return null
    try {
      val properties = declaration.getAllProperties().filter { property ->
        property.isMutable && property.extensionReceiver == null && hasBridgeVisibility(property) &&
          (property.setter?.modifiers?.none { it == Modifier.PRIVATE || it == Modifier.PROTECTED || it == Modifier.INTERNAL } ?: true)
      }.toList()
      val fields = properties.mapNotNull { property ->
        val value = property.type.resolve()
        val kind = fieldKind(value) ?: defaultsKind(value, allowComposable = false) ?: return@mapNotNull null
        Parameter(property.simpleName.asString(), kind, true, value.isMarkedNullable)
      }.sortedBy { it.name }
      if (fields.isEmpty()) {
        rejectedBlocks += qualified
        return null
      }
      val name = "Compose" + qualified.removePrefix(declaration.packageName.asString() + ".").replace(".", "") + "Block"
      if (typeNames[name]?.let { it != key } == true) return null
      val record = RecordValue(name, qualified, fields,
        markers(optIns(declaration) + properties.flatMap { optIns(it) }), block = true)
      records[key] = record
      typeNames[name] = key
      return "record:$name"
    } finally {
      visiting.remove(key)
    }
  }

  private fun fieldKind(value: KSType): String? {
    if (value.declaration.qualifiedName?.asString() != "kotlin.collections.List") return resolve(value, field = true)
    val element = value.arguments.singleOrNull()?.type?.resolve() ?: return null
    if (element.isMarkedNullable) return null
    val kind = resolve(element, field = true) ?: return null
    return if (kind.startsWith("record:") || kind in listElementKinds) "list:$kind" else null
  }

  private fun nestedFactories(type: KSClassDeclaration): List<Pair<RecordFactory, KSFunctionDeclaration>> {
    if (Modifier.SEALED !in type.modifiers &&
      !(Modifier.ABSTRACT in type.modifiers && type.primaryConstructor?.getVisibility() == Visibility.PRIVATE)) {
      return emptyList()
    }
    val expected = type.asStarProjectedType()
    return type.declarations.filterIsInstance<KSClassDeclaration>().mapNotNull { variant ->
      if (variant.typeParameters.isNotEmpty() || !expected.isAssignableFrom(variant.asStarProjectedType())) return@mapNotNull null
      val function = variant.qualifiedName?.asString() ?: return@mapNotNull null
      val constructor = publicValueConstructor(variant)?.takeIf { hasBridgeVisibility(it) } ?: return@mapNotNull null
      val fields = decodeFields(constructor) ?: return@mapNotNull null
      RecordFactory(function.removePrefix(type.packageName.asString() + "."), function, fields, false) to constructor
    }.toList()
  }

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
    // Factory records are fields too, unless a factory is @Composable (a `*Defaults` function).
    records[qualified]?.let { return if (it.factories.none { factory -> factory.composable }) "record:" + it.name else null }
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
        ClassKind.CLASS, ClassKind.INTERFACE -> {
          val record = recordValue(declaration, qualified, name)
          // Named constants (`BlurredEdgeTreatment.Rectangle`) stay the encoding of a type whose record
          // form needs a shape or brush field, so published string values keep working.
          val constants = if (record == null || record.fields.any { it.kind in drawingFieldKinds }) {
            constantValue(declaration, qualified, name)
          } else null
          val copied = if (record == null && constants == null) {
            copyRecord(declaration, qualified, name)
              ?: factoryRecord(declaration, qualified, name, listOf(declaration.packageName.asString()))
          } else null
          when {
            constants != null -> {
              enums[qualified] = constants
              name
            }
            record != null || copied != null -> {
              records[qualified] = record ?: copied!!
              "record:" + name
            }
            else -> null
          }
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
    val entries = declaration.declarations.filterIsInstance<KSClassDeclaration>()
      .filter { it.classKind == ClassKind.ENUM_ENTRY && hasBridgeVisibility(it) }.toList()
    return namedCases(qualified, name, entries)
  }

  private fun constantValue(declaration: KSClassDeclaration, qualified: String, name: String): ValueType? {
    val entries = declaration.declarations.filterIsInstance<KSClassDeclaration>()
      .filter { it.isCompanionObject }
      .flatMap { it.declarations.filterIsInstance<KSPropertyDeclaration>() }
      .filter {
        !it.isMutable && it.extensionReceiver == null && hasBridgeVisibility(it) &&
          // Constants may be declared as a subtype (FontFamily.SansSerif is a GenericFontFamily).
          it.type.resolve().let { value -> !value.isMarkedNullable && declaration.asStarProjectedType().isAssignableFrom(value) }
      }.toList()
    return namedCases(qualified, name, entries)
  }

  private fun namedCases(qualified: String, name: String, entries: List<KSDeclaration>): ValueType? {
    val cases = entries.map { entry ->
      val label = entry.simpleName.asString()
      ValueCase(label.replaceFirstChar { it.lowercaseChar() }, "$qualified.`$label`")
    }.sortedBy { it.name }
    if (cases.isEmpty() || cases.distinctBy { it.name }.size != cases.size) return null
    return ValueType(name, qualified, cases, markers(entries.flatMap { optIns(it) }))
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
    val primary = publicValueConstructor(type)
    val candidates = (factories + listOfNotNull(primary)).mapNotNull { fn ->
      val parameters = fn.parameters
      if (!hasBridgeVisibility(fn) || parameters.isEmpty()) return@mapNotNull null
      val fields = decodeFields(fn) ?: return@mapNotNull null
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
      RecordValue(name, qualified, fields, markers(optIns(type) + optIns(fn)))
    }.distinct()
    val widest = candidates.maxOfOrNull { it.fields.size } ?: return null
    return candidates.singleOrNull { it.fields.size == widest }
  }

  // A wide value type such as TextStyle (25 parameters) is built as `T()` followed by one `copy(field = ...)`
  // per supplied field, so Kotlin keeps its own defaults for the rest. It needs a single visible
  // all-default constructor and a `copy` whose parameters all default to the current value.
  private fun copyRecord(type: KSClassDeclaration, qualified: String, name: String): RecordValue? {
    if (type.classKind != ClassKind.CLASS || Modifier.ABSTRACT in type.modifiers || type.typeParameters.isNotEmpty()) return null
    // Kotlin picks the applicable overload that leaves the fewest defaults unspecified, so a call is only
    // ambiguous when two applicable overloads tie on parameter count.
    fun unambiguous(overloads: List<KSFunctionDeclaration>) =
      overloads.groupBy { it.parameters.size }.minByOrNull { it.key }?.value?.size == 1
    val constructors = type.getConstructors().filter { !isDeprecated(it) && it.getVisibility() == Visibility.PUBLIC }.toList()
    if (!unambiguous(constructors.filter { constructor -> constructor.parameters.all { it.hasDefault } })) return null
    val copies = type.getAllFunctions().filter { it.simpleName.asString() == "copy" && hasBridgeVisibility(it) }.toList()
    val copy = copies.filter { fn -> fn.parameters.isNotEmpty() && fn.parameters.all { it.hasDefault } }
      .maxByOrNull { it.parameters.size } ?: return null
    val fields = copy.parameters.mapNotNull { parameter ->
      val label = parameter.name?.asString() ?: return@mapNotNull null
      val value = parameter.type.resolve()
      val kind = fieldKind(value) ?: return@mapNotNull null
      if (!unambiguous(copies.filter { accepts(it, mapOf(label to value)) })) return@mapNotNull null
      Parameter(label, kind, true, value.isMarkedNullable)
    }
    if (fields.isEmpty()) return null
    return RecordValue(name, qualified, fields, markers(optIns(type) + optIns(copy)), copy = true)
  }

  // Generates the record of a type that has a hand-written kind (TextStyle's `textStyle`), so the kind keeps
  // its published name while its fields come from the Compose declaration.
  fun recordFor(qualified: String): RecordValue? {
    records[qualified]?.let { return it }
    val declaration = resolver.getClassDeclarationByName(resolver.getKSNameFromString(qualified)) ?: return null
    if (!hasBridgeVisibility(declaration)) return null
    val name = "Compose" + qualified.removePrefix(declaration.packageName.asString() + ".").replace(".", "") + "Value"
    if (typeNames[name]?.let { it != qualified } == true || !visiting.add(qualified)) return null
    try {
      val record = recordValue(declaration, qualified, name) ?: copyRecord(declaration, qualified, name)
        ?: factoryRecord(declaration, qualified, name, factoryPackages[qualified] ?: listOf(declaration.packageName.asString()))
        ?: return defaultsKind(declaration.asStarProjectedType(), allowComposable = false, forced = true)
          ?.let { records[qualified] }
      records[qualified] = record
      typeNames[name] = qualified
      return record
    } finally {
      visiting.remove(qualified)
    }
  }

  // A type made by top-level factory functions named like a class (`RoundedCornerShape(topStart = 8.dp)`)
  // whose results are that type. Overloads that take the same fields in different units keep dp.
  @OptIn(KspExperimental::class)
  private fun factoryRecord(type: KSClassDeclaration, qualified: String, name: String, packages: List<String>): RecordValue? {
    if (Modifier.ABSTRACT !in type.modifiers && type.classKind != ClassKind.INTERFACE) return null
    val expected = type.asStarProjectedType()
    val functions = packages.flatMap { namespace ->
      resolver.getDeclarationsFromPackage(namespace).filterIsInstance<KSFunctionDeclaration>().filter { fn ->
        fn.extensionReceiver == null && fn.typeParameters.isEmpty() && hasBridgeVisibility(fn) &&
          fn.simpleName.asString().firstOrNull()?.isUpperCase() == true &&
          fn.returnType?.resolve()?.let { !it.isMarkedNullable && expected.isAssignableFrom(it) } == true
      }.toList()
    }
    val factories = functions.groupBy { it.qualifiedName!!.asString() }.toSortedMap().flatMap { (function, overloads) ->
      val decoded = overloads.mapNotNull { fn -> decodeFields(fn, maxDefaults = 6)?.let { fn to it } }
      val preferred = decoded.groupBy { (_, fields) -> fields.map { it.name }.sorted() }.values
        .map { group -> group.maxBy { (_, fields) -> fields.count { it.kind == "dp" } } }
      distinguishable(preferred).map { (fn, fields) ->
        RecordFactory(function.substringAfterLast('.'), function, fields, false) to fn
      }
    }
    if (factories.isEmpty()) return null
    return RecordValue(name, qualified, emptyList(),
      markers(optIns(type) + factories.flatMap { (_, fn) -> optIns(fn) }), factories.map { it.first })
  }

  private fun publicValueConstructor(type: KSClassDeclaration): KSFunctionDeclaration? {
    if (type.classKind != ClassKind.CLASS || Modifier.ABSTRACT in type.modifiers) return null
    val immutableFields = type.getAllProperties()
      .filter { it.getVisibility() == Visibility.PUBLIC && !it.isMutable }
      .map { it.simpleName.asString() }.toSet()
    return type.primaryConstructor?.takeIf { constructor ->
      constructor.parameters.all { parameter -> parameter.name?.asString() in immutableFields }
    }
  }

  private fun decodeFields(fn: KSFunctionDeclaration, maxDefaults: Int = 5): List<Parameter>? {
    val parameters = fn.parameters
    // Keep decoding bounded while calling Kotlin for the actual default expressions.
    if (parameters.any { it.isVararg } || parameters.count { it.hasDefault } > maxDefaults) return null
    // An optional parameter that cannot cross the bridge is left out: calls name their arguments, so Kotlin
    // keeps its default (Stroke's pathEffect). A required one makes the function unusable.
    val fields = parameters.mapNotNull { parameter ->
      val label = parameter.name?.asString() ?: return null
      val value = parameter.type.resolve()
      val kind = fieldKind(value)
      when {
        kind != null -> Parameter(label, kind, parameter.hasDefault, value.isMarkedNullable)
        parameter.hasDefault -> null
        else -> return null
      }
    }
    return fields.takeIf { it.isNotEmpty() || parameters.isEmpty() }
  }

  private fun hasBridgeVisibility(declaration: KSDeclaration): Boolean =
    generateSequence(declaration) { it.parentDeclaration }.all {
      // An enum entry has its enum's visibility. KSP2 cannot read an entry's modifiers from binaries.
      (it.isEnumEntry() || it.getVisibility() == Visibility.PUBLIC) && !isDeprecated(it) &&
        optIns(it).all { marker -> marker.getVisibility() == Visibility.PUBLIC }
    }

  private fun markers(declarations: Collection<KSDeclaration>): List<String> =
    declarations.mapNotNull { it.qualifiedName?.asString() }.distinct().sorted()

  fun recordsFor(kinds: Set<String>): List<RecordValue> {
    val byKind = records.values.associateBy { "record:" + it.name }
    val used = mutableSetOf<RecordValue>()
    fun include(kind: String) {
      val record = byKind[kind] ?: return
      if (used.add(record)) {
        (record.fields + record.factories.flatMap { it.fields }).forEach { include(it.kind.removePrefix("list:")) }
      }
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
    // Where a type's factory functions live when it is not their package (Shape's are in foundation.shape).
    val factoryPackages = mapOf("androidx.compose.ui.graphics.Shape" to listOf("androidx.compose.foundation.shape"))
    val drawingFieldKinds = setOf("shape", "brush")
    val fieldAdapters = setOf("string", "char", "boolean", "int", "long", "float", "double", "dp", "sp", "color",
      "shape", "brush", "textStyle")
    // Kinds a list field can hold. Records and named values decode from each array element.
    val listElementKinds = setOf("string", "boolean", "int", "long", "float", "double", "dp", "sp", "color")
    // These names were exported before value discovery became transitive.
    val legacyNames = mapOf(
      "androidx.compose.ui.geometry.Offset" to "ComposeOffset",
      "androidx.compose.ui.graphics.TransformOrigin" to "ComposeTransformOrigin",
      "androidx.compose.ui.unit.DpOffset" to "ComposeDpOffset",
      "androidx.compose.ui.unit.IntOffset" to "ComposeIntOffset",
    )
  }
}

internal fun KSDeclaration.isEnumEntry(): Boolean = this is KSClassDeclaration && classKind == ClassKind.ENUM_ENTRY
