package com.jetpackcomposereactnative.generated

import android.graphics.Paint
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.DrawResult
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.drawscope.inset
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

// The commands of `{ commands: [...] }`, in dp. Shapes take a `color` or a `brush`, an optional `alpha`, and
// are stroked when they have `strokeWidth`. Transforms (`translate`, `rotate`, `scale`, `inset`, `clipRect`,
// `clipPath`) apply to their nested `commands`.
private fun DrawScope.drawCommands(commands: JSONArray?) {
  if (commands == null) return
  for (index in 0 until commands.length()) drawCommand(commands.getJSONObject(index))
}

private fun DrawScope.drawCommand(command: JSONObject) {
  val alpha = command.optDouble("alpha", 1.0).toFloat()
  when (command.getString("type")) {
    "rect" -> {
      val (topLeft, size) = bounds(command)
      val radius = CornerRadius(command.optDouble("cornerRadius", 0.0).dp.toPx())
      paint(command,
        { brush -> drawRoundRect(brush, topLeft, size, radius, alpha, style(command)) },
        { color -> drawRoundRect(color, topLeft, size, radius, style(command), alpha) })
    }
    "oval" -> {
      val (topLeft, size) = bounds(command)
      paint(command,
        { brush -> drawOval(brush, topLeft, size, alpha, style(command)) },
        { color -> drawOval(color, topLeft, size, alpha, style(command)) })
    }
    "circle" -> {
      val radius = command.getDouble("radius").dp.toPx()
      val center = command.optJSONObject("center")?.let(::point) ?: center
      paint(command,
        { brush -> drawCircle(brush, radius, center, alpha, style(command)) },
        { color -> drawCircle(color, radius, center, alpha, style(command)) })
    }
    "arc" -> {
      val (topLeft, size) = bounds(command)
      val start = command.getDouble("startAngle").toFloat()
      val sweep = command.getDouble("sweepAngle").toFloat()
      val useCenter = command.optBoolean("useCenter")
      paint(command,
        { brush -> drawArc(brush, start, sweep, useCenter, topLeft, size, alpha, style(command)) },
        { color -> drawArc(color, start, sweep, useCenter, topLeft, size, alpha, style(command)) })
    }
    "line" -> {
      val start = point(command.getJSONObject("start"))
      val end = point(command.getJSONObject("end"))
      val width = command.optDouble("strokeWidth", 1.0).dp.toPx()
      val cap = strokeCap(command)
      paint(command,
        { brush -> drawLine(brush, start, end, width, cap, alpha = alpha) },
        { color -> drawLine(color, start, end, width, cap, alpha = alpha) })
    }
    "points" -> {
      val points = command.getJSONArray("points").let { values -> List(values.length()) { point(values.getJSONObject(it)) } }
      val mode = when (command.optString("pointMode")) {
        "lines" -> PointMode.Lines
        "polygon" -> PointMode.Polygon
        else -> PointMode.Points
      }
      val width = command.optDouble("strokeWidth", 1.0).dp.toPx()
      val cap = strokeCap(command)
      paint(command,
        { brush -> drawPoints(points, mode, brush, width, cap, alpha = alpha) },
        { color -> drawPoints(points, mode, color, width, cap, alpha = alpha) })
    }
    "path" -> {
      val path = path(command) ?: return
      paint(command,
        { brush -> drawPath(path, brush, alpha, style(command)) },
        { color -> drawPath(path, color, alpha, style(command)) })
    }
    "text" -> drawIntoCanvas { canvas ->
      val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = parseComposeColor(command.optString("color", "black")).copy(alpha = alpha).toArgb()
        textSize = command.optDouble("fontSize", 14.0).sp.toPx()
        isFakeBoldText = command.optString("fontWeight") == "bold"
        textAlign = when (command.optString("textAlign")) {
          "center" -> Paint.Align.CENTER
          "end", "right" -> Paint.Align.RIGHT
          else -> Paint.Align.LEFT
        }
      }
      // `y` is the baseline, as in Canvas.drawText.
      canvas.nativeCanvas.drawText(command.getString("text"), command.optDouble("x", 0.0).dp.toPx(),
        command.optDouble("y", 0.0).dp.toPx(), paint)
    }
    "translate" -> translate(command.optDouble("x", 0.0).dp.toPx(), command.optDouble("y", 0.0).dp.toPx()) {
      drawCommands(command.optJSONArray("commands"))
    }
    "rotate" -> rotate(command.getDouble("degrees").toFloat(), command.optJSONObject("pivot")?.let(::point) ?: center) {
      drawCommands(command.optJSONArray("commands"))
    }
    "scale" -> {
      val x = command.optDouble("x", command.optDouble("scale", 1.0)).toFloat()
      val y = command.optDouble("y", command.optDouble("scale", 1.0)).toFloat()
      scale(x, y, command.optJSONObject("pivot")?.let(::point) ?: center) { drawCommands(command.optJSONArray("commands")) }
    }
    "inset" -> inset(
      command.optDouble("left", command.optDouble("all", 0.0)).dp.toPx(),
      command.optDouble("top", command.optDouble("all", 0.0)).dp.toPx(),
      command.optDouble("right", command.optDouble("all", 0.0)).dp.toPx(),
      command.optDouble("bottom", command.optDouble("all", 0.0)).dp.toPx(),
    ) { drawCommands(command.optJSONArray("commands")) }
    "clipRect" -> {
      val (topLeft, size) = bounds(command)
      val rect = Rect(topLeft, size)
      clipRect(rect.left, rect.top, rect.right, rect.bottom) { drawCommands(command.optJSONArray("commands")) }
    }
    "clipPath" -> {
      val path = path(command) ?: return
      clipPath(path) { drawCommands(command.optJSONArray("commands")) }
    }
    else -> error("Unknown Compose draw command: " + command.getString("type"))
  }
}

