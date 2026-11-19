package com.jetpackcomposereactnative.views.progress_indicator

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import com.jetpackcomposereactnative.common.ModifierProp
import com.jetpackcomposereactnative.common.toModifier
import com.jetpackcomposereactnative.common.LegacyComposeView

data class ProgressIndicatorProps(
    var progress: Float = 0f,
    var variant: String = "circular",
    var modifier: ModifierProp = emptyList()
)

class ProgressIndicatorView(context: Context) : LegacyComposeView(context) {
    private var props = mutableStateOf(ProgressIndicatorProps())

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                ProgressIndicatorComposable(props = props.value)
            }
            addView(it)
        }
    }

    fun updateProgress(progress: Float) {
        props.value = props.value.copy(progress = progress)
    }

    fun updateVariant(variant: String) {
        props.value = props.value.copy(variant = variant)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@Composable
fun ProgressIndicatorComposable(props: ProgressIndicatorProps) {
    when(props.variant) {
        "linear" -> LinearProgressIndicator(
            progress = { props.progress },
            modifier = props.modifier.toModifier()

        )
        "circular" -> CircularProgressIndicator(
            progress = { props.progress },
            modifier = props.modifier.toModifier()
        )
    }
}
