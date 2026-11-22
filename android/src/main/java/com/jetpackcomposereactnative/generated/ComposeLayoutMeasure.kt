package com.jetpackcomposereactnative.generated

import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt
import org.json.JSONObject

internal fun JSONObject.toComposeLayoutMeasurePolicy(): MeasurePolicy {
  val placements = optJSONArray("children")?.let { entries ->
    List(entries.length()) { index -> entries.getJSONObject(index).toPlacement() }
  }.orEmpty()
  val measure = LayoutMeasure(optionalSize("width"), optionalSize("height"), placements)
  return MeasurePolicy { measurables, constraints ->
    measure.run { measureChildren(measurables, constraints) }
  }
}

internal fun JSONObject.toComposeLayoutModifierMeasure(): MeasureScope.(Measurable, Constraints) -> MeasureResult {
  val placements = listOfNotNull(optJSONObject("child")?.toPlacement())
  val measure = LayoutMeasure(optionalSize("width"), optionalSize("height"), placements)
  return { measurable, constraints -> measure.run { measureChildren(listOf(measurable), constraints) } }
}

private data class ChildPlacement(
  val width: Dp? = null,
  val height: Dp? = null,
  val horizontalBias: Float = 0f,
  val verticalBias: Float = 0f,
  val x: Dp = 0.dp,
  val y: Dp = 0.dp,
)

private class LayoutMeasure(
  val width: Dp?,
  val height: Dp?,
  val placements: List<ChildPlacement>,
) {
  fun MeasureScope.measureChildren(measurables: List<Measurable>, constraints: Constraints): MeasureResult {
    val maxWidth = width?.let { constraints.constrainWidth(it.roundToPx()) } ?: constraints.maxWidth
    val maxHeight = height?.let { constraints.constrainHeight(it.roundToPx()) } ?: constraints.maxHeight
    val children = measurables.mapIndexed { index, measurable ->
      val placement = placements.getOrElse(index) { ChildPlacement() }
      val childWidth = placement.width?.roundToPx()?.coerceAtMost(maxWidth)
      val childHeight = placement.height?.roundToPx()?.coerceAtMost(maxHeight)
      val childConstraints = Constraints.fitPrioritizingWidth(
        minWidth = childWidth ?: 0,
        maxWidth = childWidth ?: maxWidth,
        minHeight = childHeight ?: 0,
        maxHeight = childHeight ?: maxHeight,
      )
      measurable.measure(childConstraints) to placement
    }
    val measuredWidth = if (width != null) maxWidth else constraints.constrainWidth(children.maxOfOrNull { it.first.width } ?: 0)
    val measuredHeight = if (height != null) maxHeight else constraints.constrainHeight(children.maxOfOrNull { it.first.height } ?: 0)
    return layout(measuredWidth, measuredHeight) {
      for ((child, placement) in children) {
        val x = ((measuredWidth - child.width) * placement.horizontalBias).roundToInt() + placement.x.roundToPx()
        val y = ((measuredHeight - child.height) * placement.verticalBias).roundToInt() + placement.y.roundToPx()
        child.placeRelative(x, y)
      }
    }
  }
}

private fun JSONObject.toPlacement() = ChildPlacement(
  width = optionalSize("width"),
  height = optionalSize("height"),
  horizontalBias = placementBias("horizontalBias"),
  verticalBias = placementBias("verticalBias"),
  x = optDouble("x", 0.0).dp,
  y = optDouble("y", 0.0).dp,
)

private fun JSONObject.optionalSize(name: String): Dp? {
  if (isNull(name)) return null
  val value = getDouble(name)
  require(value.isFinite() && value >= 0) { "Layout size must be finite and non-negative" }
  return value.dp
}

private fun JSONObject.placementBias(name: String): Float = optDouble(name, 0.0).toFloat().also {
  require(it in 0f..1f) { "Layout bias must be between 0 and 1" }
}
