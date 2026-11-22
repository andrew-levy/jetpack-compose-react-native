// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.FloatingActionButtonMenuItem as composeScoped0
import androidx.compose.material3.NavigationBarItem as composeScoped1
import androidx.compose.material3.PlainTooltip as composeScoped2
import androidx.compose.material3.RichTooltip as composeScoped3
import androidx.compose.material3.SegmentedButton as composeScoped4

// androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(columns: androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalItemSpacing: androidx.compose.ui.unit.Dp, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit>)
internal object RendererLazyVerticalStaggeredGrid {
  private fun decode_reverseLayout(node: ComposeNode) = node.boolean("reverseLayout")
  private fun decode_verticalItemSpacing(node: ComposeNode) = node.number("verticalItemSpacing").dp
  private fun decode_userScrollEnabled(node: ComposeNode) = node.boolean("userScrollEnabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyStaggeredGridState(node.arguments()) else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalItemSpacing")) 8 else 0) +
      (if (node.has("horizontalArrangement")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyVerticalStaggeredGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyVerticalStaggeredGridGroup1(node, scope, mask, stateValue)
      2 -> renderLazyVerticalStaggeredGridGroup2(node, scope, mask, stateValue)
      3 -> renderLazyVerticalStaggeredGridGroup3(node, scope, mask, stateValue)
      4 -> renderLazyVerticalStaggeredGridGroup4(node, scope, mask, stateValue)
      5 -> renderLazyVerticalStaggeredGridGroup5(node, scope, mask, stateValue)
      6 -> renderLazyVerticalStaggeredGridGroup6(node, scope, mask, stateValue)
      7 -> renderLazyVerticalStaggeredGridGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), content = { renderLazyComposeChildren(node.children) })
      1 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), content = { renderLazyComposeChildren(node.children) })
      2 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      3 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { renderLazyComposeChildren(node.children) })
      4 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      5 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      6 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      7 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), content = { renderLazyComposeChildren(node.children) })
      8 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      9 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      10 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      11 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      12 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      13 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      14 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      15 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), content = { renderLazyComposeChildren(node.children) })
      16 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      17 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      18 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      19 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      20 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      21 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      22 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      23 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      24 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      25 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      26 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      27 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      28 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      29 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      30 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      31 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      33 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      36 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      37 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      40 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      41 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      44 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      45 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      65 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      66 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      67 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      68 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      69 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      70 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      71 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      72 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      73 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      74 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      75 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      76 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      77 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      78 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      79 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      80 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      81 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      82 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      83 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      84 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      85 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      86 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      87 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      88 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      89 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      90 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      91 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      92 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      93 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      94 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      95 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      97 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      100 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      101 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      104 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      105 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      108 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      109 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      127 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      129 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      132 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      133 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      136 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      137 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      140 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      141 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      191 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      193 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      196 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      197 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      200 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      201 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      204 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      205 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      223 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      239 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      247 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      251 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      253 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      254 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      255 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(`columns` = node.jsonObject("columns").toStaggeredGridCells(), `modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `verticalItemSpacing` = decode_verticalItemSpacing(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), content = { renderLazyComposeChildren(node.children) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SplitButtonDefaults.LeadingButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererLeadingButton {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shapes")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("border")) 16 else 0) +
      (if (node.has("contentPadding")) 32 else 0) +
      (if (node.has("interactionSource")) 64 else 0)
    when (mask / 32) {
      0 -> renderLeadingButtonGroup0(node, scope, mask)
      1 -> renderLeadingButtonGroup1(node, scope, mask)
      2 -> renderLeadingButtonGroup2(node, scope, mask)
      3 -> renderLeadingButtonGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLeadingButtonGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLeadingButtonGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLeadingButtonGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLeadingButtonGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LeadingIconTab(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, selectedContentColor: androidx.compose.ui.graphics.Color, unselectedContentColor: androidx.compose.ui.graphics.Color, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererLeadingIconTab {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("selectedContentColor")) 2 else 0) +
      (if (node.has("unselectedContentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      3 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      4 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      5 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      6 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      7 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      8 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      9 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      10 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      11 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      12 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      13 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      14 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      15 -> androidx.compose.material3.LeadingIconTab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LinearProgressIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, strokeCap: androidx.compose.ui.graphics.StrokeCap, gapSize: androidx.compose.ui.unit.Dp)
internal object RendererLinearProgressIndicator {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("strokeCap")) 4 else 0) +
      (if (node.has("gapSize")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      3 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      4 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      5 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      6 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      7 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      8 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      9 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      10 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      11 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      12 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      13 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      14 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      15 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LinearProgressIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, strokeCap: androidx.compose.ui.graphics.StrokeCap, gapSize: androidx.compose.ui.unit.Dp, drawStopIndicator: kotlin.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>)
internal object RendererLinearProgressIndicator_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("strokeCap")) 4 else 0) +
      (if (node.has("gapSize")) 8 else 0) +
      (if (node.has("drawStopIndicator")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      3 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      4 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      5 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      6 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      7 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      8 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      9 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      10 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      11 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      12 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      13 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      14 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      15 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      16 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      17 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      18 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      19 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      20 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      21 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      22 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      23 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      24 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      25 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      26 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      27 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      28 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      29 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      30 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      31 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LinearWavyProgressIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Float, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererLinearWavyProgressIndicator {
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_trackColor(node: ComposeNode) = node.color("trackColor")
  private fun decode_gapSize(node: ComposeNode) = node.number("gapSize").dp
  private fun decode_amplitude(node: ComposeNode) = node.number("amplitude").toFloat()
  private fun decode_wavelength(node: ComposeNode) = node.number("wavelength").dp
  private fun decode_waveSpeed(node: ComposeNode) = node.number("waveSpeed").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("gapSize")) 4 else 0) +
      (if (node.has("amplitude")) 8 else 0) +
      (if (node.has("wavelength")) 16 else 0) +
      (if (node.has("waveSpeed")) 32 else 0)
    when (mask / 32) {
      0 -> renderLinearWavyProgressIndicatorGroup0(node, scope, mask)
      1 -> renderLinearWavyProgressIndicatorGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLinearWavyProgressIndicatorGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node))
      2 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node))
      3 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node))
      4 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node))
      5 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node))
      6 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      7 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      8 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node))
      9 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node))
      10 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node))
      11 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node))
      12 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      13 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      14 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      15 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      16 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node))
      17 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node))
      18 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      19 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      20 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      21 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      22 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      23 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      24 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      25 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      26 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      27 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      28 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      29 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      30 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      31 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLinearWavyProgressIndicatorGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `waveSpeed` = decode_waveSpeed(node))
      33 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `waveSpeed` = decode_waveSpeed(node))
      34 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      35 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      36 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      37 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      38 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      39 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      40 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      41 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      42 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      43 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      44 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      45 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      46 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      47 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      48 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      49 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      50 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      51 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      52 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      53 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      54 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      55 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      56 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      57 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      58 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      59 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      60 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      61 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      62 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      63 -> androidx.compose.material3.LinearWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LinearWavyProgressIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, stopSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Function1<kotlin.Float, kotlin.Float>, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererLinearWavyProgressIndicator_1 {
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_trackColor(node: ComposeNode) = node.color("trackColor")
  private fun decode_gapSize(node: ComposeNode) = node.number("gapSize").dp
  private fun decode_stopSize(node: ComposeNode) = node.number("stopSize").dp
  private fun decode_wavelength(node: ComposeNode) = node.number("wavelength").dp
  private fun decode_waveSpeed(node: ComposeNode) = node.number("waveSpeed").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("gapSize")) 4 else 0) +
      (if (node.has("stopSize")) 8 else 0) +
      (if (node.has("wavelength")) 16 else 0) +
      (if (node.has("waveSpeed")) 32 else 0)
    when (mask / 32) {
      0 -> renderLinearWavyProgressIndicator_1Group0(node, scope, mask)
      1 -> renderLinearWavyProgressIndicator_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLinearWavyProgressIndicator_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node))
      2 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node))
      3 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node))
      4 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node))
      5 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node))
      6 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      7 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      8 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stopSize` = decode_stopSize(node))
      9 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stopSize` = decode_stopSize(node))
      10 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node))
      11 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node))
      12 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node))
      13 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node))
      14 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node))
      15 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node))
      16 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node))
      17 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node))
      18 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      19 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      20 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      21 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      22 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      23 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      24 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      25 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      26 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      27 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      28 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      29 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      30 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      31 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLinearWavyProgressIndicator_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `waveSpeed` = decode_waveSpeed(node))
      33 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `waveSpeed` = decode_waveSpeed(node))
      34 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      35 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      36 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      37 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      38 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      39 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      40 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      41 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      42 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      43 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      44 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      45 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      46 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      47 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `waveSpeed` = decode_waveSpeed(node))
      48 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      49 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      50 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      51 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      52 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      53 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      54 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      55 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      56 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      57 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      58 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      59 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      60 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      61 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      62 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      63 -> androidx.compose.material3.LinearWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `stopSize` = decode_stopSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ListItem(headlineContent: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, overlineContent: kotlin.Function0<kotlin.Unit>?, supportingContent: kotlin.Function0<kotlin.Unit>?, leadingContent: kotlin.Function0<kotlin.Unit>?, trailingContent: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.ListItemColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp)
internal object RendererListItem {
  private fun decode_tonalElevation(node: ComposeNode) = node.number("tonalElevation").dp
  private fun decode_shadowElevation(node: ComposeNode) = node.number("shadowElevation").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_headlineContent: @Composable () -> Unit = { RenderComposeChildren(node.slot("headlineContent")) }
    val content_overlineContent: @Composable () -> Unit = { RenderComposeChildren(node.slot("overlineContent")) }
    val slot_overlineContent = if (node.isNull("overlineContent")) null else content_overlineContent
    val content_supportingContent: @Composable () -> Unit = { RenderComposeChildren(node.slot("supportingContent")) }
    val slot_supportingContent = if (node.isNull("supportingContent")) null else content_supportingContent
    val content_leadingContent: @Composable () -> Unit = { RenderComposeChildren(node.slot("leadingContent")) }
    val slot_leadingContent = if (node.isNull("leadingContent")) null else content_leadingContent
    val content_trailingContent: @Composable () -> Unit = { RenderComposeChildren(node.slot("trailingContent")) }
    val slot_trailingContent = if (node.isNull("trailingContent")) null else content_trailingContent
    val mask = (if (node.has("overlineContent")) 1 else 0) +
      (if (node.has("supportingContent")) 2 else 0) +
      (if (node.has("leadingContent")) 4 else 0) +
      (if (node.has("trailingContent")) 8 else 0) +
      (if (node.has("colors")) 16 else 0) +
      (if (node.has("tonalElevation")) 32 else 0) +
      (if (node.has("shadowElevation")) 64 else 0)
    when (mask / 32) {
      0 -> renderListItemGroup0(node, scope, mask, slot_headlineContent, slot_overlineContent, slot_supportingContent, slot_leadingContent, slot_trailingContent)
      1 -> renderListItemGroup1(node, scope, mask, slot_headlineContent, slot_overlineContent, slot_supportingContent, slot_leadingContent, slot_trailingContent)
      2 -> renderListItemGroup2(node, scope, mask, slot_headlineContent, slot_overlineContent, slot_supportingContent, slot_leadingContent, slot_trailingContent)
      3 -> renderListItemGroup3(node, scope, mask, slot_headlineContent, slot_overlineContent, slot_supportingContent, slot_leadingContent, slot_trailingContent)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderListItemGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_headlineContent: @Composable () -> Unit, slot_overlineContent: (@Composable () -> Unit)?, slot_supportingContent: (@Composable () -> Unit)?, slot_leadingContent: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent)
      2 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent)
      3 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent)
      4 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent)
      5 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent)
      6 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent)
      7 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent)
      8 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent)
      9 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `trailingContent` = slot_trailingContent)
      10 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent)
      11 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent)
      12 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent)
      13 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent)
      14 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent)
      15 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent)
      16 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      17 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      18 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      19 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      20 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      21 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      22 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      23 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      24 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      25 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      26 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      27 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      28 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      29 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      30 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      31 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderListItemGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_headlineContent: @Composable () -> Unit, slot_overlineContent: (@Composable () -> Unit)?, slot_supportingContent: (@Composable () -> Unit)?, slot_leadingContent: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node))
      33 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `tonalElevation` = decode_tonalElevation(node))
      34 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `tonalElevation` = decode_tonalElevation(node))
      35 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `tonalElevation` = decode_tonalElevation(node))
      36 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `tonalElevation` = decode_tonalElevation(node))
      37 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `tonalElevation` = decode_tonalElevation(node))
      38 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `tonalElevation` = decode_tonalElevation(node))
      39 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `tonalElevation` = decode_tonalElevation(node))
      40 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node))
      41 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node))
      42 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node))
      43 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node))
      44 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node))
      45 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node))
      46 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node))
      47 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node))
      48 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      49 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      50 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      51 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      52 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      53 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      54 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      55 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      56 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      57 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      58 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      59 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      60 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      61 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      62 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      63 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderListItemGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_headlineContent: @Composable () -> Unit, slot_overlineContent: (@Composable () -> Unit)?, slot_supportingContent: (@Composable () -> Unit)?, slot_leadingContent: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node))
      65 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `shadowElevation` = decode_shadowElevation(node))
      66 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `shadowElevation` = decode_shadowElevation(node))
      67 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `shadowElevation` = decode_shadowElevation(node))
      68 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `shadowElevation` = decode_shadowElevation(node))
      69 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `shadowElevation` = decode_shadowElevation(node))
      70 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `shadowElevation` = decode_shadowElevation(node))
      71 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `shadowElevation` = decode_shadowElevation(node))
      72 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `shadowElevation` = decode_shadowElevation(node))
      73 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `trailingContent` = slot_trailingContent, `shadowElevation` = decode_shadowElevation(node))
      74 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `shadowElevation` = decode_shadowElevation(node))
      75 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `shadowElevation` = decode_shadowElevation(node))
      76 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `shadowElevation` = decode_shadowElevation(node))
      77 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `shadowElevation` = decode_shadowElevation(node))
      78 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `shadowElevation` = decode_shadowElevation(node))
      79 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `shadowElevation` = decode_shadowElevation(node))
      80 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      81 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      82 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      83 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      84 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      85 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      86 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      87 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      88 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      89 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      90 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      91 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      92 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      93 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      94 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      95 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `shadowElevation` = decode_shadowElevation(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderListItemGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_headlineContent: @Composable () -> Unit, slot_overlineContent: (@Composable () -> Unit)?, slot_supportingContent: (@Composable () -> Unit)?, slot_leadingContent: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      97 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      98 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      99 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      100 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      101 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      102 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      103 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      104 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      105 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      106 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      107 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      108 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      109 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      110 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      111 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      112 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      113 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      114 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      115 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      116 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      117 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      118 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      119 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      120 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      121 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      122 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      123 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      124 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      125 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      126 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      127 -> androidx.compose.material3.ListItem(`headlineContent` = slot_headlineContent, `modifier` = node.modifier("modifier", scope), `overlineContent` = slot_overlineContent, `supportingContent` = slot_supportingContent, `leadingContent` = slot_leadingContent, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeListItemColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LoadingIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, polygons: kotlin.collections.List<androidx.graphics.shapes.RoundedPolygon>)
internal object RendererLoadingIndicator {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LoadingIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, polygons: kotlin.collections.List<androidx.graphics.shapes.RoundedPolygon>)
internal object RendererLoadingIndicator_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(state: androidx.compose.material3.pulltorefresh.PullToRefreshState, isRefreshing: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, color: androidx.compose.ui.graphics.Color, elevation: androidx.compose.ui.unit.Dp, threshold: androidx.compose.ui.unit.Dp)
internal object RendererLoadingIndicator_2 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("color")) 2 else 0) +
      (if (node.has("elevation")) 4 else 0) +
      (if (node.has("threshold")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      2 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `color` = node.color("color"),
      )
      4 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.number("elevation").dp,
      )
      5 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.number("elevation").dp,
      )
      6 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `elevation` = node.number("elevation").dp,
      )
      7 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `color` = node.color("color"),
        `elevation` = node.number("elevation").dp,
      )
      8 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `threshold` = node.number("threshold").dp,
      )
      9 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `threshold` = node.number("threshold").dp,
      )
      10 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `threshold` = node.number("threshold").dp,
      )
      11 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `color` = node.color("color"),
        `threshold` = node.number("threshold").dp,
      )
      12 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.number("elevation").dp,
        `threshold` = node.number("threshold").dp,
      )
      13 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.number("elevation").dp,
        `threshold` = node.number("threshold").dp,
      )
      14 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `elevation` = node.number("elevation").dp,
        `threshold` = node.number("threshold").dp,
      )
      15 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.LoadingIndicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `color` = node.color("color"),
        `elevation` = node.number("elevation").dp,
        `threshold` = node.number("threshold").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.animation.LookaheadAnimationVisualDebugging(isEnabled: kotlin.Boolean, overlayColor: androidx.compose.ui.graphics.Color, multipleMatchesColor: androidx.compose.ui.graphics.Color, unmatchedElementColor: androidx.compose.ui.graphics.Color, isShowKeyLabelEnabled: kotlin.Boolean, content: kotlin.Function0<kotlin.Unit>)
internal object RendererLookaheadAnimationVisualDebugging {
  @OptIn(androidx.compose.animation.ExperimentalLookaheadAnimationVisualDebugApi::class)
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("isEnabled")) 1 else 0) +
      (if (node.has("overlayColor")) 2 else 0) +
      (if (node.has("multipleMatchesColor")) 4 else 0) +
      (if (node.has("unmatchedElementColor")) 8 else 0) +
      (if (node.has("isShowKeyLabelEnabled")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `overlayColor` = node.color("overlayColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `overlayColor` = node.color("overlayColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `overlayColor` = node.color("overlayColor"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `overlayColor` = node.color("overlayColor"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `overlayColor` = node.color("overlayColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `overlayColor` = node.color("overlayColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `overlayColor` = node.color("overlayColor"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `overlayColor` = node.color("overlayColor"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `overlayColor` = node.color("overlayColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `overlayColor` = node.color("overlayColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `overlayColor` = node.color("overlayColor"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `overlayColor` = node.color("overlayColor"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `overlayColor` = node.color("overlayColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `overlayColor` = node.color("overlayColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `overlayColor` = node.color("overlayColor"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.animation.LookaheadAnimationVisualDebugging(
        `isEnabled` = node.boolean("isEnabled"),
        `overlayColor` = node.color("overlayColor"),
        `multipleMatchesColor` = node.color("multipleMatchesColor"),
        `unmatchedElementColor` = node.color("unmatchedElementColor"),
        `isShowKeyLabelEnabled` = node.boolean("isShowKeyLabelEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.ui.layout.LookaheadScope(content: kotlin.Function1<androidx.compose.ui.layout.LookaheadScope, kotlin.Unit>)
internal object RendererLookaheadScope {
  @Composable
  fun render(node: ComposeNode) {
    androidx.compose.ui.layout.LookaheadScope(
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

// androidx.compose.material3.MaterialExpressiveTheme(colorScheme: androidx.compose.material3.ColorScheme?, motionScheme: androidx.compose.material3.MotionScheme?, shapes: androidx.compose.material3.Shapes?, typography: androidx.compose.material3.Typography?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererMaterialExpressiveTheme {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("colorScheme")) 1 else 0) +
      (if (node.has("motionScheme")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MaterialExpressiveTheme(
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.MaterialExpressiveTheme(
        `colorScheme` = if (node.isNull("colorScheme")) null else (node.jsonObject("colorScheme").toColorScheme()),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.MaterialExpressiveTheme(
        `motionScheme` = if (node.isNull("motionScheme")) null else (node.jsonObject("motionScheme").decodeComposeMotionSchemeValue()),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.MaterialExpressiveTheme(
        `colorScheme` = if (node.isNull("colorScheme")) null else (node.jsonObject("colorScheme").toColorScheme()),
        `motionScheme` = if (node.isNull("motionScheme")) null else (node.jsonObject("motionScheme").decodeComposeMotionSchemeValue()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MaterialTheme(colorScheme: androidx.compose.material3.ColorScheme, shapes: androidx.compose.material3.Shapes, typography: androidx.compose.material3.Typography, content: kotlin.Function0<kotlin.Unit>)
internal object RendererMaterialTheme {
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("colorScheme")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MaterialTheme(
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.MaterialTheme(
        `colorScheme` = node.jsonObject("colorScheme").toColorScheme(),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MaterialTheme(colorScheme: androidx.compose.material3.ColorScheme, motionScheme: androidx.compose.material3.MotionScheme, shapes: androidx.compose.material3.Shapes, typography: androidx.compose.material3.Typography, content: kotlin.Function0<kotlin.Unit>)
internal object RendererMaterialTheme_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("colorScheme")) 1 else 0) +
      (if (node.has("motionScheme")) 2 else 0)
    when (mask) {
      2 -> androidx.compose.material3.MaterialTheme(
        `motionScheme` = node.jsonObject("motionScheme").decodeComposeMotionSchemeValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.MaterialTheme(
        `colorScheme` = node.jsonObject("colorScheme").toColorScheme(),
        `motionScheme` = node.jsonObject("motionScheme").decodeComposeMotionSchemeValue(),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MediumExtendedFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererMediumExtendedFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MediumExtendedFloatingActionButton(text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, expanded: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererMediumExtendedFloatingActionButton_1 {
  private fun decode_expanded(node: ComposeNode) = node.boolean("expanded")
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_text: @Composable () -> Unit = { RenderComposeChildren(node.slot("text")) }
    val slot_icon: @Composable () -> Unit = { RenderComposeChildren(node.slot("icon")) }
    val mask = (if (node.has("expanded")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("elevation")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderMediumExtendedFloatingActionButton_1Group0(node, scope, mask, slot_text, slot_icon)
      1 -> renderMediumExtendedFloatingActionButton_1Group1(node, scope, mask, slot_text, slot_icon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumExtendedFloatingActionButton_1Group0(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_icon: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node))
      2 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      3 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"))
      4 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node))
      5 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node))
      6 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node))
      7 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node))
      8 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node))
      9 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node))
      10 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node))
      11 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node))
      12 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      13 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      14 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      15 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      16 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      17 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      18 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      19 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      20 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      21 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      22 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      23 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      24 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      25 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      26 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      27 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      28 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      29 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      30 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      31 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumExtendedFloatingActionButton_1Group1(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_icon: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      33 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      34 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      35 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      36 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      37 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      38 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      39 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      40 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      41 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      42 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      43 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      44 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      45 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      46 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      47 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      48 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      49 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      50 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      51 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      52 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      53 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      54 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      55 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      56 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      57 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      58 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      59 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      60 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      61 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      62 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      63 -> androidx.compose.material3.MediumExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MediumFlexibleTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, subtitle: kotlin.Function0<kotlin.Unit>?, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, titleHorizontalAlignment: androidx.compose.ui.Alignment.Horizontal, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererMediumFlexibleTopAppBar {
  private fun decode_collapsedHeight(node: ComposeNode) = node.number("collapsedHeight").dp
  private fun decode_expandedHeight(node: ComposeNode) = node.number("expandedHeight").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scrollBehaviorValue = if (node.has("scrollBehavior") && !node.isNull("scrollBehavior")) node.jsonObject("scrollBehavior").rememberComposeTopAppBarScrollBehavior() else null
    val slot_title: @Composable () -> Unit = { RenderComposeChildren(node.slot("title")) }
    val content_subtitle: @Composable () -> Unit = { RenderComposeChildren(node.slot("subtitle")) }
    val slot_subtitle = if (node.isNull("subtitle")) null else content_subtitle
    val slot_navigationIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("navigationIcon")) }
    val mask = (if (node.has("subtitle")) 1 else 0) +
      (if (node.has("navigationIcon")) 2 else 0) +
      (if (node.has("actions")) 4 else 0) +
      (if (node.has("titleHorizontalAlignment")) 8 else 0) +
      (if (node.has("collapsedHeight")) 16 else 0) +
      (if (node.has("expandedHeight")) 32 else 0) +
      (if (node.has("windowInsets")) 64 else 0) +
      (if (node.has("colors")) 128 else 0) +
      (if (node.has("scrollBehavior")) 256 else 0)
    when (mask / 32) {
      0 -> renderMediumFlexibleTopAppBarGroup0(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      1 -> renderMediumFlexibleTopAppBarGroup1(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      2 -> renderMediumFlexibleTopAppBarGroup2(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      3 -> renderMediumFlexibleTopAppBarGroup3(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      4 -> renderMediumFlexibleTopAppBarGroup4(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      5 -> renderMediumFlexibleTopAppBarGroup5(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      6 -> renderMediumFlexibleTopAppBarGroup6(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      7 -> renderMediumFlexibleTopAppBarGroup7(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      8 -> renderMediumFlexibleTopAppBarGroup8(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      11 -> renderMediumFlexibleTopAppBarGroup11(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      13 -> renderMediumFlexibleTopAppBarGroup13(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      14 -> renderMediumFlexibleTopAppBarGroup14(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      15 -> renderMediumFlexibleTopAppBarGroup15(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle)
      2 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon)
      3 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon)
      4 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      5 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      6 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      7 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      8 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      9 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      10 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      11 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      12 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      13 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      14 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      15 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      16 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node))
      17 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node))
      18 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node))
      19 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node))
      20 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      21 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      22 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      23 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      24 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      25 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      26 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      27 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      28 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      29 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      30 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      31 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node))
      33 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `expandedHeight` = decode_expandedHeight(node))
      34 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node))
      35 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node))
      36 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      37 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      38 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      39 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      40 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      41 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      42 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      43 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      44 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      45 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      46 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      47 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      48 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      49 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      50 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      51 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      52 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      53 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      54 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      55 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      56 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      57 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      58 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      59 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      60 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      61 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      62 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      63 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup2(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      65 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      66 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      67 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      68 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      69 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      70 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      71 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      72 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      73 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      74 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      75 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      76 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      77 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      78 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      79 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      80 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      81 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      82 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      83 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      84 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      85 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      86 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      87 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      88 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      89 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      90 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      91 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      92 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      93 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      94 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      95 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup3(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      97 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      98 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      99 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      100 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      101 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      102 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      103 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      104 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      105 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      106 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      107 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      108 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      109 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      110 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      111 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      112 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      113 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      114 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      115 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      116 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      117 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      118 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      119 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      120 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      121 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      122 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      123 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      124 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      125 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      126 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      127 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup4(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      128 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      129 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      130 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      131 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      132 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      133 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      134 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      135 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      136 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      137 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      138 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      139 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      140 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      141 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      142 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      143 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      144 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      145 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      146 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      147 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      148 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      149 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      150 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      151 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      152 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      153 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      154 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      155 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      156 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      157 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      158 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      159 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup5(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      160 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      161 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      162 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      163 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      164 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      165 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      166 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      167 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      168 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      169 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      170 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      171 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      172 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      173 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      174 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      175 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      176 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      177 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      178 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      179 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      180 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      181 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      182 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      183 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      184 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      185 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      186 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      187 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      188 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      189 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      190 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      191 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup6(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      192 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      193 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      194 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      195 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      196 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      197 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      198 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      199 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      200 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      201 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      202 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      203 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      204 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      205 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      206 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      207 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      208 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      209 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      210 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      211 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      212 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      213 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      214 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      215 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      216 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      217 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      218 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      219 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      220 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      221 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      222 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      223 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup7(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      224 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      225 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      226 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      227 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      228 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      229 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      230 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      231 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      232 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      233 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      234 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      235 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      236 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      237 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      238 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      239 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      240 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      241 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      242 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      243 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      244 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      245 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      246 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      247 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      248 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      249 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      250 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      251 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      252 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      253 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      254 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      255 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup8(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      256 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      257 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      258 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      259 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      260 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      261 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      262 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      263 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      264 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      265 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      266 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      267 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      268 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      269 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      270 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      271 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      272 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      273 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      274 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      275 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      276 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      277 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      278 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      279 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      280 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      281 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      282 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      283 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      284 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      285 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      286 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      287 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup11(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      383 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup13(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      447 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup14(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      479 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup15(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      495 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      503 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      507 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      509 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      510 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      511 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MediumFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererMediumFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MediumTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererMediumTopAppBar {
  private fun decode_collapsedHeight(node: ComposeNode) = node.number("collapsedHeight").dp
  private fun decode_expandedHeight(node: ComposeNode) = node.number("expandedHeight").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scrollBehaviorValue = if (node.has("scrollBehavior") && !node.isNull("scrollBehavior")) node.jsonObject("scrollBehavior").rememberComposeTopAppBarScrollBehavior() else null
    val slot_title: @Composable () -> Unit = { RenderComposeChildren(node.slot("title")) }
    val slot_navigationIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("navigationIcon")) }
    val mask = (if (node.has("navigationIcon")) 1 else 0) +
      (if (node.has("actions")) 2 else 0) +
      (if (node.has("collapsedHeight")) 4 else 0) +
      (if (node.has("expandedHeight")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0) +
      (if (node.has("colors")) 32 else 0) +
      (if (node.has("scrollBehavior")) 64 else 0)
    when (mask / 32) {
      0 -> renderMediumTopAppBarGroup0(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      1 -> renderMediumTopAppBarGroup1(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      2 -> renderMediumTopAppBarGroup2(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      3 -> renderMediumTopAppBarGroup3(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderMediumTopAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon)
      2 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      3 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      4 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node))
      5 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node))
      6 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      7 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node))
      8 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node))
      9 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node))
      10 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      11 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      12 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      13 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      14 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      15 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node))
      16 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      17 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      18 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      19 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      20 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      21 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      22 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      23 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      24 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      25 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      26 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      27 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      28 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      29 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      30 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      31 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderMediumTopAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      33 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      34 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      35 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      36 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      37 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      38 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      39 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      40 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      41 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      42 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      43 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      44 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      45 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      46 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      47 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      48 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      49 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      50 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      51 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      52 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      53 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      54 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      55 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      56 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      57 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      58 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      59 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      60 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      61 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      62 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      63 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderMediumTopAppBarGroup2(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      65 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      66 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      67 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      68 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      69 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      70 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      71 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      72 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      73 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      74 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      75 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      76 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      77 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      78 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      79 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      80 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      81 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      82 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      83 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      84 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      85 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      86 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      87 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      88 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      89 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      90 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      91 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      92 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      93 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      94 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      95 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderMediumTopAppBarGroup3(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      97 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      98 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      99 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      100 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      101 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      102 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      103 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      104 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      105 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      106 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      107 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      108 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      109 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      110 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      111 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      112 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      113 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      114 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      115 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      116 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      117 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      118 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      119 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      120 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      121 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      122 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      123 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      124 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      125 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      126 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      127 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
