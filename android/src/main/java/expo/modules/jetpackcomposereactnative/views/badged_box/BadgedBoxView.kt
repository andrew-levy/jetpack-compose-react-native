package expo.modules.jetpackcomposereactnative.views.badged_box

import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.BadgedBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.jetpackcomposereactnative.views.badge.BadgeView
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

data class BadgedBoxProps(
    var children: List<View> = emptyList(),
    var badge: View? = null,
    var modifier: ModifierProp = emptyList()
)

class BadgedBoxView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(BadgedBoxProps())

    override fun addView(child: View?, index: Int) {
        when (child) {
            is ComposeView -> {
                super.addView(child, index)
            }

            is BadgeView -> {
                props.value = props.value.copy(badge = child)
            }

            else -> {
                if (child != null) {
                    props.value = props.value.copy(children = props.value.children + child)
                }
            }
        }
    }

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                BadgedBoxComposable(props = props.value)
            }
            addView(it)
        }
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

}

@Composable
fun BadgedBoxComposable(props: BadgedBoxProps) {
    BadgedBox(
        badge = {
            props.badge?.let { badge ->
                AndroidView(
                    factory = { badge },
                )
            }
        },
        modifier = props.modifier.toModifier()
    ) {
        props.children.map { child ->
            AndroidView(
                factory = { child },
            )
        }
    }
}