private inline fun paint(command: JSONObject, withBrush: (Brush) -> Unit, withColor: (androidx.compose.ui.graphics.Color) -> Unit) {
  if (command.has("brush")) withBrush(command.composeBrush("brush"))
  else withColor(parseComposeColor(command.getString("color")))
}

// `x`, `y`, `width`, `height` in dp; a missing size fills the rest of the drawing area.
private fun DrawScope.bounds(command: JSONObject): Pair<Offset, Size> {
  val left = command.optDouble("x", 0.0).dp.toPx()
  val top = command.optDouble("y", 0.0).dp.toPx()
  val width = if (command.isNull("width")) size.width - left else command.getDouble("width").dp.toPx()
  val height = if (command.isNull("height")) size.height - top else command.getDouble("height").dp.toPx()
  return Offset(left, top) to Size(width.coerceAtLeast(0f), height.coerceAtLeast(0f))
}

private fun DrawScope.style(command: JSONObject): DrawStyle =
  if (command.isNull("strokeWidth")) Fill else Stroke(
    width = command.getDouble("strokeWidth").dp.toPx(),
    cap = strokeCap(command),
    join = when (command.optString("strokeJoin")) {
      "round" -> StrokeJoin.Round
      "bevel" -> StrokeJoin.Bevel
      else -> StrokeJoin.Miter
    },
  )

private fun strokeCap(command: JSONObject): StrokeCap = when (command.optString("strokeCap")) {
  "round" -> StrokeCap.Round
  "square" -> StrokeCap.Square
  else -> StrokeCap.Butt
}

// A path from `points` (straight segments) or `segments` (moveTo, lineTo, quadTo, cubicTo, arcTo, close).
private fun DrawScope.path(command: JSONObject): Path? {
  val path = Path()
  val points = command.optJSONArray("points")
  if (points != null) {
    if (points.length() == 0) return null
    val start = point(points.getJSONObject(0))
    path.moveTo(start.x, start.y)
    for (index in 1 until points.length()) point(points.getJSONObject(index)).let { path.lineTo(it.x, it.y) }
    if (command.optBoolean("closed")) path.close()
    return path
  }
  val segments = command.optJSONArray("segments") ?: return null
  fun px(segment: JSONObject, name: String) = segment.getDouble(name).dp.toPx()
  for (index in 0 until segments.length()) {
    val segment = segments.getJSONObject(index)
    when (segment.getString("op")) {
      "moveTo" -> path.moveTo(px(segment, "x"), px(segment, "y"))
      "lineTo" -> path.lineTo(px(segment, "x"), px(segment, "y"))
      "quadTo" -> path.quadraticTo(px(segment, "x1"), px(segment, "y1"), px(segment, "x2"), px(segment, "y2"))
      "cubicTo" -> path.cubicTo(px(segment, "x1"), px(segment, "y1"), px(segment, "x2"), px(segment, "y2"),
        px(segment, "x3"), px(segment, "y3"))
      "arcTo" -> path.arcTo(Rect(Offset(px(segment, "x"), px(segment, "y")),
        Size(px(segment, "width"), px(segment, "height"))), segment.getDouble("startAngle").toFloat(),
        segment.getDouble("sweepAngle").toFloat(), segment.optBoolean("forceMoveTo"))
      "close" -> path.close()
      else -> error("Unknown Compose path segment: " + segment.getString("op"))
    }
  }
  if (command.optBoolean("closed")) path.close()
  return path
}

private fun DrawScope.point(value: JSONObject): Offset =
  Offset(value.getDouble("x").dp.toPx(), value.getDouble("y").dp.toPx())
