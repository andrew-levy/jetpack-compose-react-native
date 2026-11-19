package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key

@Composable
internal fun RenderComposeChildren(children: List<ComposeChild>) {
  for (child in children) {
    key(child) {
      when (child) {
        is ComposeNode -> if (child.name.isNotEmpty()) RenderComposable(child)
        is ReactChildSlot -> RenderReactChild(child)
      }
    }
  }
}
