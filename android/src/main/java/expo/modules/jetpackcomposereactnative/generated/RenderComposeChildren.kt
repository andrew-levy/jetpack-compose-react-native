package expo.modules.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key

@Composable
internal fun RenderComposeChildren(children: List<ComposeNode>) {
  for (child in children) {
    key(child) {
      if (child.name.isNotEmpty()) RenderComposable(child)
    }
  }
}
