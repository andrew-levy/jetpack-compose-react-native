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

// androidx.compose.material3.ExpandedDockedSearchBarWithGap(state: androidx.compose.material3.SearchBarState, inputField: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, dropdownShape: androidx.compose.ui.graphics.Shape, dropdownGapSize: androidx.compose.ui.unit.Dp, dropdownScrimColor: androidx.compose.ui.graphics.Color, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, properties: androidx.compose.ui.window.PopupProperties, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererExpandedDockedSearchBarWithGap {
  private fun decode_dropdownGapSize(node: ComposeNode) = node.number("dropdownGapSize").dp
  private fun decode_dropdownScrimColor(node: ComposeNode) = node.color("dropdownScrimColor")
  private fun decode_tonalElevation(node: ComposeNode) = node.number("tonalElevation").dp
  private fun decode_shadowElevation(node: ComposeNode) = node.number("shadowElevation").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeSearchBarState() else null
    val slot_inputField: @Composable () -> Unit = { RenderComposeChildren(node.slot("inputField")) }
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("dropdownShape")) 2 else 0) +
      (if (node.has("dropdownGapSize")) 4 else 0) +
      (if (node.has("dropdownScrimColor")) 8 else 0) +
      (if (node.has("colors")) 16 else 0) +
      (if (node.has("tonalElevation")) 32 else 0) +
      (if (node.has("shadowElevation")) 64 else 0) +
      (if (node.has("properties")) 128 else 0)
    when (mask / 32) {
      0 -> renderExpandedDockedSearchBarWithGapGroup0(node, scope, mask, stateValue, slot_inputField)
      1 -> renderExpandedDockedSearchBarWithGapGroup1(node, scope, mask, stateValue, slot_inputField)
      2 -> renderExpandedDockedSearchBarWithGapGroup2(node, scope, mask, stateValue, slot_inputField)
      3 -> renderExpandedDockedSearchBarWithGapGroup3(node, scope, mask, stateValue, slot_inputField)
      4 -> renderExpandedDockedSearchBarWithGapGroup4(node, scope, mask, stateValue, slot_inputField)
      5 -> renderExpandedDockedSearchBarWithGapGroup5(node, scope, mask, stateValue, slot_inputField)
      6 -> renderExpandedDockedSearchBarWithGapGroup6(node, scope, mask, stateValue, slot_inputField)
      7 -> renderExpandedDockedSearchBarWithGapGroup7(node, scope, mask, stateValue, slot_inputField)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderExpandedDockedSearchBarWithGapGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.SearchBarState?, slot_inputField: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderExpandedDockedSearchBarWithGapGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.SearchBarState?, slot_inputField: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderExpandedDockedSearchBarWithGapGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.SearchBarState?, slot_inputField: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderExpandedDockedSearchBarWithGapGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.SearchBarState?, slot_inputField: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderExpandedDockedSearchBarWithGapGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.SearchBarState?, slot_inputField: @Composable () -> Unit) {
    when (mask) {
      128 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      129 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      130 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      131 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      132 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      133 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      134 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      135 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      136 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      137 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      138 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      139 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      140 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      141 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      142 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      143 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      144 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      145 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      146 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      147 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      148 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      149 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      150 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      151 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      152 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      153 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      154 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      155 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      156 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      157 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      158 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      159 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderExpandedDockedSearchBarWithGapGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.SearchBarState?, slot_inputField: @Composable () -> Unit) {
    when (mask) {
      160 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      161 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      162 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      163 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      164 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      165 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      166 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      167 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      168 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      169 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      170 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      171 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      172 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      173 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      174 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      175 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      176 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      177 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      178 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      179 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      180 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      181 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      182 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      183 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      184 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      185 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      186 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      187 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      188 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      189 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      190 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      191 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderExpandedDockedSearchBarWithGapGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.SearchBarState?, slot_inputField: @Composable () -> Unit) {
    when (mask) {
      192 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      193 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      194 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      195 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      196 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      197 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      198 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      199 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      200 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      201 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      202 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      203 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      204 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      205 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      206 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      207 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      208 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      209 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      210 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      211 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      212 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      213 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      214 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      215 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      216 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      217 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      218 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      219 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      220 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      221 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      222 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      223 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderExpandedDockedSearchBarWithGapGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.SearchBarState?, slot_inputField: @Composable () -> Unit) {
    when (mask) {
      224 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      225 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      226 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      227 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      228 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      229 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      230 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      231 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      232 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      233 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      234 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      235 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      236 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      237 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      238 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      239 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      240 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      241 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      242 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      243 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      244 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      245 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      246 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      247 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      248 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      249 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      250 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      251 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      252 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      253 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      254 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      255 -> androidx.compose.material3.ExpandedDockedSearchBarWithGap(`state` = requireNotNull(stateValue), `inputField` = slot_inputField, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `dropdownShape` = node.arguments().shape("dropdownShape"), `dropdownGapSize` = decode_dropdownGapSize(node), `dropdownScrimColor` = decode_dropdownScrimColor(node), `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `properties` = node.jsonObject("properties").toComposePopupProperties(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ExpandedFullScreenContainedSearchBar(state: androidx.compose.material3.SearchBarState, inputField: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, collapsedShape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, windowInsets: kotlin.Function0<androidx.compose.foundation.layout.WindowInsets>, properties: androidx.compose.ui.window.DialogProperties, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererExpandedFullScreenContainedSearchBar {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeSearchBarState() else null
    val mask = (if (node.has("collapsedShape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("shadowElevation")) 8 else 0) +
      (if (node.has("properties")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.ExpandedFullScreenContainedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ExpandedFullScreenSearchBar(state: androidx.compose.material3.SearchBarState, inputField: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, collapsedShape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, windowInsets: kotlin.Function0<androidx.compose.foundation.layout.WindowInsets>, properties: androidx.compose.ui.window.DialogProperties, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererExpandedFullScreenSearchBar {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeSearchBarState() else null
    val mask = (if (node.has("collapsedShape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("shadowElevation")) 8 else 0) +
      (if (node.has("properties")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ExposedDropdownMenuBox(expanded: kotlin.Boolean, onExpandedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, content: kotlin.Function1<androidx.compose.material3.ExposedDropdownMenuBoxScope, kotlin.Unit>)
internal object RendererExposedDropdownMenuBox {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.material3.ExposedDropdownMenuBox(
      `expanded` = node.boolean("expanded"),
      `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

// androidx.compose.material3.ExtendedFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererExtendedFloatingActionButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.ExtendedFloatingActionButton(
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

// androidx.compose.material3.ExtendedFloatingActionButton(text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, expanded: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererExtendedFloatingActionButton_1 {
  private fun decode_expanded(node: ComposeNode) = node.boolean("expanded")
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")

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
      0 -> renderExtendedFloatingActionButton_1Group0(node, scope, mask, slot_text, slot_icon)
      1 -> renderExtendedFloatingActionButton_1Group1(node, scope, mask, slot_text, slot_icon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderExtendedFloatingActionButton_1Group0(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_icon: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node))
      2 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      3 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"))
      4 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node))
      5 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node))
      6 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node))
      7 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node))
      8 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node))
      9 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node))
      10 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node))
      11 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node))
      12 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      13 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      14 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      15 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      16 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      17 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      18 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      19 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      20 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      21 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      22 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      23 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      24 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      25 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      26 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      27 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      28 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      29 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      30 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      31 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderExtendedFloatingActionButton_1Group1(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_icon: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      33 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      34 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      35 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      36 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      37 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      38 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      39 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      40 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      41 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      42 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      43 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      44 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      45 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      46 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      47 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      48 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      49 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      50 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      51 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      52 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      53 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      54 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      55 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      56 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      57 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      58 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      59 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      60 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      61 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      62 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      63 -> androidx.compose.material3.ExtendedFloatingActionButton(`text` = slot_text, `icon` = slot_icon, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `expanded` = decode_expanded(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledIconButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledIconButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledIconButton(onClick: kotlin.Function0<kotlin.Unit>, shapes: androidx.compose.material3.IconButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledIconButton_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledIconButton(
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

// androidx.compose.material3.FilledIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, shapes: androidx.compose.material3.IconToggleButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledIconToggleButton_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledIconToggleButton(
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

// androidx.compose.material3.FilledTonalButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererFilledTonalButton {
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
      0 -> renderFilledTonalButtonGroup0(node, scope, mask)
      1 -> renderFilledTonalButtonGroup1(node, scope, mask)
      2 -> renderFilledTonalButtonGroup2(node, scope, mask)
      3 -> renderFilledTonalButtonGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalButtonGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalButtonGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalButtonGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalButtonGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledTonalButton(onClick: kotlin.Function0<kotlin.Unit>, shapes: androidx.compose.material3.ButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererFilledTonalButton_1 {
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
      0 -> renderFilledTonalButton_1Group0(node, scope, mask)
      1 -> renderFilledTonalButton_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalButton_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalButton_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.FilledTonalButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledTonalIconButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledTonalIconButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledTonalIconButton(onClick: kotlin.Function0<kotlin.Unit>, shapes: androidx.compose.material3.IconButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledTonalIconButton_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledTonalIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledTonalIconButton(
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

// androidx.compose.material3.FilledTonalIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledTonalIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilledTonalIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, shapes: androidx.compose.material3.IconToggleButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconToggleButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererFilledTonalIconToggleButton_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FilledTonalIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FilledTonalIconToggleButton(
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

// androidx.compose.material3.FilledTonalToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, buttonSize: androidx.compose.material3.ToggleButtonSize, enabled: kotlin.Boolean, icon: kotlin.Function0<kotlin.Unit>?, shapes: androidx.compose.material3.ToggleButtonShapes, colors: androidx.compose.material3.ToggleButtonColors, elevation: androidx.compose.material3.ToggleButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererFilledTonalToggleButton {
  private fun decode_checked(node: ComposeNode) = node.boolean("checked")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val content_icon: @Composable () -> Unit = { RenderComposeChildren(node.slot("icon")) }
    val slot_icon = if (node.isNull("icon")) null else content_icon
    val mask = (if (node.has("buttonSize")) 1 else 0) +
      (if (node.has("enabled")) 2 else 0) +
      (if (node.has("icon")) 4 else 0) +
      (if (node.has("shapes")) 8 else 0) +
      (if (node.has("colors")) 16 else 0) +
      (if (node.has("elevation")) 32 else 0) +
      (if (node.has("border")) 64 else 0) +
      (if (node.has("contentPadding")) 128 else 0) +
      (if (node.has("interactionSource")) 256 else 0)
    when (mask / 32) {
      0 -> renderFilledTonalToggleButtonGroup0(node, scope, mask, slot_icon)
      1 -> renderFilledTonalToggleButtonGroup1(node, scope, mask, slot_icon)
      2 -> renderFilledTonalToggleButtonGroup2(node, scope, mask, slot_icon)
      3 -> renderFilledTonalToggleButtonGroup3(node, scope, mask, slot_icon)
      4 -> renderFilledTonalToggleButtonGroup4(node, scope, mask, slot_icon)
      5 -> renderFilledTonalToggleButtonGroup5(node, scope, mask, slot_icon)
      6 -> renderFilledTonalToggleButtonGroup6(node, scope, mask, slot_icon)
      7 -> renderFilledTonalToggleButtonGroup7(node, scope, mask, slot_icon)
      8 -> renderFilledTonalToggleButtonGroup8(node, scope, mask, slot_icon)
      9 -> renderFilledTonalToggleButtonGroup9(node, scope, mask, slot_icon)
      10 -> renderFilledTonalToggleButtonGroup10(node, scope, mask, slot_icon)
      11 -> renderFilledTonalToggleButtonGroup11(node, scope, mask, slot_icon)
      12 -> renderFilledTonalToggleButtonGroup12(node, scope, mask, slot_icon)
      13 -> renderFilledTonalToggleButtonGroup13(node, scope, mask, slot_icon)
      14 -> renderFilledTonalToggleButtonGroup14(node, scope, mask, slot_icon)
      15 -> renderFilledTonalToggleButtonGroup15(node, scope, mask, slot_icon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `icon` = slot_icon, content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup4(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      129 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      130 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      131 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      132 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      133 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `icon` = slot_icon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      134 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      135 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      136 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      138 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      140 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      142 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      144 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      146 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      148 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      150 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup5(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      160 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      162 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      164 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      166 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup6(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      192 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      193 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      194 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      195 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      196 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      197 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      198 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      199 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      200 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      202 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      204 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      206 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      208 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      210 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      212 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      214 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup7(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      224 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      226 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      228 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      230 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      255 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup8(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      256 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      257 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      258 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      259 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      260 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      261 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `icon` = slot_icon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      262 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      263 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      264 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      266 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      268 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      270 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      272 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      274 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      276 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      278 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup9(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      288 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      290 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      292 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      294 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup10(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      320 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      321 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      322 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      323 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      324 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      325 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      326 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      327 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      328 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      330 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      332 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      334 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      336 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      338 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      340 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      342 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup11(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      352 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      354 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      356 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      358 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      383 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup12(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      384 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      385 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      386 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      387 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      388 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      389 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `icon` = slot_icon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      390 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      391 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      392 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      394 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      396 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      398 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      400 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      402 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      404 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      406 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup13(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      416 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      418 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      420 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      422 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      447 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup14(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      448 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      449 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      450 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      451 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      452 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      453 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      454 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      455 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      456 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      458 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      460 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      462 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      463 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      464 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      466 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      468 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      470 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      471 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      478 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      479 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilledTonalToggleButtonGroup15(node: ComposeNode, scope: Any?, mask: Int, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      480 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      482 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      484 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      486 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      487 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      494 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      495 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      502 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      503 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      507 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      509 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      510 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      511 -> androidx.compose.material3.FilledTonalToggleButton(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `buttonSize` = toComposeToggleButtonSizeValue(node.string("buttonSize")), `enabled` = decode_enabled(node), `icon` = slot_icon, `shapes` = node.jsonObject("shapes").decodeComposeToggleButtonShapesValue(), `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeToggleButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FilterChip(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SelectableChipColors, elevation: androidx.compose.material3.SelectableChipElevation?, border: androidx.compose.foundation.BorderStroke?, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererFilterChip {
  private fun decode_selected(node: ComposeNode) = node.boolean("selected")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_label: @Composable () -> Unit = { RenderComposeChildren(node.slot("label")) }
    val content_leadingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("leadingIcon")) }
    val slot_leadingIcon = if (node.isNull("leadingIcon")) null else content_leadingIcon
    val content_trailingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("trailingIcon")) }
    val slot_trailingIcon = if (node.isNull("trailingIcon")) null else content_trailingIcon
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("leadingIcon")) 2 else 0) +
      (if (node.has("trailingIcon")) 4 else 0) +
      (if (node.has("shape")) 8 else 0) +
      (if (node.has("colors")) 16 else 0) +
      (if (node.has("elevation")) 32 else 0) +
      (if (node.has("border")) 64 else 0) +
      (if (node.has("horizontalArrangement")) 128 else 0) +
      (if (node.has("contentPadding")) 256 else 0) +
      (if (node.has("interactionSource")) 512 else 0)
    when (mask / 32) {
      0 -> renderFilterChipGroup0(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      1 -> renderFilterChipGroup1(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      2 -> renderFilterChipGroup2(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      3 -> renderFilterChipGroup3(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      4 -> renderFilterChipGroup4(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      8 -> renderFilterChipGroup8(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      12 -> renderFilterChipGroup12(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      14 -> renderFilterChipGroup14(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      15 -> renderFilterChipGroup15(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      16 -> renderFilterChipGroup16(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      17 -> renderFilterChipGroup17(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      18 -> renderFilterChipGroup18(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      19 -> renderFilterChipGroup19(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      20 -> renderFilterChipGroup20(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      22 -> renderFilterChipGroup22(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      23 -> renderFilterChipGroup23(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      24 -> renderFilterChipGroup24(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      26 -> renderFilterChipGroup26(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      27 -> renderFilterChipGroup27(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      28 -> renderFilterChipGroup28(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      29 -> renderFilterChipGroup29(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      30 -> renderFilterChipGroup30(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      31 -> renderFilterChipGroup31(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      3 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon)
      4 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon)
      5 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon)
      6 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      7 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      8 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      9 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      10 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      11 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      12 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      13 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      14 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      15 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      16 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      17 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      18 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      19 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      20 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      21 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      22 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      23 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      24 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      25 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      26 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      27 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      28 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      29 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      30 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      31 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      33 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      34 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      35 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      36 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      37 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      38 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      39 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      40 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      41 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      42 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      43 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      44 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      45 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      46 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      47 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      48 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      65 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      66 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      67 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      68 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      69 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      70 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      71 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      72 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      73 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      74 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      75 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      76 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      77 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      78 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      79 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      80 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      81 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      82 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      83 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      84 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      85 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      86 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      87 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      88 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      89 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      90 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      91 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      92 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      93 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      94 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      95 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      97 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      98 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      99 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      100 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      101 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      102 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      103 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      104 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      105 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      106 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      107 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      108 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      109 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      110 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      111 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup4(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      129 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      130 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      131 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      132 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      133 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      134 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      135 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      136 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      137 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      138 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      139 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      140 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      141 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      142 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      143 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup8(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      256 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      257 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      258 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      259 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      260 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      261 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      262 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      263 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      264 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      265 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      266 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      267 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      268 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      269 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      270 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      271 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup12(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      384 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      385 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      386 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      387 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      388 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      389 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      390 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      391 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      392 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      393 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      394 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      395 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      396 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      397 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      398 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      399 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup14(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      463 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup15(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      511 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup16(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      512 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      513 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      514 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      515 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      516 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      517 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      518 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      519 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      520 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      521 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      522 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      523 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      524 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      525 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      526 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      527 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup17(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      544 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      545 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      546 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      547 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      548 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      549 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      550 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      551 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      552 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      553 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      554 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      555 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      556 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      557 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      558 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      559 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup18(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      576 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      577 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      578 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      579 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      580 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      581 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      582 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      583 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      584 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      585 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      586 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      587 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      588 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      589 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      590 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      591 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup19(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      608 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      609 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      610 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      611 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      612 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      613 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      614 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      615 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      616 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      617 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      618 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      619 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      620 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      621 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      622 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      623 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup20(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      640 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      641 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      642 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      643 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      644 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      645 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      646 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      647 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      648 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      649 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      650 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      651 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      652 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      653 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      654 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      655 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup22(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      719 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup23(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      767 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup24(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      768 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      769 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      770 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      771 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      772 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      773 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      774 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      775 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      776 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      777 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      778 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      779 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      780 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      781 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      782 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      783 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup26(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      847 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup27(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      895 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup28(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      896 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      897 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      898 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      899 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      900 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      901 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      902 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      903 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      904 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      905 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      906 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      907 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      908 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      909 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      910 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      911 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup29(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      959 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup30(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      967 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      971 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      973 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      974 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      975 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      991 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderFilterChipGroup31(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      1007 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1015 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1019 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1021 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1022 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1023 -> androidx.compose.material3.FilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeSelectableChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
