package com.jetpackcomposereactnative.generated

import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.DrawResult
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONArray
import org.json.JSONObject

internal fun JSONObject.toComposeDrawing(): DrawScope.() -> Unit = {
  drawCommands(getJSONArray("commands"))
}

internal fun JSONObject.toComposeContentDrawing(): ContentDrawScope.() -> Unit = {
  drawCommands(optJSONArray("before"))
  drawContent()
  drawCommands(optJSONArray("after"))
}

internal fun JSONObject.toComposeCachedDrawing(): CacheDrawScope.() -> DrawResult = {
  onDrawWithContent(toComposeContentDrawing())
}

private fun DrawScope.drawCommands(commands: JSONArray?) {
  if (commands == null) return
  for (index in 0 until commands.length()) {
    val command = commands.getJSONObject(index)
    val color = parseComposeColor(command.getString("color"))
    when (command.getString("type")) {
      "rect" -> {
        val left = command.optDouble("x", 0.0).dp.toPx()
        val top = command.optDouble("y", 0.0).dp.toPx()
        val width = if (command.isNull("width")) size.width - left else command.getDouble("width").dp.toPx()
        val height = if (command.isNull("height")) size.height - top else command.getDouble("height").dp.toPx()
        drawRoundRect(color, Offset(left, top), Size(width.coerceAtLeast(0f), height.coerceAtLeast(0f)),
          CornerRadius(command.optDouble("cornerRadius", 0.0).dp.toPx()))
      }
      "circle" -> drawCircle(color, command.getDouble("radius").dp.toPx(),
        command.optJSONObject("center")?.let(::point) ?: center)
      "line" -> drawLine(color, point(command.getJSONObject("start")), point(command.getJSONObject("end")),
        command.optDouble("strokeWidth", 1.0).dp.toPx())
      "path" -> {
        val points = command.getJSONArray("points")
        if (points.length() == 0) continue
        val path = Path()
        val start = point(points.getJSONObject(0))
        path.moveTo(start.x, start.y)
        for (pointIndex in 1 until points.length()) {
          val next = point(points.getJSONObject(pointIndex))
          path.lineTo(next.x, next.y)
        }
        if (command.optBoolean("closed")) path.close()
        val style = if (command.isNull("strokeWidth")) Fill else Stroke(command.getDouble("strokeWidth").dp.toPx())
        drawPath(path, color, style = style)
      }
      else -> error("Unknown Compose draw command: " + command.getString("type"))
    }
  }
}

private fun DrawScope.point(value: JSONObject): Offset =
  Offset(value.getDouble("x").dp.toPx(), value.getDouble("y").dp.toPx())
