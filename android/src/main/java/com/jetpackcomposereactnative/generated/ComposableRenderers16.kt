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

// androidx.compose.material3.SecondaryScrollableTabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, scrollState: androidx.compose.foundation.ScrollState, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, edgePadding: androidx.compose.ui.unit.Dp, indicator: kotlin.Function1<androidx.compose.material3.TabIndicatorScope, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, minTabWidth: androidx.compose.ui.unit.Dp, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererSecondaryScrollableTabRow {
  private fun decode_selectedTabIndex(node: ComposeNode) = node.number("selectedTabIndex").toInt()
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_edgePadding(node: ComposeNode) = node.number("edgePadding").dp
  private fun decode_minTabWidth(node: ComposeNode) = node.number("minTabWidth").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scrollStateValue = if (node.has("scrollState") && !node.isNull("scrollState")) node.jsonObject("scrollState").rememberComposeScrollState(node.arguments()) else null
    val slot_divider: @Composable () -> Unit = { RenderComposeChildren(node.slot("divider")) }
    val slot_tabs: @Composable () -> Unit = { RenderComposeChildren(node.slot("tabs")) }
    val mask = (if (node.has("scrollState")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("edgePadding")) 8 else 0) +
      (if (node.has("indicator")) 16 else 0) +
      (if (node.has("divider")) 32 else 0) +
      (if (node.has("minTabWidth")) 64 else 0)
    when (mask / 32) {
      0 -> renderSecondaryScrollableTabRowGroup0(node, scope, mask, scrollStateValue, slot_divider, slot_tabs)
      1 -> renderSecondaryScrollableTabRowGroup1(node, scope, mask, scrollStateValue, slot_divider, slot_tabs)
      2 -> renderSecondaryScrollableTabRowGroup2(node, scope, mask, scrollStateValue, slot_divider, slot_tabs)
      3 -> renderSecondaryScrollableTabRowGroup3(node, scope, mask, scrollStateValue, slot_divider, slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup0(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `tabs` = slot_tabs)
      1 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `tabs` = slot_tabs)
      2 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tabs` = slot_tabs)
      3 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tabs` = slot_tabs)
      4 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      5 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      6 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      7 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      8 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      9 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      10 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      11 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      12 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      13 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      14 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      15 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      16 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      17 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      18 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      19 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      20 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      21 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      22 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      23 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      24 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      25 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      26 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      27 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      28 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      29 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      30 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      31 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup1(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `divider` = slot_divider, `tabs` = slot_tabs)
      33 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `divider` = slot_divider, `tabs` = slot_tabs)
      34 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      35 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      36 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      37 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      38 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      39 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      40 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      41 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      42 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      43 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      44 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      45 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      46 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      47 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      48 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      49 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      50 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      51 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      52 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      53 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      54 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      55 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      56 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      57 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      58 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      59 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      60 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      61 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      62 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      63 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup2(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      65 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      66 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      67 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      68 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      69 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      70 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      71 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      72 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      73 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      74 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      75 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      76 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      77 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      78 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      79 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      80 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      81 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      82 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      83 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      84 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      85 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      86 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      87 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      88 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      89 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      90 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      91 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      92 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      93 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      94 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      95 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup3(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      97 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      98 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      99 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      100 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      101 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      102 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      103 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      104 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      105 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      106 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      107 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      108 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      109 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      110 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      111 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      112 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      113 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      114 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      115 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      116 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      117 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      118 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      119 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      120 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      121 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      122 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      123 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      124 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      125 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      126 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      127 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SecondaryTabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, indicator: kotlin.Function1<androidx.compose.material3.TabIndicatorScope, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererSecondaryTabRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("indicator")) 4 else 0) +
      (if (node.has("divider")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      1 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      2 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      3 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      4 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      5 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      6 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      7 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      8 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      9 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      10 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      11 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      12 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      13 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      14 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      15 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SecureTextField(state: androidx.compose.foundation.text.input.TextFieldState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, labelPosition: androidx.compose.material3.TextFieldLabelPosition, label: kotlin.Function1<androidx.compose.material3.TextFieldLabelScope, kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, isError: kotlin.Boolean, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, textObfuscationMode: androidx.compose.foundation.text.input.TextObfuscationMode, textObfuscationCharacter: kotlin.Char, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, onKeyboardAction: androidx.compose.foundation.text.input.KeyboardActionHandler?, onTextLayout: kotlin.Function2<androidx.compose.ui.unit.Density, kotlin.Function0<androidx.compose.ui.text.TextLayoutResult?>, kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererSecureTextField {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_isError(node: ComposeNode) = node.boolean("isError")
  private fun decode_textObfuscationCharacter(node: ComposeNode) = node.string("textObfuscationCharacter").single()

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
      (if (node.has("textObfuscationMode")) 1024 else 0) +
      (if (node.has("textObfuscationCharacter")) 2048 else 0) +
      (if (node.has("keyboardOptions")) 4096 else 0) +
      (if (node.has("onKeyboardAction")) 8192 else 0) +
      (if (node.has("onTextLayout")) 16384 else 0) +
      (if (node.has("shape")) 32768 else 0) +
      (if (node.has("colors")) 65536 else 0) +
      (if (node.has("contentPadding")) 131072 else 0) +
      (if (node.has("interactionSource")) 262144 else 0)
    when (mask / 32) {
      0 -> renderSecureTextFieldGroup0(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1 -> renderSecureTextFieldGroup1(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2 -> renderSecureTextFieldGroup2(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      4 -> renderSecureTextFieldGroup4(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8 -> renderSecureTextFieldGroup8(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16 -> renderSecureTextFieldGroup16(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      32 -> renderSecureTextFieldGroup32(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      64 -> renderSecureTextFieldGroup64(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      96 -> renderSecureTextFieldGroup96(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      128 -> renderSecureTextFieldGroup128(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      144 -> renderSecureTextFieldGroup144(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      256 -> renderSecureTextFieldGroup256(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      272 -> renderSecureTextFieldGroup272(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      384 -> renderSecureTextFieldGroup384(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      400 -> renderSecureTextFieldGroup400(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      512 -> renderSecureTextFieldGroup512(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1024 -> renderSecureTextFieldGroup1024(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2048 -> renderSecureTextFieldGroup2048(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2080 -> renderSecureTextFieldGroup2080(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2112 -> renderSecureTextFieldGroup2112(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      4096 -> renderSecureTextFieldGroup4096(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      5135 -> renderSecureTextFieldGroup5135(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8192 -> renderSecureTextFieldGroup8192(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8193 -> renderSecureTextFieldGroup8193(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13327 -> renderSecureTextFieldGroup13327(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13455 -> renderSecureTextFieldGroup13455(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13583 -> renderSecureTextFieldGroup13583(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13711 -> renderSecureTextFieldGroup13711(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13727 -> renderSecureTextFieldGroup13727(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13759 -> renderSecureTextFieldGroup13759(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13791 -> renderSecureTextFieldGroup13791(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13823 -> renderSecureTextFieldGroup13823(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14239 -> renderSecureTextFieldGroup14239(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14271 -> renderSecureTextFieldGroup14271(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14303 -> renderSecureTextFieldGroup14303(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14335 -> renderSecureTextFieldGroup14335(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15775 -> renderSecureTextFieldGroup15775(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15807 -> renderSecureTextFieldGroup15807(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15839 -> renderSecureTextFieldGroup15839(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15871 -> renderSecureTextFieldGroup15871(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16287 -> renderSecureTextFieldGroup16287(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16319 -> renderSecureTextFieldGroup16319(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16351 -> renderSecureTextFieldGroup16351(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16383 -> renderSecureTextFieldGroup16383(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      3 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      4 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder)
      5 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder)
      6 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder)
      7 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder)
      8 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      9 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon)
      10 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon)
      11 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon)
      12 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      13 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      14 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      15 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      16 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon)
      17 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon)
      18 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon)
      19 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon)
      20 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      21 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      22 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      23 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      24 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      25 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      26 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      27 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      28 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      29 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      30 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      31 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `prefix` = slot_prefix)
      33 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `prefix` = slot_prefix)
      36 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      37 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      40 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      41 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      44 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      45 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      48 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      49 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      52 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      53 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      56 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      57 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      60 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      61 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `suffix` = slot_suffix)
      65 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `suffix` = slot_suffix)
      68 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      69 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      72 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      73 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      76 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      77 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      80 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      81 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      84 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      85 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      88 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      89 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      92 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      93 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText)
      129 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `supportingText` = slot_supportingText)
      132 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      133 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      136 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      137 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      140 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      141 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      144 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      145 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      148 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      149 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      152 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      153 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      156 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      157 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      256 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `isError` = decode_isError(node))
      257 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `isError` = decode_isError(node))
      260 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `isError` = decode_isError(node))
      261 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `isError` = decode_isError(node))
      264 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      265 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      268 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      269 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      272 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      273 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      276 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      277 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      280 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      281 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      284 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      285 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      512 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      513 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      514 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      515 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup32(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      1024 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1025 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1026 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1027 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1028 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1029 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1030 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1031 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1032 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1033 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1034 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1035 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1036 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1037 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1038 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1039 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1040 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1041 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1042 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1043 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1044 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1045 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1046 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1047 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1048 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1049 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1050 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1051 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1052 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1053 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1054 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1055 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup64(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      2048 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2049 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2050 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2051 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2052 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2053 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2054 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2055 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2056 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2057 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2058 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2059 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2060 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2061 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2062 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2063 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2064 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2065 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2066 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2067 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2068 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2069 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2070 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2071 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2072 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2073 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2074 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2075 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2076 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2077 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2078 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2079 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup96(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      3072 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup128(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      4096 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4097 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4100 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4101 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4104 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4105 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4108 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4109 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4112 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4113 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4116 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4117 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4120 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4121 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4124 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4125 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup144(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      4608 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4609 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4610 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4611 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup256(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      8192 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8193 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8196 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8197 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8200 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8201 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8204 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8205 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8208 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8209 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8212 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8213 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8216 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8217 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8220 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8221 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup272(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      8704 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8705 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8706 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8707 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup384(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      12288 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup400(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      12800 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      12801 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      12802 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      12803 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup512(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      16384 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16385 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16386 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16387 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16388 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16389 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16390 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16391 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16392 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16393 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16394 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16395 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16396 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16397 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16398 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16399 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16400 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16401 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16402 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16403 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16404 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16405 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16406 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16407 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16408 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16409 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16410 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16411 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16412 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16413 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16414 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16415 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup1024(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32768 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      32769 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      32772 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      32773 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      32776 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32777 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32780 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32781 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32784 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32785 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32788 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32789 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32792 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32793 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32796 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32797 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup2048(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      65536 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65537 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65538 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65539 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65540 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65541 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65542 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65543 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65544 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65545 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65546 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65547 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65548 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65549 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65550 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65551 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65552 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65553 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65554 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65555 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65556 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65557 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65558 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65559 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65560 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65561 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65562 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65563 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65564 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65565 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65566 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65567 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup2080(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      66560 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup2112(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      67584 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup4096(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      131072 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131073 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131076 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131077 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131080 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131081 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131084 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131085 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131088 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131089 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131092 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131093 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131096 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131097 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131100 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131101 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup5135(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      164351 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup8192(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      262144 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262145 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262146 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262147 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262148 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262149 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262150 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262151 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262152 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262153 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262154 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262155 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262156 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262157 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262158 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262159 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262160 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262161 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262162 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262163 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262164 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262165 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262166 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262167 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262168 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262169 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262170 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262171 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262172 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262173 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262174 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262175 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup8193(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      262176 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262177 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262178 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262179 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262180 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262181 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262182 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262183 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262184 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262185 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262186 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262187 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262188 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262189 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262190 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262191 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262192 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262193 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262194 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262195 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262196 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262197 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262198 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262199 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262200 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262201 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262202 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262203 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262204 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262205 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262206 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262207 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13327(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      426495 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13455(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      430591 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13583(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      434687 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13711(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      438783 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13727(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      439295 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13759(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      440319 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13791(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      441343 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13823(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      442367 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup14239(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      455679 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup14271(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      456703 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup14303(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      457727 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup14335(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      458751 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15775(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      504831 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15807(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      505855 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15839(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      506879 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15871(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      507903 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16287(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      521215 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16319(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      522239 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16351(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      523263 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16383(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      524287 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SegmentedButton [receiver: androidx.compose.material3.MultiChoiceSegmentedButtonRowScope](checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, shape: androidx.compose.ui.graphics.Shape, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SegmentedButtonColors, border: androidx.compose.foundation.BorderStroke, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>)
internal object RendererSegmentedButton {
  private fun decode_checked(node: ComposeNode) = node.boolean("checked")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.MultiChoiceSegmentedButtonRowScope) {
    val slot_icon: @Composable () -> Unit = { RenderComposeChildren(node.slot("icon")) }
    val slot_label: @Composable () -> Unit = { RenderComposeChildren(node.slot("label")) }
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0) +
      (if (node.has("icon")) 32 else 0)
    when (mask / 32) {
      0 -> renderSegmentedButtonGroup0(node, scope, mask, slot_icon, slot_label)
      1 -> renderSegmentedButtonGroup1(node, scope, mask, slot_icon, slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSegmentedButtonGroup0(node: ComposeNode, scope: androidx.compose.material3.MultiChoiceSegmentedButtonRowScope, mask: Int, slot_icon: @Composable () -> Unit, slot_label: @Composable () -> Unit) {
    when (mask) {
      0 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `label` = slot_label)
      1 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `label` = slot_label)
      2 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `label` = slot_label)
      3 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `label` = slot_label)
      4 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      5 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      6 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      7 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      8 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      9 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      10 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      11 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      12 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      13 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      14 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      15 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      16 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      17 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      18 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      19 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      20 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      21 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      22 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      23 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      24 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      25 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      26 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      27 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      28 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      29 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      30 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      31 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSegmentedButtonGroup1(node: ComposeNode, scope: androidx.compose.material3.MultiChoiceSegmentedButtonRowScope, mask: Int, slot_icon: @Composable () -> Unit, slot_label: @Composable () -> Unit) {
    when (mask) {
      32 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `label` = slot_label)
      33 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `label` = slot_label)
      34 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `icon` = slot_icon, `label` = slot_label)
      35 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `icon` = slot_icon, `label` = slot_label)
      36 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      37 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      38 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      39 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      40 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      41 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      42 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      43 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      44 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      45 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      46 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      47 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      48 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      49 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      50 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      51 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      52 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      53 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      54 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      55 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      56 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      57 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      58 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      59 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      60 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      61 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      62 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      63 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SegmentedButton [receiver: androidx.compose.material3.SingleChoiceSegmentedButtonRowScope](selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, shape: androidx.compose.ui.graphics.Shape, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SegmentedButtonColors, border: androidx.compose.foundation.BorderStroke, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>)
internal object RendererSegmentedButton_1 {
  private fun decode_selected(node: ComposeNode) = node.boolean("selected")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.SingleChoiceSegmentedButtonRowScope) {
    val slot_icon: @Composable () -> Unit = { RenderComposeChildren(node.slot("icon")) }
    val slot_label: @Composable () -> Unit = { RenderComposeChildren(node.slot("label")) }
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0) +
      (if (node.has("icon")) 32 else 0)
    when (mask / 32) {
      0 -> renderSegmentedButton_1Group0(node, scope, mask, slot_icon, slot_label)
      1 -> renderSegmentedButton_1Group1(node, scope, mask, slot_icon, slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSegmentedButton_1Group0(node: ComposeNode, scope: androidx.compose.material3.SingleChoiceSegmentedButtonRowScope, mask: Int, slot_icon: @Composable () -> Unit, slot_label: @Composable () -> Unit) {
    when (mask) {
      0 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `label` = slot_label)
      1 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `label` = slot_label)
      2 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `label` = slot_label)
      3 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `label` = slot_label)
      4 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      5 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      6 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      7 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      8 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      9 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      10 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      11 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      12 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      13 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      14 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      15 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      16 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      17 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      18 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      19 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      20 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      21 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      22 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      23 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      24 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      25 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      26 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      27 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      28 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      29 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      30 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      31 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSegmentedButton_1Group1(node: ComposeNode, scope: androidx.compose.material3.SingleChoiceSegmentedButtonRowScope, mask: Int, slot_icon: @Composable () -> Unit, slot_label: @Composable () -> Unit) {
    when (mask) {
      32 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `label` = slot_label)
      33 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `label` = slot_label)
      34 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `icon` = slot_icon, `label` = slot_label)
      35 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `icon` = slot_icon, `label` = slot_label)
      36 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      37 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      38 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      39 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      40 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      41 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      42 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      43 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      44 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      45 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      46 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      47 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      48 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      49 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      50 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      51 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      52 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      53 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      54 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      55 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      56 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      57 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      58 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      59 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      60 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      61 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      62 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      63 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.selection.SelectionContainer(modifier: androidx.compose.ui.Modifier, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSelectionContainer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.foundation.text.selection.SelectionContainer(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.animation.SharedTransitionLayout(modifier: androidx.compose.ui.Modifier, content: kotlin.Function1<androidx.compose.animation.SharedTransitionScope, kotlin.Unit>)
internal object RendererSharedTransitionLayout {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.animation.SharedTransitionLayout(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

// androidx.compose.material3.ShortNavigationBar(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, windowInsets: androidx.compose.foundation.layout.WindowInsets, arrangement: androidx.compose.material3.ShortNavigationBarArrangement, content: kotlin.Function0<kotlin.Unit>)
internal object RendererShortNavigationBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("windowInsets")) 4 else 0) +
      (if (node.has("arrangement")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ShortNavigationBarItem(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>?, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, iconPosition: androidx.compose.material3.NavigationItemIconPosition, colors: androidx.compose.material3.NavigationItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererShortNavigationBarItem {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("iconPosition")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
      )
      3 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
      )
      4 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      5 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      6 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      7 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      8 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      9 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      10 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      11 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      12 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      13 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      14 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      15 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SingleChoiceSegmentedButtonRow(modifier: androidx.compose.ui.Modifier, space: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.material3.SingleChoiceSegmentedButtonRowScope, kotlin.Unit>)
internal object RendererSingleChoiceSegmentedButtonRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("space")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SingleChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SingleChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        `space` = node.number("space").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Slider(state: androidx.compose.material3.SliderState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource, thumb: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>, track: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>)
internal object RendererSlider {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      3 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      4 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      5 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      6 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      7 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Slider(value: kotlin.Float, onValueChange: kotlin.Function1<kotlin.Float, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, valueRange: kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, steps: kotlin.Int, onValueChangeFinished: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.SliderColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource)
internal object RendererSlider_1 {
  private fun decode_value(node: ComposeNode) = node.number("value").toFloat()
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_steps(node: ComposeNode) = node.number("steps").toInt()

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("valueRange")) 2 else 0) +
      (if (node.has("steps")) 4 else 0) +
      (if (node.has("onValueChangeFinished")) 8 else 0) +
      (if (node.has("colors")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderSlider_1Group0(node, scope, mask)
      1 -> renderSlider_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSlider_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"))
      3 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"))
      4 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node))
      5 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node))
      6 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node))
      7 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node))
      8 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      9 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      10 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      11 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      12 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      13 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      14 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      15 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      16 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      17 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      18 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      19 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      20 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      21 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      22 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      23 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      24 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      25 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      26 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      27 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      28 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      29 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      30 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      31 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSlider_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      33 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      34 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      35 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      36 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      37 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      38 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      39 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      40 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      41 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      42 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      43 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      44 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      45 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      46 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      47 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      48 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      49 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      50 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      51 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      52 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      53 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      54 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      55 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      56 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      57 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      58 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      59 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      60 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      61 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      62 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      63 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SmallExtendedFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererSmallExtendedFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
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

// androidx.compose.material3.SmallExtendedFloatingActionButton(text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, expanded: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererSmallExtendedFloatingActionButton_1 {
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
      0 -> renderSmallExtendedFloatingActionButton_1Group0(node, scope, mask, slot_text, slot_icon)
      1 -> renderSmallExtendedFloatingActionButton_1Group1(node, scope, mask, slot_text, slot_icon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderSmallExtendedFloatingActionButton_1Group0(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_icon: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node))
      2 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      3 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"))
      4 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node))
      5 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node))
      6 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node))
      7 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node))
      8 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node))
      9 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node))
      10 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node))
      11 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node))
      12 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      13 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      14 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      15 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      16 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      17 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      18 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      19 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      20 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      21 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      22 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      23 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      24 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      25 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      26 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      27 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      28 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      29 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      30 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      31 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderSmallExtendedFloatingActionButton_1Group1(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_icon: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      33 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      34 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      35 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      36 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      37 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      38 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      39 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      40 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      41 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      42 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      43 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      44 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      45 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      46 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      47 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      48 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      49 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      50 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      51 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      52 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      53 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      54 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      55 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      56 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      57 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      58 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      59 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      60 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      61 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      62 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      63 -> androidx.compose.material3.SmallExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SmallFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSmallFloatingActionButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.SmallFloatingActionButton(
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

// androidx.compose.material3.Snackbar(modifier: androidx.compose.ui.Modifier, action: kotlin.Function0<kotlin.Unit>?, dismissAction: kotlin.Function0<kotlin.Unit>?, actionOnNewLine: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, actionContentColor: androidx.compose.ui.graphics.Color, dismissActionContentColor: androidx.compose.ui.graphics.Color, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSnackbar {
  private fun decode_actionOnNewLine(node: ComposeNode) = node.boolean("actionOnNewLine")
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_actionContentColor(node: ComposeNode) = node.color("actionContentColor")
  private fun decode_dismissActionContentColor(node: ComposeNode) = node.color("dismissActionContentColor")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val content_action: @Composable () -> Unit = { RenderComposeChildren(node.slot("action")) }
    val slot_action = if (node.isNull("action")) null else content_action
    val content_dismissAction: @Composable () -> Unit = { RenderComposeChildren(node.slot("dismissAction")) }
    val slot_dismissAction = if (node.isNull("dismissAction")) null else content_dismissAction
    val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }
    val mask = (if (node.has("action")) 1 else 0) +
      (if (node.has("dismissAction")) 2 else 0) +
      (if (node.has("actionOnNewLine")) 4 else 0) +
      (if (node.has("shape")) 8 else 0) +
      (if (node.has("containerColor")) 16 else 0) +
      (if (node.has("contentColor")) 32 else 0) +
      (if (node.has("actionContentColor")) 64 else 0) +
      (if (node.has("dismissActionContentColor")) 128 else 0)
    when (mask / 32) {
      0 -> renderSnackbarGroup0(node, scope, mask, renderChildren, slot_action, slot_dismissAction)
      1 -> renderSnackbarGroup1(node, scope, mask, renderChildren, slot_action, slot_dismissAction)
      2 -> renderSnackbarGroup2(node, scope, mask, renderChildren, slot_action, slot_dismissAction)
      3 -> renderSnackbarGroup3(node, scope, mask, renderChildren, slot_action, slot_dismissAction)
      4 -> renderSnackbarGroup4(node, scope, mask, renderChildren, slot_action, slot_dismissAction)
      5 -> renderSnackbarGroup5(node, scope, mask, renderChildren, slot_action, slot_dismissAction)
      6 -> renderSnackbarGroup6(node, scope, mask, renderChildren, slot_action, slot_dismissAction)
      7 -> renderSnackbarGroup7(node, scope, mask, renderChildren, slot_action, slot_dismissAction)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup0(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_action: (@Composable () -> Unit)?, slot_dismissAction: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), content = renderChildren)
      1 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, content = renderChildren)
      2 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, content = renderChildren)
      3 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, content = renderChildren)
      4 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), content = renderChildren)
      5 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), content = renderChildren)
      6 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), content = renderChildren)
      7 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), content = renderChildren)
      8 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = renderChildren)
      9 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), content = renderChildren)
      10 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), content = renderChildren)
      11 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), content = renderChildren)
      12 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), content = renderChildren)
      13 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), content = renderChildren)
      14 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), content = renderChildren)
      15 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), content = renderChildren)
      16 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = renderChildren)
      17 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `containerColor` = decode_containerColor(node), content = renderChildren)
      18 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), content = renderChildren)
      19 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), content = renderChildren)
      20 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      21 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      22 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      23 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      24 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      25 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      26 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      27 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      28 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      29 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      30 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      31 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup1(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_action: (@Composable () -> Unit)?, slot_dismissAction: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = renderChildren)
      33 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `contentColor` = decode_contentColor(node), content = renderChildren)
      34 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `contentColor` = decode_contentColor(node), content = renderChildren)
      35 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `contentColor` = decode_contentColor(node), content = renderChildren)
      36 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      37 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      38 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      39 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      40 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      41 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      42 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      43 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      44 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      45 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      46 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      47 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      48 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      49 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      50 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      51 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      52 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      53 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      54 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      55 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      56 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      57 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      58 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      59 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      60 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      61 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      62 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      63 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup2(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_action: (@Composable () -> Unit)?, slot_dismissAction: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      65 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      66 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      67 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      68 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      69 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      70 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      71 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      72 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      73 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      74 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      75 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      76 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      77 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      78 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      79 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      80 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      81 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      82 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      83 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      84 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      85 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      86 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      87 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      88 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      89 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      90 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      91 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      92 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      93 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      94 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      95 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup3(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_action: (@Composable () -> Unit)?, slot_dismissAction: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      97 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      98 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      99 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      100 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      101 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      102 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      103 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      104 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      105 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      106 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      107 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      108 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      109 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      110 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      111 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      112 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      113 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      114 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      115 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      116 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      117 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      118 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      119 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      120 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      121 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      122 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      123 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      124 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      125 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      126 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      127 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup4(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_action: (@Composable () -> Unit)?, slot_dismissAction: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      129 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      130 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      131 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      132 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      133 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      134 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      135 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      136 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      137 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      138 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      139 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      140 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      141 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      142 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      143 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      144 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      145 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      146 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      147 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      148 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      149 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      150 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      151 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      152 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      153 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      154 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      155 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      156 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      157 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      158 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      159 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup5(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_action: (@Composable () -> Unit)?, slot_dismissAction: (@Composable () -> Unit)?) {
    when (mask) {
      160 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      161 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      162 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      163 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      164 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      165 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      166 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      167 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      168 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      169 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      170 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      171 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      172 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      173 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      174 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      175 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      176 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      177 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      178 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      179 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      180 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      181 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      182 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      183 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      184 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      185 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      186 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      187 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      188 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      189 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      190 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      191 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup6(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_action: (@Composable () -> Unit)?, slot_dismissAction: (@Composable () -> Unit)?) {
    when (mask) {
      192 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      193 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      194 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      195 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      196 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      197 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      198 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      199 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      200 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      201 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      202 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      203 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      204 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      205 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      206 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      207 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      208 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      209 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      210 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      211 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      212 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      213 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      214 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      215 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      216 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      217 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      218 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      219 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      220 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      221 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      222 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      223 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup7(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit, slot_action: (@Composable () -> Unit)?, slot_dismissAction: (@Composable () -> Unit)?) {
    when (mask) {
      224 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      225 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      226 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      227 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      228 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      229 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      230 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      231 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      232 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      233 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      234 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      235 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      236 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      237 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      238 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      239 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      240 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      241 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      242 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      243 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      244 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      245 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      246 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      247 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      248 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      249 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      250 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      251 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      252 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      253 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      254 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      255 -> androidx.compose.material3.Snackbar(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `dismissAction` = slot_dismissAction, `actionOnNewLine` = decode_actionOnNewLine(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `actionContentColor` = decode_actionContentColor(node), `dismissActionContentColor` = decode_dismissActionContentColor(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SnackbarHost(hostState: androidx.compose.material3.SnackbarHostState, modifier: androidx.compose.ui.Modifier, snackbar: kotlin.Function1<androidx.compose.material3.SnackbarData, kotlin.Unit>)
internal object RendererSnackbarHost {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val hostStateValue = if (node.has("hostState") && !node.isNull("hostState")) node.jsonObject("hostState").rememberComposeSnackbarHostState() else null
    androidx.compose.material3.SnackbarHost(
      `hostState` = requireNotNull(hostStateValue),
      `modifier` = node.modifier("modifier", scope),
    )
  }
}

// androidx.compose.foundation.layout.Spacer(modifier: androidx.compose.ui.Modifier)
internal object RendererSpacer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.foundation.layout.Spacer(
      `modifier` = node.modifier("modifier", scope),
    )
  }
}

// androidx.compose.material3.SplitButtonLayout(leadingButton: kotlin.Function0<kotlin.Unit>, trailingButton: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, spacing: androidx.compose.ui.unit.Dp)
internal object RendererSplitButtonLayout {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("spacing")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonLayout(
        `leadingButton` = { RenderComposeChildren(node.slot("leadingButton")) },
        `trailingButton` = { RenderComposeChildren(node.slot("trailingButton")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SplitButtonLayout(
        `leadingButton` = { RenderComposeChildren(node.slot("leadingButton")) },
        `trailingButton` = { RenderComposeChildren(node.slot("trailingButton")) },
        `modifier` = node.modifier("modifier", scope),
        `spacing` = node.number("spacing").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererStandardFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
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
