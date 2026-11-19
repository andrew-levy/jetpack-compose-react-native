package example
import androidx.compose.ui.Modifier
import expo.modules.jetpackcomposereactnative.poc.runtime.ComposeNode
import expo.modules.jetpackcomposereactnative.poc.generated.renderComposable
class TestNode(override val name: String, private val props: Map<String, Any> = emptyMap(),
  override val children: List<ComposeNode> = emptyList(), val events: MutableList<String> = mutableListOf()) : ComposeNode {
  override fun string(name: String) = props[name] as String
  override fun boolean(name: String, fallback: Boolean) = props[name] as? Boolean ?: fallback
  override fun modifier(name: String) = Modifier.Default
  override fun emit(name: String) { events.add(name) }
}
fun main() {
  val button = TestNode("Button", children = listOf(TestNode("Text", mapOf("text" to "Tap me"))))
  val root = TestNode("Column", children = listOf(TestNode("Text", mapOf("text" to "Hello")), button))
  renderComposable(root)
  check(button.events == listOf("onClick")) { "Button event was not routed" }
  println("Generated Kotlin dispatcher / child recursion / event callback: PASS")
}
