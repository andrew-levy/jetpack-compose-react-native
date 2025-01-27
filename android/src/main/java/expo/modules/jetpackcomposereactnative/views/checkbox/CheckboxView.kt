package expo.modules.jetpackcomposereactnative.views.checkbox

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.viewevent.ViewEventCallback
import expo.modules.kotlin.views.ExpoView

data class CheckboxProps(
    var checked: Boolean = false,
    var modifier: ModifierProp = emptyList()
)

class CheckboxView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(CheckboxProps())
    private val onCheckedChange by EventDispatcher()

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
fun CheckboxComposable(props: CheckboxProps, onCheckedChange: ViewEventCallback<Map<String, Any>>) {
    Checkbox(
        checked = props.checked,
        onCheckedChange = {
            onCheckedChange(mapOf("checked" to it))
        },
        modifier = props.modifier.toModifier()
    )
}