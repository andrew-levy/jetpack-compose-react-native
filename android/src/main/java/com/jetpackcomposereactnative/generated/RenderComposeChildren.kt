package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key

@Composable
internal fun RenderComposeChildren(children: List<ComposeChild>, scope: Any? = null) {
  for (child in children) {
    key(child) {
      when (child) {
        is ComposeNode -> if (child.name.isNotEmpty()) RenderComposable(child, scope)
        is ReactChildSlot -> RenderReactChild(child)
      }
    }
  }
}
