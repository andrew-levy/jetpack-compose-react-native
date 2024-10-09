package expo.modules.jetpackcomposereactnative.views.button

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.viewevent.ViewEventCallback
import expo.modules.kotlin.views.ExpoView

data class ButtonProps(
    var text: String = ""
)

class ButtonView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(ButtonProps())
    private val onButtonClick by EventDispatcher()

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                ButtonComposable(props = props.value, onClick = onButtonClick)
            }
            addView(it)
        }
    }

    fun updateText(text: String) {
        props.value = props.value.copy(text = text)
    }
}

@Composable
fun ButtonComposable(props: ButtonProps, onClick: ViewEventCallback<Map<String, Any>>) {
    Button(
        onClick = { onClick(mapOf()) },
        modifier = Modifier.fillMaxWidth() // Ensure button takes up full width
    ) {
        Text(text = props.text)
    }
}
