package expo.modules.jetpackcomposereactnative.views.chip

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.Modifier
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.jetpackcomposereactnative.views.icon.IconComposable
import expo.modules.jetpackcomposereactnative.views.icon.IconProps
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.viewevent.ViewEventCallback
import expo.modules.kotlin.views.ExpoView

data class ChipProps(
    var labelText: String = "",
    var selected: Boolean = false,
    var leadingIcon: String? = null,
    var trailingIcon: String? = null,
    var modifier: ModifierProp = emptyList(),
    var variant: String = "assist",
    var enabled: Boolean = true
)

class ChipView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(ChipProps())
    private val onChipClick by EventDispatcher()

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                ChipComposable(props = props.value, onClick = onChipClick)
            }
            addView(it)
        }
    }

    fun updateLabelText(labelText: String) {
        props.value = props.value.copy(labelText = labelText)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

    fun updateVariant(variant: String) {
        props.value = props.value.copy(variant = variant)
    }

    fun updateTrailingIcon(trailingIcon: String?) {
        props.value = props.value.copy(trailingIcon = trailingIcon)
    }

    fun updateLeadingIcon(leadingIcon: String?) {
        props.value = props.value.copy(leadingIcon = leadingIcon)
    }

    fun updateSelected(selected: Boolean) {
        props.value = props.value.copy(selected = selected)
    }

    fun updateEnabled(enabled: Boolean) {
        props.value = props.value.copy(enabled = enabled)
    }
}

@Composable
fun ChipComposable(props: ChipProps, onClick: ViewEventCallback<Map<String, Any>>) {
    val modifier: Modifier = props.modifier.toModifier()
    val labelContent: @Composable () -> Unit = { Text(text = props.labelText) }
    val leadingIconContent: @Composable (() -> Unit)? = props.leadingIcon?.let {
        { IconComposable(props = IconProps(name = it)) }
    }
    val trailingIconContent: @Composable (() -> Unit)? = props.trailingIcon?.let {
        { IconComposable(props = IconProps(name = it)) }
    }

    val onClickAction = { onClick(mapOf()) }

    when (props.variant.lowercase()) {
        "assist" -> AssistChip(
            label = labelContent,
            leadingIcon = leadingIconContent,
            trailingIcon = trailingIconContent,
            enabled = props.enabled,
            onClick = onClickAction,
            modifier = modifier
        )
        "filter" -> FilterChip(
            label = labelContent,
            leadingIcon = leadingIconContent,
            trailingIcon = trailingIconContent,
            selected = props.selected,
            enabled = props.enabled,
            onClick = onClickAction,
            modifier = modifier
        )
        "input" -> InputChip(
            label = labelContent,
            leadingIcon = leadingIconContent,
            trailingIcon = trailingIconContent,
            selected = props.selected,
            enabled = props.enabled,
            onClick = onClickAction,
            modifier = modifier
        )
        "suggestion" -> SuggestionChip(
            label = labelContent,
            icon = leadingIconContent,
            onClick = onClickAction,
            enabled = props.enabled,
            modifier = modifier
        )
        else -> AssistChip(
            label = labelContent,
            leadingIcon = leadingIconContent,
            trailingIcon = trailingIconContent,
            enabled = props.enabled,
            onClick = onClickAction,
            modifier = modifier
        )
    }
}
