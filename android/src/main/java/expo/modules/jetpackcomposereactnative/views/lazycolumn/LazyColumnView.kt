package expo.modules.jetpackcomposereactnative.views.lazycolumn

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.lazy.LazyColumn
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

data class LazyColumnProps(
    var children: List<View> = emptyList(),
    var modifier: ModifierProp = emptyList()
)

class LazyColumnView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(LazyColumnProps())

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
                LazyColumnFactory(props = props.value)
            }
            addView(it)
        }
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

}

@Composable
fun <T: View> LazyColumnComposable(props: ColumnProps) {
    LazyColumn(modifier = props.modifier.toModifier()) {
        items(100) {
           AndroidView(
               modifier = Modifier.fillMaxWidth(),
               factory = { context ->
                   FrameLayout(context).apply {
                       addView(viewFactory(context))

                       // Create a ComposeView and add it as a child
                       val composeView = ComposeView(context)
                       addView(composeView)

                       // Compose the content into the ComposeView
                       composeView.setContent {
                           content()
                       }
                   }
               },
           )
       }
    }
}

@Composable
fun LazyColumnFactory(props: ColumnProps) {
    LazyColumnComposable(
        viewFactory = { context ->
            TextView(context).apply {
                text = "Custom TextView"
            }
        }
    ) {
        Text("A")
    }
}
