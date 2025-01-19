package expo.modules.jetpackcomposereactnative.views.divider

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.views.ExpoView

data class DividerProps(
    var direction: String = "horizontal",
    var thickness: Double? = null,
    var color: String? = null,
    var modifier: ModifierProp = emptyList()
)

class DividerView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(DividerProps())
    private val onDividerClick by EventDispatcher()

    override val shouldUseAndroidLayout = true

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                DividerComposable(props = props.value)
            }
            addView(it)
        }
    }

    fun updateThickness(thickness: Double?) {
        props.value = props.value.copy(thickness = thickness)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

    fun updateColor(color: String?) {
        props.value = props.value.copy(color = color)
    }

    fun updateDirection(direction: String) {
        props.value = props.value.copy(direction = direction)
    }
    
}

@Composable
fun DividerComposable(props: DividerProps) {
    when(props.direction) {
        "horizontal" -> HorizontalDivider(
            thickness = props.thickness?.dp ?: DividerDefaults.Thickness,
            color = props.color?.toColorInt()?.let { Color(it) } ?: DividerDefaults.color,
            modifier = props.modifier.toModifier()
        )
        "vertical" -> VerticalDivider(
            thickness = props.thickness?.dp ?: DividerDefaults.Thickness,
            color = props.color?.toColorInt()?.let { Color(it) } ?: DividerDefaults.color,
            modifier = props.modifier.toModifier()
        )
    }
}
