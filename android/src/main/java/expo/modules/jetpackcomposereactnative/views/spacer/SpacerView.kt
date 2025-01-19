package expo.modules.jetpackcomposereactnative.views.spacer

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.views.ExpoView

data class SpacerProps(
    var modifier: ModifierProp = emptyList(),
)

class SpacerView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(SpacerProps())
    private val onSpacerClick by EventDispatcher()

    override val shouldUseAndroidLayout = true

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                SpacerComposable(props = props.value)
            }
            addView(it)
        }
    }
    
    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@Composable
fun SpacerComposable(props: SpacerProps) {
    Spacer(modifier = props.modifier.toModifier())
}
