package expo.modules.jetpackcomposereactnative.views.snackbar

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.Modifier
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.viewevent.ViewEventCallback
import kotlinx.coroutines.launch

data class SnackbarProps(
    var modifier: ModifierProp = emptyList(),
    var message: String = "",
    var actionLabel: String? = null,
    var show: Boolean = false,
)

class SnackbarView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(SnackbarProps())
    private val onActionPerformed by EventDispatcher()
    private val onDismissed by EventDispatcher()

    override val shouldUseAndroidLayout = true

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            it.setContent {
                SnackbarComposable(
                    props = props.value,
                    onActionPerformed = onActionPerformed,
                    onDismissed = onDismissed,
                )
            }
            addView(it)
        }
    }

    fun updateShow(show: Boolean) {
        props.value = props.value.copy(show = show)
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
@SuppressLint("RestrictedApi")
fun SnackbarComposable(
    props: SnackbarProps,
    onActionPerformed: ViewEventCallback<Map<String, Any>>,
    onDismissed: ViewEventCallback<Map<String, Any>>
) {
    val snackState = remember { SnackbarHostState() }
    val snackScope = rememberCoroutineScope()

    SnackbarHost(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(Alignment.Bottom),
        hostState = snackState,
        snackbar = { data ->
            Snackbar(
                modifier = Modifier
                    .padding(12.dp),
                dismissAction = {
                    onDismissed(mapOf("onDismissed" to true))
                },
                action = {
                    TextButton(
                        onClick = {
                            onActionPerformed(mapOf("onActionPerformed" to true))
                            snackState.currentSnackbarData?.dismiss()
                        }
                    ) { Text(data.visuals.actionLabel ?: "") }
                }) {
                Text(data.visuals.message)
            }
        }
    )

    if (props.show) {
        LaunchedEffect(Unit) {
            snackScope.launch {
                snackState.showSnackbar(
                    message = "Hello world",
                    actionLabel = "OK",
                    duration = SnackbarDuration.Short,
                )
            }
        }
    }
}

