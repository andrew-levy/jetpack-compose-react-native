// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.adaptive.layout.AnimatedPane as composeScoped0
import androidx.compose.material3.ExposedDropdownMenu as composeScoped1
import androidx.compose.material3.FloatingActionButtonMenuItem as composeScoped2
import androidx.compose.material3.NavigationBarItem as composeScoped3
import androidx.compose.material3.PlainTooltip as composeScoped4
import androidx.compose.material3.RichTooltip as composeScoped5
import androidx.compose.material3.SegmentedButton as composeScoped6

// androidx.compose.material3.FlexibleBottomAppBar(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, contentPadding: androidx.compose.foundation.layout.PaddingValues, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, scrollBehavior: androidx.compose.material3.BottomAppBarScrollBehavior?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererFlexibleBottomAppBar {
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_expandedHeight(node: ComposeNode) = node.number("expandedHeight").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("horizontalArrangement")) 8 else 0) +
      (if (node.has("expandedHeight")) 16 else 0) +
      (if (node.has("windowInsets")) 32 else 0) +
      (if (node.has("scrollBehavior")) 64 else 0)
    when (mask / 32) {
      0 -> renderFlexibleBottomAppBarGroup0(node, scope, mask)
      1 -> renderFlexibleBottomAppBarGroup1(node, scope, mask)
      2 -> renderFlexibleBottomAppBarGroup2(node, scope, mask)
      3 -> renderFlexibleBottomAppBarGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFlexibleBottomAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFlexibleBottomAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFlexibleBottomAppBarGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFlexibleBottomAppBarGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.FlexibleBottomAppBar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeBottomAppBarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFloatingActionButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.FloatingActionButton(
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

// androidx.compose.material3.FloatingActionButtonMenu(expanded: kotlin.Boolean, button: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, horizontalAlignment: androidx.compose.ui.Alignment.Horizontal, content: kotlin.Function1<androidx.compose.material3.FloatingActionButtonMenuScope, kotlin.Unit>)
internal object RendererFloatingActionButtonMenu {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("horizontalAlignment")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FloatingActionButtonMenu(
        `expanded` = node.boolean("expanded"),
        `button` = { RenderComposeChildren(node.slot("button")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.FloatingActionButtonMenu(
        `expanded` = node.boolean("expanded"),
        `button` = { RenderComposeChildren(node.slot("button")) },
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FloatingActionButtonMenuItem [receiver: androidx.compose.material3.FloatingActionButtonMenuScope](onClick: kotlin.Function0<kotlin.Unit>, text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color)
internal object RendererFloatingActionButtonMenuItem {
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.FloatingActionButtonMenuScope) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0)
    when (mask) {
      0 -> scope.composeScoped2(
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> scope.composeScoped2(
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      2 -> scope.composeScoped2(
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      3 -> scope.composeScoped2(
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.FlowColumn(modifier: androidx.compose.ui.Modifier, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, itemHorizontalAlignment: androidx.compose.ui.Alignment.Horizontal, maxItemsInEachColumn: kotlin.Int, maxLines: kotlin.Int, content: kotlin.Function1<androidx.compose.foundation.layout.FlowColumnScope, kotlin.Unit>)
internal object RendererFlowColumn {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("verticalArrangement")) 1 else 0) +
      (if (node.has("horizontalArrangement")) 2 else 0) +
      (if (node.has("itemHorizontalAlignment")) 4 else 0) +
      (if (node.has("maxItemsInEachColumn")) 8 else 0) +
      (if (node.has("maxLines")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.foundation.layout.FlowColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemHorizontalAlignment` = toComposeHorizontalAlignment(node.string("itemHorizontalAlignment")),
        `maxItemsInEachColumn` = node.number("maxItemsInEachColumn").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.FlowRow(modifier: androidx.compose.ui.Modifier, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, itemVerticalAlignment: androidx.compose.ui.Alignment.Vertical, maxItemsInEachRow: kotlin.Int, maxLines: kotlin.Int, content: kotlin.Function1<androidx.compose.foundation.layout.FlowRowScope, kotlin.Unit>)
internal object RendererFlowRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("horizontalArrangement")) 1 else 0) +
      (if (node.has("verticalArrangement")) 2 else 0) +
      (if (node.has("itemVerticalAlignment")) 4 else 0) +
      (if (node.has("maxItemsInEachRow")) 8 else 0) +
      (if (node.has("maxLines")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.foundation.layout.FlowRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `itemVerticalAlignment` = toComposeVerticalAlignment(node.string("itemVerticalAlignment")),
        `maxItemsInEachRow` = node.number("maxItemsInEachRow").toInt(),
        `maxLines` = node.number("maxLines").toInt(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.Grid(config: kotlin.Function1<androidx.compose.foundation.layout.GridConfigurationScope, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, content: kotlin.Function1<androidx.compose.foundation.layout.GridScope, kotlin.Unit>)
internal object RendererGrid {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.foundation.layout.Grid(
      `config` = node.jsonObject("config").toComposeGridConfig(),
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

// androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(state: androidx.compose.material3.carousel.CarouselState, modifier: androidx.compose.ui.Modifier, preferredItemWidth: androidx.compose.ui.unit.Dp, itemSpacing: androidx.compose.ui.unit.Dp, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, userScrollEnabled: kotlin.Boolean, minSmallItemWidth: androidx.compose.ui.unit.Dp, maxSmallItemWidth: androidx.compose.ui.unit.Dp, contentPadding: androidx.compose.foundation.layout.PaddingValues, content: kotlin.Function2<androidx.compose.material3.carousel.CarouselItemScope, kotlin.Int, kotlin.Unit>)
internal object RendererHorizontalCenteredHeroCarousel {
  private fun decode_preferredItemWidth(node: ComposeNode) = node.number("preferredItemWidth").dp
  private fun decode_itemSpacing(node: ComposeNode) = node.number("itemSpacing").dp
  private fun decode_userScrollEnabled(node: ComposeNode) = node.boolean("userScrollEnabled")
  private fun decode_minSmallItemWidth(node: ComposeNode) = node.number("minSmallItemWidth").dp
  private fun decode_maxSmallItemWidth(node: ComposeNode) = node.number("maxSmallItemWidth").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeCarouselState(node) else null
    val mask = (if (node.has("preferredItemWidth")) 1 else 0) +
      (if (node.has("itemSpacing")) 2 else 0) +
      (if (node.has("userScrollEnabled")) 4 else 0) +
      (if (node.has("minSmallItemWidth")) 8 else 0) +
      (if (node.has("maxSmallItemWidth")) 16 else 0) +
      (if (node.has("contentPadding")) 32 else 0)
    when (mask / 32) {
      0 -> renderHorizontalCenteredHeroCarouselGroup0(node, scope, mask, stateValue)
      1 -> renderHorizontalCenteredHeroCarouselGroup1(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalCenteredHeroCarouselGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.carousel.CarouselState?) {
    when (mask) {
      0 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      1 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      2 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      3 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      4 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      5 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      6 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      7 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      8 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `minSmallItemWidth` = decode_minSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      9 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      10 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      11 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      12 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      13 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      14 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      15 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      16 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      17 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      18 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      19 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      20 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      21 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `userScrollEnabled` = decode_userScrollEnabled(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      22 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      23 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      24 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      25 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      26 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      27 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      28 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      29 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      30 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      31 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalCenteredHeroCarouselGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.carousel.CarouselState?) {
    when (mask) {
      32 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      33 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      34 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      35 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      36 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      37 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `userScrollEnabled` = decode_userScrollEnabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      38 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      39 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      40 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `minSmallItemWidth` = decode_minSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      41 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      42 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      43 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      44 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      45 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      46 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      47 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      48 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      49 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      50 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      51 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      52 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      53 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `userScrollEnabled` = decode_userScrollEnabled(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      54 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      55 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      56 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      57 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      58 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      59 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      60 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      61 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      62 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      63 -> androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `preferredItemWidth` = decode_preferredItemWidth(node), `itemSpacing` = decode_itemSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `minSmallItemWidth` = decode_minSmallItemWidth(node), `maxSmallItemWidth` = decode_maxSmallItemWidth(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.HorizontalDivider(modifier: androidx.compose.ui.Modifier, thickness: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color)
internal object RendererHorizontalDivider {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("thickness")) 1 else 0) +
      (if (node.has("color")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.HorizontalDivider(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.HorizontalDivider(
        `modifier` = node.modifier("modifier", scope),
        `thickness` = node.number("thickness").dp,
      )
      2 -> androidx.compose.material3.HorizontalDivider(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.HorizontalDivider(
        `modifier` = node.modifier("modifier", scope),
        `thickness` = node.number("thickness").dp,
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.HorizontalFloatingToolbar(expanded: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.FloatingToolbarColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, scrollBehavior: androidx.compose.material3.FloatingToolbarScrollBehavior?, shape: androidx.compose.ui.graphics.Shape, leadingContent: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>?, trailingContent: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>?, expandedShadowElevation: androidx.compose.ui.unit.Dp, collapsedShadowElevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererHorizontalFloatingToolbar {
  private fun decode_expanded(node: ComposeNode) = node.boolean("expanded")
  private fun decode_expandedShadowElevation(node: ComposeNode) = node.number("expandedShadowElevation").dp
  private fun decode_collapsedShadowElevation(node: ComposeNode) = node.number("collapsedShadowElevation").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("colors")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("scrollBehavior")) 4 else 0) +
      (if (node.has("shape")) 8 else 0) +
      (if (node.has("leadingContent")) 16 else 0) +
      (if (node.has("trailingContent")) 32 else 0) +
      (if (node.has("expandedShadowElevation")) 64 else 0) +
      (if (node.has("collapsedShadowElevation")) 128 else 0)
    when (mask / 32) {
      0 -> renderHorizontalFloatingToolbarGroup0(node, scope, mask)
      1 -> renderHorizontalFloatingToolbarGroup1(node, scope, mask)
      2 -> renderHorizontalFloatingToolbarGroup2(node, scope, mask)
      3 -> renderHorizontalFloatingToolbarGroup3(node, scope, mask)
      4 -> renderHorizontalFloatingToolbarGroup4(node, scope, mask)
      5 -> renderHorizontalFloatingToolbarGroup5(node, scope, mask)
      6 -> renderHorizontalFloatingToolbarGroup6(node, scope, mask)
      7 -> renderHorizontalFloatingToolbarGroup7(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbarGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbarGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbarGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbarGroup4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      129 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      130 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      131 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      132 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      133 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      134 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      135 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      136 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      137 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      138 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      139 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      140 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      141 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      142 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      143 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      144 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      145 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      146 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      147 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      148 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      149 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      150 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      151 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      152 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      153 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      154 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      155 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      156 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      157 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      158 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      159 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbarGroup5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      161 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      162 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      163 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      164 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      165 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      166 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      167 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      168 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      169 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      170 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      171 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      172 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      173 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      174 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      175 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      176 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      177 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      178 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      179 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      180 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      181 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      182 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      183 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      184 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      185 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      186 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      187 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      188 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      189 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      190 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      191 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbarGroup6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      193 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      194 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      195 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      196 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      197 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      198 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      199 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      200 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      201 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      202 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      203 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      204 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      205 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      206 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      207 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      208 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      209 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      210 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      211 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      212 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      213 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      214 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      215 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      216 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      217 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      218 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      219 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      220 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      221 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      222 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      223 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbarGroup7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      225 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      226 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      227 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      228 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      229 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      230 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      231 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      232 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      233 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      234 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      235 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      236 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      237 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      238 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      239 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      240 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      241 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      242 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      243 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      244 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      245 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      246 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      247 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      248 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      249 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      250 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      251 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      252 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      253 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      254 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      255 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.HorizontalFloatingToolbar(expanded: kotlin.Boolean, floatingActionButton: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.FloatingToolbarColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, scrollBehavior: androidx.compose.material3.FloatingToolbarScrollBehavior?, shape: androidx.compose.ui.graphics.Shape, floatingActionButtonPosition: androidx.compose.material3.FloatingToolbarHorizontalFabPosition, animationSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>, expandedShadowElevation: androidx.compose.ui.unit.Dp, collapsedShadowElevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererHorizontalFloatingToolbar_1 {
  private fun decode_expanded(node: ComposeNode) = node.boolean("expanded")
  private fun decode_expandedShadowElevation(node: ComposeNode) = node.number("expandedShadowElevation").dp
  private fun decode_collapsedShadowElevation(node: ComposeNode) = node.number("collapsedShadowElevation").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_floatingActionButton: @Composable () -> Unit = { RenderComposeChildren(node.slot("floatingActionButton")) }
    val mask = (if (node.has("colors")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("scrollBehavior")) 4 else 0) +
      (if (node.has("shape")) 8 else 0) +
      (if (node.has("floatingActionButtonPosition")) 16 else 0) +
      (if (node.has("animationSpec")) 32 else 0) +
      (if (node.has("expandedShadowElevation")) 64 else 0) +
      (if (node.has("collapsedShadowElevation")) 128 else 0)
    when (mask / 32) {
      0 -> renderHorizontalFloatingToolbar_1Group0(node, scope, mask, slot_floatingActionButton)
      1 -> renderHorizontalFloatingToolbar_1Group1(node, scope, mask, slot_floatingActionButton)
      2 -> renderHorizontalFloatingToolbar_1Group2(node, scope, mask, slot_floatingActionButton)
      3 -> renderHorizontalFloatingToolbar_1Group3(node, scope, mask, slot_floatingActionButton)
      4 -> renderHorizontalFloatingToolbar_1Group4(node, scope, mask, slot_floatingActionButton)
      5 -> renderHorizontalFloatingToolbar_1Group5(node, scope, mask, slot_floatingActionButton)
      6 -> renderHorizontalFloatingToolbar_1Group6(node, scope, mask, slot_floatingActionButton)
      7 -> renderHorizontalFloatingToolbar_1Group7(node, scope, mask, slot_floatingActionButton)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbar_1Group0(node: ComposeNode, scope: Any?, mask: Int, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbar_1Group1(node: ComposeNode, scope: Any?, mask: Int, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbar_1Group2(node: ComposeNode, scope: Any?, mask: Int, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbar_1Group3(node: ComposeNode, scope: Any?, mask: Int, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbar_1Group4(node: ComposeNode, scope: Any?, mask: Int, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      128 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      129 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      130 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      131 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      132 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      133 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      134 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      135 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      136 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      137 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      138 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      139 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      140 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      141 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      142 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      143 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      144 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      145 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      146 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      147 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      148 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      149 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      150 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      151 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      152 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      153 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      154 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      155 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      156 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      157 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      158 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      159 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbar_1Group5(node: ComposeNode, scope: Any?, mask: Int, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      160 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      161 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      162 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      163 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      164 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      165 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      166 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      167 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      168 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      169 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      170 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      171 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      172 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      173 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      174 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      175 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      176 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      177 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      178 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      179 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      180 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      181 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      182 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      183 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      184 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      185 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      186 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      187 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      188 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      189 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      190 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      191 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbar_1Group6(node: ComposeNode, scope: Any?, mask: Int, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      192 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      193 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      194 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      195 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      196 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      197 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      198 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      199 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      200 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      201 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      202 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      203 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      204 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      205 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      206 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      207 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      208 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      209 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      210 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      211 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      212 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      213 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      214 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      215 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      216 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      217 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      218 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      219 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      220 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      221 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      222 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      223 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalFloatingToolbar_1Group7(node: ComposeNode, scope: Any?, mask: Int, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      224 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      225 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      226 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      227 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      228 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      229 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      230 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      231 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      232 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      233 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      234 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      235 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      236 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      237 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      238 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      239 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      240 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      241 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      242 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      243 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      244 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      245 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      246 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      247 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      248 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      249 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      250 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      251 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      252 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      253 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      254 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      255 -> androidx.compose.material3.HorizontalFloatingToolbar(`expanded` = decode_expanded(node), `floatingActionButton` = slot_floatingActionButton, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeFloatingToolbarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (node.jsonObject("scrollBehavior").decodeComposeFloatingToolbarScrollBehaviorValue()), `shape` = node.arguments().shape("shape"), `floatingActionButtonPosition` = toComposeFloatingToolbarHorizontalFabPositionValue(node.string("floatingActionButtonPosition")), `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(state: androidx.compose.material3.carousel.CarouselState, preferredItemWidth: androidx.compose.ui.unit.Dp, modifier: androidx.compose.ui.Modifier, itemSpacing: androidx.compose.ui.unit.Dp, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, userScrollEnabled: kotlin.Boolean, minSmallItemWidth: androidx.compose.ui.unit.Dp, maxSmallItemWidth: androidx.compose.ui.unit.Dp, contentPadding: androidx.compose.foundation.layout.PaddingValues, content: kotlin.Function2<androidx.compose.material3.carousel.CarouselItemScope, kotlin.Int, kotlin.Unit>)
internal object RendererHorizontalMultiBrowseCarousel {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeCarouselState(node) else null
    val mask = (if (node.has("itemSpacing")) 1 else 0) +
      (if (node.has("userScrollEnabled")) 2 else 0) +
      (if (node.has("minSmallItemWidth")) 4 else 0) +
      (if (node.has("maxSmallItemWidth")) 8 else 0) +
      (if (node.has("contentPadding")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      1 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      2 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      3 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      4 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      5 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      6 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      7 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      8 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      9 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      10 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      11 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      12 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      13 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      14 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      15 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      16 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      17 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      18 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      19 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      20 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      21 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      22 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      23 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      24 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      25 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      26 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      27 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      28 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      29 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      30 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      31 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.pager.HorizontalPager(state: androidx.compose.foundation.pager.PagerState, modifier: androidx.compose.ui.Modifier, contentPadding: androidx.compose.foundation.layout.PaddingValues, pageSize: androidx.compose.foundation.pager.PageSize, beyondViewportPageCount: kotlin.Int, pageSpacing: androidx.compose.ui.unit.Dp, verticalAlignment: androidx.compose.ui.Alignment.Vertical, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, userScrollEnabled: kotlin.Boolean, reverseLayout: kotlin.Boolean, key: kotlin.Function1<kotlin.Int, kotlin.Any>?, pageNestedScrollConnection: androidx.compose.ui.input.nestedscroll.NestedScrollConnection, snapPosition: androidx.compose.foundation.gestures.snapping.SnapPosition, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, bringIntoViewSpec: androidx.compose.foundation.gestures.BringIntoViewSpec, pageContent: kotlin.Function2<androidx.compose.foundation.pager.PagerScope, kotlin.Int, kotlin.Unit>)
internal object RendererHorizontalPager {
  private fun decode_beyondViewportPageCount(node: ComposeNode) = node.number("beyondViewportPageCount").toInt()
  private fun decode_pageSpacing(node: ComposeNode) = node.number("pageSpacing").dp
  private fun decode_userScrollEnabled(node: ComposeNode) = node.boolean("userScrollEnabled")
  private fun decode_reverseLayout(node: ComposeNode) = node.boolean("reverseLayout")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposePagerState(node) else null
    val mask = (if (node.has("contentPadding")) 1 else 0) +
      (if (node.has("pageSize")) 2 else 0) +
      (if (node.has("beyondViewportPageCount")) 4 else 0) +
      (if (node.has("pageSpacing")) 8 else 0) +
      (if (node.has("verticalAlignment")) 16 else 0) +
      (if (node.has("userScrollEnabled")) 32 else 0) +
      (if (node.has("reverseLayout")) 64 else 0) +
      (if (node.has("pageNestedScrollConnection")) 128 else 0) +
      (if (node.has("snapPosition")) 256 else 0) +
      (if (node.has("overscrollEffect")) 512 else 0)
    when (mask / 32) {
      0 -> renderHorizontalPagerGroup0(node, scope, mask, stateValue)
      1 -> renderHorizontalPagerGroup1(node, scope, mask, stateValue)
      2 -> renderHorizontalPagerGroup2(node, scope, mask, stateValue)
      3 -> renderHorizontalPagerGroup3(node, scope, mask, stateValue)
      4 -> renderHorizontalPagerGroup4(node, scope, mask, stateValue)
      5 -> renderHorizontalPagerGroup5(node, scope, mask, stateValue)
      6 -> renderHorizontalPagerGroup6(node, scope, mask, stateValue)
      7 -> renderHorizontalPagerGroup7(node, scope, mask, stateValue)
      8 -> renderHorizontalPagerGroup8(node, scope, mask, stateValue)
      9 -> renderHorizontalPagerGroup9(node, scope, mask, stateValue)
      10 -> renderHorizontalPagerGroup10(node, scope, mask, stateValue)
      11 -> renderHorizontalPagerGroup11(node, scope, mask, stateValue)
      15 -> renderHorizontalPagerGroup15(node, scope, mask, stateValue)
      16 -> renderHorizontalPagerGroup16(node, scope, mask, stateValue)
      17 -> renderHorizontalPagerGroup17(node, scope, mask, stateValue)
      18 -> renderHorizontalPagerGroup18(node, scope, mask, stateValue)
      19 -> renderHorizontalPagerGroup19(node, scope, mask, stateValue)
      23 -> renderHorizontalPagerGroup23(node, scope, mask, stateValue)
      24 -> renderHorizontalPagerGroup24(node, scope, mask, stateValue)
      27 -> renderHorizontalPagerGroup27(node, scope, mask, stateValue)
      29 -> renderHorizontalPagerGroup29(node, scope, mask, stateValue)
      30 -> renderHorizontalPagerGroup30(node, scope, mask, stateValue)
      31 -> renderHorizontalPagerGroup31(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      0 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      1 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      2 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      4 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      5 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      6 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      8 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      9 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      10 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      12 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      13 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      14 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      16 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      17 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      20 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      21 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      24 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      25 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      28 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      29 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      32 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      33 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      34 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      36 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      37 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      38 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      40 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      41 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      42 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      44 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      45 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      46 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      48 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      49 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      52 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      53 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      56 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      57 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      60 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      61 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      64 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      65 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      66 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      68 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      69 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      70 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      72 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      73 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      74 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      76 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      77 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      78 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      80 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      81 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      84 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      85 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      88 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      89 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      92 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      93 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      96 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      97 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      98 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      100 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      101 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      102 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      104 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      105 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      106 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      108 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      109 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      110 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      112 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      113 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      116 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      117 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      120 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      121 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      124 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      125 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      128 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      129 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      132 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      133 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      136 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      137 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      140 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      141 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      144 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      145 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      148 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      149 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      152 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      153 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      156 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      157 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      160 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      161 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      164 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      165 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      168 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      169 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      172 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      173 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      176 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      177 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      180 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      181 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      184 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      185 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      188 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      189 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      192 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      193 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      196 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      197 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      200 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      201 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      204 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      205 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      208 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      209 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      212 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      213 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      216 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      217 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      220 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      221 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      224 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      225 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      228 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      229 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      232 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      233 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      236 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      237 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      240 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      241 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      244 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      245 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      248 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      249 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      252 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      253 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      255 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      256 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      258 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      260 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      264 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      268 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup9(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      288 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      292 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      296 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      300 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup10(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      320 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      324 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      328 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      332 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup11(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      352 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      356 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      360 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      364 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup15(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      509 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      511 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      512 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      514 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      516 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      520 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      524 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup17(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      544 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      548 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      552 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      556 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup18(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      576 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      580 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      584 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      588 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup19(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      608 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      612 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      616 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      620 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup23(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      765 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      767 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup24(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      768 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup27(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      895 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup29(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      959 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup30(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      991 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup31(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      1007 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      1015 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      1019 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      1021 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      1022 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      1023 -> androidx.compose.foundation.pager.HorizontalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), `key` = { index -> node.children[index].composeChildId }, pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.carousel.HorizontalUncontainedCarousel(state: androidx.compose.material3.carousel.CarouselState, itemWidth: androidx.compose.ui.unit.Dp, modifier: androidx.compose.ui.Modifier, itemSpacing: androidx.compose.ui.unit.Dp, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, userScrollEnabled: kotlin.Boolean, contentPadding: androidx.compose.foundation.layout.PaddingValues, content: kotlin.Function2<androidx.compose.material3.carousel.CarouselItemScope, kotlin.Int, kotlin.Unit>)
internal object RendererHorizontalUncontainedCarousel {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeCarouselState(node) else null
    val mask = (if (node.has("itemSpacing")) 1 else 0) +
      (if (node.has("userScrollEnabled")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      1 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      2 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      3 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      4 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      5 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      6 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      7 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Icon(bitmap: androidx.compose.ui.graphics.ImageBitmap, contentDescription: kotlin.String?, modifier: androidx.compose.ui.Modifier, tint: androidx.compose.ui.graphics.Color)
internal object RendererIcon {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("tint")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Icon(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Icon(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `tint` = node.color("tint"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Icon(imageVector: androidx.compose.ui.graphics.vector.ImageVector, contentDescription: kotlin.String?, modifier: androidx.compose.ui.Modifier, tint: androidx.compose.ui.graphics.Color)
internal object RendererIcon_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("tint")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Icon(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Icon(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `tint` = node.color("tint"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Icon(painter: androidx.compose.ui.graphics.painter.Painter, contentDescription: kotlin.String?, modifier: androidx.compose.ui.Modifier, tint: androidx.compose.ui.graphics.Color)
internal object RendererIcon_2 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("tint")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Icon(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Icon(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `tint` = node.color("tint"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SegmentedButtonDefaults.Icon(active: kotlin.Boolean, activeContent: kotlin.Function0<kotlin.Unit>, inactiveContent: kotlin.Function0<kotlin.Unit>?)
internal object RendererIcon_3 {
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("activeContent")) 1 else 0) +
      (if (node.has("inactiveContent")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SegmentedButtonDefaults.Icon(
        `active` = node.boolean("active"),
      )
      1 -> androidx.compose.material3.SegmentedButtonDefaults.Icon(
        `active` = node.boolean("active"),
        `activeContent` = { RenderComposeChildren(node.slot("activeContent")) },
      )
      2 -> androidx.compose.material3.SegmentedButtonDefaults.Icon(
        `active` = node.boolean("active"),
        `inactiveContent` = if (node.isNull("inactiveContent")) null else ({ RenderComposeChildren(node.slot("inactiveContent")) }),
      )
      3 -> androidx.compose.material3.SegmentedButtonDefaults.Icon(
        `active` = node.boolean("active"),
        `activeContent` = { RenderComposeChildren(node.slot("activeContent")) },
        `inactiveContent` = if (node.isNull("inactiveContent")) null else ({ RenderComposeChildren(node.slot("inactiveContent")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.IconButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, shape: androidx.compose.ui.graphics.Shape, content: kotlin.Function0<kotlin.Unit>)
internal object RendererIconButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0) +
      (if (node.has("shape")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.IconButton(onClick: kotlin.Function0<kotlin.Unit>, shapes: androidx.compose.material3.IconButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererIconButton_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.IconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, shape: androidx.compose.ui.graphics.Shape, content: kotlin.Function0<kotlin.Unit>)
internal object RendererIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0) +
      (if (node.has("shape")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.IconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, shapes: androidx.compose.material3.IconToggleButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererIconToggleButton_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.Image(bitmap: androidx.compose.ui.graphics.ImageBitmap, contentDescription: kotlin.String?, modifier: androidx.compose.ui.Modifier, alignment: androidx.compose.ui.Alignment, contentScale: androidx.compose.ui.layout.ContentScale, alpha: kotlin.Float, colorFilter: androidx.compose.ui.graphics.ColorFilter?, filterQuality: androidx.compose.ui.graphics.FilterQuality)
internal object RendererImage {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("alignment")) 1 else 0) +
      (if (node.has("contentScale")) 2 else 0) +
      (if (node.has("alpha")) 4 else 0) +
      (if (node.has("colorFilter")) 8 else 0) +
      (if (node.has("filterQuality")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
      )
      2 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
      )
      3 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
      )
      4 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alpha` = node.number("alpha").toFloat(),
      )
      5 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `alpha` = node.number("alpha").toFloat(),
      )
      6 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
      )
      7 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
      )
      8 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      9 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      10 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      11 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      12 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      13 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      14 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      15 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      16 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      17 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      18 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      19 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      20 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alpha` = node.number("alpha").toFloat(),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      21 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `alpha` = node.number("alpha").toFloat(),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      22 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      23 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      24 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      25 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      26 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      27 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      28 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      29 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      30 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      31 -> androidx.compose.foundation.Image(
        `bitmap` = node.jsonObject("bitmap").decodeComposeImageBitmapValue(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
        `filterQuality` = toComposeFilterQualityValue(node.string("filterQuality")),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.Image(imageVector: androidx.compose.ui.graphics.vector.ImageVector, contentDescription: kotlin.String?, modifier: androidx.compose.ui.Modifier, alignment: androidx.compose.ui.Alignment, contentScale: androidx.compose.ui.layout.ContentScale, alpha: kotlin.Float, colorFilter: androidx.compose.ui.graphics.ColorFilter?)
internal object RendererImage_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("alignment")) 1 else 0) +
      (if (node.has("contentScale")) 2 else 0) +
      (if (node.has("alpha")) 4 else 0) +
      (if (node.has("colorFilter")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
      )
      2 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
      )
      3 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
      )
      4 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alpha` = node.number("alpha").toFloat(),
      )
      5 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `alpha` = node.number("alpha").toFloat(),
      )
      6 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
      )
      7 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
      )
      8 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      9 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      10 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      11 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      12 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      13 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      14 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      15 -> androidx.compose.foundation.Image(
        `imageVector` = node.jsonObject("imageVector").toComposeMaterialIcon(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.Image(painter: androidx.compose.ui.graphics.painter.Painter, contentDescription: kotlin.String?, modifier: androidx.compose.ui.Modifier, alignment: androidx.compose.ui.Alignment, contentScale: androidx.compose.ui.layout.ContentScale, alpha: kotlin.Float, colorFilter: androidx.compose.ui.graphics.ColorFilter?)
internal object RendererImage_2 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("alignment")) 1 else 0) +
      (if (node.has("contentScale")) 2 else 0) +
      (if (node.has("alpha")) 4 else 0) +
      (if (node.has("colorFilter")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
      )
      2 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
      )
      3 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
      )
      4 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alpha` = node.number("alpha").toFloat(),
      )
      5 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `alpha` = node.number("alpha").toFloat(),
      )
      6 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
      )
      7 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
      )
      8 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      9 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      10 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      11 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      12 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      13 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      14 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      15 -> androidx.compose.foundation.Image(
        `painter` = node.jsonObject("painter").rememberComposePainter(),
        `contentDescription` = if (node.isNull("contentDescription")) null else (node.string("contentDescription")),
        `modifier` = node.modifier("modifier", scope),
        `alignment` = toComposeAlignment(node.string("alignment")),
        `contentScale` = toComposeContentScale(node.string("contentScale")),
        `alpha` = node.number("alpha").toFloat(),
        `colorFilter` = if (node.isNull("colorFilter")) null else (node.jsonObject("colorFilter").decodeComposeColorFilterValue()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TabRowDefaults.Indicator(modifier: androidx.compose.ui.Modifier, height: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color)
internal object RendererIndicator {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("height")) 1 else 0) +
      (if (node.has("color")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TabRowDefaults.Indicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.TabRowDefaults.Indicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
      )
      2 -> androidx.compose.material3.TabRowDefaults.Indicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.TabRowDefaults.Indicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(state: androidx.compose.material3.pulltorefresh.PullToRefreshState, isRefreshing: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, color: androidx.compose.ui.graphics.Color, maxDistance: androidx.compose.ui.unit.Dp)
internal object RendererIndicator_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("color")) 2 else 0) +
      (if (node.has("maxDistance")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      2 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `color` = node.color("color"),
      )
      4 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `maxDistance` = node.number("maxDistance").dp,
      )
      5 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `maxDistance` = node.number("maxDistance").dp,
      )
      6 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `maxDistance` = node.number("maxDistance").dp,
      )
      7 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `color` = node.color("color"),
        `maxDistance` = node.number("maxDistance").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(state: androidx.compose.material3.pulltorefresh.PullToRefreshState, isRefreshing: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, maxDistance: androidx.compose.ui.unit.Dp, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.BoxScope, kotlin.Unit>)
internal object RendererIndicatorBox {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("maxDistance")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `maxDistance` = node.number("maxDistance").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `maxDistance` = node.number("maxDistance").dp,
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `maxDistance` = node.number("maxDistance").dp,
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `maxDistance` = node.number("maxDistance").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `maxDistance` = node.number("maxDistance").dp,
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `maxDistance` = node.number("maxDistance").dp,
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `maxDistance` = node.number("maxDistance").dp,
        `containerColor` = node.color("containerColor"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `maxDistance` = node.number("maxDistance").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
