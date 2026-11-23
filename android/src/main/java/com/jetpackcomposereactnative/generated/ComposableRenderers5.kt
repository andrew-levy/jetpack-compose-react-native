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

// androidx.compose.material3.CenterAlignedTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?, contentPadding: androidx.compose.foundation.layout.PaddingValues)
internal object RendererCenterAlignedTopAppBar {
  private fun decode_expandedHeight(node: ComposeNode) = node.number("expandedHeight").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scrollBehaviorValue = if (node.has("scrollBehavior") && !node.isNull("scrollBehavior")) node.jsonObject("scrollBehavior").rememberComposeTopAppBarScrollBehavior() else null
    val slot_title: @Composable () -> Unit = { RenderComposeChildren(node.slot("title")) }
    val slot_navigationIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("navigationIcon")) }
    val mask = (if (node.has("navigationIcon")) 1 else 0) +
      (if (node.has("actions")) 2 else 0) +
      (if (node.has("expandedHeight")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0) +
      (if (node.has("colors")) 16 else 0) +
      (if (node.has("scrollBehavior")) 32 else 0) +
      (if (node.has("contentPadding")) 64 else 0)
    when (mask / 32) {
      0 -> renderCenterAlignedTopAppBarGroup0(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      1 -> renderCenterAlignedTopAppBarGroup1(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      2 -> renderCenterAlignedTopAppBarGroup2(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      3 -> renderCenterAlignedTopAppBarGroup3(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCenterAlignedTopAppBarGroup0(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon)
      2 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      3 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      4 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node))
      5 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node))
      6 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      7 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      8 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      9 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      10 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      11 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      12 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      13 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      14 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      15 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      16 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      17 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      18 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      19 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      20 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      21 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      22 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      23 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      24 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      25 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      26 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      27 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      28 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      29 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      30 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      31 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCenterAlignedTopAppBarGroup1(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      33 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      34 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      35 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      36 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      37 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      38 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      39 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      40 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      41 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      42 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      43 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      44 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      45 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      46 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      47 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      48 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      49 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      50 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      51 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      52 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      53 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      54 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      55 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      56 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      57 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      58 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      59 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      60 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      61 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      62 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      63 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCenterAlignedTopAppBarGroup2(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      65 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      66 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      67 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      68 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      69 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      70 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      71 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      72 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      73 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      74 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      75 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      76 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      77 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      78 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      79 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      80 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      81 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      82 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      83 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      84 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      85 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      86 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      87 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      88 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      89 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      90 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      91 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      92 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      93 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      94 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      95 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCenterAlignedTopAppBarGroup3(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      97 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      98 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      99 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      100 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      101 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      102 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      103 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      104 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      105 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      106 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      107 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      108 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      109 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      110 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      111 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      112 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      113 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      114 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      115 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      116 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      117 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      118 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      119 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      120 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      121 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      122 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      123 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      124 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      125 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      126 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      127 -> androidx.compose.material3.CenterAlignedTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `colors` = node.jsonObject("colors").decodeComposeTopAppBarColorsValue(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SliderDefaults.CenteredTrack(sliderState: androidx.compose.material3.SliderState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, drawStopIndicator: kotlin.Function2<androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.geometry.Offset, kotlin.Unit>?, drawTick: kotlin.Function3<androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.geometry.Offset, androidx.compose.ui.graphics.Color, kotlin.Unit>, thumbTrackGapSize: androidx.compose.ui.unit.Dp, trackInsideCornerSize: androidx.compose.ui.unit.Dp, trackCornerSize: androidx.compose.ui.unit.Dp)
internal object RendererCenteredTrack {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("thumbTrackGapSize")) 4 else 0) +
      (if (node.has("trackInsideCornerSize")) 8 else 0) +
      (if (node.has("trackCornerSize")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      3 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      4 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      5 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      6 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      7 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      8 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      9 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      10 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      11 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      12 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      13 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      14 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      15 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      16 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      17 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      18 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      19 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      20 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      21 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      22 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      23 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      24 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      25 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      26 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      27 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      28 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      29 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      30 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      31 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.CheckableDropdownMenuItem(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, text: kotlin.Function0<kotlin.Unit>, shapes: androidx.compose.material3.MenuItemShapes, modifier: androidx.compose.ui.Modifier, leadingIcon: kotlin.Function0<kotlin.Unit>?, checkedLeadingIcon: kotlin.Function0<kotlin.Unit>?, trailingContent: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, enabled: kotlin.Boolean, colors: androidx.compose.material3.SelectableMenuItemColors, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererCheckableDropdownMenuItem {
  private fun decode_checked(node: ComposeNode) = node.boolean("checked")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_text: @Composable () -> Unit = { RenderComposeChildren(node.slot("text")) }
    val content_leadingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("leadingIcon")) }
    val slot_leadingIcon = if (node.isNull("leadingIcon")) null else content_leadingIcon
    val content_checkedLeadingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("checkedLeadingIcon")) }
    val slot_checkedLeadingIcon = if (node.isNull("checkedLeadingIcon")) null else content_checkedLeadingIcon
    val content_trailingContent: @Composable () -> Unit = { RenderComposeChildren(node.slot("trailingContent")) }
    val slot_trailingContent = if (node.isNull("trailingContent")) null else content_trailingContent
    val content_supportingText: @Composable () -> Unit = { RenderComposeChildren(node.slot("supportingText")) }
    val slot_supportingText = if (node.isNull("supportingText")) null else content_supportingText
    val mask = (if (node.has("leadingIcon")) 1 else 0) +
      (if (node.has("checkedLeadingIcon")) 2 else 0) +
      (if (node.has("trailingContent")) 4 else 0) +
      (if (node.has("supportingText")) 8 else 0) +
      (if (node.has("enabled")) 16 else 0) +
      (if (node.has("colors")) 32 else 0) +
      (if (node.has("horizontalArrangement")) 64 else 0) +
      (if (node.has("contentPadding")) 128 else 0) +
      (if (node.has("interactionSource")) 256 else 0)
    when (mask / 32) {
      0 -> renderCheckableDropdownMenuItemGroup0(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      1 -> renderCheckableDropdownMenuItemGroup1(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      2 -> renderCheckableDropdownMenuItemGroup2(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      4 -> renderCheckableDropdownMenuItemGroup4(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      6 -> renderCheckableDropdownMenuItemGroup6(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      7 -> renderCheckableDropdownMenuItemGroup7(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      8 -> renderCheckableDropdownMenuItemGroup8(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      10 -> renderCheckableDropdownMenuItemGroup10(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      11 -> renderCheckableDropdownMenuItemGroup11(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      12 -> renderCheckableDropdownMenuItemGroup12(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      13 -> renderCheckableDropdownMenuItemGroup13(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      14 -> renderCheckableDropdownMenuItemGroup14(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      15 -> renderCheckableDropdownMenuItemGroup15(node, scope, mask, slot_text, slot_leadingIcon, slot_checkedLeadingIcon, slot_trailingContent, slot_supportingText)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      2 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon)
      3 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon)
      4 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent)
      5 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent)
      6 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent)
      7 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent)
      8 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText)
      9 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      10 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText)
      11 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText)
      12 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText)
      13 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText)
      14 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText)
      15 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText)
      16 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      17 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node))
      18 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node))
      19 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node))
      20 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node))
      21 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node))
      22 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node))
      23 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node))
      24 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `enabled` = decode_enabled(node))
      25 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node))
      26 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node))
      27 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node))
      28 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node))
      29 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node))
      30 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node))
      31 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      33 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      34 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      35 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      36 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      37 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      38 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      39 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      40 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      41 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      42 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      43 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      44 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      45 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      46 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      47 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      48 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      49 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      50 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      51 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      52 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      53 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      54 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      55 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      56 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      57 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      58 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      59 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      60 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      61 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      62 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      63 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      65 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      66 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      67 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      68 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      69 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      70 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      71 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      72 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      73 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      74 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      75 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      76 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      77 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      78 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      79 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      80 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      81 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      82 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      83 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      84 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      85 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      86 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      87 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      88 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      89 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      90 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      91 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      92 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      93 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      94 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      95 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup4(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      129 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      130 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      132 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      133 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      134 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      135 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      136 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      137 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      138 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      139 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      140 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      141 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      142 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      143 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      144 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      145 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      146 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      147 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      148 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      149 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      150 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      151 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      152 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      153 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      154 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      155 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      156 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      157 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      158 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      159 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup6(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      192 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      193 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      194 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      195 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      196 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      197 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      198 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      199 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      200 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      201 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      202 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      203 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      204 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      205 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      206 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      207 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      208 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      209 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      210 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      211 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      212 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      213 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      214 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      215 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      216 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      217 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      218 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      219 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      220 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      221 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      222 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      223 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup7(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      255 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup8(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      256 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      257 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      258 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      259 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      260 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      261 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      263 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      264 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      265 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      266 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      267 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      268 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      269 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      270 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      271 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      272 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      273 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      274 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      275 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      276 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      277 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      278 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      279 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      280 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      281 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      282 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      283 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      284 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      285 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      286 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      287 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup10(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      320 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      321 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      322 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      323 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      324 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      325 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      326 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      327 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      328 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      329 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      330 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      331 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      332 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      333 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      334 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      335 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      336 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      337 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      338 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      339 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      340 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      341 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      342 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      343 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      344 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      345 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      346 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      347 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      348 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      349 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      350 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      351 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup11(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      383 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup12(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      384 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      385 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      386 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      387 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      388 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      389 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      390 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      391 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      392 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      393 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      394 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      395 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      396 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      397 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      398 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      399 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      400 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      401 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      402 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      403 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      404 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      405 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      406 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      407 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      408 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      409 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      410 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      411 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      412 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      413 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      414 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      415 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup13(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      447 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup14(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      448 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      449 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      450 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      451 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      452 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      453 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      454 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      455 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      456 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      457 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      458 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      459 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      460 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      461 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      462 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      463 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      464 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      465 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      466 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      467 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      468 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      469 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      470 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      471 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      472 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      473 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      474 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      475 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      476 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      477 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      478 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      479 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCheckableDropdownMenuItemGroup15(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_checkedLeadingIcon: (@Composable () -> Unit)?, slot_trailingContent: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      495 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      503 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      507 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      509 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      510 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      511 -> androidx.compose.material3.CheckableDropdownMenuItem(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `text` = slot_text, `shapes` = node.jsonObject("shapes").decodeComposeMenuItemShapesValue(), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `checkedLeadingIcon` = slot_checkedLeadingIcon, `trailingContent` = slot_trailingContent, `supportingText` = slot_supportingText, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableMenuItemColorsValue(), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Checkbox(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>?, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.CheckboxColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererCheckbox {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
      )
      3 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
      )
      4 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      5 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      6 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      7 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Checkbox(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>?, checkmarkStroke: androidx.compose.ui.graphics.drawscope.Stroke, outlineStroke: androidx.compose.ui.graphics.drawscope.Stroke, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.CheckboxColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererCheckbox_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `checkmarkStroke` = node.jsonObject("checkmarkStroke").decodeComposeStrokeValue(),
        `outlineStroke` = node.jsonObject("outlineStroke").decodeComposeStrokeValue(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `checkmarkStroke` = node.jsonObject("checkmarkStroke").decodeComposeStrokeValue(),
        `outlineStroke` = node.jsonObject("outlineStroke").decodeComposeStrokeValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `checkmarkStroke` = node.jsonObject("checkmarkStroke").decodeComposeStrokeValue(),
        `outlineStroke` = node.jsonObject("outlineStroke").decodeComposeStrokeValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
      )
      3 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `checkmarkStroke` = node.jsonObject("checkmarkStroke").decodeComposeStrokeValue(),
        `outlineStroke` = node.jsonObject("outlineStroke").decodeComposeStrokeValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
      )
      4 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `checkmarkStroke` = node.jsonObject("checkmarkStroke").decodeComposeStrokeValue(),
        `outlineStroke` = node.jsonObject("outlineStroke").decodeComposeStrokeValue(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      5 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `checkmarkStroke` = node.jsonObject("checkmarkStroke").decodeComposeStrokeValue(),
        `outlineStroke` = node.jsonObject("outlineStroke").decodeComposeStrokeValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      6 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `checkmarkStroke` = node.jsonObject("checkmarkStroke").decodeComposeStrokeValue(),
        `outlineStroke` = node.jsonObject("outlineStroke").decodeComposeStrokeValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      7 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `checkmarkStroke` = node.jsonObject("checkmarkStroke").decodeComposeStrokeValue(),
        `outlineStroke` = node.jsonObject("outlineStroke").decodeComposeStrokeValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.CircularProgressIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, strokeWidth: androidx.compose.ui.unit.Dp, trackColor: androidx.compose.ui.graphics.Color, strokeCap: androidx.compose.ui.graphics.StrokeCap, gapSize: androidx.compose.ui.unit.Dp)
internal object RendererCircularProgressIndicator {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("strokeWidth")) 2 else 0) +
      (if (node.has("trackColor")) 4 else 0) +
      (if (node.has("strokeCap")) 8 else 0) +
      (if (node.has("gapSize")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
      )
      3 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
      )
      4 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      5 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      6 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
      )
      7 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
      )
      8 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      9 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      10 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      11 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      12 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      13 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      14 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      15 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      16 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      17 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      18 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `gapSize` = node.number("gapSize").dp,
      )
      19 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `gapSize` = node.number("gapSize").dp,
      )
      20 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      21 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      22 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      23 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      24 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      25 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      26 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      27 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      28 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      29 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      30 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      31 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.CircularProgressIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, strokeWidth: androidx.compose.ui.unit.Dp, trackColor: androidx.compose.ui.graphics.Color, strokeCap: androidx.compose.ui.graphics.StrokeCap, gapSize: androidx.compose.ui.unit.Dp)
internal object RendererCircularProgressIndicator_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("strokeWidth")) 2 else 0) +
      (if (node.has("trackColor")) 4 else 0) +
      (if (node.has("strokeCap")) 8 else 0) +
      (if (node.has("gapSize")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
      )
      3 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
      )
      4 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      5 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      6 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
      )
      7 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
      )
      8 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      9 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      10 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      11 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      12 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      13 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      14 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      15 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
      )
      16 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      17 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      18 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `gapSize` = node.number("gapSize").dp,
      )
      19 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `gapSize` = node.number("gapSize").dp,
      )
      20 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      21 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      22 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      23 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      24 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      25 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      26 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      27 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      28 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      29 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      30 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      31 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `strokeCap` = toComposeStrokeCapValue(node.string("strokeCap")),
        `gapSize` = node.number("gapSize").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.CircularWavyProgressIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Float, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererCircularWavyProgressIndicator {
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_trackColor(node: ComposeNode) = node.color("trackColor")
  private fun decode_gapSize(node: ComposeNode) = node.number("gapSize").dp
  private fun decode_amplitude(node: ComposeNode) = node.number("amplitude").toFloat()
  private fun decode_wavelength(node: ComposeNode) = node.number("wavelength").dp
  private fun decode_waveSpeed(node: ComposeNode) = node.number("waveSpeed").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("stroke")) 4 else 0) +
      (if (node.has("trackStroke")) 8 else 0) +
      (if (node.has("gapSize")) 16 else 0) +
      (if (node.has("amplitude")) 32 else 0) +
      (if (node.has("wavelength")) 64 else 0) +
      (if (node.has("waveSpeed")) 128 else 0)
    when (mask / 32) {
      0 -> renderCircularWavyProgressIndicatorGroup0(node, scope, mask)
      1 -> renderCircularWavyProgressIndicatorGroup1(node, scope, mask)
      2 -> renderCircularWavyProgressIndicatorGroup2(node, scope, mask)
      3 -> renderCircularWavyProgressIndicatorGroup3(node, scope, mask)
      4 -> renderCircularWavyProgressIndicatorGroup4(node, scope, mask)
      5 -> renderCircularWavyProgressIndicatorGroup5(node, scope, mask)
      6 -> renderCircularWavyProgressIndicatorGroup6(node, scope, mask)
      7 -> renderCircularWavyProgressIndicatorGroup7(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node))
      2 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node))
      3 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node))
      4 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      5 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      6 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      7 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      8 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      9 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      10 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      11 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      12 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      13 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      14 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      15 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      16 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node))
      17 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node))
      18 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      19 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      20 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      21 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      22 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      23 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      24 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      25 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      26 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      27 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      28 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      29 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      30 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      31 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node))
      33 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node))
      34 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node))
      35 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node))
      36 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      37 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      38 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      39 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      40 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      41 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      42 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      43 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      44 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      45 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      46 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      47 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node))
      48 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      49 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      50 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      51 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      52 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      53 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      54 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      55 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      56 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      57 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      58 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      59 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      60 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      61 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      62 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      63 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node))
      65 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node))
      66 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      67 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      68 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      69 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      70 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      71 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      72 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      73 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      74 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      75 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      76 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      77 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      78 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      79 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      80 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      81 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      82 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      83 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      84 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      85 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      86 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      87 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      88 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      89 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      90 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      91 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      92 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      93 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      94 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      95 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      97 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      98 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      99 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      100 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      101 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      102 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      103 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      104 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      105 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      106 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      107 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      108 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      109 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      110 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      111 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      112 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      113 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      114 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      115 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      116 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      117 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      118 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      119 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      120 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      121 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      122 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      123 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      124 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      125 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      126 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      127 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `waveSpeed` = decode_waveSpeed(node))
      129 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `waveSpeed` = decode_waveSpeed(node))
      130 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      131 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      132 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      133 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      134 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      135 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      136 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      137 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      138 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      139 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      140 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      141 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      142 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      143 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      144 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      145 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      146 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      147 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      148 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      149 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      150 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      151 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      152 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      153 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      154 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      155 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      156 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      157 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      158 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      159 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      161 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      162 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      163 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      164 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      165 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      166 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      167 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      168 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      169 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      170 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      171 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      172 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      173 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      174 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      175 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      176 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      177 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      178 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      179 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      180 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      181 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      182 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      183 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      184 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      185 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      186 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      187 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      188 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      189 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      190 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      191 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      193 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      194 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      195 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      196 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      197 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      198 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      199 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      200 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      201 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      202 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      203 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      204 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      205 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      206 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      207 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      208 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      209 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      210 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      211 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      212 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      213 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      214 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      215 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      216 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      217 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      218 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      219 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      220 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      221 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      222 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      223 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicatorGroup7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      225 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      226 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      227 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      228 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      229 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      230 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      231 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      232 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      233 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      234 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      235 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      236 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      237 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      238 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      239 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      240 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      241 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      242 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      243 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      244 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      245 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      246 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      247 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      248 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      249 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      250 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      251 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      252 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      253 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      254 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      255 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.CircularWavyProgressIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Function1<kotlin.Float, kotlin.Float>, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererCircularWavyProgressIndicator_1 {
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_trackColor(node: ComposeNode) = node.color("trackColor")
  private fun decode_gapSize(node: ComposeNode) = node.number("gapSize").dp
  private fun decode_wavelength(node: ComposeNode) = node.number("wavelength").dp
  private fun decode_waveSpeed(node: ComposeNode) = node.number("waveSpeed").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("stroke")) 4 else 0) +
      (if (node.has("trackStroke")) 8 else 0) +
      (if (node.has("gapSize")) 16 else 0) +
      (if (node.has("wavelength")) 32 else 0) +
      (if (node.has("waveSpeed")) 64 else 0)
    when (mask / 32) {
      0 -> renderCircularWavyProgressIndicator_1Group0(node, scope, mask)
      1 -> renderCircularWavyProgressIndicator_1Group1(node, scope, mask)
      2 -> renderCircularWavyProgressIndicator_1Group2(node, scope, mask)
      3 -> renderCircularWavyProgressIndicator_1Group3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node))
      2 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node))
      3 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node))
      4 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      5 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      6 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      7 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue())
      8 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      9 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      10 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      11 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      12 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      13 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      14 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      15 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue())
      16 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node))
      17 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node))
      18 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      19 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      20 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      21 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      22 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      23 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      24 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      25 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      26 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      27 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      28 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      29 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      30 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      31 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node))
      33 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node))
      34 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      35 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      36 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      37 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      38 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      39 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      40 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      41 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      42 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      43 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      44 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      45 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      46 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      47 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node))
      48 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      49 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      50 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      51 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      52 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      53 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      54 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      55 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      56 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      57 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      58 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      59 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      60 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      61 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      62 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      63 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `waveSpeed` = decode_waveSpeed(node))
      65 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `waveSpeed` = decode_waveSpeed(node))
      66 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      67 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      68 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      69 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      70 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      71 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      72 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      73 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      74 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      75 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      76 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      77 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      78 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      79 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `waveSpeed` = decode_waveSpeed(node))
      80 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      81 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      82 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      83 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      84 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      85 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      86 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      87 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      88 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      89 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      90 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      91 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      92 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      93 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      94 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      95 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCircularWavyProgressIndicator_1Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      97 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      98 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      99 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      100 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      101 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      102 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      103 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      104 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      105 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      106 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      107 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      108 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      109 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      110 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      111 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      112 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      113 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      114 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      115 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      116 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      117 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      118 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      119 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      120 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      121 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      122 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      123 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      124 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      125 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      126 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      127 -> androidx.compose.material3.CircularWavyProgressIndicator(`progress` = { node.number("progress").toFloat() }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `stroke` = node.jsonObject("stroke").decodeComposeStrokeValue(), `trackStroke` = node.jsonObject("trackStroke").decodeComposeStrokeValue(), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.ClickableText(text: androidx.compose.ui.text.AnnotatedString, modifier: androidx.compose.ui.Modifier, style: androidx.compose.ui.text.TextStyle, softWrap: kotlin.Boolean, overflow: androidx.compose.ui.text.style.TextOverflow, maxLines: kotlin.Int, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>, onClick: kotlin.Function1<kotlin.Int, kotlin.Unit>)
internal object RendererClickableText {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("composeTextStyle")) 1 else 0) +
      (if (node.has("softWrap")) 2 else 0) +
      (if (node.has("overflow")) 4 else 0) +
      (if (node.has("maxLines")) 8 else 0) +
      (if (node.has("onTextLayout")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      1 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      2 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      3 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      4 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      5 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      6 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      7 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      8 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      9 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      10 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      11 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      12 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      13 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      14 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      15 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      16 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      17 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      18 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      19 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      20 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      21 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      22 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      23 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      24 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      25 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      26 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      27 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      28 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      29 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      30 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      31 -> androidx.compose.foundation.text.ClickableText(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
        `softWrap` = node.boolean("softWrap"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) },
        `onClick` = { value: Int -> node.emit("onClick", value) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.Column(modifier: androidx.compose.ui.Modifier, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, horizontalAlignment: androidx.compose.ui.Alignment.Horizontal, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererColumn {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("verticalArrangement")) 1 else 0) +
      (if (node.has("horizontalAlignment")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.layout.Column(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.foundation.layout.Column(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.foundation.layout.Column(
        `modifier` = node.modifier("modifier", scope),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.foundation.layout.Column(
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.runtime.CompositionLocalProvider(vararg values: androidx.compose.runtime.ProvidedValue<*>, content: kotlin.Function0<kotlin.Unit>)
internal object RendererCompositionLocalProvider {
  @Composable
  fun render(node: ComposeNode) {
    androidx.compose.runtime.CompositionLocalProvider(
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.material3.ContainedLoadingIndicator(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, indicatorColor: androidx.compose.ui.graphics.Color, containerShape: androidx.compose.ui.graphics.Shape, polygons: kotlin.collections.List<androidx.graphics.shapes.RoundedPolygon>)
internal object RendererContainedLoadingIndicator {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("indicatorColor")) 2 else 0) +
      (if (node.has("containerShape")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      2 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `indicatorColor` = node.color("indicatorColor"),
      )
      3 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicatorColor` = node.color("indicatorColor"),
      )
      4 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `containerShape` = node.arguments().shape("containerShape"),
      )
      5 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `containerShape` = node.arguments().shape("containerShape"),
      )
      6 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `indicatorColor` = node.color("indicatorColor"),
        `containerShape` = node.arguments().shape("containerShape"),
      )
      7 -> androidx.compose.material3.ContainedLoadingIndicator(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicatorColor` = node.color("indicatorColor"),
        `containerShape` = node.arguments().shape("containerShape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ContainedLoadingIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, indicatorColor: androidx.compose.ui.graphics.Color, containerShape: androidx.compose.ui.graphics.Shape, polygons: kotlin.collections.List<androidx.graphics.shapes.RoundedPolygon>)
internal object RendererContainedLoadingIndicator_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("indicatorColor")) 2 else 0) +
      (if (node.has("containerShape")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      2 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `indicatorColor` = node.color("indicatorColor"),
      )
      3 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicatorColor` = node.color("indicatorColor"),
      )
      4 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `containerShape` = node.arguments().shape("containerShape"),
      )
      5 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `containerShape` = node.arguments().shape("containerShape"),
      )
      6 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `indicatorColor` = node.color("indicatorColor"),
        `containerShape` = node.arguments().shape("containerShape"),
      )
      7 -> androidx.compose.material3.ContainedLoadingIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicatorColor` = node.color("indicatorColor"),
        `containerShape` = node.arguments().shape("containerShape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedTextFieldDefaults.Container(enabled: kotlin.Boolean, isError: kotlin.Boolean, interactionSource: androidx.compose.foundation.interaction.InteractionSource, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.TextFieldColors, shape: androidx.compose.ui.graphics.Shape, focusedBorderThickness: androidx.compose.ui.unit.Dp, unfocusedBorderThickness: androidx.compose.ui.unit.Dp)
internal object RendererContainer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("colors")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("focusedBorderThickness")) 4 else 0) +
      (if (node.has("unfocusedBorderThickness")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
      )
      2 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      3 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
      )
      4 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      5 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      6 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      7 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      8 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      9 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      10 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      11 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      12 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      13 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      14 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      15 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TextFieldDefaults.Container(enabled: kotlin.Boolean, isError: kotlin.Boolean, interactionSource: androidx.compose.foundation.interaction.InteractionSource, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.TextFieldColors, shape: androidx.compose.ui.graphics.Shape, focusedIndicatorLineThickness: androidx.compose.ui.unit.Dp, unfocusedIndicatorLineThickness: androidx.compose.ui.unit.Dp)
internal object RendererContainer_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("colors")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("focusedIndicatorLineThickness")) 4 else 0) +
      (if (node.has("unfocusedIndicatorLineThickness")) 8 else 0)
    when (mask) {
      4 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
      )
      5 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
      )
      6 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
      )
      7 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
      )
      8 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      9 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      10 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      11 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      12 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      13 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      14 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      15 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(enabled: kotlin.Boolean, isError: kotlin.Boolean, interactionSource: androidx.compose.foundation.interaction.InteractionSource, colors: androidx.compose.material3.TextFieldColors, shape: androidx.compose.ui.graphics.Shape, focusedBorderThickness: androidx.compose.ui.unit.Dp, unfocusedBorderThickness: androidx.compose.ui.unit.Dp)
internal object RendererContainerBox {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("colors")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("focusedBorderThickness")) 4 else 0) +
      (if (node.has("unfocusedBorderThickness")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      1 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
      )
      2 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `shape` = node.arguments().shape("shape"),
      )
      3 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
      )
      4 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      5 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      6 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      7 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      8 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      9 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      10 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `shape` = node.arguments().shape("shape"),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      11 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      12 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      13 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      14 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      15 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.animation.Crossfade(targetState: T, modifier: androidx.compose.ui.Modifier, animationSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>, label: kotlin.String, content: kotlin.Function1<T, kotlin.Unit>)
internal object RendererCrossfade {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("animationSpec")) 1 else 0) +
      (if (node.has("label")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.animation.Crossfade(
        `targetState` = node.arguments().animationTarget("targetState"),
        `modifier` = node.modifier("modifier", scope),
        content = { state -> RenderComposeAnimationChild(node, state) },
      )
      1 -> androidx.compose.animation.Crossfade(
        `targetState` = node.arguments().animationTarget("targetState"),
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(),
        content = { state -> RenderComposeAnimationChild(node, state) },
      )
      2 -> androidx.compose.animation.Crossfade(
        `targetState` = node.arguments().animationTarget("targetState"),
        `modifier` = node.modifier("modifier", scope),
        `label` = node.string("label"),
        content = { state -> RenderComposeAnimationChild(node, state) },
      )
      3 -> androidx.compose.animation.Crossfade(
        `targetState` = node.arguments().animationTarget("targetState"),
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeFloatAnimationSpec(),
        `label` = node.string("label"),
        content = { state -> RenderComposeAnimationChild(node, state) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.animation.CustomizedLookaheadAnimationVisualDebugging(debugColor: androidx.compose.ui.graphics.Color, content: kotlin.Function0<kotlin.Unit>)
internal object RendererCustomizedLookaheadAnimationVisualDebugging {
  @OptIn(androidx.compose.animation.ExperimentalLookaheadAnimationVisualDebugApi::class)
  @Composable
  fun render(node: ComposeNode) {
    androidx.compose.animation.CustomizedLookaheadAnimationVisualDebugging(
      `debugColor` = node.color("debugColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.material3.DatePicker(state: androidx.compose.material3.DatePickerState, modifier: androidx.compose.ui.Modifier, dateFormatter: androidx.compose.material3.DatePickerFormatter, colors: androidx.compose.material3.DatePickerColors, title: kotlin.Function0<kotlin.Unit>?, headline: kotlin.Function0<kotlin.Unit>?, showModeToggle: kotlin.Boolean, focusRequester: androidx.compose.ui.focus.FocusRequester?)
internal object RendererDatePicker {
  private fun decode_showModeToggle(node: ComposeNode) = node.boolean("showModeToggle")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeDatePickerState() else null
    val content_title: @Composable () -> Unit = { RenderComposeChildren(node.slot("title")) }
    val slot_title = if (node.isNull("title")) null else content_title
    val content_headline: @Composable () -> Unit = { RenderComposeChildren(node.slot("headline")) }
    val slot_headline = if (node.isNull("headline")) null else content_headline
    val mask = (if (node.has("dateFormatter")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("title")) 4 else 0) +
      (if (node.has("headline")) 8 else 0) +
      (if (node.has("showModeToggle")) 16 else 0) +
      (if (node.has("focusRequester")) 32 else 0)
    when (mask / 32) {
      0 -> renderDatePickerGroup0(node, scope, mask, stateValue, slot_title, slot_headline)
      1 -> renderDatePickerGroup1(node, scope, mask, stateValue, slot_title, slot_headline)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDatePickerGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.DatePickerState?, slot_title: (@Composable () -> Unit)?, slot_headline: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter())
      2 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue())
      3 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue())
      4 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title)
      5 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title)
      6 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title)
      7 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title)
      8 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline)
      9 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline)
      10 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline)
      11 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline)
      12 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline)
      13 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline)
      14 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline)
      15 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline)
      16 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `showModeToggle` = decode_showModeToggle(node))
      17 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `showModeToggle` = decode_showModeToggle(node))
      18 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node))
      19 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node))
      20 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      21 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      22 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      23 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      24 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      25 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      26 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      27 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      28 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      29 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      30 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      31 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDatePickerGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.DatePickerState?, slot_title: (@Composable () -> Unit)?, slot_headline: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      33 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      34 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      35 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      36 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      37 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      38 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      39 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      40 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      41 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      42 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      43 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      44 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      45 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      46 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      47 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      48 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      49 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      50 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      51 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      52 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      53 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      54 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      55 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      56 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      57 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      58 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      59 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      60 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      61 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      62 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      63 -> androidx.compose.material3.DatePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DatePickerDialog(onDismissRequest: kotlin.Function0<kotlin.Unit>, confirmButton: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, dismissButton: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, tonalElevation: androidx.compose.ui.unit.Dp, colors: androidx.compose.material3.DatePickerColors, properties: androidx.compose.ui.window.DialogProperties, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererDatePickerDialog {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("dismissButton")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("properties")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.DatePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DatePickerDefaults.DatePickerHeadline(selectedDateMillis: kotlin.Long?, displayMode: androidx.compose.material3.DisplayMode, dateFormatter: androidx.compose.material3.DatePickerFormatter, modifier: androidx.compose.ui.Modifier, contentColor: androidx.compose.ui.graphics.Color)
internal object RendererDatePickerHeadline {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentColor")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DatePickerDefaults.DatePickerHeadline(
        `selectedDateMillis` = if (node.isNull("selectedDateMillis")) null else (node.number("selectedDateMillis").toLong()),
        `displayMode` = toComposeDisplayMode(node.string("displayMode")),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.DatePickerDefaults.DatePickerHeadline(
        `selectedDateMillis` = if (node.isNull("selectedDateMillis")) null else (node.number("selectedDateMillis").toLong()),
        `displayMode` = toComposeDisplayMode(node.string("displayMode")),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DatePickerDefaults.DatePickerTitle(displayMode: androidx.compose.material3.DisplayMode, modifier: androidx.compose.ui.Modifier, contentColor: androidx.compose.ui.graphics.Color)
internal object RendererDatePickerTitle {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentColor")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DatePickerDefaults.DatePickerTitle(
        `displayMode` = toComposeDisplayMode(node.string("displayMode")),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.DatePickerDefaults.DatePickerTitle(
        `displayMode` = toComposeDisplayMode(node.string("displayMode")),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DateRangePicker(state: androidx.compose.material3.DateRangePickerState, modifier: androidx.compose.ui.Modifier, dateFormatter: androidx.compose.material3.DatePickerFormatter, colors: androidx.compose.material3.DatePickerColors, title: kotlin.Function0<kotlin.Unit>?, headline: kotlin.Function0<kotlin.Unit>?, showModeToggle: kotlin.Boolean, focusRequester: androidx.compose.ui.focus.FocusRequester?)
internal object RendererDateRangePicker {
  private fun decode_showModeToggle(node: ComposeNode) = node.boolean("showModeToggle")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeDateRangePickerState() else null
    val content_title: @Composable () -> Unit = { RenderComposeChildren(node.slot("title")) }
    val slot_title = if (node.isNull("title")) null else content_title
    val content_headline: @Composable () -> Unit = { RenderComposeChildren(node.slot("headline")) }
    val slot_headline = if (node.isNull("headline")) null else content_headline
    val mask = (if (node.has("dateFormatter")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("title")) 4 else 0) +
      (if (node.has("headline")) 8 else 0) +
      (if (node.has("showModeToggle")) 16 else 0) +
      (if (node.has("focusRequester")) 32 else 0)
    when (mask / 32) {
      0 -> renderDateRangePickerGroup0(node, scope, mask, stateValue, slot_title, slot_headline)
      1 -> renderDateRangePickerGroup1(node, scope, mask, stateValue, slot_title, slot_headline)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDateRangePickerGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.DateRangePickerState?, slot_title: (@Composable () -> Unit)?, slot_headline: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter())
      2 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue())
      3 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue())
      4 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title)
      5 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title)
      6 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title)
      7 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title)
      8 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline)
      9 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline)
      10 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline)
      11 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline)
      12 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline)
      13 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline)
      14 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline)
      15 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline)
      16 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `showModeToggle` = decode_showModeToggle(node))
      17 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `showModeToggle` = decode_showModeToggle(node))
      18 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node))
      19 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node))
      20 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      21 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      22 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      23 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node))
      24 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      25 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      26 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      27 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      28 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      29 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      30 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      31 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDateRangePickerGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.DateRangePickerState?, slot_title: (@Composable () -> Unit)?, slot_headline: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      33 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      34 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      35 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      36 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      37 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      38 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      39 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      40 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      41 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      42 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      43 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      44 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      45 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      46 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      47 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      48 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      49 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      50 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      51 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      52 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      53 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      54 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      55 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      56 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      57 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      58 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      59 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      60 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      61 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      62 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      63 -> androidx.compose.material3.DateRangePicker(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(), `colors` = node.jsonObject("colors").decodeComposeDatePickerColorsValue(), `title` = slot_title, `headline` = slot_headline, `showModeToggle` = decode_showModeToggle(node), `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline(selectedStartDateMillis: kotlin.Long?, selectedEndDateMillis: kotlin.Long?, displayMode: androidx.compose.material3.DisplayMode, dateFormatter: androidx.compose.material3.DatePickerFormatter, modifier: androidx.compose.ui.Modifier, contentColor: androidx.compose.ui.graphics.Color)
internal object RendererDateRangePickerHeadline {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentColor")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline(
        `selectedStartDateMillis` = if (node.isNull("selectedStartDateMillis")) null else (node.number("selectedStartDateMillis").toLong()),
        `selectedEndDateMillis` = if (node.isNull("selectedEndDateMillis")) null else (node.number("selectedEndDateMillis").toLong()),
        `displayMode` = toComposeDisplayMode(node.string("displayMode")),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline(
        `selectedStartDateMillis` = if (node.isNull("selectedStartDateMillis")) null else (node.number("selectedStartDateMillis").toLong()),
        `selectedEndDateMillis` = if (node.isNull("selectedEndDateMillis")) null else (node.number("selectedEndDateMillis").toLong()),
        `displayMode` = toComposeDisplayMode(node.string("displayMode")),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle(displayMode: androidx.compose.material3.DisplayMode, modifier: androidx.compose.ui.Modifier, contentColor: androidx.compose.ui.graphics.Color)
internal object RendererDateRangePickerTitle {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentColor")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle(
        `displayMode` = toComposeDisplayMode(node.string("displayMode")),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle(
        `displayMode` = toComposeDisplayMode(node.string("displayMode")),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
