package expo.modules.jetpackcomposereactnative.views.row

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.compose.material3.Text

data class RowProps(
    var children: List<View> = emptyList(),
    var modifier: ModifierProp = emptyList(),
    var lazy: Boolean = false,
    var lastItem: View? = null,
)

class RowView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(RowProps())

    override val shouldUseAndroidLayout = true

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
                if (props.value.lazy) {
                    LazyRowComposable(props = props.value)
                } else {
                    RowComposable(props = props.value)
                }
            }
            addView(it)
        }
    }

    fun updateLazy(lazy: Boolean) {
        props.value = props.value.copy(lazy = lazy)
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

@Composable
fun LazyRowComposable(props: RowProps) {
    val totalItems = props.children.size

    LazyRow(modifier = props.modifier.toModifier()) {
        items(totalItems) { index ->
            AndroidView(
                factory = { context -> 
                    props.children[index].apply {
                        layoutParams = ViewGroup.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
                    }                    
                },
            )
        }
       item {}
    }
}
