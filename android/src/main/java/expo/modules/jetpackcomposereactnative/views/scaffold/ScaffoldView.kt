package expo.modules.jetpackcomposereactnative.views.scaffold

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.jetpackcomposereactnative.views.icon.IconComposable
import expo.modules.jetpackcomposereactnative.views.icon.IconProps
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

data class ScaffoldProps(
    var children: List<View> = emptyList(),
    var modifier: ModifierProp = emptyList()
)

class ScaffoldView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(ScaffoldProps())

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
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            it.setContent {
                ScaffoldComposable(props = props.value)
            }
            addView(it)
        }
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ScaffoldComposable(props: ScaffoldProps) {
    Scaffold(
        modifier = props.modifier.toModifier(),
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                IconComposable(props = IconProps(
                    name = "favorite"
                ))
            }
        }
    ) {
        props.children.map { child ->
            AndroidView(
                factory = { child },
            )
        }
    }
}