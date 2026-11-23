package com.jetpackcomposereactnative.generated

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.toPath
import androidx.compose.ui.unit.dp
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONArray
import org.json.JSONObject

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
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
  fun animationTarget(name: String): Any = when (val value = values.get(name)) {
    is String -> value
    is Number -> value.toInt()
    else -> error("Expected a Compose animation target key or index")
  }
  fun floatRange(name: String): ClosedFloatingPointRange<Float> {
    val range = jsonArray(name)
    return range.getDouble(0).toFloat()..range.getDouble(1).toFloat()
  }
  // `[first, last]`, both inclusive, as in Kotlin's `first..last`.
  fun intRange(name: String): IntRange {
    val range = jsonArray(name)
    return range.getInt(0)..range.getInt(1)
  }
  fun color(name: String) = parseComposeColor(string(name))
  fun emit(name: String, value: Any? = null) = emitEvent(string(name), value)

  fun emitValueEvent(dictionary: JSONObject, name: String, value: Any?) {
    if (!dictionary.isNull(name)) emitEvent(dictionary.getString(name), value)
  }

  fun shape(name: String): Shape = when (val value = values.get(name)) {
    // Every shape factory (`RoundedCornerShape`, `CutCornerShape`, ...) and MaterialShapes is generated.
    is JSONObject -> when {
      value.has("factory") -> value.decodeComposeShapeValue()
      value.has("material") -> ComposePolygonShape(toComposeMaterialShape(value.getString("material")))
      else -> {
        val radius = value.optJSONObject("rect")?.getDouble("cornerRadius") ?: value.getDouble("radius")
        RoundedCornerShape(radius.dp)
      }
    }
    "circle", "CircleShape" -> CircleShape
    else -> RectangleShape
  }

  fun brush(name: String): Brush {
    val value = values.get(name)
    if (value is String) return SolidColor(parseComposeColor(value))
    val brush = value as JSONObject
    // Every Brush factory (`linearGradient`, `radialGradient`, `sweepGradient`, ...) is generated.
    if (brush.has("factory")) return brush.decodeComposeBrushValue()
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

// Shape and brush fields of generated records and configuration blocks use the modifier encodings.
internal fun JSONObject.composeShape(name: String): Shape = ComposeModifierArguments(this) { _, _ -> }.shape(name)

internal fun JSONObject.composeBrush(name: String): Brush = ComposeModifierArguments(this) { _, _ -> }.brush(name)

// A MaterialShapes polygon scaled to the layout size, as material3's composable `toShape()` draws it.
private class ComposePolygonShape(polygon: RoundedPolygon) : Shape {
  private val unitPath = polygon.normalized().toPath()

  override fun createOutline(size: Size, layoutDirection: LayoutDirection, density: Density): Outline {
    val path = android.graphics.Path(unitPath)
    path.transform(android.graphics.Matrix().apply { setScale(size.width, size.height) })
    return Outline.Generic(path.asComposePath())
  }
}
