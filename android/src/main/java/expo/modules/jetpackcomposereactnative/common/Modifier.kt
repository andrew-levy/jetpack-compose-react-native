package expo.modules.jetpackcomposereactnative.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.zIndex

typealias ModifierProp = List<Map<String, Any>>

fun ModifierProp.toModifier(): Modifier {
    var modifiers: Modifier = Modifier

    forEach { map ->
        map.forEach { (key, value) ->
            when (key) {
                "padding" -> {
                    if (value is Number) {
                        modifiers = modifiers.then(Modifier.padding(value.toDouble().dp))
                    }
                }
                "width" -> {
                    if (value is Number) {
                        modifiers = modifiers.then(Modifier.width(value.toDouble().dp))
                    }
                }
                "height" -> {
                    if (value is Number) {
                        modifiers = modifiers.then(Modifier.height(value.toDouble().dp))
                    }
                }
                "size" -> {
                    if (value is Number) {
                        modifiers = modifiers.then(Modifier.size(value.toDouble().dp))
                    }
                }
                "fillMaxHeight" -> {
                    modifiers = modifiers.then(Modifier.fillMaxHeight())
                }
                "fillMaxWidth" -> {
                    modifiers = modifiers.then(Modifier.fillMaxWidth())
                }
                "fillMaxSize" -> {
                    modifiers = modifiers.then(Modifier.fillMaxSize())
                }
                "border" -> {
                    if (value is Map<*, *>) {
                        val width = value["width"] as? Dp
                        val brush = value["brush"] as? Brush
                        val color = value["color"] as? Color
                        val shape = value["shape"] as? Shape ?: RectangleShape

                        if (width != null && brush != null) {
                            modifiers = modifiers.then(Modifier.border(width, brush, shape))
                        } else if (width != null && color != null) {
                            modifiers = modifiers.then(Modifier.border(width, color, shape))
                        }
                    }
                }
                "alpha" -> {
                    if (value is Float) {
                        modifiers = modifiers.then(Modifier.alpha(value))
                    }
                }
                "backgroundColor" -> {
                    if (value is Map<*, *>) {
                        val color = value["color"] as? Color ?: Color.Transparent
                        val shape = value["shape"] as? Shape ?: RectangleShape
                        modifiers = modifiers.then(Modifier.background(color, shape))
                    }
                }
                "backgroundBrush" -> {
                    if (value is Map<*, *>) {
                        val brush = value["brush"] as? Brush ?: SolidColor(Color.Transparent)
                        val shape = value["shape"] as? Shape ?: RectangleShape
                        val alpha = value["alpha"] as? Float ?: 1f
                        modifiers = modifiers.then(Modifier.background(brush, shape, alpha))
                    }
                }
                "clipToBounds" -> {
                    modifiers = modifiers.then(Modifier.clipToBounds())
                }
                "shadow" -> {
                    if (value is Map<*, *>) {
                        val elevation = value["elevation"] as? Dp ?: 0.dp
                        val shape = value["shape"] as? Shape ?: RectangleShape
                        val clip = value["clip"] as? Boolean ?: false
                        val ambientColor = value["ambientColor"] as? Color ?: Color.Black
                        val spotColor = value["spotColor"] as? Color ?: Color.Black
                        modifiers = modifiers.then(Modifier.shadow(elevation, shape, clip, ambientColor, spotColor))
                    }
                }
                "zIndex" -> {
                    if (value is Number) {
                        modifiers = modifiers.then(Modifier.zIndex(value.toFloat()))
                    }
                }
            }
        }
    }
    return modifiers
}
