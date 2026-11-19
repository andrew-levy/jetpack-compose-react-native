package expo.modules.jetpackcomposereactnative.generated

import android.content.Context
import android.view.View
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import expo.modules.kotlin.views.ViewDefinitionBuilder

internal abstract class ComposeContainerView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
  internal var composeChildren by mutableStateOf<List<GeneratedComposeNodeView>>(emptyList())
    private set

  internal fun insertComposeChild(view: View, index: Int) {
    require(view is GeneratedComposeNodeView) { "ComposeHost children must render generated Compose components." }
    addView(view, index)
    composeChildren = composeChildren.toMutableList().apply { add(index, view) }
  }

  internal fun removeComposeChildAt(index: Int) {
    composeChildren.getOrNull(index)?.let(::removeView)
  }

  override fun onViewRemoved(child: View) {
    super.onViewRemoved(child)
    if (child is GeneratedComposeNodeView) {
      composeChildren = composeChildren.filterNot { it === child }
    }
  }
}

internal inline fun <reified T : ComposeContainerView> ViewDefinitionBuilder<T>.composeChildren() {
  GroupView<T> {
    AddChildView<View> { parent, child, index -> parent.insertComposeChild(child, index) }
    GetChildCount { it.composeChildren.size }
    GetChildViewAt<GeneratedComposeNodeView> { parent, index -> parent.composeChildren.getOrNull(index) }
    RemoveChildViewAt { parent, index -> parent.removeComposeChildAt(index) }
    RemoveChildView<View> { parent, child -> parent.removeView(child) }
  }
}
