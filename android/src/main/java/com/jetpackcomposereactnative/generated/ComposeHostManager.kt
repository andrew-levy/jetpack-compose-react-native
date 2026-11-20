package com.jetpackcomposereactnative.generated

import android.content.Context
import android.view.ViewGroup.LayoutParams
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.unit.IntSize
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONObject

internal class ComposeHostManager : ComposeContainerManager<GeneratedComposeHostView>() {
    override fun getName(): String = "JpcComposeHost"
    override fun createViewInstance(context: ThemedReactContext): GeneratedComposeHostView =
        GeneratedComposeHostView(context)

    @ReactProp(name = "theme")
    fun setTheme(view: GeneratedComposeHostView, value: String?) {
        view.theme = value?.let(::JSONObject)
    }

    @ReactProp(name = "fitContent")
    fun setFitContent(view: GeneratedComposeHostView, enabled: Boolean) {
        view.setFitContent(enabled)
    }
}

internal class GeneratedComposeHostView(context: Context) : ComposeContainerView(context) {
    var theme by mutableStateOf<JSONObject?>(null)
    private var fitContent = false
    private var layoutPending = false
    private val composeView = ComposeView(context).apply {
        setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool)
        setContent {
            val options = theme
            val dark = when (options?.optString("appearance")) {
                "dark" -> true
                "system" -> isSystemInDarkTheme()
                else -> false
            }
            val defaultColors = if (dark) darkColorScheme() else lightColorScheme()
            val colors = options?.optJSONObject("colors")
            MaterialTheme(colorScheme = colors?.applyTo(defaultColors) ?: defaultColors) {
                Box { RenderComposeChildren(composeChildren) }
            }
        }
    }

    init {
        addView(composeView, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))
    }

    fun setFitContent(enabled: Boolean) {
        if (fitContent == enabled) return
        fitContent = enabled
        requestLayout()
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        requestLayout()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        if (composeView.isAttachedToWindow) {
            if (fitContent) {
                // Before Yoga has received an intrinsic size, it may allocate zero width.
                val proposedWidth = MeasureSpec.getSize(widthMeasureSpec)
                    .takeIf { it > 0 } ?: resources.displayMetrics.widthPixels
                composeView.measure(
                    MeasureSpec.makeMeasureSpec(proposedWidth, MeasureSpec.AT_MOST),
                    MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED)
                )
                reportMeasurement(IntSize(composeView.measuredWidth, composeView.measuredHeight), proposedWidth)
            } else {
                composeView.measure(widthMeasureSpec, heightMeasureSpec)
            }
        }
        setMeasuredDimension(resolveSize(0, widthMeasureSpec), resolveSize(0, heightMeasureSpec))
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        if (composeView.isAttachedToWindow) {
            composeView.layout(0, 0, composeView.measuredWidth, composeView.measuredHeight)
        }
    }

    override fun requestLayout() {
        super.requestLayout()
        // Compose can request measurement at the same Yoga bounds after its content changes.
        if (layoutPending || !isAttachedToWindow) return
        layoutPending = true
        post {
            if (isAttachedToWindow) {
                measure(
                    MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
                    MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY)
                )
                layout(left, top, right, bottom)
            }
            layoutPending = false
        }
    }
}

private fun JSONObject.applyTo(base: ColorScheme): ColorScheme = base.copy(
    primary = color("primary", base.primary),
    onPrimary = color("onPrimary", base.onPrimary),
    primaryContainer = color("primaryContainer", base.primaryContainer),
    onPrimaryContainer = color("onPrimaryContainer", base.onPrimaryContainer),
    secondary = color("secondary", base.secondary),
    onSecondary = color("onSecondary", base.onSecondary),
    secondaryContainer = color("secondaryContainer", base.secondaryContainer),
    onSecondaryContainer = color("onSecondaryContainer", base.onSecondaryContainer),
    tertiary = color("tertiary", base.tertiary),
    onTertiary = color("onTertiary", base.onTertiary),
    tertiaryContainer = color("tertiaryContainer", base.tertiaryContainer),
    onTertiaryContainer = color("onTertiaryContainer", base.onTertiaryContainer),
    surface = color("surface", base.surface),
    onSurface = color("onSurface", base.onSurface),
    surfaceVariant = color("surfaceVariant", base.surfaceVariant),
    onSurfaceVariant = color("onSurfaceVariant", base.onSurfaceVariant),
    outline = color("outline", base.outline),
    error = color("error", base.error),
    onError = color("onError", base.onError),
)

private fun JSONObject.color(role: String, fallback: Color): Color {
    return (opt(role) as? String)?.let(::parseComposeColor)?.takeUnless { it == Color.Unspecified }
        ?: fallback
}
