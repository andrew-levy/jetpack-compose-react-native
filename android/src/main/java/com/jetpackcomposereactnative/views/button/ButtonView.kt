package com.jetpackcomposereactnative.views.button

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.Modifier
import com.jetpackcomposereactnative.common.ModifierProp
import com.jetpackcomposereactnative.common.toModifier
import com.jetpackcomposereactnative.common.LegacyComposeView

data class ButtonProps(
    var text: String = "",
    var modifier: ModifierProp = emptyList(),
    var variant: String = "default"
)

class ButtonView(context: Context) : LegacyComposeView(context) {
    private var props = mutableStateOf(ButtonProps())
    private val onButtonClick = legacyEvent("topButtonClick")

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

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

    fun updateVariant(variant: String) {
        props.value = props.value.copy(variant = variant)
    }
}

@Composable
fun ButtonComposable(props: ButtonProps, onClick: (Map<String, Any>) -> Unit) {
    val modifier: Modifier = props.modifier.toModifier()

    when (props.variant.lowercase()) {
        "filled" -> Button(
            onClick = { onClick(mapOf()) },
            modifier = modifier
        ) {
            Text(text = props.text)
        }
        "elevated" -> ElevatedButton(
            onClick = { onClick(mapOf()) },
            modifier = modifier
        ) {
            Text(text = props.text)
        }
        "filled-tonal" -> FilledTonalButton(
            onClick = { onClick(mapOf()) },
            modifier = modifier
        ) {
            Text(text = props.text)
        }
        "outlined" -> OutlinedButton(
            onClick = { onClick(mapOf()) },
            modifier = modifier
        ) {
            Text(text = props.text)
        }
        "text" -> TextButton(
            onClick = { onClick(mapOf()) },
            modifier = modifier
        ) {
            Text(text = props.text)
        }
        "floating-action" -> FloatingActionButton(
            onClick = { onClick(mapOf()) },
            modifier = modifier
        ) {
            Text(text = props.text)
        }
        "extended-floating-action" -> ExtendedFloatingActionButton(
            text = { Text(text = props.text) },
            icon = { Icon(Icons.Filled.Favorite, contentDescription = null) },
            onClick = { onClick(mapOf()) },
            modifier = modifier
        )
        "default" ->  Button(
            onClick = { onClick(mapOf()) },
            modifier = modifier
        ) {
            Text(text = props.text)
        }
        else -> Button(
            onClick = { onClick(mapOf()) },
            modifier = modifier
        ) {
            Text(text = props.text)
        }
    }
}
