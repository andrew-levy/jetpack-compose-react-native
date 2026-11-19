package expo.modules.jetpackcomposereactnative.poc.runtime

import android.content.Context
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.FrameLayout
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import expo.modules.jetpackcomposereactnative.poc.generated.renderComposable
import org.json.JSONObject

/**
 * Verifies a real Android ComposeView can render the generated registry,
 * update its node tree, and dispatch native events.
 *
 * This is NOT a React Native Fabric component. Fabric mounting and Yoga
 * measurement will be validated separately rather than conflated with
 * Compose rendering.
 */
class ComposeBridgeHostView(context: Context) : FrameLayout(context) {
  var onEvent: ((component: String, event: String) -> Unit)? = null
  private val root = mutableStateOf<ComposeNode?>(null)

  init {
    val composeView = ComposeView(context).apply {
      setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
      setContent { root.value?.let { renderComposable(it) } }
    }
    addView(composeView, LayoutParams(MATCH_PARENT, MATCH_PARENT))
  }

  fun updateTree(json: String) {
    root.value = parseNode(JSONObject(json))
  }

  private fun parseNode(data: JSONObject): ComposeNode {
    val props = data.optJSONObject("props") ?: JSONObject()
    val children = data.optJSONArray("children")
    val decoded = mutableListOf<ComposeNode>()
    if (children != null) {
      for (index in 0 until children.length()) {
        decoded.add(parseNode(children.getJSONObject(index)))
      }
    }
    return RuntimeComposeNode(
      name = data.getString("name"),
      props = props,
      children = decoded,
      events = { name, event -> onEvent?.invoke(name, event) }
    )
  }
}

private class RuntimeComposeNode(
  override val name: String,
  private val props: JSONObject,
  override val children: List<ComposeNode>,
  private val events: (String, String) -> Unit,
) : ComposeNode {
  override fun string(name: String): String = props.getString(name)
  override fun boolean(name: String, fallback: Boolean): Boolean =
    if (props.has(name)) props.getBoolean(name) else fallback

  override fun modifier(name: String): Modifier = Modifier

  override fun emit(name: String) {
    events(this.name, name)
  }
}
