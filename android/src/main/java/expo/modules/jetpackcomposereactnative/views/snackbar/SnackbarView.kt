package expo.modules.jetpackcomposereactnative.views.snackbar

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.Modifier
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.viewevent.ViewEventCallback

data class SnackbarProps(
    var modifier: ModifierProp = emptyList(),
    var message: String = "",
    var actionLabel: String? = null,
)

class SnackbarView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(SnackbarProps())
    private val onAction by EventDispatcher()
    private val onDismiss by EventDispatcher()

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            it.setContent {
                SnackbarComposable(
                    props = props.value, 
                    onActionPerformed = onAction,
                    onDismissed = onDismiss,
                )
            }
            addView(it)
        }
    }

    fun updateMessage(message: String) {
        props.value = props.value.copy(message = message)
    }

    fun updateActionLabel(actionLabel: String) {
        props.value = props.value.copy(actionLabel = actionLabel)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@Composable
fun SnackbarComposable(
        props: SnackbarProps, 
        onActionPerformed: ViewEventCallback<Map<String, Any>>,
        onDismissed: ViewEventCallback<Map<String, Any>>
    ) {
    val modifier: Modifier = props.modifier.toModifier()

    Snackbar(
        modifier = modifier,    
        action = {
            if(props.actionLabel != null) {
                TextButton(
                    onClick = { onActionPerformed(mapOf()) },
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = MaterialTheme.colorScheme.inversePrimary
                    )
                ) {
                    Text(props.actionLabel ?: "Action")
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        },
        dismissAction = {
            IconButton(
                onClick = { onDismissed(mapOf()) }
            ) {
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = "Dismiss",
                )
            }
        }
    ) {
        Text(props.message)
    }
}