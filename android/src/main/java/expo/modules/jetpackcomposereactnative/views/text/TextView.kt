package expo.modules.jetpackcomposereactnative.views.text

import android.content.Context
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.parseComposeColor
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import java.util.Locale

data class TextProps(
    var text: String = "",
    var modifier: ModifierProp = emptyList(),
    val color: String? = null,
    val fontSize: Int? = null,
    val fontStyle: String? = null,
    val fontWeight: String? = null,
    val fontFamily: String? = null,
    val letterSpacing: Int? = null,
    val textDecoration: String? = null,
    val textAlign: String? = null,
    val lineHeight: Int? = null,
    val overflow: String? = null,
    val softWrap: Boolean? = null,
    val maxLines: Int? = null,
    val minLines: Int? = null
)

class TextView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(TextProps())
    private var composeView: ComposeView? = null

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                TextComposable(props = props.value)
            }
            addView(it)
            composeView = it
        }
    }

    fun updateText(text: String) {
        props.value = props.value.copy(text = text)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

    fun updateColor(color: String?) {
        props.value = props.value.copy(color = color)
    }

    fun updateFontSize(fontSize: Int?) {
        props.value = props.value.copy(fontSize = fontSize)
    }

    fun updateFontStyle(fontStyle: String?) {
        props.value = props.value.copy(fontStyle = fontStyle)
    }

    fun updateFontWeight(fontWeight: String?) {
        props.value = props.value.copy(fontWeight = fontWeight)
    }

    fun updateFontFamily(fontFamily: String?) {
        props.value = props.value.copy(fontFamily = fontFamily)
    }

    fun updateLetterSpacing(letterSpacing: Int?) {
        props.value = props.value.copy(letterSpacing = letterSpacing)
    }

    fun updateTextDecoration(textDecoration: String?) {
        props.value = props.value.copy(textDecoration = textDecoration)
    }

    fun updateTextAlign(textAlign: String?) {
        props.value = props.value.copy(textAlign = textAlign)
    }

    fun updateLineHeight(lineHeight: Int?) {
        props.value = props.value.copy(lineHeight = lineHeight)
    }

    fun updateOverflow(overflow: String?) {
        props.value = props.value.copy(overflow = overflow)
    }

    fun updateSoftWrap(softWrap: Boolean?) {
        props.value = props.value.copy(softWrap = softWrap)
    }

    fun updateMaxLines(maxLines: Int?) {
        props.value = props.value.copy(maxLines = maxLines)
    }

    fun updateMinLines(minLines: Int?) {
        props.value = props.value.copy(minLines = minLines)
    }
}

@Composable
fun TextComposable(props: TextProps) {
    Text(
        text = props.text,
        modifier = props.modifier.toModifier(),
        color = props.color?.let { parseComposeColor(it) } ?: Color.Unspecified,
        fontSize = props.fontSize?.sp ?: TextUnit.Unspecified,
        fontStyle = when (props.fontStyle) {
            "italic" -> FontStyle.Italic
            else -> FontStyle.Normal
        },
        fontWeight = when (props.fontWeight) {
            "bold" -> FontWeight.Bold
            "normal" -> FontWeight.Normal
            else -> props.fontWeight?.toIntOrNull()?.let { FontWeight(it) } ?: FontWeight.Normal
        },
        fontFamily = when (props.fontFamily?.lowercase(Locale.ROOT)) {
            "sans-serif" -> FontFamily.SansSerif
            "serif" -> FontFamily.Serif
            "monospace" -> FontFamily.Monospace 
            "cursive" -> FontFamily.Cursive
            else -> FontFamily.Default
        },
        letterSpacing = props.letterSpacing?.sp ?: TextUnit.Unspecified,
        textDecoration = when (props.textDecoration) {
            "underline" -> TextDecoration.Underline
            "lineThrough" -> TextDecoration.LineThrough
            else -> null
        },
        textAlign = when (props.textAlign) {
            "center" -> TextAlign.Center
            "right" -> TextAlign.Right
            "justify" -> TextAlign.Justify
            else -> TextAlign.Left
        },
        lineHeight = props.lineHeight?.sp ?: TextUnit.Unspecified,
        overflow = when (props.overflow) {
            "ellipsis" -> TextOverflow.Ellipsis
            "clip" -> TextOverflow.Clip
            else -> TextOverflow.Clip
        },
        softWrap = props.softWrap ?: true,
        maxLines = props.maxLines ?: Int.MAX_VALUE,
        minLines = props.minLines ?: 1
    )
}

