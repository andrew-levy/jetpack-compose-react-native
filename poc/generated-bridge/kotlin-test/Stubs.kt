package expo.modules.jetpackcomposereactnative.poc.runtime
import androidx.compose.ui.Modifier
interface ComposeNode {
  val name: String
  val children: List<ComposeNode>
  fun string(name: String): String
  fun boolean(name: String, fallback: Boolean): Boolean
  fun modifier(name: String): Modifier
  fun emit(name: String)
}
