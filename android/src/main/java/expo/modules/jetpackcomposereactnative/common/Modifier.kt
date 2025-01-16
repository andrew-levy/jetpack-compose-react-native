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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
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
                    } else if (value is Map<*, *>) {
                        val horizontal = (value["horizontal"] as? Number)?.toDouble()?.dp ?: 0.dp
                        val vertical = (value["vertical"] as? Number)?.toDouble()?.dp ?: 0.dp
                        val top = (value["top"] as? Number)?.toDouble()?.dp ?: vertical
                        val bottom = (value["bottom"] as? Number)?.toDouble()?.dp ?: vertical
                        val start = (value["start"] as? Number)?.toDouble()?.dp ?: horizontal
                        val end = (value["end"] as? Number)?.toDouble()?.dp ?: horizontal

                        modifiers = modifiers.then(
                            Modifier.padding(start, top, end, bottom)
                        )
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
                        val width = value["width"] as? Double ?: 1.0
                        val color = value["color"] as? String ?: "black"

                        modifiers = modifiers.then(
                            Modifier.border(
                                width = width.dp,
                                color = parseComposeColor(color),
                                shape = RectangleShape
                            )
                        )
                    }
                }

                "alpha" -> {
                    if (value is Number) {
                        val float = value.toFloat()
                        modifiers = modifiers.then(Modifier.alpha(float))
                    }
                }

                "backgroundColor" -> {
                    if (value is Map<*, *>) {
                        val color = value["color"] as? String ?: ""
                        modifiers = modifiers.then(
                            Modifier.background(
                                parseComposeColor(color),
                                RectangleShape
                            )
                        )
                    }
                }

                "clipToBounds" -> {
                    modifiers = modifiers.then(Modifier.clipToBounds())
                }

                "shadow" -> {
                    if (value is Map<*, *>) {
                        val elevation = value["elevation"] as? Double ?: 0.0
                        val shape = value["shape"] as? Shape ?: RectangleShape
                        val clip = value["clip"] as? Boolean ?: false
                        val ambientColor = value["ambientColor"] as? String ?: "#000"
                        val spotColor = value["spotColor"] as? String ?: "#000"
                        modifiers = modifiers.then(
                            Modifier.shadow(
                                elevation.dp,
                                shape,
                                clip,
                                parseComposeColor(ambientColor),
                                parseComposeColor(spotColor)
                            )
                        )
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
