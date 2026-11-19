package com.jetpackcomposereactnative.views.slider

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import com.jetpackcomposereactnative.common.ModifierProp
import com.jetpackcomposereactnative.common.toModifier
import com.jetpackcomposereactnative.common.LegacyComposeView

data class SliderProps(
    var value: Float = 0f,
    var modifier: ModifierProp = emptyList()
)

class SliderView(context: Context) : LegacyComposeView(context) {
    private var props = mutableStateOf(SliderProps())
    private val onValueChange = legacyEvent("topValueChange")

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            it.setContent {
                SliderComposable(props = props.value, onValueChange = onValueChange)
            }
            addView(it)
        }
    }

    fun updateValue(value: Float) {
        props.value = props.value.copy(value = value)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@Composable
fun SliderComposable(props: SliderProps, onValueChange: (Map<String, Any>) -> Unit) {
    Slider(
        value = props.value,
        onValueChange = {
            onValueChange(mapOf("value" to it))
        },
        modifier = props.modifier.toModifier()
    )
}