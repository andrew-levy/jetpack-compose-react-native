package expo.modules.jetpackcomposereactnative.views.row

import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

data class RowProps(
    var children: List<View> = emptyList(),
    var modifier: ModifierProp = emptyList()
)

class RowView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(RowProps())

    override fun addView(child: View?, index: Int) {
        if (child is ComposeView) {
            super.addView(child, index)
        } else {
            if (child != null) {
                println("current size = ${props.value.children.size}")
                props.value = props.value.copy(children = props.value.children + child)
                println("new size = ${props.value.children.size}")
            }
        }
    }

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                RowComposable(props = props.value)
            }
            addView(it)
        }
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

}

@Composable
fun RowComposable(props: RowProps) {
    Row(modifier = props.modifier.toModifier()) {
        props.children.map { child ->
            AndroidView(
                factory = { child },
            )
        }
    }
}
