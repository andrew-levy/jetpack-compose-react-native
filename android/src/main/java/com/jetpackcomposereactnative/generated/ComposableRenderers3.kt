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

// androidx.compose.material3.Button(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererButton {
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
      0 -> renderButtonGroup0(node, scope, mask)
      1 -> renderButtonGroup1(node, scope, mask)
      2 -> renderButtonGroup2(node, scope, mask)
      3 -> renderButtonGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderButtonGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderButtonGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderButtonGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderButtonGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Button(onClick: kotlin.Function0<kotlin.Unit>, shapes: androidx.compose.material3.ButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererButton_1 {
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
      0 -> renderButton_1Group0(node, scope, mask)
      1 -> renderButton_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderButton_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderButton_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.Button(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ButtonGroup(overflowIndicator: kotlin.Function1<androidx.compose.material3.ButtonGroupMenuState, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, expandedRatio: kotlin.Float, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, content: kotlin.Function1<androidx.compose.material3.ButtonGroupScope, kotlin.Unit>)
internal object RendererButtonGroup {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("overflowIndicator")) 1 else 0) +
      (if (node.has("expandedRatio")) 2 else 0) +
      (if (node.has("horizontalArrangement")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ButtonGroup(
        `modifier` = node.modifier("modifier", scope),
        `content` = node.arguments().toComposeButtonGroupItems("items"),
        `overflowIndicator` = { menu -> RenderComposeOverflowIndicator(node.slot("overflowIndicator"), menu::show) },
      )
      1 -> androidx.compose.material3.ButtonGroup(
        `overflowIndicator` = { menu -> RenderComposeOverflowIndicator(node.slot("overflowIndicator"), menu::show) },
        `modifier` = node.modifier("modifier", scope),
        `content` = node.arguments().toComposeButtonGroupItems("items"),
      )
      2 -> androidx.compose.material3.ButtonGroup(
        `modifier` = node.modifier("modifier", scope),
        `expandedRatio` = node.number("expandedRatio").toFloat(),
        `content` = node.arguments().toComposeButtonGroupItems("items"),
        `overflowIndicator` = { menu -> RenderComposeOverflowIndicator(node.slot("overflowIndicator"), menu::show) },
      )
      3 -> androidx.compose.material3.ButtonGroup(
        `overflowIndicator` = { menu -> RenderComposeOverflowIndicator(node.slot("overflowIndicator"), menu::show) },
        `modifier` = node.modifier("modifier", scope),
        `expandedRatio` = node.number("expandedRatio").toFloat(),
        `content` = node.arguments().toComposeButtonGroupItems("items"),
      )
      4 -> androidx.compose.material3.ButtonGroup(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `content` = node.arguments().toComposeButtonGroupItems("items"),
        `overflowIndicator` = { menu -> RenderComposeOverflowIndicator(node.slot("overflowIndicator"), menu::show) },
      )
      5 -> androidx.compose.material3.ButtonGroup(
        `overflowIndicator` = { menu -> RenderComposeOverflowIndicator(node.slot("overflowIndicator"), menu::show) },
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `content` = node.arguments().toComposeButtonGroupItems("items"),
      )
      6 -> androidx.compose.material3.ButtonGroup(
        `modifier` = node.modifier("modifier", scope),
        `expandedRatio` = node.number("expandedRatio").toFloat(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `content` = node.arguments().toComposeButtonGroupItems("items"),
        `overflowIndicator` = { menu -> RenderComposeOverflowIndicator(node.slot("overflowIndicator"), menu::show) },
      )
      7 -> androidx.compose.material3.ButtonGroup(
        `overflowIndicator` = { menu -> RenderComposeOverflowIndicator(node.slot("overflowIndicator"), menu::show) },
        `modifier` = node.modifier("modifier", scope),
        `expandedRatio` = node.number("expandedRatio").toFloat(),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `content` = node.arguments().toComposeButtonGroupItems("items"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.Canvas(modifier: androidx.compose.ui.Modifier, onDraw: kotlin.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>)
internal object RendererCanvas {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.foundation.Canvas(
      `modifier` = node.modifier("modifier", scope),
      `onDraw` = node.jsonObject("onDraw").toComposeDrawing(),
    )
  }
}

// androidx.compose.foundation.Canvas(modifier: androidx.compose.ui.Modifier, contentDescription: kotlin.String, onDraw: kotlin.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>)
internal object RendererCanvas_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.foundation.Canvas(
      `modifier` = node.modifier("modifier", scope),
      `contentDescription` = node.string("contentDescription"),
      `onDraw` = node.jsonObject("onDraw").toComposeDrawing(),
    )
  }
}

// androidx.compose.material3.Card(modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererCard {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("elevation")) 4 else 0) +
      (if (node.has("border")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Card(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererCard_1 {
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
      0 -> renderCard_1Group0(node, scope, mask)
      1 -> renderCard_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCard_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderCard_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.Card(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.CenterAlignedTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererCenterAlignedTopAppBar {
  private fun decode_expandedHeight(node: ComposeNode) = node.number("expandedHeight").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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
      (if (node.has("scrollBehavior")) 32 else 0)
    when (mask / 32) {
      0 -> renderCenterAlignedTopAppBarGroup0(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      1 -> renderCenterAlignedTopAppBarGroup1(node, scope, mask, scrollBehaviorValue, slot_title, slot_navigationIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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
}

// androidx.compose.material3.SliderDefaults.CenteredTrack(sliderState: androidx.compose.material3.SliderState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, drawStopIndicator: kotlin.Function2<androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.geometry.Offset, kotlin.Unit>?, drawTick: kotlin.Function3<androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.geometry.Offset, androidx.compose.ui.graphics.Color, kotlin.Unit>, thumbTrackGapSize: androidx.compose.ui.unit.Dp, trackInsideCornerSize: androidx.compose.ui.unit.Dp, trackCornerSize: androidx.compose.ui.unit.Dp)
internal object RendererCenteredTrack {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
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
      0 -> renderCircularWavyProgressIndicatorGroup0(node, scope, mask)
      1 -> renderCircularWavyProgressIndicatorGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderCircularWavyProgressIndicatorGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node))
      2 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node))
      3 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node))
      4 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node))
      5 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node))
      6 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      7 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node))
      8 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node))
      9 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node))
      10 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node))
      11 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node))
      12 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      13 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      14 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      15 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node))
      16 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node))
      17 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node))
      18 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      19 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node))
      20 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      21 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      22 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      23 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node))
      24 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      25 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      26 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      27 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      28 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      29 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      30 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      31 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderCircularWavyProgressIndicatorGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `waveSpeed` = decode_waveSpeed(node))
      33 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `waveSpeed` = decode_waveSpeed(node))
      34 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      35 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `waveSpeed` = decode_waveSpeed(node))
      36 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      37 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      38 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      39 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `waveSpeed` = decode_waveSpeed(node))
      40 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      41 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      42 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      43 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      44 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      45 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      46 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      47 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `waveSpeed` = decode_waveSpeed(node))
      48 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      49 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      50 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      51 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      52 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      53 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      54 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      55 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      56 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      57 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      58 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      59 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      60 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      61 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      62 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      63 -> androidx.compose.material3.CircularWavyProgressIndicator(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `trackColor` = decode_trackColor(node), `gapSize` = decode_gapSize(node), `amplitude` = decode_amplitude(node), `wavelength` = decode_wavelength(node), `waveSpeed` = decode_waveSpeed(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.CircularWavyProgressIndicator(progress: kotlin.Function0<kotlin.Float>, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Function1<kotlin.Float, kotlin.Float>, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererCircularWavyProgressIndicator_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("trackColor")) 2 else 0) +
      (if (node.has("gapSize")) 4 else 0) +
      (if (node.has("wavelength")) 8 else 0) +
      (if (node.has("waveSpeed")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      3 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      4 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      5 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      6 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      7 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      8 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
      )
      9 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
      )
      10 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      11 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      12 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      13 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      14 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      15 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      16 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      17 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      18 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      19 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      20 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      21 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      22 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      23 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      24 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      25 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      26 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      27 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      28 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      29 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      30 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      31 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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

// androidx.compose.material3.TextFieldDefaults.DecorationBox(value: kotlin.String, innerTextField: kotlin.Function0<kotlin.Unit>, enabled: kotlin.Boolean, singleLine: kotlin.Boolean, visualTransformation: androidx.compose.ui.text.input.VisualTransformation, interactionSource: androidx.compose.foundation.interaction.InteractionSource, isError: kotlin.Boolean, label: kotlin.Function0<kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, container: kotlin.Function0<kotlin.Unit>)
internal object RendererDecorationBox {
  private fun decode_value(node: ComposeNode) = node.string("value")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_singleLine(node: ComposeNode) = node.boolean("singleLine")
  private fun decode_isError(node: ComposeNode) = node.boolean("isError")

  @Composable
  fun render(node: ComposeNode) {
    val slot_innerTextField: @Composable () -> Unit = { RenderComposeChildren(node.slot("innerTextField")) }
    val content_label: @Composable () -> Unit = { RenderComposeChildren(node.slot("label")) }
    val slot_label = if (node.isNull("label")) null else content_label
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
    val slot_container: @Composable () -> Unit = { RenderComposeChildren(node.slot("container")) }
    val mask = (if (node.has("isError")) 1 else 0) +
      (if (node.has("label")) 2 else 0) +
      (if (node.has("placeholder")) 4 else 0) +
      (if (node.has("leadingIcon")) 8 else 0) +
      (if (node.has("trailingIcon")) 16 else 0) +
      (if (node.has("prefix")) 32 else 0) +
      (if (node.has("suffix")) 64 else 0) +
      (if (node.has("supportingText")) 128 else 0) +
      (if (node.has("shape")) 256 else 0) +
      (if (node.has("colors")) 512 else 0) +
      (if (node.has("contentPadding")) 1024 else 0) +
      (if (node.has("container")) 2048 else 0)
    when (mask / 32) {
      0 -> renderDecorationBoxGroup0(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      1 -> renderDecorationBoxGroup1(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      2 -> renderDecorationBoxGroup2(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      4 -> renderDecorationBoxGroup4(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      8 -> renderDecorationBoxGroup8(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      16 -> renderDecorationBoxGroup16(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      32 -> renderDecorationBoxGroup32(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      63 -> renderDecorationBoxGroup63(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      64 -> renderDecorationBoxGroup64(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      95 -> renderDecorationBoxGroup95(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      111 -> renderDecorationBoxGroup111(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      119 -> renderDecorationBoxGroup119(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      123 -> renderDecorationBoxGroup123(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      125 -> renderDecorationBoxGroup125(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      126 -> renderDecorationBoxGroup126(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      127 -> renderDecorationBoxGroup127(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup0(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      1 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node))
      2 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label)
      3 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label)
      4 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder)
      5 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder)
      6 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder)
      7 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder)
      8 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon)
      9 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon)
      10 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon)
      11 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon)
      12 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      13 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      14 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      15 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      16 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `trailingIcon` = slot_trailingIcon)
      17 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `trailingIcon` = slot_trailingIcon)
      18 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `trailingIcon` = slot_trailingIcon)
      19 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `trailingIcon` = slot_trailingIcon)
      20 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      21 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      22 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      23 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      24 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      25 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      26 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      27 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      28 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      29 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      30 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      31 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup1(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `prefix` = slot_prefix)
      33 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `prefix` = slot_prefix)
      34 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `prefix` = slot_prefix)
      35 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `prefix` = slot_prefix)
      36 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      37 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      38 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      39 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      40 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      41 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      42 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      43 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      44 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      45 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      46 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      47 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup2(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `suffix` = slot_suffix)
      65 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `suffix` = slot_suffix)
      66 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `suffix` = slot_suffix)
      67 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `suffix` = slot_suffix)
      68 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      69 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      70 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      71 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      72 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      73 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      74 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      75 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      76 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      77 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      78 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      79 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup4(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      128 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `supportingText` = slot_supportingText)
      129 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `supportingText` = slot_supportingText)
      130 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `supportingText` = slot_supportingText)
      131 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `supportingText` = slot_supportingText)
      132 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      133 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      134 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      135 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      136 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      137 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      138 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      139 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      140 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      141 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      142 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      143 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup8(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      256 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `shape` = node.arguments().shape("shape"))
      257 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"))
      258 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `shape` = node.arguments().shape("shape"))
      259 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `shape` = node.arguments().shape("shape"))
      260 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      261 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      262 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      263 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      264 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      265 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      266 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      267 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      268 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      269 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      270 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      271 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup16(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      512 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      513 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      514 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      515 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      516 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      517 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      518 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      519 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      520 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      521 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      522 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      523 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      524 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      525 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      526 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      527 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      528 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      529 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      530 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      531 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      532 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      533 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      534 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      535 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      536 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      537 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      538 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      539 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      540 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      541 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      542 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      543 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup32(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      1024 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1025 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1026 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1027 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1028 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1029 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1030 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1031 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1032 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1033 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1034 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1035 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1036 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1037 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1038 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      1039 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup63(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      2047 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup64(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      2048 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `container` = slot_container)
      2049 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `container` = slot_container)
      2050 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `container` = slot_container)
      2051 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `container` = slot_container)
      2052 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `container` = slot_container)
      2053 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `container` = slot_container)
      2054 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `container` = slot_container)
      2055 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `container` = slot_container)
      2056 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2057 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2058 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2059 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2060 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2061 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2062 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      2063 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup95(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      3071 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup111(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      3583 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup119(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      3839 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup123(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      3967 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup125(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      4031 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup126(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      4063 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup127(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      4079 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      4087 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      4091 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      4093 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      4094 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      4095 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(value: kotlin.String, innerTextField: kotlin.Function0<kotlin.Unit>, enabled: kotlin.Boolean, singleLine: kotlin.Boolean, visualTransformation: androidx.compose.ui.text.input.VisualTransformation, interactionSource: androidx.compose.foundation.interaction.InteractionSource, isError: kotlin.Boolean, label: kotlin.Function0<kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, container: kotlin.Function0<kotlin.Unit>)
internal object RendererDecorationBox_1 {
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("isError")) 1 else 0) +
      (if (node.has("label")) 2 else 0) +
      (if (node.has("placeholder")) 4 else 0) +
      (if (node.has("leadingIcon")) 8 else 0) +
      (if (node.has("trailingIcon")) 16 else 0) +
      (if (node.has("prefix")) 32 else 0) +
      (if (node.has("suffix")) 64 else 0) +
      (if (node.has("supportingText")) 128 else 0) +
      (if (node.has("colors")) 256 else 0) +
      (if (node.has("contentPadding")) 512 else 0) +
      (if (node.has("container")) 1024 else 0)
    when (mask) {
      1023 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      1535 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1791 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1919 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1983 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2015 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2031 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2039 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2043 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2045 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      2046 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.ui.window.Dialog(onDismissRequest: kotlin.Function0<kotlin.Unit>, properties: androidx.compose.ui.window.DialogProperties, content: kotlin.Function0<kotlin.Unit>)
internal object RendererDialog {
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("properties")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.ui.window.Dialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.ui.window.Dialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `properties` = node.jsonObject("properties").toComposeDialogProperties(),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.selection.DisableSelection(content: kotlin.Function0<kotlin.Unit>)
internal object RendererDisableSelection {
  @Composable
  fun render(node: ComposeNode) {
    androidx.compose.foundation.text.selection.DisableSelection(
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.material3.DismissibleDrawerSheet(modifier: androidx.compose.ui.Modifier, drawerShape: androidx.compose.ui.graphics.Shape, drawerContainerColor: androidx.compose.ui.graphics.Color, drawerContentColor: androidx.compose.ui.graphics.Color, drawerTonalElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererDismissibleDrawerSheet {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("drawerShape")) 1 else 0) +
      (if (node.has("drawerContainerColor")) 2 else 0) +
      (if (node.has("drawerContentColor")) 4 else 0) +
      (if (node.has("drawerTonalElevation")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.DismissibleDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DismissibleNavigationDrawer(drawerContent: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, drawerState: androidx.compose.material3.DrawerState, gesturesEnabled: kotlin.Boolean, content: kotlin.Function0<kotlin.Unit>)
internal object RendererDismissibleNavigationDrawer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("gesturesEnabled")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DismissibleNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.DismissibleNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle(onDisplayModeChange: kotlin.Function0<kotlin.Unit>, displayMode: androidx.compose.material3.TimePickerDisplayMode, modifier: androidx.compose.ui.Modifier)
internal object RendererDisplayModeToggle {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle(
      `onDisplayModeChange` = { node.emit("onDisplayModeChange") },
      `displayMode` = toComposeTimePickerDisplayMode(node.string("displayMode")),
      `modifier` = node.modifier("modifier", scope),
    )
  }
}

// androidx.compose.material3.Divider(modifier: androidx.compose.ui.Modifier, thickness: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color)
internal object RendererDivider {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("thickness")) 1 else 0) +
      (if (node.has("color")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Divider(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Divider(
        `modifier` = node.modifier("modifier", scope),
        `thickness` = node.number("thickness").dp,
      )
      2 -> androidx.compose.material3.Divider(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.Divider(
        `modifier` = node.modifier("modifier", scope),
        `thickness` = node.number("thickness").dp,
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DockedSearchBar(inputField: kotlin.Function0<kotlin.Unit>, expanded: kotlin.Boolean, onExpandedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererDockedSearchBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("shadowElevation")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.DockedSearchBar(
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
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.BottomSheetDefaults.DragHandle(modifier: androidx.compose.ui.Modifier, width: androidx.compose.ui.unit.Dp, height: androidx.compose.ui.unit.Dp, shape: androidx.compose.ui.graphics.Shape, color: androidx.compose.ui.graphics.Color)
internal object RendererDragHandle {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("width")) 1 else 0) +
      (if (node.has("height")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("color")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
      )
      2 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
      )
      3 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
      )
      4 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      5 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `shape` = node.arguments().shape("shape"),
      )
      6 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `shape` = node.arguments().shape("shape"),
      )
      7 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
        `shape` = node.arguments().shape("shape"),
      )
      8 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      9 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `color` = node.color("color"),
      )
      10 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `color` = node.color("color"),
      )
      11 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
        `color` = node.color("color"),
      )
      12 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
      )
      13 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
      )
      14 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
      )
      15 -> androidx.compose.material3.BottomSheetDefaults.DragHandle(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
