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

// androidx.compose.material3.LargeFlexibleTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, subtitle: kotlin.Function0<kotlin.Unit>?, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, titleHorizontalAlignment: androidx.compose.ui.Alignment.Horizontal, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererLargeFlexibleTopAppBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("subtitle")) 1 else 0) +
      (if (node.has("navigationIcon")) 2 else 0) +
      (if (node.has("actions")) 4 else 0) +
      (if (node.has("titleHorizontalAlignment")) 8 else 0) +
      (if (node.has("collapsedHeight")) 16 else 0) +
      (if (node.has("expandedHeight")) 32 else 0) +
      (if (node.has("windowInsets")) 64 else 0)
    when (mask / 32) {
      0 -> renderLargeFlexibleTopAppBarGroup0(node, scope, mask)
      1 -> renderLargeFlexibleTopAppBarGroup1(node, scope, mask)
      2 -> renderLargeFlexibleTopAppBarGroup2(node, scope, mask)
      3 -> renderLargeFlexibleTopAppBarGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
      )
      2 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      3 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      4 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      5 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      6 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      7 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      8 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      9 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      10 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      11 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      12 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      13 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      14 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      15 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      16 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      17 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      18 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      19 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      20 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      21 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      22 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      23 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      24 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      25 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      26 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      27 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      28 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      29 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      30 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      31 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      33 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      34 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      35 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      36 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      37 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      38 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      39 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      40 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      41 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      42 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      43 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      44 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      45 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      46 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      47 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      48 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      49 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      50 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      51 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      52 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      53 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      54 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      55 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      56 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      57 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      58 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      59 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      60 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      61 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      62 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      63 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      65 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      66 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      67 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      68 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      69 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      70 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      71 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      72 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      73 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      74 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      75 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      76 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      77 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      78 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      79 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      80 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      81 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      82 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      83 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      84 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      85 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      86 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      87 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      88 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      89 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      90 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      91 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      92 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      93 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      94 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      95 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLargeFlexibleTopAppBarGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      97 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      98 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      99 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      100 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      101 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      102 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      103 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      104 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      105 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      106 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      107 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      108 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      109 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      110 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      111 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      112 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      113 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      114 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      115 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      116 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      117 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      118 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      119 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      120 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      121 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      122 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      123 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      124 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      125 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      126 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      127 -> androidx.compose.material3.LargeFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LargeFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererLargeFloatingActionButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.LargeFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.LargeFloatingActionButton(
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

// androidx.compose.material3.LargeTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererLargeTopAppBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("navigationIcon")) 1 else 0) +
      (if (node.has("actions")) 2 else 0) +
      (if (node.has("collapsedHeight")) 4 else 0) +
      (if (node.has("expandedHeight")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      2 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      3 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      4 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      5 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      6 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      7 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      8 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      9 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      10 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      11 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      12 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      13 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      14 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      15 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      16 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      17 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      18 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      19 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      20 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      21 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      22 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      23 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      24 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      25 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      26 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      27 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      28 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      29 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      30 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      31 -> androidx.compose.material3.LargeTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.LazyColumn(modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.LazyListState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalAlignment: androidx.compose.ui.Alignment.Horizontal, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>)
internal object RendererLazyColumn {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyListState() else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalArrangement")) 8 else 0) +
      (if (node.has("horizontalAlignment")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyColumnGroup0(node, scope, mask, stateValue)
      1 -> renderLazyColumnGroup1(node, scope, mask, stateValue)
      2 -> renderLazyColumnGroup2(node, scope, mask, stateValue)
      3 -> renderLazyColumnGroup3(node, scope, mask, stateValue)
      4 -> renderLazyColumnGroup4(node, scope, mask, stateValue)
      5 -> renderLazyColumnGroup5(node, scope, mask, stateValue)
      6 -> renderLazyColumnGroup6(node, scope, mask, stateValue)
      7 -> renderLazyColumnGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      34 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      35 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      38 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      39 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      65 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      66 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      67 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      68 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      69 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      70 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      71 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      72 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      73 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      74 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      75 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      76 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      77 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      78 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      79 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      80 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      81 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      82 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      83 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      84 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      85 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      86 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      87 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      88 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      89 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      90 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      91 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      92 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      93 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      94 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      95 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      97 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      98 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      99 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      100 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      101 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      102 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      103 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      127 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      129 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      130 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      131 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      132 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      133 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      134 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      135 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      193 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      194 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      195 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      196 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      197 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      198 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      199 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      223 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyColumnGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.LazyColumn(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(rows: androidx.compose.foundation.lazy.grid.GridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.grid.LazyGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit>)
internal object RendererLazyHorizontalGrid {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyGridState() else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("horizontalArrangement")) 8 else 0) +
      (if (node.has("verticalArrangement")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyHorizontalGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyHorizontalGridGroup1(node, scope, mask, stateValue)
      2 -> renderLazyHorizontalGridGroup2(node, scope, mask, stateValue)
      3 -> renderLazyHorizontalGridGroup3(node, scope, mask, stateValue)
      4 -> renderLazyHorizontalGridGroup4(node, scope, mask, stateValue)
      5 -> renderLazyHorizontalGridGroup5(node, scope, mask, stateValue)
      6 -> renderLazyHorizontalGridGroup6(node, scope, mask, stateValue)
      7 -> renderLazyHorizontalGridGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      34 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      35 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      38 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      39 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      65 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      66 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      67 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      68 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      69 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      70 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      71 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      72 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      73 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      74 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      75 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      76 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      77 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      78 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      79 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      80 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      81 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      82 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      83 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      84 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      85 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      86 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      87 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      88 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      89 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      90 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      91 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      92 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      93 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      94 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      95 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      97 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      98 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      99 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      100 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      101 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      102 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      103 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      127 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      129 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      130 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      131 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      132 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      133 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      134 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      135 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      193 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      194 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      195 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      196 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      197 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      198 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      199 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      223 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalGridGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.grid.LazyHorizontalGrid(
        `rows` = node.jsonObject("rows").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(rows: androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalItemSpacing: androidx.compose.ui.unit.Dp, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit>)
internal object RendererLazyHorizontalStaggeredGrid {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyStaggeredGridState() else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalArrangement")) 8 else 0) +
      (if (node.has("horizontalItemSpacing")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyHorizontalStaggeredGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyHorizontalStaggeredGridGroup1(node, scope, mask, stateValue)
      2 -> renderLazyHorizontalStaggeredGridGroup2(node, scope, mask, stateValue)
      3 -> renderLazyHorizontalStaggeredGridGroup3(node, scope, mask, stateValue)
      4 -> renderLazyHorizontalStaggeredGridGroup4(node, scope, mask, stateValue)
      5 -> renderLazyHorizontalStaggeredGridGroup5(node, scope, mask, stateValue)
      6 -> renderLazyHorizontalStaggeredGridGroup6(node, scope, mask, stateValue)
      7 -> renderLazyHorizontalStaggeredGridGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      48 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      49 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      52 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      53 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      65 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      66 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      67 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      68 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      69 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      70 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      71 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      72 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      73 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      74 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      75 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      76 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      77 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      78 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      79 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      80 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      81 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      82 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      83 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      84 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      85 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      86 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      87 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      88 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      89 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      90 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      91 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      92 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      93 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      94 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      95 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      97 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      100 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      101 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      112 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      113 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      116 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      117 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      127 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      129 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      132 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      133 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      144 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      145 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      148 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      149 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      193 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      196 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      197 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      208 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      209 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      212 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      213 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      223 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyHorizontalStaggeredGridGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid(
        `rows` = node.jsonObject("rows").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalItemSpacing` = node.number("horizontalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.LazyRow(modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.LazyListState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, verticalAlignment: androidx.compose.ui.Alignment.Vertical, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>)
internal object RendererLazyRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyListState() else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("horizontalArrangement")) 8 else 0) +
      (if (node.has("verticalAlignment")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyRowGroup0(node, scope, mask, stateValue)
      1 -> renderLazyRowGroup1(node, scope, mask, stateValue)
      2 -> renderLazyRowGroup2(node, scope, mask, stateValue)
      3 -> renderLazyRowGroup3(node, scope, mask, stateValue)
      4 -> renderLazyRowGroup4(node, scope, mask, stateValue)
      5 -> renderLazyRowGroup5(node, scope, mask, stateValue)
      6 -> renderLazyRowGroup6(node, scope, mask, stateValue)
      7 -> renderLazyRowGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      34 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      35 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      38 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      39 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      65 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      66 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      67 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      68 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      69 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      70 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      71 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      72 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      73 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      74 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      75 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      76 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      77 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      78 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      79 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      80 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      81 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      82 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      83 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      84 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      85 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      86 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      87 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      88 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      89 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      90 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      91 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      92 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      93 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      94 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      95 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      97 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      98 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      99 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      100 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      101 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      102 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      103 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      127 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      129 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      130 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      131 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      132 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      133 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      134 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      135 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      193 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      194 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      195 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      196 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      197 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      198 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      199 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      223 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyRowGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.LazyListState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.LazyRow(
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.grid.LazyVerticalGrid(columns: androidx.compose.foundation.lazy.grid.GridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.grid.LazyGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit>)
internal object RendererLazyVerticalGrid {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyGridState() else null
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentPadding")) 2 else 0) +
      (if (node.has("reverseLayout")) 4 else 0) +
      (if (node.has("verticalArrangement")) 8 else 0) +
      (if (node.has("horizontalArrangement")) 16 else 0) +
      (if (node.has("flingBehavior")) 32 else 0) +
      (if (node.has("userScrollEnabled")) 64 else 0) +
      (if (node.has("overscrollEffect")) 128 else 0)
    when (mask / 32) {
      0 -> renderLazyVerticalGridGroup0(node, scope, mask, stateValue)
      1 -> renderLazyVerticalGridGroup1(node, scope, mask, stateValue)
      2 -> renderLazyVerticalGridGroup2(node, scope, mask, stateValue)
      3 -> renderLazyVerticalGridGroup3(node, scope, mask, stateValue)
      4 -> renderLazyVerticalGridGroup4(node, scope, mask, stateValue)
      5 -> renderLazyVerticalGridGroup5(node, scope, mask, stateValue)
      6 -> renderLazyVerticalGridGroup6(node, scope, mask, stateValue)
      7 -> renderLazyVerticalGridGroup7(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      0 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      34 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      35 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      38 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      39 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      65 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      66 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      67 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      68 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      69 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      70 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      71 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      72 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      73 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      74 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      75 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      76 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      77 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      78 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      79 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      80 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      81 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      82 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      83 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      84 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      85 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      86 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      87 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      88 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      89 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      90 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      91 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      92 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      93 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      94 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      95 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      97 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      98 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      99 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      100 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      101 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      102 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      103 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      127 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      129 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      130 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      131 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      132 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      133 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      134 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      135 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      193 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      194 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      195 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      196 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      197 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      198 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      199 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      223 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalGridGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.grid.LazyGridState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
        `columns` = node.jsonObject("columns").toGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(columns: androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, modifier: androidx.compose.ui.Modifier, state: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, contentPadding: androidx.compose.foundation.layout.PaddingValues, reverseLayout: kotlin.Boolean, verticalItemSpacing: androidx.compose.ui.unit.Dp, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior, userScrollEnabled: kotlin.Boolean, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, content: kotlin.Function1<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit>)
internal object RendererLazyVerticalStaggeredGrid {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeLazyStaggeredGridState() else null
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
      0 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        content = { renderLazyComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        content = { renderLazyComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { renderLazyComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        content = { renderLazyComposeChildren(node.children) },
      )
      8 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      9 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      10 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      11 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      12 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      13 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      14 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      15 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        content = { renderLazyComposeChildren(node.children) },
      )
      16 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      17 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      18 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      19 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      20 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      21 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      22 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      23 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      24 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      25 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      26 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      27 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      28 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      29 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      30 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      31 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      32 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      33 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      36 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      37 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      40 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      41 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      44 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      45 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      64 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      65 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      66 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      67 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      68 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      69 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      70 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      71 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      72 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      73 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      74 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      75 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      76 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      77 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      78 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      79 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      80 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      81 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      82 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      83 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      84 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      85 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      86 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      87 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      88 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      89 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      90 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      91 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      92 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      93 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      94 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      95 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      96 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      97 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      100 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      101 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      104 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      105 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      108 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      109 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      127 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      128 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      129 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      132 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      133 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      136 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      137 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      140 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      141 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      160 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      192 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      193 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      196 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      197 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      200 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      201 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      204 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      205 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      223 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderLazyVerticalStaggeredGridGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState?) {
    when (mask) {
      255 -> androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid(
        `columns` = node.jsonObject("columns").toStaggeredGridCells(),
        `modifier` = node.modifier("modifier", scope),
        `state` = requireNotNull(stateValue),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `reverseLayout` = node.boolean("reverseLayout"),
        `verticalItemSpacing` = node.number("verticalItemSpacing").dp,
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `flingBehavior` = node.jsonObject("flingBehavior").rememberComposeFlingBehavior(),
        `userScrollEnabled` = node.boolean("userScrollEnabled"),
        `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()),
        content = { renderLazyComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SplitButtonDefaults.LeadingButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererLeadingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("border")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.LeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
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
      (if (node.has("gapSize")) 4 else 0)
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
        `gapSize` = node.number("gapSize").dp,
      )
      5 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      6 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      7 -> androidx.compose.material3.LinearProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
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
      (if (node.has("gapSize")) 4 else 0) +
      (if (node.has("drawStopIndicator")) 8 else 0)
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
        `gapSize` = node.number("gapSize").dp,
      )
      5 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      6 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      7 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      8 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      9 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      10 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      11 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      12 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      13 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      14 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      15 -> androidx.compose.material3.LinearProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `drawStopIndicator` = node.jsonObject("drawStopIndicator").toComposeDrawing(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LinearWavyProgressIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Float, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererLinearWavyProgressIndicator {
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
      0 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      3 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      4 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      5 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      6 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      7 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      8 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      9 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      10 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      11 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      12 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      13 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      14 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      15 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      16 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
      )
      17 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
      )
      18 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      19 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      20 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      21 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      22 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      23 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      24 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      25 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      26 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      27 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      28 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      29 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      30 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      31 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLinearWavyProgressIndicatorGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      33 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      34 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      35 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      36 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      37 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      38 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      39 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      40 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      41 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      42 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      43 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      44 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      45 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      46 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      47 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      48 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      49 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      50 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      51 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      52 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      53 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      54 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      55 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      56 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      57 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      58 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      59 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      60 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      61 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      62 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      63 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.LinearWavyProgressIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, stopSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Function1<kotlin.Float, kotlin.Float>, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererLinearWavyProgressIndicator_1 {
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
      0 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      3 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      4 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      5 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      6 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      7 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      8 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `stopSize` = node.number("stopSize").dp,
      )
      9 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `stopSize` = node.number("stopSize").dp,
      )
      10 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
      )
      11 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
      )
      12 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
      )
      13 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
      )
      14 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
      )
      15 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
      )
      16 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
      )
      17 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
      )
      18 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      19 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      20 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      21 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      22 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      23 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      24 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      25 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      26 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      27 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      28 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      29 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      30 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      31 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderLinearWavyProgressIndicator_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      33 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      34 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      35 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      36 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      37 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      38 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      39 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      40 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      41 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      42 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      43 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      44 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      45 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      46 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      47 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      48 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      49 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      50 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      51 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      52 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      53 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      54 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      55 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      56 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      57 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      58 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      59 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      60 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      61 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      62 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      63 -> androidx.compose.material3.LinearWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `stopSize` = node.number("stopSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ListItem(headlineContent: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, overlineContent: kotlin.Function0<kotlin.Unit>?, supportingContent: kotlin.Function0<kotlin.Unit>?, leadingContent: kotlin.Function0<kotlin.Unit>?, trailingContent: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.ListItemColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp)
internal object RendererListItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("overlineContent")) 1 else 0) +
      (if (node.has("supportingContent")) 2 else 0) +
      (if (node.has("leadingContent")) 4 else 0) +
      (if (node.has("trailingContent")) 8 else 0) +
      (if (node.has("tonalElevation")) 16 else 0) +
      (if (node.has("shadowElevation")) 32 else 0)
    when (mask / 32) {
      0 -> renderListItemGroup0(node, scope, mask)
      1 -> renderListItemGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderListItemGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      )
      2 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      )
      3 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      )
      4 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      )
      5 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      )
      6 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      )
      7 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      )
      8 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      9 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      10 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      11 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      12 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      13 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      14 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      15 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
      )
      16 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      17 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      18 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      19 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      20 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      21 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      22 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      23 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      24 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      25 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      26 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      27 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      28 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      29 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      30 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      31 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderListItemGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      33 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      34 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      35 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      36 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      37 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      38 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      39 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      40 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      41 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      42 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      43 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      44 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      45 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      46 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      47 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      48 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      49 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      50 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      51 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      52 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      53 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      54 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      55 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      56 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      57 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      58 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      59 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      60 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      61 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      62 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      63 -> androidx.compose.material3.ListItem(
        `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
        `modifier` = node.modifier("modifier", scope),
        `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
        `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
        `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
        `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
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
    val mask = (if (node.has("colorScheme")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MaterialExpressiveTheme(
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.MaterialExpressiveTheme(
        `colorScheme` = if (node.isNull("colorScheme")) null else (node.jsonObject("colorScheme").toColorScheme()),
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

// androidx.compose.material3.MediumExtendedFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererMediumExtendedFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MediumExtendedFloatingActionButton(text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, expanded: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererMediumExtendedFloatingActionButton_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("expanded")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
      )
      2 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      3 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
      )
      4 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      5 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
      )
      6 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      7 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      8 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      9 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
      )
      10 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      11 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      12 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      13 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      14 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      15 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      16 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.MediumExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MediumFlexibleTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, subtitle: kotlin.Function0<kotlin.Unit>?, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, titleHorizontalAlignment: androidx.compose.ui.Alignment.Horizontal, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererMediumFlexibleTopAppBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("subtitle")) 1 else 0) +
      (if (node.has("navigationIcon")) 2 else 0) +
      (if (node.has("actions")) 4 else 0) +
      (if (node.has("titleHorizontalAlignment")) 8 else 0) +
      (if (node.has("collapsedHeight")) 16 else 0) +
      (if (node.has("expandedHeight")) 32 else 0) +
      (if (node.has("windowInsets")) 64 else 0)
    when (mask / 32) {
      0 -> renderMediumFlexibleTopAppBarGroup0(node, scope, mask)
      1 -> renderMediumFlexibleTopAppBarGroup1(node, scope, mask)
      2 -> renderMediumFlexibleTopAppBarGroup2(node, scope, mask)
      3 -> renderMediumFlexibleTopAppBarGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
      )
      2 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      3 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      4 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      5 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      6 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      7 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      8 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      9 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      10 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      11 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      12 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      13 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      14 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      15 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
      )
      16 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      17 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      18 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      19 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      20 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      21 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      22 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      23 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      24 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      25 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      26 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      27 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      28 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      29 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      30 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      31 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      33 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      34 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      35 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      36 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      37 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      38 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      39 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      40 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      41 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      42 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      43 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      44 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      45 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      46 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      47 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      48 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      49 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      50 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      51 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      52 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      53 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      54 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      55 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      56 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      57 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      58 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      59 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      60 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      61 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      62 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      63 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      65 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      66 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      67 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      68 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      69 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      70 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      71 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      72 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      73 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      74 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      75 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      76 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      77 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      78 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      79 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      80 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      81 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      82 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      83 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      84 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      85 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      86 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      87 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      88 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      89 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      90 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      91 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      92 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      93 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      94 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      95 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      97 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      98 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      99 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      100 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      101 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      102 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      103 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      104 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      105 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      106 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      107 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      108 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      109 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      110 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      111 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      112 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      113 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      114 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      115 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      116 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      117 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      118 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      119 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      120 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      121 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      122 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      123 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      124 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      125 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      126 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      127 -> androidx.compose.material3.MediumFlexibleTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `subtitle` = if (node.isNull("subtitle")) null else ({ RenderComposeChildren(node.slot("subtitle")) }),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
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
      (if (node.has("interactionSource")) 8 else 0)
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.MediumFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.MediumFloatingActionButton(
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

// androidx.compose.material3.MediumTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, collapsedHeight: androidx.compose.ui.unit.Dp, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererMediumTopAppBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("navigationIcon")) 1 else 0) +
      (if (node.has("actions")) 2 else 0) +
      (if (node.has("collapsedHeight")) 4 else 0) +
      (if (node.has("expandedHeight")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      2 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      3 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      4 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      5 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      6 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      7 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
      )
      8 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      9 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      10 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      11 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      12 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      13 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      14 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      15 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      16 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      17 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      18 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      19 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      20 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      21 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      22 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      23 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      24 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      25 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      26 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      27 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      28 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      29 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      30 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      31 -> androidx.compose.material3.MediumTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `collapsedHeight` = node.number("collapsedHeight").dp,
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
