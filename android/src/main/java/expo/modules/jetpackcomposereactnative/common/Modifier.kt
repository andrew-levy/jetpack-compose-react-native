package expo.modules.jetpackcomposereactnative.common

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

typealias ModifierProp = List<Map<String, Any>>

fun ModifierProp.toModifier(): Modifier {
    var modifiers = Modifier as Modifier

    forEach { map ->
        map.forEach { (key, value) ->
            when (key) {
                "padding" -> {
                    if (value is Number) {
                        modifiers = Modifier.padding(value.toDouble().dp)
                    }
                }
            }
        }
    }
    return modifiers
}