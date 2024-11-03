package expo.modules.jetpackcomposereactnative.views.textfield

import android.content.Context
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.views.ExpoView
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.ComposeView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.viewevent.ViewEventCallback

data class TextFieldProps(
    var value: String = "",
    var label: String? = null,
    var modifier: ModifierProp = emptyList()
)

class TextFieldView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(TextFieldProps())
    private val onValueChange by EventDispatcher()

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            it.setContent {
                TextFieldComposable(
                    props = props.value,
                    onValueChange = onValueChange
                )
            }
            addView(it)
        }
    }

    fun setValue(value: String) {
        props.value = props.value.copy(value = value)
    }

    fun setLabel(label: String?) {
        props.value = props.value.copy(label = label)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@Composable
fun TextFieldComposable(
    props: TextFieldProps,
    onValueChange: ViewEventCallback<Map<String, Any>>
) {
    var text by remember { mutableStateOf(props.value) }
    TextField(
        value = text,
        onValueChange = { newValue ->
            text = newValue
            onValueChange(mapOf("value" to newValue))
        },
        label = props.label?.let { labelText ->
            { Text(labelText) }
        },
        modifier = props.modifier.toModifier()
    )
} 
