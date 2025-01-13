package expo.modules.jetpackcomposereactnative.views.dialog

import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
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

data class DialogProps(
    var children: List<View> = emptyList(),
    var modifier: ModifierProp = emptyList(),
    var title: String = "",
    var text: String = "",
    var icon: String? = null,
    var tonalElevation: Int? = null,
    var confirmText: String? = null,
    var dismissText: String? = null,
)

class DialogView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(DialogProps())
    private val onConfirm by EventDispatcher()
    private val onDismiss by EventDispatcher()

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            it.setContent {
                DialogComposable(
                    props = props.value, 
                    onDismissRequest = onDismiss,
                    onConfirmation = onConfirm
                )
            }
            addView(it)
        }
    }

    fun updateTitle(title: String) {
        props.value = props.value.copy(title = title)
    }

    fun updateText(text: String) {
        props.value = props.value.copy(text = text)
    }

    fun updateIcon(icon: String) {
        props.value = props.value.copy(icon = icon)
    }

    fun updateTonalElevation(tonalElevation: Int) {
        props.value = props.value.copy(tonalElevation = tonalElevation)
    }

    fun updateConfirmText(confirmText: String) {
        props.value = props.value.copy(confirmText = confirmText)
    }

    fun updateDismissText(dismissText: String) {
        props.value = props.value.copy(dismissText = dismissText)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@Composable
fun DialogComposable(
    props: DialogProps, 
    onDismissRequest: ViewEventCallback<Map<String, Any>>, 
    onConfirmation: ViewEventCallback<Map<String, Any>>
    ) {
    val modifier: Modifier = props.modifier.toModifier()

    AlertDialog(
        onDismissRequest = { onDismissRequest(mapOf()) },
        modifier = modifier,
        icon = {
            if (props.icon != null) {
                Icon(Icons.Rounded.Favorite, null) 
            }
        },
        title = { Text(props.title) },
        text = { Text(props.text) },
        shape = AlertDialogDefaults.shape,
        tonalElevation = props.tonalElevation?.dp ?: AlertDialogDefaults.TonalElevation,
        confirmButton = {
            TextButton(onClick = { 
                onConfirmation(mapOf())
            }) {
                Text(props.confirmText ?: "Confirm")
            }
        },
        dismissButton = {
            TextButton(onClick = { 
                onDismissRequest(mapOf()) 
            }) {
                Text(props.dismissText ?: "Dismiss")
            }
        }
    )
}