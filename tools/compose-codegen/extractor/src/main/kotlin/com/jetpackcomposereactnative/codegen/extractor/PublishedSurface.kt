package com.jetpackcomposereactnative.codegen.extractor

import com.google.gson.Gson
import java.io.File

internal class PublishedSurface private constructor(
  private val components: Map<String, List<Overload>>,
  private val modifiers: Map<String, List<Overload>>,
) {
  private data class Snapshot(val components: List<Overload>, val modifiers: List<Overload>)

  // Signatures of the declarations the generator still binds. A published overload whose signature is no
  // longer among them was changed or removed upstream (hidden for binary compatibility) (for example Material 3 added a parameter); its call
  // forms carry over to the current overload of the same function when every prop still fits.
  var currentSignatures: Set<String> = emptySet()

  private data class Overload(
    val name: String, val signature: String?, val children: Boolean, val scope: String?, val ownerScope: String?,
    val parameters: List<Parameter>, val masks: List<Int>,
  )

  fun publishes(signature: String): Boolean =
    components.values.any { overloads -> overloads.any { it.signature == signature } }

  fun componentMasks(name: String, signature: String, children: Boolean, scope: String?, parameters: List<Parameter>) =
    retainedMasks(components[name].orEmpty(), signature, children, scope, parameters)

  fun modifierMasks(name: String, signature: String, scope: String?, parameters: List<Parameter>) =
    retainedMasks(modifiers[name].orEmpty(), signature, false, scope, parameters)

  private fun retainedMasks(
    overloads: List<Overload>, signature: String, children: Boolean, scope: String?, parameters: List<Parameter>,
  ): Set<Int> {
    if (overloads.isEmpty()) return emptySet()
    val names = parameters.associateBy { it.name }
    val required = parameters.filterNot { it.hasMaskBit() }.map { it.name }.toSet()
    val bits = parameters.filter { it.hasMaskBit() }.mapIndexed { index, it -> it.name to (1 shl index) }.toMap()
    val matching = overloads.filter {
      val publishedScope = it.scope ?: it.ownerScope
      it.children == children && (it.signature == signature && publishedScope == scope ||
        it.signature == null && (publishedScope == null || publishedScope == scope) ||
        it.signature != null && it.signature !in currentSignatures && publishedScope == scope &&
        it.signature.functionName() == signature.functionName())
    }
    return matching.flatMap { overload ->
      overload.masks.mapNotNull { oldMask ->
        var bit = 0
        val passed = overload.parameters.filter { !it.hasMaskBit() || oldMask and (1 shl bit++) != 0 }
        if (!passed.map { it.name }.containsAll(required)) return@mapNotNull null
        if (passed.any { previous ->
            val parameter = names[previous.name]
            parameter == null || previous.kind != parameter.kind || previous.nullable != parameter.nullable ||
              previous.kind == "modifier" && previous.optional != parameter.optional
          }) return@mapNotNull null
        passed.sumOf { bits[it.name] ?: 0 }
      }
    }.toSet()
  }

  private fun Parameter.hasMaskBit() = optional && kind != "modifier"

  // The qualified function name and receiver, without the parameter list.
  private fun String.functionName() = substringBefore('(')

  companion object {
    fun read(path: String?): PublishedSurface {
      if (path == null) return PublishedSurface(emptyMap(), emptyMap())
      val snapshot = File(path).reader().use { Gson().fromJson(it, Snapshot::class.java) }
      return PublishedSurface(snapshot.components.groupBy { it.name }, snapshot.modifiers.groupBy { it.name })
    }
  }
}
