package com.jetpackcomposereactnative.views.checkbox

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import com.jetpackcomposereactnative.common.ModifierProp
import com.jetpackcomposereactnative.common.toModifier
import com.jetpackcomposereactnative.common.LegacyComposeView

data class CheckboxProps(
    var checked: Boolean = false,
    var modifier: ModifierProp = emptyList()
)

class CheckboxView(context: Context) : LegacyComposeView(context) {
    private var props = mutableStateOf(CheckboxProps())
    private val onCheckedChange = legacyEvent("topCheckedChange")


    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            it.setContent {
                CheckboxComposable(props = props.value, onCheckedChange = onCheckedChange)
            }
            addView(it)
        }
    }

    fun updateChecked(checked: Boolean) {
        props.value = props.value.copy(checked = checked)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@Composable
fun CheckboxComposable(props: CheckboxProps, onCheckedChange: (Map<String, Any>) -> Unit) {
    Checkbox(
        checked = props.checked,
        onCheckedChange = {
            onCheckedChange(mapOf("checked" to it))
        },
        modifier = props.modifier.toModifier()
    )
}