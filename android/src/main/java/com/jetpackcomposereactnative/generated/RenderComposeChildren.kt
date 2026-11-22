package com.jetpackcomposereactnative.generated

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier

@Composable
internal fun RenderComposeChildren(children: List<ComposeChild>, scope: Any? = null) {
  for (child in children) RenderComposeChild(child, scope)
}

@Composable
internal fun RenderComposeAnimationChild(node: ComposeNode, state: Any, scope: Any? = null) {
  when (state) {
    is Int -> node.children.getOrNull(state)?.let { RenderComposeChild(it, scope) }
    is String -> RenderComposeChildren(node.slot("\$state:$state"), scope)
  }
}

@Composable
internal fun RenderComposeChild(child: ComposeChild, scope: Any? = null) {
  key(child) {
    when (child) {
      is ComposeNode -> when (child.name) {
        "" -> Unit
        STICKY_HEADER -> RenderComposeChildren(child.children, scope)
        "\$innerContent" -> checkNotNull(LocalInnerContent.current) {
          "ComposeInnerContent requires a Compose decoration slot"
        }.invoke()
        else -> WithComposeOwners(scope) { RenderComposable(child, scope) }
      }
      is ReactChildSlot -> RenderReactChild(child)
    }
  }
}

private val LocalInnerContent = compositionLocalOf<(@Composable () -> Unit)?> { null }

@Composable
internal fun RenderComposeDecoration(children: List<ComposeChild>, inner: @Composable () -> Unit) {
  if (children.isEmpty()) {
    inner()
  } else {
    CompositionLocalProvider(LocalInnerContent provides inner) {
      RenderComposeChildren(children)
    }
  }
}

private const val STICKY_HEADER = "\$stickyHeader"

@OptIn(ExperimentalFoundationApi::class)
internal fun LazyListScope.renderLazyComposeChildren(children: List<ComposeChild>) {
  for (child in children) {
    if (child is ComposeNode && child.name == STICKY_HEADER) {
      stickyHeader(key = child.composeChildId) { RenderComposeChild(child, this) }
    } else {
      item(key = child.composeChildId) { RenderComposeChild(child, this) }
    }
  }
}

internal fun LazyGridScope.renderLazyComposeChildren(children: List<ComposeChild>) {
  for (child in children) item(key = child.composeChildId) { RenderComposeChild(child, this) }
}

internal fun LazyStaggeredGridScope.renderLazyComposeChildren(children: List<ComposeChild>) {
  for (child in children) item(key = child.composeChildId) { RenderComposeChild(child, this) }
}

@Composable
internal fun RenderPaddedComposeChildren(children: List<ComposeChild>, padding: PaddingValues) {
  Box(Modifier.padding(padding).consumeWindowInsets(padding)) {
    RenderComposeChildren(children, this)
  }
}
