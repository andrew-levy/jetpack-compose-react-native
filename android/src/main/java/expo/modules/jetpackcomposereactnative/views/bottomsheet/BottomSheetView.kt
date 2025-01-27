package expo.modules.jetpackcomposereactnative.views.bottomsheet

import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.viewevent.ViewEventCallback

data class BottomSheetProps(
    var children: List<View> = emptyList(),
    var modifier: ModifierProp = emptyList()
)

class BottomSheetView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(BottomSheetProps())
    private val onDismiss by EventDispatcher()

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
                BottomSheetComposable(
                    props = props.value,
                    onDismissRequest = onDismiss 
                )
            }
            addView(it)
        }
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetComposable(
    props: BottomSheetProps,
    onDismissRequest: ViewEventCallback<Map<String, Any>>
){
    val sheetState = rememberModalBottomSheetState()
    val modifier: Modifier = props.modifier.toModifier()

    ModalBottomSheet(
        onDismissRequest = {
            onDismissRequest(mapOf())
        },
        sheetState = sheetState,
        sheetMaxWidth = BottomSheetDefaults.SheetMaxWidth,
        containerColor = BottomSheetDefaults.ContainerColor,
        shape = BottomSheetDefaults.ExpandedShape,
        tonalElevation = 0.dp
    ) {
        props.children.map { child ->
            AndroidView(
                factory = { child },
            )
        }
    }
}