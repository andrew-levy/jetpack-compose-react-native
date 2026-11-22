package com.jetpackcomposereactnative.generated

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONArray
import org.json.JSONObject

internal class ComposeModifierArguments(
  private val values: JSONObject,
  private val emitEvent: (String, Any?) -> Unit,
) {
  fun has(name: String) = values.has(name)
  fun isNull(name: String) = values.isNull(name)
  fun jsonObject(name: String): JSONObject = values.getJSONObject(name)
  fun jsonArray(name: String): JSONArray = values.getJSONArray(name)
  fun string(name: String): String = values.getString(name)
  fun boolean(name: String): Boolean = values.getBoolean(name)
  fun number(name: String): Double = values.getDouble(name)
  fun floatRange(name: String): ClosedFloatingPointRange<Float> {
    val range = jsonArray(name)
    return range.getDouble(0).toFloat()..range.getDouble(1).toFloat()
  }
  fun color(name: String) = parseComposeColor(string(name))
  fun emit(name: String, value: Any? = null) = emitEvent(string(name), value)

  fun emitValueEvent(dictionary: JSONObject, name: String, value: Any?) {
    if (!dictionary.isNull(name)) emitEvent(dictionary.getString(name), value)
  }

  fun shape(name: String): Shape = when (val value = values.get(name)) {
    is JSONObject -> {
      val radius = value.optJSONObject("rect")?.getDouble("cornerRadius") ?: value.getDouble("radius")
      RoundedCornerShape(radius.dp)
    }
    "circle", "CircleShape" -> CircleShape
    else -> RectangleShape
  }

  fun brush(name: String): Brush {
    val value = values.get(name)
    if (value is String) return SolidColor(parseComposeColor(value))
    val brush = value as JSONObject
    val stops = brush.getJSONArray("colors")
    val colors = List(stops.length()) { parseComposeColor(stops.getString(it)) }
    require(colors.size >= 2) { "A gradient brush needs at least two colors" }
    return when (brush.optString("direction")) {
      "vertical" -> Brush.verticalGradient(colors)
      else -> Brush.horizontalGradient(colors)
    }
  }

  override fun toString(): String = values.toString()
}
