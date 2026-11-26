// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.ui.graphics.toArgb
import org.json.JSONObject

internal fun composePayloadColor(color: androidx.compose.ui.graphics.Color): String =
  "#%08X".format(color.toArgb())

internal fun <T> org.json.JSONArray.toComposeInterpolation(
  decode: (org.json.JSONArray, Int) -> T,
  lerp: (T, T, Float) -> T,
): (Float) -> T {
  val stops = List(length()) { getJSONArray(it) }
  require(stops.isNotEmpty()) { "An interpolation needs at least one stop" }
  val positions = FloatArray(stops.size) { stops[it].getDouble(0).toFloat() }
  val values = stops.map { decode(it, 1) }
  return { position ->
    val next = positions.indexOfFirst { it > position }
    when (next) {
      -1 -> values.last()
      0 -> values.first()
      else -> {
        val span = positions[next] - positions[next - 1]
        lerp(values[next - 1], values[next], if (span == 0f) 1f else (position - positions[next - 1]) / span)
      }
    }
  }
}

internal fun <T> org.json.JSONArray.toComposeLookup(
  decode: (org.json.JSONArray, Int) -> T,
  fallback: ((Int) -> T)? = null,
): (Int) -> T {
  val values = List(length()) { decode(this, it) }
  return { index -> values.getOrNull(index) ?: fallback?.invoke(index) ?: values[index.coerceIn(0, values.lastIndex)] }
}

// Native objects behind payload snapshots, so `Snackbar(snackbarData = data)` receives the object Compose passed out.
// Equal objects share a handle, which keeps the keys of argument slots stable across recompositions.
internal object ComposePayloadHandles {
  private const val CAPACITY = 2048
  private val ids = object : LinkedHashMap<Any, Int>(16, 0.75f, true) {
    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Any, Int>) = size > CAPACITY
  }
  private val values = object : LinkedHashMap<Int, Any>(16, 0.75f, true) {
    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, Any>) = size > CAPACITY
  }
  private var next = 0

  @Synchronized
  fun handle(value: Any): Int = ids.getOrPut(value) { ++next }.also { values[it] = value }

  @Synchronized
  fun value(handle: Int): Any = values[handle] ?: error("Compose payload $handle is no longer available")
}

@Suppress("UNCHECKED_CAST")
internal fun <T> JSONObject.toComposePayloadValue(): T = ComposePayloadHandles.value(getInt("\$handle")) as T

internal fun androidx.compose.material3.SnackbarData.toComposeSnackbarDataSnapshot(): JSONObject = JSONObject()
  .put("\$handle", ComposePayloadHandles.handle(this))
  .put("visuals", this.`visuals`.toComposeSnackbarVisualsSnapshot())

internal fun androidx.compose.material3.SnackbarHostState.toComposeSnackbarHostStateSnapshot(): JSONObject = JSONObject()
  .put("\$handle", ComposePayloadHandles.handle(this))
  .put("currentSnackbarData", this.`currentSnackbarData`?.let { v1 -> v1.toComposeSnackbarDataSnapshot() } ?: org.json.JSONObject.NULL)

internal fun androidx.compose.material3.SnackbarVisuals.toComposeSnackbarVisualsSnapshot(): JSONObject = JSONObject()
  .put("\$handle", ComposePayloadHandles.handle(this))
  .put("actionLabel", this.`actionLabel` ?: org.json.JSONObject.NULL)
  .put("duration", this.`duration`.name.replaceFirstChar { it.lowercaseChar() })
  .put("message", this.`message`)
  .put("withDismissAction", this.`withDismissAction`)

internal fun androidx.compose.material3.TabPosition.toComposeTabPositionSnapshot(): JSONObject = JSONObject()
  .put("\$handle", ComposePayloadHandles.handle(this))
  .put("contentWidth", this.`contentWidth`.value.toDouble())
  .put("left", this.`left`.value.toDouble())
  .put("right", this.`right`.value.toDouble())
  .put("width", this.`width`.value.toDouble())

@OptIn(androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi::class)
internal fun androidx.compose.material3.adaptive.layout.DragToResizeState.toComposeDragToResizeStateSnapshot(): JSONObject = JSONObject()
  .put("\$handle", ComposePayloadHandles.handle(this))

internal fun androidx.compose.material3.adaptive.layout.PaneExpansionAnchor.toComposePaneExpansionAnchorSnapshot(): JSONObject = JSONObject()
  .put("\$handle", ComposePayloadHandles.handle(this))

internal fun androidx.compose.material3.adaptive.layout.PaneExpansionState.toComposePaneExpansionStateSnapshot(): JSONObject = JSONObject()
  .put("\$handle", ComposePayloadHandles.handle(this))
  .put("currentAnchor", this.`currentAnchor`?.let { v1 -> v1.toComposePaneExpansionAnchorSnapshot() } ?: org.json.JSONObject.NULL)
