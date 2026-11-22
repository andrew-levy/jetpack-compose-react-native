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

// androidx.compose.material3.FlexibleBottomAppBar(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, contentPadding: androidx.compose.foundation.layout.PaddingValues, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, scrollBehavior: androidx.compose.material3.BottomAppBarScrollBehavior?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererFlexibleBottomAppBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("horizontalArrangement")) 8 else 0) +
      (if (node.has("expandedHeight")) 16 else 0) +
      (if (node.has("windowInsets")) 32 else 0)
    when (mask / 32) {
      0 -> renderFlexibleBottomAppBarGroup0(node, scope, mask)
      1 -> renderFlexibleBottomAppBarGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderFlexibleBottomAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderFlexibleBottomAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      33 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      34 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      35 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      36 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      37 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      38 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      39 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      40 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      41 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      42 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      43 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      44 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      45 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      46 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      47 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      48 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      49 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      50 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      51 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      52 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      53 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      54 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      55 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      56 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      57 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      58 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      59 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      60 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      61 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      62 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      63 -> androidx.compose.material3.FlexibleBottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
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
      (if (node.has("interactionSource")) 8 else 0)
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FloatingActionButton(
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

// androidx.compose.material3.FloatingActionButtonMenu(expanded: kotlin.Boolean, button: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, horizontalAlignment: androidx.compose.ui.Alignment.Horizontal, content: kotlin.Function1<androidx.compose.material3.FloatingActionButtonMenuScope, kotlin.Unit>)
internal object RendererFloatingActionButtonMenu {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
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
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.FloatingActionButtonMenuScope) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0)
    when (mask) {
      0 -> scope.composeScoped1(
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> scope.composeScoped1(
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      2 -> scope.composeScoped1(
        `onClick` = { node.emit("onClick") },
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      3 -> scope.composeScoped1(
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
  @OptIn(androidx.compose.foundation.layout.ExperimentalGridApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.foundation.layout.Grid(
      `config` = node.jsonObject("config").toComposeGridConfig(),
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
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
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentPadding")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("leadingContent")) 4 else 0) +
      (if (node.has("trailingContent")) 8 else 0) +
      (if (node.has("expandedShadowElevation")) 16 else 0) +
      (if (node.has("collapsedShadowElevation")) 32 else 0)
    when (mask / 32) {
      0 -> renderHorizontalFloatingToolbarGroup0(node, scope, mask)
      1 -> renderHorizontalFloatingToolbarGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderHorizontalFloatingToolbarGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderHorizontalFloatingToolbarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      33 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      34 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      35 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      36 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      37 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      38 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      39 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      40 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      41 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      42 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      43 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      44 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      45 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      46 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      47 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      48 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      49 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      50 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      51 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      52 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      53 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      54 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      55 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      56 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      57 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      58 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      59 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      60 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      61 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      62 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      63 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.HorizontalFloatingToolbar(expanded: kotlin.Boolean, floatingActionButton: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.FloatingToolbarColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, scrollBehavior: androidx.compose.material3.FloatingToolbarScrollBehavior?, shape: androidx.compose.ui.graphics.Shape, floatingActionButtonPosition: androidx.compose.material3.FloatingToolbarHorizontalFabPosition, animationSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>, expandedShadowElevation: androidx.compose.ui.unit.Dp, collapsedShadowElevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererHorizontalFloatingToolbar_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentPadding")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("animationSpec")) 4 else 0) +
      (if (node.has("expandedShadowElevation")) 8 else 0) +
      (if (node.has("collapsedShadowElevation")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.HorizontalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(state: androidx.compose.material3.carousel.CarouselState, preferredItemWidth: androidx.compose.ui.unit.Dp, modifier: androidx.compose.ui.Modifier, itemSpacing: androidx.compose.ui.unit.Dp, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, minSmallItemWidth: androidx.compose.ui.unit.Dp, maxSmallItemWidth: androidx.compose.ui.unit.Dp, contentPadding: androidx.compose.foundation.layout.PaddingValues, content: kotlin.Function2<androidx.compose.material3.carousel.CarouselItemScope, kotlin.Int, kotlin.Unit>)
internal object RendererHorizontalMultiBrowseCarousel {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeCarouselState(node) else null
    val mask = (if (node.has("itemSpacing")) 1 else 0) +
      (if (node.has("minSmallItemWidth")) 2 else 0) +
      (if (node.has("maxSmallItemWidth")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0)
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
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      3 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      4 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      5 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      6 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      7 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      8 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      9 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      10 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      11 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      12 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      13 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      14 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      15 -> androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel(
        `state` = requireNotNull(stateValue),
        `preferredItemWidth` = node.number("preferredItemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `minSmallItemWidth` = node.number("minSmallItemWidth").dp,
        `maxSmallItemWidth` = node.number("maxSmallItemWidth").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.pager.HorizontalPager(state: androidx.compose.foundation.pager.PagerState, modifier: androidx.compose.ui.Modifier, contentPadding: androidx.compose.foundation.layout.PaddingValues, pageSize: androidx.compose.foundation.pager.PageSize, beyondViewportPageCount: kotlin.Int, pageSpacing: androidx.compose.ui.unit.Dp, verticalAlignment: androidx.compose.ui.Alignment.Vertical, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, userScrollEnabled: kotlin.Boolean, reverseLayout: kotlin.Boolean, key: kotlin.Function1<kotlin.Int, kotlin.Any>?, pageNestedScrollConnection: androidx.compose.ui.input.nestedscroll.NestedScrollConnection, snapPosition: androidx.compose.foundation.gestures.snapping.SnapPosition, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, pageContent: kotlin.Function2<androidx.compose.foundation.pager.PagerScope, kotlin.Int, kotlin.Unit>)
internal object RendererHorizontalPager {
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
      31 -> renderHorizontalPagerGroup31(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      0 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      1 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      2 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      4 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      5 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      6 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      8 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      9 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      10 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      12 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      13 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      14 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      16 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      17 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      20 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      21 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      24 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      25 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      28 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      29 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      32 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      33 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      34 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      36 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      37 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      38 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      40 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      41 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      42 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      44 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      45 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      46 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      48 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      49 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      52 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      53 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      56 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      57 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      60 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      61 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      64 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      65 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      66 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      68 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      69 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      70 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      72 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      73 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      74 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      76 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      77 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      78 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      80 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      81 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      84 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      85 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      88 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      89 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      92 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      93 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      96 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      97 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      98 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      100 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      101 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      102 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      104 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      105 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      106 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      108 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      109 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      110 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      112 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      113 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      116 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      117 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      120 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      121 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      124 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      125 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      128 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      129 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      132 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      133 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      136 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      137 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      140 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      141 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      144 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      145 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      148 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      149 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      152 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      153 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      156 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      157 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      160 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      161 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      164 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      165 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      168 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      169 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      172 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      173 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      176 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      177 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      180 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      181 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      184 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      185 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      188 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      189 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      192 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      193 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      196 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      197 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      200 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      201 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      204 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      205 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      208 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      209 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      212 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      213 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      216 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      217 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      220 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      221 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      224 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      225 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      228 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      229 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      232 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      233 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      236 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      237 -> androidx.compose.foundation.pager.HorizontalPager(
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
      240 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      241 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      244 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      245 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      248 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      249 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      252 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      253 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      255 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").toComposeNestedScrollConnection(),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderHorizontalPagerGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      256 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      258 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      260 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      264 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      268 -> androidx.compose.foundation.pager.HorizontalPager(
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
  private fun renderHorizontalPagerGroup9(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      288 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      292 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      296 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      300 -> androidx.compose.foundation.pager.HorizontalPager(
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
  private fun renderHorizontalPagerGroup10(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      320 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      324 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      328 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      332 -> androidx.compose.foundation.pager.HorizontalPager(
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
  private fun renderHorizontalPagerGroup11(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      352 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      356 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      360 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `snapPosition` = toComposeSnapPosition(node.string("snapPosition")),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      364 -> androidx.compose.foundation.pager.HorizontalPager(
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
  private fun renderHorizontalPagerGroup15(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      509 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
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
  private fun renderHorizontalPagerGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      512 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      514 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      516 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      520 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      524 -> androidx.compose.foundation.pager.HorizontalPager(
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
  private fun renderHorizontalPagerGroup17(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      544 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      548 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      552 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      556 -> androidx.compose.foundation.pager.HorizontalPager(
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
  private fun renderHorizontalPagerGroup18(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      576 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      580 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      584 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      588 -> androidx.compose.foundation.pager.HorizontalPager(
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
  private fun renderHorizontalPagerGroup19(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      608 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      612 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      616 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `pageSpacing` = node.number("pageSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      620 -> androidx.compose.foundation.pager.HorizontalPager(
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
  private fun renderHorizontalPagerGroup23(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      765 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
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
  private fun renderHorizontalPagerGroup24(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      768 -> androidx.compose.foundation.pager.HorizontalPager(
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
  private fun renderHorizontalPagerGroup31(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      1023 -> androidx.compose.foundation.pager.HorizontalPager(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `pageSize` = node.jsonObject("pageSize").toComposePageSize(),
        `beyondViewportPageCount` = node.number("beyondViewportPageCount").toInt(),
        `pageSpacing` = node.number("pageSpacing").dp,
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
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

// androidx.compose.material3.carousel.HorizontalUncontainedCarousel(state: androidx.compose.material3.carousel.CarouselState, itemWidth: androidx.compose.ui.unit.Dp, modifier: androidx.compose.ui.Modifier, itemSpacing: androidx.compose.ui.unit.Dp, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, contentPadding: androidx.compose.foundation.layout.PaddingValues, content: kotlin.Function2<androidx.compose.material3.carousel.CarouselItemScope, kotlin.Int, kotlin.Unit>)
internal object RendererHorizontalUncontainedCarousel {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeCarouselState(node) else null
    val mask = (if (node.has("itemSpacing")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0)
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
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      3 -> androidx.compose.material3.carousel.HorizontalUncontainedCarousel(
        `state` = requireNotNull(stateValue),
        `itemWidth` = node.number("itemWidth").dp,
        `modifier` = node.modifier("modifier", scope),
        `itemSpacing` = node.number("itemSpacing").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Icon(painter: androidx.compose.ui.graphics.painter.Painter, contentDescription: kotlin.String?, modifier: androidx.compose.ui.Modifier, tint: androidx.compose.ui.graphics.Color)
internal object RendererIcon {
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
internal object RendererIcon_1 {
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
      (if (node.has("interactionSource")) 2 else 0) +
      (if (node.has("shape")) 4 else 0)
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.IconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
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
      (if (node.has("interactionSource")) 2 else 0) +
      (if (node.has("shape")) 4 else 0)
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.IconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.Image(painter: androidx.compose.ui.graphics.painter.Painter, contentDescription: kotlin.String?, modifier: androidx.compose.ui.Modifier, alignment: androidx.compose.ui.Alignment, contentScale: androidx.compose.ui.layout.ContentScale, alpha: kotlin.Float, colorFilter: androidx.compose.ui.graphics.ColorFilter?)
internal object RendererImage {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("alignment")) 1 else 0) +
      (if (node.has("contentScale")) 2 else 0) +
      (if (node.has("alpha")) 4 else 0)
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

// androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(state: androidx.compose.material3.pulltorefresh.PullToRefreshState, isRefreshing: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, color: androidx.compose.ui.graphics.Color, threshold: androidx.compose.ui.unit.Dp)
internal object RendererIndicator_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("color")) 2 else 0) +
      (if (node.has("threshold")) 4 else 0)
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
        `threshold` = node.number("threshold").dp,
      )
      5 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `threshold` = node.number("threshold").dp,
      )
      6 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `threshold` = node.number("threshold").dp,
      )
      7 -> androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator(
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `isRefreshing` = node.boolean("isRefreshing"),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `color` = node.color("color"),
        `threshold` = node.number("threshold").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox(state: androidx.compose.material3.pulltorefresh.PullToRefreshState, isRefreshing: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, threshold: androidx.compose.ui.unit.Dp, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.BoxScope, kotlin.Unit>)
internal object RendererIndicatorBox {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("threshold")) 1 else 0) +
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
        `threshold` = node.number("threshold").dp,
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
        `threshold` = node.number("threshold").dp,
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
        `threshold` = node.number("threshold").dp,
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
        `threshold` = node.number("threshold").dp,
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
        `threshold` = node.number("threshold").dp,
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
        `threshold` = node.number("threshold").dp,
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
        `threshold` = node.number("threshold").dp,
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
        `threshold` = node.number("threshold").dp,
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.number("elevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.InputChip(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, avatar: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SelectableChipColors, elevation: androidx.compose.material3.SelectableChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererInputChip {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("leadingIcon")) 2 else 0) +
      (if (node.has("avatar")) 4 else 0) +
      (if (node.has("trailingIcon")) 8 else 0) +
      (if (node.has("shape")) 16 else 0) +
      (if (node.has("border")) 32 else 0) +
      (if (node.has("interactionSource")) 64 else 0)
    when (mask / 32) {
      0 -> renderInputChipGroup0(node, scope, mask)
      1 -> renderInputChipGroup1(node, scope, mask)
      2 -> renderInputChipGroup2(node, scope, mask)
      3 -> renderInputChipGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderInputChipGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      3 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      4 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      )
      5 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      )
      6 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      )
      7 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      )
      8 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      9 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      10 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      11 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      12 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      13 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      14 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      15 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      16 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      17 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      18 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      19 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      20 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
      )
      21 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
      )
      22 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
      )
      23 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
      )
      24 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      25 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      26 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      27 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      28 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      29 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      30 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      31 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderInputChipGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      33 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      34 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      35 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      36 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      37 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      38 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      39 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      40 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      41 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      42 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      43 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      44 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      45 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      46 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      47 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      48 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      49 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      50 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      51 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      52 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      53 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      54 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      55 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      56 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      57 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      58 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      59 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      60 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      61 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      62 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      63 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderInputChipGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      65 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      66 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      67 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      68 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      69 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      70 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      71 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      72 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      73 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      74 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      75 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      76 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      77 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      78 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      79 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      80 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      81 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      82 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      83 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      84 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      85 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      86 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      87 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      88 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      89 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      90 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      91 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      92 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      93 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      94 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      95 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderInputChipGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      97 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      98 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      99 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      100 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      101 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      102 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      103 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      104 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      105 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      106 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      107 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      108 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      109 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      110 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      111 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      112 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      113 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      114 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      115 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      116 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      117 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      118 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      119 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      120 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      121 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      122 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      123 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      124 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      125 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      126 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      127 -> androidx.compose.material3.InputChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
