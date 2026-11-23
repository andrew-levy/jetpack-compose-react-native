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
      72 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      73 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      74 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      75 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      76 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      77 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      78 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      79 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      80 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      81 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      82 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      83 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      84 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      85 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      86 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      87 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      88 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      89 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      90 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      91 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      92 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      93 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      94 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      95 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
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
      104 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      105 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      106 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      107 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      108 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      109 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      110 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      111 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      112 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      113 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      114 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      115 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      116 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      117 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      118 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      119 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      120 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      121 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      122 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      123 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      124 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      125 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      126 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      127 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
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
      136 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      137 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      138 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      139 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      140 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      141 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      142 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      143 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      144 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      145 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      146 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      147 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      148 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      149 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      150 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      151 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      152 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      153 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      154 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      155 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      156 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      157 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      158 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      159 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
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
      168 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      169 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      170 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      171 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      172 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      173 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      174 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      175 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      176 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      177 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      178 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      179 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      180 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      181 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      182 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      183 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      184 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      185 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      186 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      187 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      188 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      189 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      190 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      191 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
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
      200 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      201 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      202 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      203 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      204 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      205 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      206 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      207 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      208 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      209 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      210 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      211 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      212 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      213 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      214 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      215 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      216 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      217 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      218 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      219 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      220 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      221 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      222 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      223 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
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
      232 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      233 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      234 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      235 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      236 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      237 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      238 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      239 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      240 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      241 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      242 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      243 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      244 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      245 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      246 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      247 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      248 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      249 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      250 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      251 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      252 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      253 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      254 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
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
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("border")) 16 else 0) +
      (if (node.has("contentPadding")) 32 else 0) +
      (if (node.has("interactionSource")) 64 else 0)
    when (mask / 32) {
      0 -> renderOutlinedButtonGroup0(node, scope, mask)
      1 -> renderOutlinedButtonGroup1(node, scope, mask)
      2 -> renderOutlinedButtonGroup2(node, scope, mask)
      3 -> renderOutlinedButtonGroup3(node, scope, mask)
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
      8 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedButtonGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedButtonGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedButtonGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedButton(onClick: kotlin.Function0<kotlin.Unit>, shapes: androidx.compose.material3.ButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererOutlinedButton_1 {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("elevation")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("contentPadding")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderOutlinedButton_1Group0(node, scope, mask)
      1 -> renderOutlinedButton_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderOutlinedButton_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderOutlinedButton_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
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
      (if (node.has("elevation")) 4 else 0) +
      (if (node.has("border")) 8 else 0)
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
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedCard(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererOutlinedCard_1 {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("border")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderOutlinedCard_1Group0(node, scope, mask)
      1 -> renderOutlinedCard_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedCard_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedCard_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
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
      0 -> renderOutlinedLeadingButtonGroup0(node, scope, mask)
      1 -> renderOutlinedLeadingButtonGroup1(node, scope, mask)
      2 -> renderOutlinedLeadingButtonGroup2(node, scope, mask)
      3 -> renderOutlinedLeadingButtonGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderOutlinedLeadingButtonGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderOutlinedLeadingButtonGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderOutlinedLeadingButtonGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderOutlinedLeadingButtonGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeSplitButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
