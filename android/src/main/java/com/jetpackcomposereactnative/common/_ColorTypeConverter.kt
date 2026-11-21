package com.jetpackcomposereactnative.common

import androidx.compose.ui.graphics.Color
import kotlin.math.abs

fun parseComposeColor(color: Any): Color = when (color) {
    is Number -> Color(color.toInt())
    is String -> runCatching { parseColorString(color) }.getOrDefault(Color.Unspecified)
    else -> Color.Unspecified
}

private fun parseColorString(color: String): Color {
    // hex
    if (color.startsWith("#")) {
        val cleaned = color.substring(1)
        val hex = if (cleaned.length == 6) {
            "#FF$cleaned"
        } else if (cleaned.length == 8) {
            "#$cleaned"
        } else {
            "#000000"
        }
        val parsed = android.graphics.Color.parseColor(hex)
        return Color(parsed)
    }

    // hsla
    if (color.startsWith("hsl")) {
        val hsla = color.substringAfter("(").substringBefore(")").split(",").map { it.trim() }
        val h = hsla[0].toFloat()
        val s = hsla[1].removeSuffix("%").toFloat() / 100
        val l = hsla[2].removeSuffix("%").toFloat() / 100
        val a = hsla.getOrNull(3)?.toFloat() ?: 1f
        val parsed = hslaToColor(h, s, l, a)
        return Color(parsed)
    }

    // rgba
    if (color.startsWith("rgba")) {
        val rgba = color.substringAfter("(").substringBefore(")").split(",").map { it.trim() }
        val r = rgba[0].toInt()
        val g = rgba[1].toInt()
        val b = rgba[2].toInt()
        val a = rgba.getOrNull(3)?.toFloat() ?: 1f
        val parsed = android.graphics.Color.argb((a * 255).toInt(), r, g, b)
        return Color(parsed)
    }

    // rgb
    if (color.startsWith("rgb")) {
        val rgb = color.substringAfter("(").substringBefore(")").split(",").map { it.trim() }
        val r = rgb[0].toInt()
        val g = rgb[1].toInt()
        val b = rgb[2].toInt()
        val parsed = android.graphics.Color.rgb(r, g, b)
        return Color(parsed)
    }

    return Color(android.graphics.Color.parseColor(color))
}


private fun hslaToColor(h: Float, s: Float, l: Float, a: Float): Int {
    val c = (1 - abs(2 * l - 1)) * s
    val x = c * (1 - abs((h / 60) % 2 - 1))
    val m = l - c / 2
    val (r, g, b) = when (h.toInt()) {
        in 0..59 -> listOf(c, x, 0f)
        in 60..119 -> listOf(x, c, 0f)
        in 120..179 -> listOf(0f, c, x)
        in 180..239 -> listOf(0f, x, c)
        in 240..299 -> listOf(x, 0f, c)
        in 300..359 -> listOf(c, 0f, x)
        else -> listOf(0f, 0f, 0f)
    }
    return android.graphics.Color.argb(
        (a * 255).toInt(),
        ((r + m) * 255).toInt(),
        ((g + m) * 255).toInt(),
        ((b + m) * 255).toInt()
    )
}
