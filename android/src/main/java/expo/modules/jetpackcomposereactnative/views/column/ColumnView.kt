package expo.modules.jetpackcomposereactnative.views.column

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.jetpackcomposereactnative.views.carousel.CarouselProps
import expo.modules.jetpackcomposereactnative.views.carousel.CarouselView
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

data class ColumnProps(
    var children: List<View> = emptyList(),
    var modifier: ModifierProp = emptyList(),
    var lazy: Boolean = false,
    var lastItem: View? = null,
)

class ColumnView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(ColumnProps())

    override val shouldUseAndroidLayout = true

    override fun addView(child: View?, index: Int) {
        if (child is ComposeView) {
            super.addView(child, index)
        } else {
            if (child != null) {
                props.value = props.value.copy(children = props.value.children + child)
            }
        }
    }

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                 if (props.value.lazy) {
                    LazyColumnComposable(props = props.value)
                } else {
                    ColumnComposable(props = props.value)
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
fun ColumnComposable(props: ColumnProps) {
    Column(modifier = props.modifier.toModifier()) {
        props.children.map { child ->
            AndroidView(
                modifier = Modifier.fillMaxWidth(),
                factory = { child },
            )
        }
    }
}

@Composable
fun LazyColumnComposable(props: ColumnProps) {
    val totalItems = props.children.size

    LazyColumn(modifier = props.modifier.toModifier()) {
        items(totalItems) { index ->
            AndroidView(
                modifier = Modifier.fillMaxWidth(),
                factory = { context ->
                    props.children[index].apply {
                        layoutParams = ViewGroup.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
                    }
                },
            )
        }
        // To be added soon...
       item {}
    }
}
