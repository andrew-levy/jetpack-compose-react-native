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

// androidx.compose.material3.ModalWideNavigationRail(modifier: androidx.compose.ui.Modifier, state: androidx.compose.material3.WideNavigationRailState, hideOnCollapse: kotlin.Boolean, collapsedShape: androidx.compose.ui.graphics.Shape, expandedShape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.WideNavigationRailColors, header: kotlin.Function0<kotlin.Unit>?, expandedHeaderTopPadding: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, arrangement: androidx.compose.foundation.layout.Arrangement.Vertical, expandedProperties: androidx.compose.material3.ModalWideNavigationRailProperties, contentPadding: androidx.compose.foundation.layout.PaddingValues, content: kotlin.Function0<kotlin.Unit>)
internal object RendererModalWideNavigationRail {
  private fun decode_hideOnCollapse(node: ComposeNode) = node.boolean("hideOnCollapse")
  private fun decode_expandedHeaderTopPadding(node: ComposeNode) = node.number("expandedHeaderTopPadding").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeWideNavigationRailState(node.arguments()) else null
    val content_header: @Composable () -> Unit = { RenderComposeChildren(node.slot("header")) }
    val slot_header = if (node.isNull("header")) null else content_header
    val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("hideOnCollapse")) 2 else 0) +
      (if (node.has("collapsedShape")) 4 else 0) +
      (if (node.has("expandedShape")) 8 else 0) +
      (if (node.has("colors")) 16 else 0) +
      (if (node.has("header")) 32 else 0) +
      (if (node.has("expandedHeaderTopPadding")) 64 else 0) +
      (if (node.has("windowInsets")) 128 else 0) +
      (if (node.has("arrangement")) 256 else 0) +
      (if (node.has("expandedProperties")) 512 else 0) +
      (if (node.has("contentPadding")) 1024 else 0)
    when (mask / 32) {
      0 -> renderModalWideNavigationRailGroup0(node, scope, mask, stateValue, renderChildren, slot_header)
      1 -> renderModalWideNavigationRailGroup1(node, scope, mask, stateValue, renderChildren, slot_header)
      2 -> renderModalWideNavigationRailGroup2(node, scope, mask, stateValue, renderChildren, slot_header)
      3 -> renderModalWideNavigationRailGroup3(node, scope, mask, stateValue, renderChildren, slot_header)
      4 -> renderModalWideNavigationRailGroup4(node, scope, mask, stateValue, renderChildren, slot_header)
      5 -> renderModalWideNavigationRailGroup5(node, scope, mask, stateValue, renderChildren, slot_header)
      6 -> renderModalWideNavigationRailGroup6(node, scope, mask, stateValue, renderChildren, slot_header)
      7 -> renderModalWideNavigationRailGroup7(node, scope, mask, stateValue, renderChildren, slot_header)
      8 -> renderModalWideNavigationRailGroup8(node, scope, mask, stateValue, renderChildren, slot_header)
      9 -> renderModalWideNavigationRailGroup9(node, scope, mask, stateValue, renderChildren, slot_header)
      10 -> renderModalWideNavigationRailGroup10(node, scope, mask, stateValue, renderChildren, slot_header)
      11 -> renderModalWideNavigationRailGroup11(node, scope, mask, stateValue, renderChildren, slot_header)
      12 -> renderModalWideNavigationRailGroup12(node, scope, mask, stateValue, renderChildren, slot_header)
      13 -> renderModalWideNavigationRailGroup13(node, scope, mask, stateValue, renderChildren, slot_header)
      14 -> renderModalWideNavigationRailGroup14(node, scope, mask, stateValue, renderChildren, slot_header)
      15 -> renderModalWideNavigationRailGroup15(node, scope, mask, stateValue, renderChildren, slot_header)
      16 -> renderModalWideNavigationRailGroup16(node, scope, mask, stateValue, renderChildren, slot_header)
      17 -> renderModalWideNavigationRailGroup17(node, scope, mask, stateValue, renderChildren, slot_header)
      18 -> renderModalWideNavigationRailGroup18(node, scope, mask, stateValue, renderChildren, slot_header)
      19 -> renderModalWideNavigationRailGroup19(node, scope, mask, stateValue, renderChildren, slot_header)
      31 -> renderModalWideNavigationRailGroup31(node, scope, mask, stateValue, renderChildren, slot_header)
      32 -> renderModalWideNavigationRailGroup32(node, scope, mask, stateValue, renderChildren, slot_header)
      33 -> renderModalWideNavigationRailGroup33(node, scope, mask, stateValue, renderChildren, slot_header)
      34 -> renderModalWideNavigationRailGroup34(node, scope, mask, stateValue, renderChildren, slot_header)
      35 -> renderModalWideNavigationRailGroup35(node, scope, mask, stateValue, renderChildren, slot_header)
      36 -> renderModalWideNavigationRailGroup36(node, scope, mask, stateValue, renderChildren, slot_header)
      37 -> renderModalWideNavigationRailGroup37(node, scope, mask, stateValue, renderChildren, slot_header)
      38 -> renderModalWideNavigationRailGroup38(node, scope, mask, stateValue, renderChildren, slot_header)
      39 -> renderModalWideNavigationRailGroup39(node, scope, mask, stateValue, renderChildren, slot_header)
      40 -> renderModalWideNavigationRailGroup40(node, scope, mask, stateValue, renderChildren, slot_header)
      41 -> renderModalWideNavigationRailGroup41(node, scope, mask, stateValue, renderChildren, slot_header)
      42 -> renderModalWideNavigationRailGroup42(node, scope, mask, stateValue, renderChildren, slot_header)
      43 -> renderModalWideNavigationRailGroup43(node, scope, mask, stateValue, renderChildren, slot_header)
      44 -> renderModalWideNavigationRailGroup44(node, scope, mask, stateValue, renderChildren, slot_header)
      45 -> renderModalWideNavigationRailGroup45(node, scope, mask, stateValue, renderChildren, slot_header)
      46 -> renderModalWideNavigationRailGroup46(node, scope, mask, stateValue, renderChildren, slot_header)
      47 -> renderModalWideNavigationRailGroup47(node, scope, mask, stateValue, renderChildren, slot_header)
      55 -> renderModalWideNavigationRailGroup55(node, scope, mask, stateValue, renderChildren, slot_header)
      59 -> renderModalWideNavigationRailGroup59(node, scope, mask, stateValue, renderChildren, slot_header)
      61 -> renderModalWideNavigationRailGroup61(node, scope, mask, stateValue, renderChildren, slot_header)
      62 -> renderModalWideNavigationRailGroup62(node, scope, mask, stateValue, renderChildren, slot_header)
      63 -> renderModalWideNavigationRailGroup63(node, scope, mask, stateValue, renderChildren, slot_header)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), content = renderChildren)
      1 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), content = renderChildren)
      2 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), content = renderChildren)
      3 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), content = renderChildren)
      4 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), content = renderChildren)
      5 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), content = renderChildren)
      6 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), content = renderChildren)
      7 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), content = renderChildren)
      8 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      9 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      10 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      11 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      12 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      13 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      14 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      15 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      16 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      17 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      18 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      19 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      20 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      21 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      22 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      23 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      24 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      26 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      28 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      30 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, content = renderChildren)
      33 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, content = renderChildren)
      34 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, content = renderChildren)
      35 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, content = renderChildren)
      36 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, content = renderChildren)
      37 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, content = renderChildren)
      38 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, content = renderChildren)
      39 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, content = renderChildren)
      40 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      41 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      42 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      43 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      44 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      45 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      46 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      47 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      48 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      49 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      50 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      51 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      52 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      53 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      54 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      55 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      56 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      58 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      60 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      62 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      65 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      66 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      67 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      68 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      69 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      70 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      71 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      72 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      73 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      74 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      75 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      76 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      77 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      78 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      79 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      80 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      81 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      82 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      83 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      84 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      85 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      86 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      87 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      88 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      90 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      92 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      94 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      97 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      98 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      99 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      100 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      101 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      102 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      103 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      104 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      105 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      106 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      107 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      108 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      109 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      110 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      111 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      112 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      113 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      114 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      115 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      116 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      117 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      118 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      119 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      120 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      122 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      124 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      126 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      129 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      130 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      131 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      132 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      133 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      134 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      135 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      136 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      137 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      138 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      139 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      140 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      141 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      142 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      143 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      144 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      146 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      148 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      150 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      152 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      154 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      156 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      158 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      160 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      161 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      162 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      163 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      164 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      165 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      166 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      167 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      168 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      169 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      170 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      171 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      172 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      173 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      174 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      175 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      176 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      178 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      180 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      182 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      184 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      186 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      188 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      190 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      192 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      193 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      194 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      195 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      196 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      197 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      198 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      199 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      200 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      201 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      202 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      203 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      204 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      205 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      206 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      207 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      208 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      210 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      212 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      214 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      216 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      218 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      220 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      222 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      224 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      225 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      226 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      227 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      228 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      229 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      230 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      231 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      232 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      233 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      234 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      235 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      236 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      237 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      238 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      239 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      240 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      242 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      244 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      246 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      248 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      250 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      252 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      254 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      256 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      257 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      258 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      259 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      260 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      261 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      262 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      263 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      264 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      265 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      266 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      267 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      268 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      269 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      270 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      271 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      272 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      274 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      276 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      278 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      280 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      282 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      284 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      286 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup9(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      288 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      289 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      290 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      291 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      292 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      293 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      294 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      295 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      296 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      297 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      298 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      299 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      300 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      301 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      302 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      303 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      304 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      306 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      308 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      310 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      312 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      314 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      316 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      318 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup10(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      320 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      321 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      322 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      323 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      324 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      325 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      326 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      327 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      328 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      329 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      330 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      331 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      332 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      333 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      334 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      335 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      336 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      338 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      340 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      342 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      344 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      346 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      348 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      350 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup11(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      352 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      353 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      354 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      355 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      356 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      357 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      358 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      359 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      360 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      361 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      362 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      363 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      364 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      365 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      366 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      367 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      368 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      370 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      372 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      374 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      376 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      378 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      380 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      382 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup12(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      384 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      385 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      386 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      387 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      388 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      389 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      390 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      391 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      392 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      393 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      394 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      395 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      396 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      397 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      398 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      399 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      400 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      402 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      404 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      406 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      408 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      410 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      412 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      414 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup13(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      416 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      417 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      418 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      419 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      420 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      421 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      422 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      423 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      424 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      425 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      426 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      427 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      428 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      429 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      430 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      431 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      432 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      434 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      436 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      438 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      440 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      442 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      444 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      446 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup14(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      448 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      449 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      450 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      451 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      452 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      453 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      454 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      455 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      456 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      457 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      458 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      459 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      460 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      461 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      462 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      463 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      464 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      466 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      468 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      470 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      472 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      474 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      476 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      478 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup15(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      480 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      481 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      482 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      483 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      484 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      485 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      486 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      487 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      488 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      489 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      490 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      491 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      492 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      493 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      494 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      495 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      496 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      498 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      500 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      502 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      504 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      506 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      508 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      510 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      511 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      512 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      513 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      514 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      515 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      516 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      517 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      518 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      519 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      528 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup17(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      544 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      545 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      546 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      547 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      548 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      549 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      550 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      551 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup18(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      576 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      577 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      578 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      579 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      580 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      581 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      582 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      583 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup19(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      608 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      609 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      610 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      611 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      612 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      613 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      614 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      615 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup31(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1023 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup32(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1024 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1025 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1026 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1027 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1028 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1029 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1030 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1031 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1032 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1033 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1034 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1035 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1036 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1037 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1038 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1039 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup33(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1056 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1057 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1058 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1059 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1060 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1061 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1062 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1063 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1064 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1065 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1066 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1067 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1068 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1069 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1070 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1071 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup34(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1088 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1089 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1090 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1091 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1092 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1093 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1094 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1095 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1096 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1097 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1098 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1099 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1100 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1101 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1102 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1103 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup35(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1120 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1121 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1122 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1123 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1124 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1125 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1126 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1127 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1128 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1129 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1130 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1131 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1132 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1133 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1134 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1135 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup36(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1152 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1153 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1154 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1155 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1156 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1157 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1158 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1159 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1160 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1161 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1162 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1163 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1164 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1165 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1166 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1167 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup37(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1184 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1185 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1186 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1187 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1188 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1189 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1190 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1191 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1192 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1193 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1194 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1195 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1196 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1197 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1198 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1199 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup38(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1216 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1217 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1218 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1219 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1220 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1221 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1222 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1223 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1224 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1225 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1226 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1227 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1228 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1229 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1230 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1231 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup39(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1248 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1249 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1250 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1251 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1252 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1253 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1254 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1255 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1256 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1257 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1258 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1259 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1260 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1261 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1262 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1263 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1278 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1279 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup40(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1280 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1281 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1282 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1283 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1284 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1285 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1286 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1287 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1288 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1289 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1290 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1291 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1292 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1293 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1294 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1295 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup41(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1312 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1313 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1314 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1315 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1316 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1317 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1318 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1319 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1320 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1321 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1322 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1323 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1324 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1325 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1326 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1327 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup42(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1344 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1345 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1346 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1347 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1348 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1349 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1350 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1351 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1352 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1353 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1354 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1355 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1356 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1357 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1358 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1359 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup43(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1376 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1377 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1378 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1379 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1380 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1381 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1382 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1383 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1384 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1385 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1386 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1387 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1388 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1389 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1390 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1391 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1406 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1407 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup44(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1408 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1409 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1410 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1411 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1412 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1413 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1414 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1415 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1416 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1417 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1418 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1419 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1420 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1421 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1422 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1423 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup45(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1440 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1441 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1442 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1443 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1444 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1445 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1446 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1447 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1448 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1449 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1450 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1451 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1452 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1453 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1454 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1455 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1470 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1471 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup46(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1472 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1473 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1474 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1475 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1476 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1477 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1478 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1479 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1480 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1481 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1482 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1483 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1484 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1485 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1486 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1487 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1502 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1503 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup47(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1504 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1505 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1506 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1507 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1508 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1509 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1510 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1511 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1512 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1513 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1514 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1515 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1516 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1517 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1518 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1519 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1526 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1527 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1530 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1531 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1532 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1533 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1534 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1535 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup55(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1791 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup59(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1919 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup61(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      1983 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup62(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      2015 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup63(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      2031 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      2039 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      2043 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      2045 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      2046 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      2047 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `expandedProperties` = node.jsonObject("expandedProperties").decodeComposeModalWideNavigationRailPropertiesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
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
      0 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      3 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      4 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      5 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      6 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      7 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      8 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      9 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      10 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      11 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      12 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      13 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      14 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      15 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      16 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> scope.composeScoped3(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> scope.composeScoped3(
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

// androidx.compose.material3.adaptive.navigationsuite.NavigationSuite(navigationSuiteType: androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteColors, verticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, primaryActionContent: kotlin.Function0<kotlin.Unit>, content: kotlin.Function0<kotlin.Unit>)
internal object RendererNavigationSuite {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("verticalArrangement")) 1 else 0) +
      (if (node.has("primaryActionContent")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuite(
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuite(
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuite(
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `modifier` = node.modifier("modifier", scope),
        `primaryActionContent` = { RenderComposeChildren(node.slot("primaryActionContent")) },
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuite(
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `modifier` = node.modifier("modifier", scope),
        `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
        `primaryActionContent` = { RenderComposeChildren(node.slot("primaryActionContent")) },
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>?, modifier: androidx.compose.ui.Modifier, navigationSuiteType: androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType, enabled: kotlin.Boolean, badge: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.NavigationItemColors?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererNavigationSuiteItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("navigationSuiteType")) 1 else 0) +
      (if (node.has("enabled")) 2 else 0) +
      (if (node.has("badge")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
      )
      2 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      3 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `enabled` = node.boolean("enabled"),
      )
      4 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
      )
      5 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
      )
      6 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
      )
      7 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `enabled` = node.boolean("enabled"),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
      )
      8 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
      )
      9 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
      )
      10 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
      )
      11 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `enabled` = node.boolean("enabled"),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
      )
      12 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
      )
      13 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
      )
      14 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
      )
      15 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `enabled` = node.boolean("enabled"),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
      )
      16 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `enabled` = node.boolean("enabled"),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `enabled` = node.boolean("enabled"),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `enabled` = node.boolean("enabled"),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `colors` = if (node.isNull("colors")) null else (node.jsonObject("colors").decodeComposeNavigationItemColorsValue()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(navigationItems: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationSuiteType: androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType, navigationSuiteColors: androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteColors, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, state: androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldState, navigationItemVerticalArrangement: androidx.compose.foundation.layout.Arrangement.Vertical, primaryActionContent: kotlin.Function0<kotlin.Unit>, primaryActionContentHorizontalAlignment: androidx.compose.ui.Alignment.Horizontal, content: kotlin.Function0<kotlin.Unit>)
internal object RendererNavigationSuiteScaffold {
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_navigationItems: @Composable () -> Unit = { RenderComposeChildren(node.slot("navigationItems")) }
    val slot_primaryActionContent: @Composable () -> Unit = { RenderComposeChildren(node.slot("primaryActionContent")) }
    val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }
    val mask = (if (node.has("navigationSuiteType")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("state")) 8 else 0) +
      (if (node.has("navigationItemVerticalArrangement")) 16 else 0) +
      (if (node.has("primaryActionContent")) 32 else 0) +
      (if (node.has("primaryActionContentHorizontalAlignment")) 64 else 0)
    when (mask / 32) {
      0 -> renderNavigationSuiteScaffoldGroup0(node, scope, mask, renderChildren, slot_navigationItems, slot_primaryActionContent)
      1 -> renderNavigationSuiteScaffoldGroup1(node, scope, mask, renderChildren, slot_navigationItems, slot_primaryActionContent)
      2 -> renderNavigationSuiteScaffoldGroup2(node, scope, mask, renderChildren, slot_navigationItems, slot_primaryActionContent)
      3 -> renderNavigationSuiteScaffoldGroup3(node, scope, mask, renderChildren, slot_navigationItems, slot_primaryActionContent)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderNavigationSuiteScaffoldGroup0(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_navigationItems: @Composable () -> Unit, slot_primaryActionContent: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), content = renderChildren)
      1 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), content = renderChildren)
      2 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = renderChildren)
      3 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), content = renderChildren)
      4 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = renderChildren)
      5 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), content = renderChildren)
      6 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      7 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      8 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), content = renderChildren)
      9 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), content = renderChildren)
      10 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), content = renderChildren)
      11 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), content = renderChildren)
      12 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), content = renderChildren)
      13 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), content = renderChildren)
      14 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), content = renderChildren)
      15 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), content = renderChildren)
      16 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      17 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      18 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      19 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      20 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      21 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      22 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      23 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      24 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      25 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      26 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      27 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      28 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      29 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      30 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      31 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderNavigationSuiteScaffoldGroup1(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_navigationItems: @Composable () -> Unit, slot_primaryActionContent: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      33 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      34 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      35 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      36 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      37 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      38 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      39 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      40 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      41 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      42 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      43 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      44 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      45 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      46 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      47 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      48 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      49 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      50 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      51 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      52 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      53 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      54 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      55 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      56 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      57 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      58 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      59 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      60 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      61 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      62 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      63 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderNavigationSuiteScaffoldGroup2(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_navigationItems: @Composable () -> Unit, slot_primaryActionContent: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      65 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      66 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      67 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      68 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      69 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      70 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      71 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      72 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      73 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      74 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      75 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      76 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      77 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      78 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      79 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      80 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      81 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      82 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      83 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      84 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      85 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      86 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      87 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      88 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      89 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      90 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      91 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      92 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      93 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      94 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      95 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderNavigationSuiteScaffoldGroup3(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_navigationItems: @Composable () -> Unit, slot_primaryActionContent: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      97 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      98 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      99 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      100 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      101 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      102 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      103 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      104 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      105 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      106 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      107 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      108 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      109 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      110 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      111 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      112 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      113 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      114 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      115 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      116 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      117 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      118 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      119 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      120 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      121 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      122 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      123 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      124 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      125 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      126 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      127 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold(`navigationItems` = slot_navigationItems, `modifier` = node.modifier("modifier", scope), `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(), `navigationItemVerticalArrangement` = toComposeVerticalArrangement(node.string("navigationItemVerticalArrangement")), `primaryActionContent` = slot_primaryActionContent, `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(navigationSuite: kotlin.Function0<kotlin.Unit>, layoutType: androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType, state: androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldState, content: kotlin.Function0<kotlin.Unit>)
internal object RendererNavigationSuiteScaffoldLayout {
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("layoutType")) 1 else 0) +
      (if (node.has("state")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        `layoutType` = toComposeNavigationSuiteTypeValue(node.string("layoutType")),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        `layoutType` = toComposeNavigationSuiteTypeValue(node.string("layoutType")),
        `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(navigationSuite: kotlin.Function0<kotlin.Unit>, navigationSuiteType: androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType, state: androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldState, primaryActionContent: kotlin.Function0<kotlin.Unit>, primaryActionContentHorizontalAlignment: androidx.compose.ui.Alignment.Horizontal, content: kotlin.Function0<kotlin.Unit>)
internal object RendererNavigationSuiteScaffoldLayout_1 {
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("primaryActionContent")) 2 else 0) +
      (if (node.has("primaryActionContentHorizontalAlignment")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `primaryActionContent` = { RenderComposeChildren(node.slot("primaryActionContent")) },
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(),
        `primaryActionContent` = { RenderComposeChildren(node.slot("primaryActionContent")) },
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(),
        `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `primaryActionContent` = { RenderComposeChildren(node.slot("primaryActionContent")) },
        `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout(
        `navigationSuite` = { RenderComposeChildren(node.slot("navigationSuite")) },
        `navigationSuiteType` = toComposeNavigationSuiteTypeValue(node.string("navigationSuiteType")),
        `state` = node.jsonObject("state").decodeComposeNavigationSuiteScaffoldStateValue(),
        `primaryActionContent` = { RenderComposeChildren(node.slot("primaryActionContent")) },
        `primaryActionContentHorizontalAlignment` = toComposeHorizontalAlignment(node.string("primaryActionContentHorizontalAlignment")),
        content = { RenderComposeChildren(node.children) },
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
