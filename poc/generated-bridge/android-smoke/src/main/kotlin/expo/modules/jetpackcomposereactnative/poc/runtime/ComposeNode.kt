package expo.modules.jetpackcomposereactnative.poc.runtime

import androidx.compose.ui.Modifier

/**
 * Minimal real-Compose compile-test contract. Implementations will later decode
 * React Native props, modifiers and callbacks from a stable Fabric node tree.
 */
interface ComposeNode {
  val name: String
  val children: List<ComposeNode>
  fun string(name: String): String
  fun boolean(name: String, fallback: Boolean): Boolean
  fun modifier(name: String): Modifier
  fun emit(name: String)
}

@androidx.compose.runtime.Composable
fun compileGeneratedRegistryReference(node: ComposeNode) {
  expo.modules.jetpackcomposereactnative.poc.generated.renderComposable(node)
}
