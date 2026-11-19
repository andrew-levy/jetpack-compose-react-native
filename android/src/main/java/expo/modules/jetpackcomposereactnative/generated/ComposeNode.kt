package expo.modules.jetpackcomposereactnative.generated

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

internal interface ComposeNode {
  val name: String
  val children: List<ComposeNode>
  fun slot(name: String): List<ComposeNode>
  fun isNull(name: String): Boolean
  fun has(name: String): Boolean
  fun string(name: String): String
  fun boolean(name: String): Boolean
  fun number(name: String): Double
  fun modifier(name: String): Modifier
  fun color(name: String): Color
  fun emit(name: String, value: Any? = null)
}
