package com.jetpackcomposereactnative.generated

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.type
import androidx.compose.ui.input.key.nativeKeyCode
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.unit.Velocity
import org.json.JSONObject

internal fun JSONObject.toComposeNestedScrollConnection(): NestedScrollConnection {
  val pre = optJSONObject("preScroll").toConsumption()
  val post = optJSONObject("postScroll").toConsumption()
  val preFling = optJSONObject("preFling").toConsumption()
  val postFling = optJSONObject("postFling").toConsumption()
  val userInputOnly = optBoolean("userInputOnly")
  return object : NestedScrollConnection {
    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset =
      if (userInputOnly && source != NestedScrollSource.UserInput) Offset.Zero else pre.consume(available)

    override fun onPostScroll(consumed: Offset, available: Offset, source: NestedScrollSource): Offset =
      if (userInputOnly && source != NestedScrollSource.UserInput) Offset.Zero else post.consume(available)

    override suspend fun onPreFling(available: Velocity): Velocity = preFling.consume(available)

    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity = postFling.consume(available)
  }
}

private data class AxisConsumption(val x: Float, val y: Float) {
  fun consume(available: Offset) = Offset(available.x * x, available.y * y)
  fun consume(available: Velocity) = Velocity(available.x * x, available.y * y)
}

private fun JSONObject?.toConsumption() =
  AxisConsumption(this?.optRatio("x") ?: 0f, this?.optRatio("y") ?: 0f)

private fun JSONObject.optRatio(name: String): Float = optDouble(name, 0.0).toFloat().also {
  require(it in 0f..1f) { "Nested scroll consumption must be in 0..1" }
}

internal fun JSONObject.toComposeKeyPolicy(): (KeyEvent) -> Boolean {
  val rawCodes = getJSONArray("keyCodes")
  val codes = List(rawCodes.length()) { rawCodes.getInt(it) }.toSet()
  val event = optString("event", "down")
  require(event in setOf("down", "up", "both")) { "Unknown key event policy: $event" }
  return { input ->
    input.key.nativeKeyCode in codes &&
      ((event != "up" && input.type == KeyEventType.KeyDown) ||
        (event != "down" && input.type == KeyEventType.KeyUp))
  }
}
