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
      (if (node.has("scrollBehavior")) 128 else 0)
    when (mask / 32) {
      0 -> renderMediumFlexibleTopAppBarGroup0(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      1 -> renderMediumFlexibleTopAppBarGroup1(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      2 -> renderMediumFlexibleTopAppBarGroup2(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      3 -> renderMediumFlexibleTopAppBarGroup3(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      4 -> renderMediumFlexibleTopAppBarGroup4(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      7 -> renderMediumFlexibleTopAppBarGroup7(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
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
      128 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      129 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      130 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      131 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      132 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      133 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      134 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      135 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      136 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      137 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      138 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      139 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      140 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      141 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      142 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      143 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      144 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      145 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      146 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      147 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      148 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      149 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      150 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      151 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      152 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      153 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      154 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      155 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      156 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      157 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      158 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      159 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderMediumFlexibleTopAppBarGroup7(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: (@Composable () -> Unit)?, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      255 -> androidx.compose.material3.MediumFlexibleTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `subtitle` = slot_subtitle, `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
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
      (if (node.has("scrollBehavior")) 32 else 0)
    when (mask / 32) {
      0 -> renderMediumTopAppBarGroup0(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      1 -> renderMediumTopAppBarGroup1(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
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
      32 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      33 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      34 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      35 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      36 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      37 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      38 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      39 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      40 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      41 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      42 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      43 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      44 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      45 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      46 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      47 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      48 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      49 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      50 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      51 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      52 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      53 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      54 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      55 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      56 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      57 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      58 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      59 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      60 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      61 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      62 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      63 -> androidx.compose.material3.MediumTopAppBar(`title` = slot_title, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `collapsedHeight` = decode_collapsedHeight(node), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
