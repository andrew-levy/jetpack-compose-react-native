package expo.modules.jetpackcomposereactnative.views.box

import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

data class BoxProps(
    var children: List<View> = emptyList(),
    var modifier: ModifierProp = emptyList(),
    var contentAlignment: String? = null
)

class BoxView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(BoxProps())

    override fun addView(child: View?, index: Int) {
        if (child is ComposeView) {
            super.addView(child, index)
        } else {
            if (child != null) {
                props.value = props.value.copy(children = props.value.children + child)
            }
        }
    }

    override val shouldUseAndroidLayout = true


    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            it.setContent {
                BoxComposable(props = props.value)
            }
            addView(it)
        }
    }

    fun updateContentAlignment(contentAlignment: String) {
        props.value = props.value.copy(contentAlignment = contentAlignment)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@Composable
fun BoxComposable(props: BoxProps) {
    val alignment = when (props.contentAlignment) {
        "topStart" -> Alignment.TopStart
        "topCenter" -> Alignment.TopCenter
        "topEnd" -> Alignment.TopEnd
        "centerStart" -> Alignment.CenterStart
        "center" -> Alignment.Center
        "centerEnd" -> Alignment.CenterEnd
        "bottomStart" -> Alignment.BottomStart
        "bottomCenter" -> Alignment.BottomCenter
        "bottomEnd" -> Alignment.BottomEnd
        else -> Alignment.TopStart // Default if null
    }

    Box(
        contentAlignment = alignment,
        propagateMinConstraints = false,
        modifier = props.modifier.toModifier()
    ) {
        props.children.map { child ->
            AndroidView(
                factory = { child },
            )
        }
    }
}