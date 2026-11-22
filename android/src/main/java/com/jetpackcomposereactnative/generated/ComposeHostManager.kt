package com.jetpackcomposereactnative.generated

import android.content.Context
import android.view.MotionEvent
import android.view.ViewGroup.LayoutParams
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.unit.IntSize
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

internal class ComposeHostManager : ComposeContainerManager<GeneratedComposeHostView>() {
    override fun getName(): String = "JpcComposeHost"
    override fun createViewInstance(context: ThemedReactContext): GeneratedComposeHostView =
        GeneratedComposeHostView(context)

    @ReactProp(name = "fitContent")
    fun setFitContent(view: GeneratedComposeHostView, enabled: Boolean) {
        view.setFitContent(enabled)
    }
}

internal class GeneratedComposeHostView(context: Context) : ComposeContainerView(context) {
    private var fitContent = false
    private var layoutPending = false
    private val composeView = ComposeView(context).apply {
        setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool)
        setContent {
            val handles = remember { ComposeNativeHandles() }
            CompositionLocalProvider(LocalComposeNativeHandles provides handles) {
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

    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        val handled = super.dispatchTouchEvent(event)
        if (handled && event.actionMasked == MotionEvent.ACTION_DOWN) {
            // The content view uses the point just dispatched to hit-test its scrollable areas.
            val content = composeView.getChildAt(0)
            if (content != null && (content.canScrollVertically(1) || content.canScrollVertically(-1))) {
                parent?.requestDisallowInterceptTouchEvent(true)
            }
        }
        return handled
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
