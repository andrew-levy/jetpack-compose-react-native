package expo.modules.jetpackcomposereactnative.views.modal_bottom_sheet

import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.viewevent.ViewEventCallback
import expo.modules.kotlin.views.ExpoView
import kotlinx.coroutines.launch

data class ModalBottomSheetProps(
    var isVisible: Boolean = false,
    var modifier: ModifierProp = emptyList(),
    var children: List<View> = emptyList(),
)

class ModalBottomSheetView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(ModalBottomSheetProps())
    private val onDismiss by EventDispatcher()

    override fun addView(child: View?, index: Int) {
        println("child: $child")
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
            it.layoutParams = LayoutParams(MATCH_PARENT, MATCH_PARENT)
            it.setContent {
                ModalBottomSheetComposable(
                    props = props.value,
                    onDismiss = onDismiss
                )
            }
            addView(it)
        }
    }

    fun updateIsVisible(isVisible: Boolean) {
        props.value = props.value.copy(isVisible = isVisible)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalBottomSheetComposable(
    props: ModalBottomSheetProps,
    onDismiss: ViewEventCallback<Map<String, Any>>
) {
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false,
    )
    val scope = rememberCoroutineScope()

    if (props.isVisible) {
        ModalBottomSheet(
            onDismissRequest = {
                scope.launch {
                    sheetState.hide()
                }.invokeOnCompletion {
                    if (!sheetState.isVisible) {
                        onDismiss(mapOf())
                    }
                }
            },
            sheetState = sheetState,
            modifier = Modifier.fillMaxHeight(),
        ) {
            props.children.map { child ->
                AndroidView(
                    modifier = Modifier.fillMaxWidth(),
                    factory = { child },
                )
            }
        }
    }
} 