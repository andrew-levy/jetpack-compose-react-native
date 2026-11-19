package com.jetpackcomposereactnative.views.spacer

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import com.jetpackcomposereactnative.common.ModifierProp
import com.jetpackcomposereactnative.common.toModifier
import com.jetpackcomposereactnative.common.LegacyComposeView

data class SpacerProps(
    var modifier: ModifierProp = emptyList(),
)

class SpacerView(context: Context) : LegacyComposeView(context) {
    private var props = mutableStateOf(SpacerProps())
    private val onSpacerClick = legacyEvent("topSpacerClick")

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                SpacerComposable(props = props.value)
            }
            addView(it)
        }
    }
    
    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@Composable
fun SpacerComposable(props: SpacerProps) {
    Spacer(modifier = props.modifier.toModifier())
}
