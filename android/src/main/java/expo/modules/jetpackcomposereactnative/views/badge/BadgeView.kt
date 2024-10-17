package expo.modules.jetpackcomposereactnative.views.badge

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.Badge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

data class BadgeProps(
    var content: String = "",
    var modifier: ModifierProp = emptyList()
)

class BadgeView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(BadgeProps())

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                BadgeComposable(props = props.value)
            }
            addView(it)
        }
    }

    fun updateContent(content: String) {
        props.value = props.value.copy(content = content)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

}

@Composable
fun BadgeComposable(props: BadgeProps) {
    Badge(
        modifier = props.modifier.toModifier()
    ) {
        Text(props.content)
    }
}
