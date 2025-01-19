package expo.modules.jetpackcomposereactnative.views.switch_

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.viewevent.ViewEventCallback
import expo.modules.kotlin.views.ExpoView

data class SwitchProps(
    var checked: Boolean = false,
    var modifier: ModifierProp = emptyList()
)

class SwitchView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(SwitchProps())
    private val onCheckedChange by EventDispatcher()

    override val shouldUseAndroidLayout = true

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            it.setContent {
                SwitchComposable(props = props.value, onCheckedChange = onCheckedChange)
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
fun SwitchComposable(props: SwitchProps, onCheckedChange: ViewEventCallback<Map<String, Any>>) {
    Switch(
        checked = props.checked,
        onCheckedChange = {
            onCheckedChange(mapOf("checked" to it))
        },
        modifier = props.modifier.toModifier()
    )
}