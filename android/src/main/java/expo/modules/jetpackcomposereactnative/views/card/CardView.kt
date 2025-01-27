package expo.modules.jetpackcomposereactnative.views.card

import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

data class CardProps(
    var children: List<View> = emptyList(),
    var variant: String = "filled",
    var modifier: ModifierProp = emptyList()
)

class CardView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(CardProps())

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
                CardComposable(props = props.value)
            }
            addView(it)
        }
    }

    fun updateVariant(variant: String) {
        props.value = props.value.copy(variant = variant)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

}

@Composable
fun CardComposable(props: CardProps) {
    when(props.variant) {
        "outlined" -> OutlinedCard(modifier = props.modifier.toModifier()) {
            props.children.map { child ->
                AndroidView(
                    modifier = Modifier.fillMaxWidth(),
                    factory = { child },
                )
            }
        }
        "elevated" -> ElevatedCard(modifier = props.modifier.toModifier()) {
            props.children.map { child ->
                AndroidView(
                    modifier = Modifier.fillMaxWidth(),
                    factory = { child },
                )
            }
        }
        "filled" -> Card(modifier = props.modifier.toModifier()) {
            props.children.map { child ->
                AndroidView(
                    modifier = Modifier.fillMaxWidth(),
                    factory = { child },
                )
            }
        }
        else -> Card(modifier = props.modifier.toModifier()) {
            props.children.map { child ->
                AndroidView(
                    modifier = Modifier.fillMaxWidth(),
                    factory = { child },
                )
            }
        }
    }
}
