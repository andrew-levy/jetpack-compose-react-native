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

// androidx.compose.material3.RichTooltip [receiver: androidx.compose.material3.TooltipScope](modifier: androidx.compose.ui.Modifier, title: kotlin.Function0<kotlin.Unit>?, action: kotlin.Function0<kotlin.Unit>?, caretSize: androidx.compose.ui.unit.DpSize, maxWidth: androidx.compose.ui.unit.Dp, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.RichTooltipColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, text: kotlin.Function0<kotlin.Unit>)
internal object RendererRichTooltip {
  private fun decode_maxWidth(node: ComposeNode) = node.number("maxWidth").dp
  private fun decode_tonalElevation(node: ComposeNode) = node.number("tonalElevation").dp
  private fun decode_shadowElevation(node: ComposeNode) = node.number("shadowElevation").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.TooltipScope) {
    val content_title: @Composable () -> Unit = { RenderComposeChildren(node.slot("title")) }
    val slot_title = if (node.isNull("title")) null else content_title
    val content_action: @Composable () -> Unit = { RenderComposeChildren(node.slot("action")) }
    val slot_action = if (node.isNull("action")) null else content_action
    val slot_text: @Composable () -> Unit = { RenderComposeChildren(node.slot("text")) }
    val mask = (if (node.has("title")) 1 else 0) +
      (if (node.has("action")) 2 else 0) +
      (if (node.has("caretSize")) 4 else 0) +
      (if (node.has("maxWidth")) 8 else 0) +
      (if (node.has("shape")) 16 else 0) +
      (if (node.has("colors")) 32 else 0) +
      (if (node.has("tonalElevation")) 64 else 0) +
      (if (node.has("shadowElevation")) 128 else 0)
    when (mask / 32) {
      0 -> renderRichTooltipGroup0(node, scope, mask, slot_title, slot_action, slot_text)
      1 -> renderRichTooltipGroup1(node, scope, mask, slot_title, slot_action, slot_text)
      2 -> renderRichTooltipGroup2(node, scope, mask, slot_title, slot_action, slot_text)
      3 -> renderRichTooltipGroup3(node, scope, mask, slot_title, slot_action, slot_text)
      4 -> renderRichTooltipGroup4(node, scope, mask, slot_title, slot_action, slot_text)
      5 -> renderRichTooltipGroup5(node, scope, mask, slot_title, slot_action, slot_text)
      6 -> renderRichTooltipGroup6(node, scope, mask, slot_title, slot_action, slot_text)
      7 -> renderRichTooltipGroup7(node, scope, mask, slot_title, slot_action, slot_text)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup0(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, slot_title: (@Composable () -> Unit)?, slot_action: (@Composable () -> Unit)?, slot_text: @Composable () -> Unit) {
    when (mask) {
      0 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `text` = slot_text)
      1 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `text` = slot_text)
      2 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `text` = slot_text)
      3 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `text` = slot_text)
      4 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `text` = slot_text)
      5 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `text` = slot_text)
      6 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `text` = slot_text)
      7 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `text` = slot_text)
      8 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `text` = slot_text)
      9 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `text` = slot_text)
      10 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `text` = slot_text)
      11 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `text` = slot_text)
      12 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `text` = slot_text)
      13 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `text` = slot_text)
      14 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `text` = slot_text)
      15 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `text` = slot_text)
      16 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      17 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shape` = node.arguments().shape("shape"), `text` = slot_text)
      18 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `text` = slot_text)
      19 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shape` = node.arguments().shape("shape"), `text` = slot_text)
      20 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      21 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      22 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      23 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      24 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      25 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      26 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      27 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      28 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      29 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      30 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      31 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `text` = slot_text)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup1(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, slot_title: (@Composable () -> Unit)?, slot_action: (@Composable () -> Unit)?, slot_text: @Composable () -> Unit) {
    when (mask) {
      32 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      33 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      34 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      35 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      36 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      37 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      38 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      39 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      40 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      41 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      42 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      43 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      44 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      45 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      46 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      47 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      48 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      49 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      50 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      51 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      52 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      53 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      54 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      55 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      56 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      57 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      58 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      59 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      60 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      61 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      62 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      63 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `text` = slot_text)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup2(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, slot_title: (@Composable () -> Unit)?, slot_action: (@Composable () -> Unit)?, slot_text: @Composable () -> Unit) {
    when (mask) {
      64 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      65 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      66 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      67 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      68 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      69 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      70 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      71 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      72 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      73 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      74 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      75 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      76 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      77 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      78 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      79 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      80 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      81 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      82 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      83 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      84 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      85 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      86 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      87 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      88 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      89 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      90 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      91 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      92 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      93 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      94 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      95 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup3(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, slot_title: (@Composable () -> Unit)?, slot_action: (@Composable () -> Unit)?, slot_text: @Composable () -> Unit) {
    when (mask) {
      96 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      97 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      98 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      99 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      100 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      101 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      102 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      103 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      104 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      105 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      106 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      107 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      108 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      109 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      110 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      111 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      112 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      113 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      114 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      115 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      116 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      117 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      118 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      119 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      120 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      121 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      122 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      123 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      124 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      125 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      126 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      127 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup4(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, slot_title: (@Composable () -> Unit)?, slot_action: (@Composable () -> Unit)?, slot_text: @Composable () -> Unit) {
    when (mask) {
      128 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      129 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      130 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      131 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      132 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      133 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      134 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      135 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      136 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      137 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      138 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      139 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      140 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      141 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      142 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      143 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      144 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      145 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      146 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      147 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      148 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      149 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      150 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      151 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      152 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      153 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      154 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      155 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      156 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      157 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      158 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      159 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup5(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, slot_title: (@Composable () -> Unit)?, slot_action: (@Composable () -> Unit)?, slot_text: @Composable () -> Unit) {
    when (mask) {
      160 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      161 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      162 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      163 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      164 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      165 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      166 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      167 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      168 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      169 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      170 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      171 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      172 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      173 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      174 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      175 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      176 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      177 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      178 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      179 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      180 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      181 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      182 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      183 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      184 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      185 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      186 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      187 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      188 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      189 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      190 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      191 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup6(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, slot_title: (@Composable () -> Unit)?, slot_action: (@Composable () -> Unit)?, slot_text: @Composable () -> Unit) {
    when (mask) {
      192 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      193 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      194 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      195 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      196 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      197 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      198 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      199 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      200 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      201 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      202 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      203 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      204 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      205 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      206 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      207 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      208 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      209 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      210 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      211 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      212 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      213 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      214 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      215 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      216 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      217 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      218 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      219 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      220 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      221 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      222 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      223 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup7(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, slot_title: (@Composable () -> Unit)?, slot_action: (@Composable () -> Unit)?, slot_text: @Composable () -> Unit) {
    when (mask) {
      224 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      225 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      226 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      227 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      228 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      229 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      230 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      231 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      232 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      233 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      234 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      235 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      236 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      237 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      238 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      239 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      240 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      241 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      242 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      243 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      244 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      245 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      246 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      247 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      248 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      249 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      250 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      251 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      252 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      253 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      254 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      255 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeRichTooltipColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.Row(modifier: androidx.compose.ui.Modifier, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, verticalAlignment: androidx.compose.ui.Alignment.Vertical, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("horizontalArrangement")) 1 else 0) +
      (if (node.has("verticalAlignment")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.layout.Row(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.foundation.layout.Row(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.foundation.layout.Row(
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.foundation.layout.Row(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Scaffold(modifier: androidx.compose.ui.Modifier, topBar: kotlin.Function0<kotlin.Unit>, bottomBar: kotlin.Function0<kotlin.Unit>, snackbarHost: kotlin.Function0<kotlin.Unit>, floatingActionButton: kotlin.Function0<kotlin.Unit>, floatingActionButtonPosition: androidx.compose.material3.FabPosition, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, contentWindowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.PaddingValues, kotlin.Unit>)
internal object RendererScaffold {
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_topBar: @Composable () -> Unit = { RenderComposeChildren(node.slot("topBar")) }
    val slot_bottomBar: @Composable () -> Unit = { RenderComposeChildren(node.slot("bottomBar")) }
    val slot_snackbarHost: @Composable () -> Unit = { RenderComposeChildren(node.slot("snackbarHost")) }
    val slot_floatingActionButton: @Composable () -> Unit = { RenderComposeChildren(node.slot("floatingActionButton")) }
    val mask = (if (node.has("topBar")) 1 else 0) +
      (if (node.has("bottomBar")) 2 else 0) +
      (if (node.has("snackbarHost")) 4 else 0) +
      (if (node.has("floatingActionButton")) 8 else 0) +
      (if (node.has("floatingActionButtonPosition")) 16 else 0) +
      (if (node.has("containerColor")) 32 else 0) +
      (if (node.has("contentColor")) 64 else 0) +
      (if (node.has("contentWindowInsets")) 128 else 0)
    when (mask / 32) {
      0 -> renderScaffoldGroup0(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      1 -> renderScaffoldGroup1(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      2 -> renderScaffoldGroup2(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      3 -> renderScaffoldGroup3(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      4 -> renderScaffoldGroup4(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      5 -> renderScaffoldGroup5(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      6 -> renderScaffoldGroup6(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      7 -> renderScaffoldGroup7(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      3 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      5 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      6 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      7 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      8 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      9 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      10 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      11 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      12 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      13 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      14 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      15 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      16 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      17 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      18 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      19 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      20 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      21 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      22 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      23 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      24 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      25 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      26 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      27 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      28 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      29 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      30 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      31 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      33 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      34 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      35 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      36 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      37 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      38 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      39 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      40 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      41 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      42 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      43 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      44 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      45 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      46 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      47 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      48 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      49 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      50 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      51 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      52 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      53 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      54 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      55 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      56 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      57 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      58 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      59 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      60 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      61 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      62 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      63 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      65 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      66 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      67 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      68 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      69 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      70 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      71 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      72 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      73 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      74 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      75 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      76 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      77 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      78 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      79 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      80 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      81 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      82 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      83 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      84 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      85 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      86 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      87 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      88 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      89 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      90 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      91 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      92 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      93 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      94 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      95 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      97 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      98 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      99 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      100 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      101 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      102 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      103 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      104 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      105 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      106 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      107 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      108 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      109 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      110 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      111 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      112 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      113 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      114 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      115 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      116 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      117 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      118 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      119 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      120 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      121 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      122 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      123 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      124 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      125 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      126 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      127 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup4(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      128 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      129 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      130 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      131 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      132 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      133 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      134 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      135 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      136 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      137 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      138 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      139 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      140 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      141 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      142 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      143 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      144 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      145 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      146 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      147 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      148 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      149 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      150 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      151 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      152 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      153 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      154 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      155 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      156 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      157 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      158 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      159 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup5(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      160 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      161 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      162 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      163 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      164 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      165 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      166 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      167 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      168 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      169 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      170 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      171 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      172 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      173 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      174 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      175 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      176 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      177 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      178 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      179 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      180 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      181 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      182 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      183 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      184 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      185 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      186 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      187 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      188 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      189 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      190 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      191 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup6(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      192 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      193 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      194 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      195 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      196 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      197 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      198 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      199 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      200 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      201 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      202 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      203 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      204 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      205 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      206 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      207 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      208 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      209 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      210 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      211 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      212 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      213 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      214 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      215 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      216 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      217 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      218 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      219 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      220 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      221 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      222 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      223 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup7(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      224 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      225 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      226 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      227 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      228 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      229 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      230 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      231 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      232 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      233 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      234 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      235 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      236 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      237 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      238 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      239 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      240 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      241 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      242 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      243 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      244 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      245 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      246 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      247 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      248 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      249 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      250 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      251 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      252 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      253 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      254 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      255 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ScrollableTabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, edgePadding: androidx.compose.ui.unit.Dp, indicator: kotlin.Function1<kotlin.collections.List<androidx.compose.material3.TabPosition>, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererScrollableTabRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("edgePadding")) 4 else 0) +
      (if (node.has("divider")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      1 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      2 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      3 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      4 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      5 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      6 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      7 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      8 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      9 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      10 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      11 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      12 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      13 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      14 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      15 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SearchBar(state: androidx.compose.material3.SearchBarState, inputField: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp)
internal object RendererSearchBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeSearchBarState() else null
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("shadowElevation")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      2 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
      )
      3 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
      )
      4 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      5 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      6 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      7 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      8 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      9 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      10 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      11 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      12 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      13 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      14 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      15 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SearchBar(inputField: kotlin.Function0<kotlin.Unit>, expanded: kotlin.Boolean, onExpandedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererSearchBar_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("shadowElevation")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TabRowDefaults.SecondaryIndicator(modifier: androidx.compose.ui.Modifier, height: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color)
internal object RendererSecondaryIndicator {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("height")) 1 else 0) +
      (if (node.has("color")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
      )
      2 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

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
