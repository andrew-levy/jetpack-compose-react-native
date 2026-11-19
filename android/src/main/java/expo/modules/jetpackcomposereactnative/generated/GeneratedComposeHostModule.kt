package expo.modules.jetpackcomposereactnative.generated

import android.content.Context
import android.view.View.MeasureSpec
import android.widget.LinearLayout
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition
import expo.modules.kotlin.viewevent.EventDispatcher

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
  private val onComposeSizeChange by EventDispatcher()
  private var fitContent by mutableStateOf(false)
  private var layoutPending = false
  private val composeView = ComposeView(context).apply {
    setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool)
    setContent {
      MaterialTheme {
        Box(
          if (fitContent) Modifier.onSizeChanged {
            onComposeSizeChange(mapOf("height" to it.height / resources.displayMetrics.density))
          } else Modifier
        ) {
          RenderComposeChildren(composeChildren)
        }
      }
    }
  }

  init {
    addView(composeView, LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))
  }

  internal fun setFitContent(enabled: Boolean) {
    if (fitContent == enabled) return
    fitContent = enabled
    requestLayout()
  }

  override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
    val composeHeight = if (fitContent) MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED) else heightMeasureSpec
    composeView.measure(widthMeasureSpec, composeHeight)
    setMeasuredDimension(
      resolveSize(composeView.measuredWidth, widthMeasureSpec),
      resolveSize(composeView.measuredHeight, heightMeasureSpec)
    )
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
