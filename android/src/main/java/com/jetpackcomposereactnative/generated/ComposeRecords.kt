// Generated from Compose value factories by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.json.JSONObject

internal fun JSONObject.decodeComposeOffset(): androidx.compose.ui.geometry.Offset = androidx.compose.ui.geometry.Offset(
  `x` = getDouble("x").toFloat(),
  `y` = getDouble("y").toFloat(),
)

internal fun JSONObject.decodeComposeTransformOrigin(): androidx.compose.ui.graphics.TransformOrigin = androidx.compose.ui.graphics.TransformOrigin(
  `pivotFractionX` = getDouble("pivotFractionX").toFloat(),
  `pivotFractionY` = getDouble("pivotFractionY").toFloat(),
)

internal fun JSONObject.decodeComposeDpOffset(): androidx.compose.ui.unit.DpOffset = androidx.compose.ui.unit.DpOffset(
  `x` = getDouble("x").dp,
  `y` = getDouble("y").dp,
)

internal fun JSONObject.decodeComposeIntOffset(): androidx.compose.ui.unit.IntOffset = androidx.compose.ui.unit.IntOffset(
  `x` = getInt("x"),
  `y` = getInt("y"),
)
