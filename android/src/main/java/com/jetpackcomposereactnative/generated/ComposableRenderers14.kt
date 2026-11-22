// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.animation.AnimatedVisibility as composeScoped0
import androidx.compose.material3.FloatingActionButtonMenuItem as composeScoped1
import androidx.compose.material3.NavigationBarItem as composeScoped2
import androidx.compose.material3.PlainTooltip as composeScoped3
import androidx.compose.material3.RichTooltip as composeScoped4
import androidx.compose.material3.SegmentedButton as composeScoped5

// androidx.compose.foundation.pager.VerticalPager(state: androidx.compose.foundation.pager.PagerState, modifier: androidx.compose.ui.Modifier, contentPadding: androidx.compose.foundation.layout.PaddingValues, pageSize: androidx.compose.foundation.pager.PageSize, beyondViewportPageCount: kotlin.Int, pageSpacing: androidx.compose.ui.unit.Dp, horizontalAlignment: androidx.compose.ui.Alignment.Horizontal, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, userScrollEnabled: kotlin.Boolean, reverseLayout: kotlin.Boolean, key: kotlin.Function1<kotlin.Int, kotlin.Any>?, pageNestedScrollConnection: androidx.compose.ui.input.nestedscroll.NestedScrollConnection, snapPosition: androidx.compose.foundation.gestures.snapping.SnapPosition, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, pageContent: kotlin.Function2<androidx.compose.foundation.pager.PagerScope, kotlin.Int, kotlin.Unit>)
internal object RendererVerticalPager {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposePagerState(node) else null
    val mask = (if (node.has("contentPadding")) 1 else 0) +
      (if (node.has("pageSize")) 2 else 0) +
      (if (node.has("beyondViewportPageCount")) 4 else 0) +
      (if (node.has("pageSpacing")) 8 else 0) +
      (if (node.has("horizontalAlignment")) 16 else 0) +
      (if (node.has("userScrollEnabled")) 32 else 0) +
      (if (node.has("reverseLayout")) 64 else 0) +
      (if (node.has("pageNestedScrollConnection")) 128 else 0) +
      (if (node.has("snapPosition")) 256 else 0) +
      (if (node.has("overscrollEffect")) 512 else 0)
    when (mask / 32) {
      0 -> renderVerticalPagerGroup0(node, scope, mask, stateValue)
      1 -> renderVerticalPagerGroup1(node, scope, mask, stateValue)
      2 -> renderVerticalPagerGroup2(node, scope, mask, stateValue)
      3 -> renderVerticalPagerGroup3(node, scope, mask, stateValue)
      4 -> renderVerticalPagerGroup4(node, scope, mask, stateValue)
      5 -> renderVerticalPagerGroup5(node, scope, mask, stateValue)
      6 -> renderVerticalPagerGroup6(node, scope, mask, stateValue)
      7 -> renderVerticalPagerGroup7(node, scope, mask, stateValue)
      8 -> renderVerticalPagerGroup8(node, scope, mask, stateValue)
      9 -> renderVerticalPagerGroup9(node, scope, mask, stateValue)
      10 -> renderVerticalPagerGroup10(node, scope, mask, stateValue)
      11 -> renderVerticalPagerGroup11(node, scope, mask, stateValue)
      15 -> renderVerticalPagerGroup15(node, scope, mask, stateValue)
      16 -> renderVerticalPagerGroup16(node, scope, mask, stateValue)
      17 -> renderVerticalPagerGroup17(node, scope, mask, stateValue)
      18 -> renderVerticalPagerGroup18(node, scope, mask, stateValue)
      19 -> renderVerticalPagerGroup19(node, scope, mask, stateValue)
      23 -> renderVerticalPagerGroup23(node, scope, mask, stateValue)
      24 -> renderVerticalPagerGroup24(node, scope, mask, stateValue)
      31 -> renderVerticalPagerGroup31(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      0 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      1 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      2 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      4 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      5 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      6 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      8 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      9 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      10 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      12 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      13 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      14 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      16 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      17 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      20 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      21 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      24 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      25 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      28 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      29 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      32 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      33 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      34 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      36 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      37 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      38 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      40 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      41 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      42 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      44 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      45 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      46 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      48 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      49 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      52 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      53 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      56 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      57 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      60 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      61 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      64 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      65 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      66 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      68 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      69 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      70 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      72 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      73 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      74 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      76 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      77 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      78 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      80 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      81 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      84 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      85 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      88 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      89 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      92 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      93 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      96 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      97 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      98 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      100 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      101 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      102 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      104 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      105 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      106 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      108 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      109 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      110 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      112 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      113 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      116 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      117 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      120 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      121 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      124 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      125 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      128 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      129 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      132 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      133 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      136 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      137 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      140 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      141 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      144 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      145 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      148 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      149 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      152 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      153 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      156 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      157 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      160 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      161 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      164 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      165 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      168 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      169 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      172 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      173 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      176 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      177 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      180 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      181 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      184 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      185 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      188 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      189 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      192 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      193 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      196 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      197 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      200 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      201 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      204 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      205 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      208 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      209 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      212 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      213 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      216 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      217 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      220 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      221 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      224 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      225 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      228 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      229 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      232 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      233 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      236 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      237 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      240 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      241 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      244 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      245 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      248 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      249 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      252 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      253 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      255 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      256 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      258 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      260 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      264 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      268 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup9(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      288 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      292 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      296 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      300 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup10(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      320 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      324 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      328 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      332 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup11(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      352 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      356 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      360 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      364 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup15(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      509 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      512 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      514 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      516 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      520 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      524 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup17(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      544 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      548 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      552 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      556 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup18(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      576 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      580 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      584 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      588 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup19(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      608 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      612 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      616 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      620 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup23(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      765 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup24(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      768 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup31(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      1023 -> androidx.compose.foundation.pager.VerticalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.VerticalSlider(state: androidx.compose.material3.SliderState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, reverseDirection: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource, thumb: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>, track: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>)
internal object RendererVerticalSlider {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("reverseDirection")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `reverseDirection` = node.boolean("reverseDirection"),
      )
      3 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `reverseDirection` = node.boolean("reverseDirection"),
      )
      4 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      5 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      6 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `reverseDirection` = node.boolean("reverseDirection"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      7 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `reverseDirection` = node.boolean("reverseDirection"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererVibrantFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.WideNavigationRail(modifier: androidx.compose.ui.Modifier, state: androidx.compose.material3.WideNavigationRailState, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.WideNavigationRailColors, header: kotlin.Function0<kotlin.Unit>?, windowInsets: androidx.compose.foundation.layout.WindowInsets, arrangement: androidx.compose.foundation.layout.Arrangement.Vertical, content: kotlin.Function0<kotlin.Unit>)
internal object RendererWideNavigationRail {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("header")) 2 else 0) +
      (if (node.has("windowInsets")) 4 else 0) +
      (if (node.has("arrangement")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.WideNavigationRailItem(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>?, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, railExpanded: kotlin.Boolean, iconPosition: androidx.compose.material3.NavigationItemIconPosition, colors: androidx.compose.material3.NavigationItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererWideNavigationRailItem {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("railExpanded")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `railExpanded` = node.boolean("railExpanded"),
      )
      3 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `railExpanded` = node.boolean("railExpanded"),
      )
      4 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      5 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      6 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `railExpanded` = node.boolean("railExpanded"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      7 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `railExpanded` = node.boolean("railExpanded"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
