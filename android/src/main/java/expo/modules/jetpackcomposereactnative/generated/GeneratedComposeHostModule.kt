package expo.modules.jetpackcomposereactnative.generated

import android.content.Context
import android.view.View.MeasureSpec
import android.widget.LinearLayout
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.facebook.react.bridge.Arguments
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class GeneratedComposeHostModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("GeneratedComposeHost")

    View(GeneratedComposeHostView::class) {
      Events("onComposeSizeChange")
      Prop("fitContent") { view: GeneratedComposeHostView, enabled: Boolean -> view.setFitContent(enabled) }
      composeChildren()
    }
  }
}

internal class GeneratedComposeHostView(context: Context, appContext: AppContext) :
  ComposeContainerView(context, appContext) {
  private var fitContent = false
  private var intrinsicHeight: Int? = null
  private var layoutPending = false
  private val composeView = ComposeView(context).apply {
    setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool)
    setContent {
      MaterialTheme {
        Box { RenderComposeChildren(composeChildren) }
      }
    }
  }

  init {
    addView(composeView, LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))
  }

  internal fun setFitContent(enabled: Boolean) {
    if (fitContent == enabled) return
    fitContent = enabled
    intrinsicHeight = null
    requestLayout()
  }

  override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
    val composeHeight = if (fitContent) MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED) else heightMeasureSpec
    composeView.measure(widthMeasureSpec, composeHeight)
    if (fitContent) reportHeight(composeView.measuredHeight)
    setMeasuredDimension(
      resolveSize(composeView.measuredWidth, widthMeasureSpec),
      resolveSize(composeView.measuredHeight, heightMeasureSpec)
    )
  }

  private fun reportHeight(height: Int) {
    if (intrinsicHeight == height) return
    intrinsicHeight = height
    post {
      if (fitContent && isAttachedToWindow && intrinsicHeight == height) {
        dispatchComposeEvent("topComposeSizeChange", Arguments.createMap().apply {
          putDouble("height", height.toDouble() / resources.displayMetrics.density)
        })
      }
    }
  }

  override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
    composeView.layout(0, 0, composeView.measuredWidth, composeView.measuredHeight)
  }

  override fun requestLayout() {
    super.requestLayout()
    // Yoga owns this view's bounds. Compose can still need a measurement
    // inside those same bounds after a child or modifier changes.
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
