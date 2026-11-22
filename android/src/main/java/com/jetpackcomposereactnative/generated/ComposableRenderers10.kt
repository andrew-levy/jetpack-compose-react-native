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

// androidx.compose.material3.ModalWideNavigationRail(modifier: androidx.compose.ui.Modifier, state: androidx.compose.material3.WideNavigationRailState, hideOnCollapse: kotlin.Boolean, collapsedShape: androidx.compose.ui.graphics.Shape, expandedShape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.WideNavigationRailColors, header: kotlin.Function0<kotlin.Unit>?, expandedHeaderTopPadding: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, arrangement: androidx.compose.foundation.layout.Arrangement.Vertical, expandedProperties: androidx.compose.material3.ModalWideNavigationRailProperties, content: kotlin.Function0<kotlin.Unit>)
internal object RendererModalWideNavigationRail {
  private fun decode_hideOnCollapse(node: ComposeNode) = node.boolean("hideOnCollapse")
  private fun decode_expandedHeaderTopPadding(node: ComposeNode) = node.number("expandedHeaderTopPadding").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val content_header: @Composable () -> Unit = { RenderComposeChildren(node.slot("header")) }
    val slot_header = if (node.isNull("header")) null else content_header
    val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }
    val mask = (if (node.has("hideOnCollapse")) 1 else 0) +
      (if (node.has("collapsedShape")) 2 else 0) +
      (if (node.has("expandedShape")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("header")) 16 else 0) +
      (if (node.has("expandedHeaderTopPadding")) 32 else 0) +
      (if (node.has("windowInsets")) 64 else 0) +
      (if (node.has("arrangement")) 128 else 0)
    when (mask / 32) {
      0 -> renderModalWideNavigationRailGroup0(node, scope, mask, renderChildren, slot_header)
      1 -> renderModalWideNavigationRailGroup1(node, scope, mask, renderChildren, slot_header)
      2 -> renderModalWideNavigationRailGroup2(node, scope, mask, renderChildren, slot_header)
      3 -> renderModalWideNavigationRailGroup3(node, scope, mask, renderChildren, slot_header)
      4 -> renderModalWideNavigationRailGroup4(node, scope, mask, renderChildren, slot_header)
      5 -> renderModalWideNavigationRailGroup5(node, scope, mask, renderChildren, slot_header)
      6 -> renderModalWideNavigationRailGroup6(node, scope, mask, renderChildren, slot_header)
      7 -> renderModalWideNavigationRailGroup7(node, scope, mask, renderChildren, slot_header)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup0(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), content = renderChildren)
      1 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), content = renderChildren)
      2 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), content = renderChildren)
      3 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), content = renderChildren)
      4 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      5 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      6 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      7 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      8 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      9 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      10 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      11 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      12 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      13 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      14 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      15 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      16 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, content = renderChildren)
      17 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, content = renderChildren)
      18 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, content = renderChildren)
      19 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, content = renderChildren)
      20 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      21 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      22 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      23 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      24 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      25 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      26 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      27 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      28 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      29 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      30 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      31 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup1(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      33 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      34 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      35 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      36 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      37 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      38 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      39 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      40 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      41 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      42 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      43 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      44 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      45 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      46 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      47 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      48 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      49 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      50 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      51 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      52 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      53 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      54 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      55 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      56 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      57 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      58 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      59 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      60 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      61 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      62 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      63 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup2(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      65 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      66 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      67 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      68 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      69 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      70 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      71 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      80 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      81 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      82 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      83 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      84 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      85 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      86 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      87 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup3(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      97 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      98 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      99 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      100 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      101 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      102 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      103 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      112 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      113 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      114 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      115 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      116 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      117 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      118 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      119 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup4(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      129 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      130 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      131 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      132 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      133 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      134 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      135 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      144 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      145 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      146 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      147 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      148 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      149 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      150 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      151 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup5(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      160 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      161 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      162 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      163 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      164 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      165 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      166 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      167 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      176 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      177 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      178 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      179 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      180 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      181 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      182 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      183 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup6(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      192 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      193 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      194 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      195 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      196 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      197 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      198 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      199 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      208 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      209 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      210 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      211 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      212 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      213 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      214 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      215 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderModalWideNavigationRailGroup7(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      224 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      225 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      226 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      227 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      228 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      229 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      230 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      231 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      240 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      241 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      242 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      243 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      244 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      245 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      246 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      247 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      255 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MultiChoiceSegmentedButtonRow(modifier: androidx.compose.ui.Modifier, space: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.material3.MultiChoiceSegmentedButtonRowScope, kotlin.Unit>)
internal object RendererMultiChoiceSegmentedButtonRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("space")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MultiChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.MultiChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        `space` = node.number("space").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.ui.layout.MultiMeasureLayout(modifier: androidx.compose.ui.Modifier, content: kotlin.Function0<kotlin.Unit>, measurePolicy: androidx.compose.ui.layout.MeasurePolicy)
internal object RendererMultiMeasureLayout {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.ui.layout.MultiMeasureLayout(
      `modifier` = node.modifier("modifier", scope),
      `measurePolicy` = node.jsonObject("measurePolicy").toComposeLayoutMeasurePolicy(),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.material3.NavigationBar(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererNavigationBar {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationBarItem [receiver: androidx.compose.foundation.layout.RowScope](selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, label: kotlin.Function0<kotlin.Unit>?, alwaysShowLabel: kotlin.Boolean, colors: androidx.compose.material3.NavigationBarItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererNavigationBarItem {
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.foundation.layout.RowScope) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("label")) 2 else 0) +
      (if (node.has("alwaysShowLabel")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      3 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      4 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      5 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      6 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      7 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      8 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      9 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      10 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      11 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      12 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      13 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      14 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      15 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      16 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> scope.composeScoped1(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationDrawerItem(label: kotlin.Function0<kotlin.Unit>, selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, icon: kotlin.Function0<kotlin.Unit>?, badge: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.NavigationDrawerItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererNavigationDrawerItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("icon")) 1 else 0) +
      (if (node.has("badge")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      2 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
      )
      3 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
      )
      4 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      5 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      6 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `shape` = node.arguments().shape("shape"),
      )
      7 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      9 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      10 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      11 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      12 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      13 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      14 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      15 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationRail(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, header: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>?, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererNavigationRail {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("header")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationRailItem(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, label: kotlin.Function0<kotlin.Unit>?, alwaysShowLabel: kotlin.Boolean, colors: androidx.compose.material3.NavigationRailItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererNavigationRailItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("label")) 2 else 0) +
      (if (node.has("alwaysShowLabel")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      3 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      4 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      5 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      6 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      7 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      8 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      9 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      10 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      11 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      12 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      13 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      14 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      15 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      16 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererOutlinedButton {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("contentPadding")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderOutlinedButtonGroup0(node, scope, mask)
      1 -> renderOutlinedButtonGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedButtonGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedButtonGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedCard(modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererOutlinedCard {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedCard(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererOutlinedCard_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.OutlinedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedIconButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconButtonColors, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererOutlinedIconButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconToggleButtonColors, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererOutlinedIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererOutlinedLeadingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedSecureTextField(state: androidx.compose.foundation.text.input.TextFieldState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, labelPosition: androidx.compose.material3.TextFieldLabelPosition, label: kotlin.Function1<androidx.compose.material3.TextFieldLabelScope, kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, isError: kotlin.Boolean, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, textObfuscationMode: androidx.compose.foundation.text.input.TextObfuscationMode, textObfuscationCharacter: kotlin.Char, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, onKeyboardAction: androidx.compose.foundation.text.input.KeyboardActionHandler?, onTextLayout: kotlin.Function2<androidx.compose.ui.unit.Density, kotlin.Function0<androidx.compose.ui.text.TextLayoutResult?>, kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererOutlinedSecureTextField {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_isError(node: ComposeNode) = node.boolean("isError")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTextFieldState() else null
    val content_placeholder: @Composable () -> Unit = { RenderComposeChildren(node.slot("placeholder")) }
    val slot_placeholder = if (node.isNull("placeholder")) null else content_placeholder
    val content_leadingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("leadingIcon")) }
    val slot_leadingIcon = if (node.isNull("leadingIcon")) null else content_leadingIcon
    val content_trailingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("trailingIcon")) }
    val slot_trailingIcon = if (node.isNull("trailingIcon")) null else content_trailingIcon
    val content_prefix: @Composable () -> Unit = { RenderComposeChildren(node.slot("prefix")) }
    val slot_prefix = if (node.isNull("prefix")) null else content_prefix
    val content_suffix: @Composable () -> Unit = { RenderComposeChildren(node.slot("suffix")) }
    val slot_suffix = if (node.isNull("suffix")) null else content_suffix
    val content_supportingText: @Composable () -> Unit = { RenderComposeChildren(node.slot("supportingText")) }
    val slot_supportingText = if (node.isNull("supportingText")) null else content_supportingText
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("textStyle")) 2 else 0) +
      (if (node.has("placeholder")) 4 else 0) +
      (if (node.has("leadingIcon")) 8 else 0) +
      (if (node.has("trailingIcon")) 16 else 0) +
      (if (node.has("prefix")) 32 else 0) +
      (if (node.has("suffix")) 64 else 0) +
      (if (node.has("supportingText")) 128 else 0) +
      (if (node.has("isError")) 256 else 0) +
      (if (node.has("inputTransformation")) 512 else 0) +
      (if (node.has("keyboardOptions")) 1024 else 0) +
      (if (node.has("onKeyboardAction")) 2048 else 0) +
      (if (node.has("shape")) 4096 else 0) +
      (if (node.has("colors")) 8192 else 0) +
      (if (node.has("contentPadding")) 16384 else 0) +
      (if (node.has("interactionSource")) 32768 else 0)
    when (mask / 32) {
      0 -> renderOutlinedSecureTextFieldGroup0(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1 -> renderOutlinedSecureTextFieldGroup1(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2 -> renderOutlinedSecureTextFieldGroup2(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      4 -> renderOutlinedSecureTextFieldGroup4(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8 -> renderOutlinedSecureTextFieldGroup8(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16 -> renderOutlinedSecureTextFieldGroup16(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      32 -> renderOutlinedSecureTextFieldGroup32(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      48 -> renderOutlinedSecureTextFieldGroup48(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      64 -> renderOutlinedSecureTextFieldGroup64(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      80 -> renderOutlinedSecureTextFieldGroup80(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      96 -> renderOutlinedSecureTextFieldGroup96(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      112 -> renderOutlinedSecureTextFieldGroup112(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      128 -> renderOutlinedSecureTextFieldGroup128(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      256 -> renderOutlinedSecureTextFieldGroup256(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      512 -> renderOutlinedSecureTextFieldGroup512(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      655 -> renderOutlinedSecureTextFieldGroup655(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1024 -> renderOutlinedSecureTextFieldGroup1024(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1025 -> renderOutlinedSecureTextFieldGroup1025(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1679 -> renderOutlinedSecureTextFieldGroup1679(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1711 -> renderOutlinedSecureTextFieldGroup1711(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1743 -> renderOutlinedSecureTextFieldGroup1743(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1775 -> renderOutlinedSecureTextFieldGroup1775(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1791 -> renderOutlinedSecureTextFieldGroup1791(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2047 -> renderOutlinedSecureTextFieldGroup2047(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      3 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      4 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder)
      5 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder)
      6 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder)
      7 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder)
      8 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      9 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon)
      10 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon)
      11 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon)
      12 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      13 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      14 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      15 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      16 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon)
      17 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon)
      18 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon)
      19 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon)
      20 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      21 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      22 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      23 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      24 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      25 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      26 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      27 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      28 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      29 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      30 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      31 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `prefix` = slot_prefix)
      33 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `prefix` = slot_prefix)
      36 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      37 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      40 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      41 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      44 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      45 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      48 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      49 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      52 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      53 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      56 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      57 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      60 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      61 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `suffix` = slot_suffix)
      65 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `suffix` = slot_suffix)
      68 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      69 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      72 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      73 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      76 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      77 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      80 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      81 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      84 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      85 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      88 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      89 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      92 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      93 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText)
      129 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `supportingText` = slot_supportingText)
      132 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      133 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      136 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      137 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      140 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      141 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      144 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      145 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      148 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      149 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      152 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      153 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      156 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      157 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      256 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `isError` = decode_isError(node))
      257 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `isError` = decode_isError(node))
      260 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `isError` = decode_isError(node))
      261 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `isError` = decode_isError(node))
      264 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      265 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      268 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      269 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      272 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      273 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      276 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      277 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      280 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      281 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      284 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      285 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      512 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      513 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      514 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      515 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup32(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      1024 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1025 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1028 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1029 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1032 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1033 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1036 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1037 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1040 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1041 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1044 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1045 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1048 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1049 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1052 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1053 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup48(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      1536 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1537 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1538 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1539 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup64(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      2048 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2049 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2052 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2053 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2056 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2057 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2060 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2061 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2064 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2065 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2068 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2069 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2072 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2073 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2076 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2077 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup80(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      2560 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2561 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2562 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2563 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup96(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      3072 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup112(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      3584 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      3585 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      3586 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      3587 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup128(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      4096 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      4097 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      4100 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      4101 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      4104 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      4105 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      4108 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      4109 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      4112 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4113 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4116 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4117 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4120 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4121 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4124 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4125 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup256(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      8192 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8193 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8194 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8195 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8196 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8197 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8198 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8199 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8200 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8201 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8202 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8203 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8204 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8205 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8206 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8207 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8208 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8209 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8210 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8211 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8212 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8213 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8214 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8215 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8216 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8217 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8218 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8219 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8220 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8221 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8222 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8223 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup512(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      16384 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16385 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16388 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16389 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16392 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16393 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16396 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16397 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16400 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16401 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16404 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16405 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16408 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16409 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16412 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16413 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup655(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      20991 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup1024(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32768 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32769 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32770 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32771 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32772 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32773 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32774 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32775 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32776 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32777 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32778 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32779 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32780 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32781 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32782 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32783 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32784 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32785 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32786 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32787 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32788 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32789 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32790 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32791 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32792 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32793 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32794 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32795 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32796 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32797 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32798 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32799 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup1025(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32800 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32801 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32802 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32803 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32804 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32805 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32806 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32807 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32808 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32809 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32810 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32811 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32812 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32813 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32814 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32815 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32816 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32817 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32818 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32819 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32820 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32821 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32822 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32823 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32824 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32825 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32826 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32827 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32828 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32829 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32830 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32831 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup1679(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      53759 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup1711(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      54783 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup1743(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      55807 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup1775(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      56831 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup1791(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      57343 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedSecureTextFieldGroup2047(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      65535 -> androidx.compose.material3.OutlinedSecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedTextField(state: androidx.compose.foundation.text.input.TextFieldState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, labelPosition: androidx.compose.material3.TextFieldLabelPosition, label: kotlin.Function1<androidx.compose.material3.TextFieldLabelScope, kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, isError: kotlin.Boolean, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, outputTransformation: androidx.compose.foundation.text.input.OutputTransformation?, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, onKeyboardAction: androidx.compose.foundation.text.input.KeyboardActionHandler?, lineLimits: androidx.compose.foundation.text.input.TextFieldLineLimits, onTextLayout: kotlin.Function2<androidx.compose.ui.unit.Density, kotlin.Function0<androidx.compose.ui.text.TextLayoutResult?>, kotlin.Unit>?, scrollState: androidx.compose.foundation.ScrollState, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererOutlinedTextField {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_readOnly(node: ComposeNode) = node.boolean("readOnly")
  private fun decode_isError(node: ComposeNode) = node.boolean("isError")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTextFieldState() else null
    val content_placeholder: @Composable () -> Unit = { RenderComposeChildren(node.slot("placeholder")) }
    val slot_placeholder = if (node.isNull("placeholder")) null else content_placeholder
    val content_leadingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("leadingIcon")) }
    val slot_leadingIcon = if (node.isNull("leadingIcon")) null else content_leadingIcon
    val content_trailingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("trailingIcon")) }
    val slot_trailingIcon = if (node.isNull("trailingIcon")) null else content_trailingIcon
    val content_prefix: @Composable () -> Unit = { RenderComposeChildren(node.slot("prefix")) }
    val slot_prefix = if (node.isNull("prefix")) null else content_prefix
    val content_suffix: @Composable () -> Unit = { RenderComposeChildren(node.slot("suffix")) }
    val slot_suffix = if (node.isNull("suffix")) null else content_suffix
    val content_supportingText: @Composable () -> Unit = { RenderComposeChildren(node.slot("supportingText")) }
    val slot_supportingText = if (node.isNull("supportingText")) null else content_supportingText
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("textStyle")) 4 else 0) +
      (if (node.has("placeholder")) 8 else 0) +
      (if (node.has("leadingIcon")) 16 else 0) +
      (if (node.has("trailingIcon")) 32 else 0) +
      (if (node.has("prefix")) 64 else 0) +
      (if (node.has("suffix")) 128 else 0) +
      (if (node.has("supportingText")) 256 else 0) +
      (if (node.has("isError")) 512 else 0) +
      (if (node.has("inputTransformation")) 1024 else 0) +
      (if (node.has("outputTransformation")) 2048 else 0) +
      (if (node.has("keyboardOptions")) 4096 else 0) +
      (if (node.has("onKeyboardAction")) 8192 else 0) +
      (if (node.has("lineLimits")) 16384 else 0) +
      (if (node.has("shape")) 32768 else 0) +
      (if (node.has("colors")) 65536 else 0) +
      (if (node.has("contentPadding")) 131072 else 0) +
      (if (node.has("interactionSource")) 262144 else 0)
    when (mask / 32) {
      0 -> renderOutlinedTextFieldGroup0(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1 -> renderOutlinedTextFieldGroup1(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2 -> renderOutlinedTextFieldGroup2(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      4 -> renderOutlinedTextFieldGroup4(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8 -> renderOutlinedTextFieldGroup8(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16 -> renderOutlinedTextFieldGroup16(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      32 -> renderOutlinedTextFieldGroup32(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      64 -> renderOutlinedTextFieldGroup64(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      96 -> renderOutlinedTextFieldGroup96(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      128 -> renderOutlinedTextFieldGroup128(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      160 -> renderOutlinedTextFieldGroup160(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      192 -> renderOutlinedTextFieldGroup192(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      224 -> renderOutlinedTextFieldGroup224(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      256 -> renderOutlinedTextFieldGroup256(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      288 -> renderOutlinedTextFieldGroup288(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      320 -> renderOutlinedTextFieldGroup320(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      352 -> renderOutlinedTextFieldGroup352(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      384 -> renderOutlinedTextFieldGroup384(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      416 -> renderOutlinedTextFieldGroup416(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      448 -> renderOutlinedTextFieldGroup448(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      480 -> renderOutlinedTextFieldGroup480(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      512 -> renderOutlinedTextFieldGroup512(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      544 -> renderOutlinedTextFieldGroup544(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      576 -> renderOutlinedTextFieldGroup576(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      608 -> renderOutlinedTextFieldGroup608(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      640 -> renderOutlinedTextFieldGroup640(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      672 -> renderOutlinedTextFieldGroup672(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      704 -> renderOutlinedTextFieldGroup704(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      736 -> renderOutlinedTextFieldGroup736(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      768 -> renderOutlinedTextFieldGroup768(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      800 -> renderOutlinedTextFieldGroup800(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      832 -> renderOutlinedTextFieldGroup832(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      864 -> renderOutlinedTextFieldGroup864(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      928 -> renderOutlinedTextFieldGroup928(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      960 -> renderOutlinedTextFieldGroup960(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      992 -> renderOutlinedTextFieldGroup992(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1024 -> renderOutlinedTextFieldGroup1024(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2048 -> renderOutlinedTextFieldGroup2048(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      4096 -> renderOutlinedTextFieldGroup4096(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      5151 -> renderOutlinedTextFieldGroup5151(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8192 -> renderOutlinedTextFieldGroup8192(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8193 -> renderOutlinedTextFieldGroup8193(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13343 -> renderOutlinedTextFieldGroup13343(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13471 -> renderOutlinedTextFieldGroup13471(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13599 -> renderOutlinedTextFieldGroup13599(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13855 -> renderOutlinedTextFieldGroup13855(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14239 -> renderOutlinedTextFieldGroup14239(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14271 -> renderOutlinedTextFieldGroup14271(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14303 -> renderOutlinedTextFieldGroup14303(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14335 -> renderOutlinedTextFieldGroup14335(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16383 -> renderOutlinedTextFieldGroup16383(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node))
      3 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node))
      4 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      5 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      6 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      7 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      8 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder)
      9 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder)
      10 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder)
      11 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder)
      12 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder)
      13 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder)
      14 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder)
      15 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder)
      16 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      17 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon)
      18 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon)
      19 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon)
      20 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon)
      21 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon)
      22 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon)
      23 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon)
      24 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      25 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      26 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      27 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      28 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      29 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      30 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      31 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon)
      33 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon)
      34 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `trailingIcon` = slot_trailingIcon)
      35 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `trailingIcon` = slot_trailingIcon)
      40 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      41 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      42 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      43 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      48 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      49 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      50 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      51 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      56 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      57 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      58 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      59 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `prefix` = slot_prefix)
      65 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `prefix` = slot_prefix)
      66 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `prefix` = slot_prefix)
      67 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `prefix` = slot_prefix)
      72 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      73 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      74 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      75 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      80 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      81 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      82 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      83 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      88 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      89 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      90 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      91 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `suffix` = slot_suffix)
      129 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `suffix` = slot_suffix)
      130 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `suffix` = slot_suffix)
      131 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `suffix` = slot_suffix)
      136 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      137 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      138 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      139 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      144 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      145 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      146 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      147 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      152 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      153 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      154 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      155 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      256 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText)
      257 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `supportingText` = slot_supportingText)
      258 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `supportingText` = slot_supportingText)
      259 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `supportingText` = slot_supportingText)
      264 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      265 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      266 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      267 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      272 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      273 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      274 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      275 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      280 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      281 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      282 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      283 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      512 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `isError` = decode_isError(node))
      513 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `isError` = decode_isError(node))
      514 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `isError` = decode_isError(node))
      515 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `isError` = decode_isError(node))
      520 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `isError` = decode_isError(node))
      521 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `isError` = decode_isError(node))
      522 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `isError` = decode_isError(node))
      523 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `isError` = decode_isError(node))
      528 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      529 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      530 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      531 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      536 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      537 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      538 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      539 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup32(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      1024 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      1025 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup64(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      2048 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      2049 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup96(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      3072 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      3073 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup128(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      4096 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4097 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4098 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4099 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4104 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4105 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4106 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4107 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4112 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4113 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4114 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4115 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4120 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4121 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4122 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4123 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup160(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      5120 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      5121 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup192(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      6144 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      6145 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup224(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      7168 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      7169 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup256(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      8192 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8193 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8194 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8195 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8200 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8201 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8202 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8203 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8208 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8209 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8210 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8211 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8216 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8217 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8218 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8219 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup288(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      9216 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      9217 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup320(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      10240 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      10241 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup352(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      11264 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      11265 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup384(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      12288 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup416(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      13312 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      13313 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup448(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      14336 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      14337 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup480(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      15360 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      15361 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup512(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      16384 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16385 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16386 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16387 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16392 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16393 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16394 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16395 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16400 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16401 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16402 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16403 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16408 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16409 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16410 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      16411 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup544(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      17408 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      17409 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup576(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      18432 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      18433 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup608(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      19456 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      19457 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup640(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      20480 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup672(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      21504 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      21505 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup704(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      22528 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      22529 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup736(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      23552 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      23553 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup768(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      24576 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup800(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      25600 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      25601 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup832(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      26624 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      26625 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup864(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      27648 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      27649 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup928(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      29696 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      29697 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup960(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      30720 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      30721 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup992(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      31744 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      31745 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup1024(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32768 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      32769 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      32770 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `shape` = node.arguments().shape("shape"))
      32771 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `shape` = node.arguments().shape("shape"))
      32776 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      32777 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      32778 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      32779 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      32784 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32785 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32786 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32787 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32792 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32793 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32794 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32795 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup2048(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      65536 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65537 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65538 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65539 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65540 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65541 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65542 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65543 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65544 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65545 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65546 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65547 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65548 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65549 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65550 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65551 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65552 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65553 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65554 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65555 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65556 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65557 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65558 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65559 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65560 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65561 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65562 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65563 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65564 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65565 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65566 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65567 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup4096(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      131072 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131073 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131074 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131075 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131080 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131081 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131082 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131083 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131088 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131089 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131090 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131091 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131096 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131097 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131098 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131099 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup5151(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      164863 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup8192(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      262144 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262145 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262146 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262147 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262148 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262149 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262150 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262151 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262152 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262153 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262154 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262155 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262156 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262157 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262158 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262159 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262160 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262161 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262162 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262163 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262164 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262165 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262166 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262167 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262168 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262169 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262170 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262171 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262172 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262173 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262174 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262175 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup8193(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      262176 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262177 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262178 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262179 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262180 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262181 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262182 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262183 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262184 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262185 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262186 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262187 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262188 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262189 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262190 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262191 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262192 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262193 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262194 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262195 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262196 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262197 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262198 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262199 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262200 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262201 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262202 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262203 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262204 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262205 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262206 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262207 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup13343(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      427007 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup13471(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      431103 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup13599(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      435199 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup13855(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      443391 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup14239(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      455679 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup14271(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      456703 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup14303(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      457727 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup14335(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      458751 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup16383(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      524287 -> androidx.compose.material3.OutlinedTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `outputTransformation` = if (node.isNull("outputTransformation")) null else (node.jsonObject("outputTransformation").toComposeOutputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
