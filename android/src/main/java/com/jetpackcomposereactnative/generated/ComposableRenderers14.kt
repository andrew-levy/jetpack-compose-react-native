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
      (if (node.has("windowInsets")) 4 else 0)
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
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
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
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      3 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      4 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      5 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      6 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      7 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
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
      (if (node.has("interactionSource")) 8 else 0)
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
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

// androidx.compose.material3.SmallExtendedFloatingActionButton(text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, expanded: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererSmallExtendedFloatingActionButton_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("expanded")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
      )
      2 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      3 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
      )
      4 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      5 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
      )
      6 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      7 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      8 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      9 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
      )
      10 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      11 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      12 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      13 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      14 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      15 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      16 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
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

// androidx.compose.material3.SmallFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSmallFloatingActionButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.SmallFloatingActionButton(
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

// androidx.compose.material3.SuggestionChip(onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, icon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ChipColors, elevation: androidx.compose.material3.ChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererSuggestionChip {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_label: @Composable () -> Unit = { RenderComposeChildren(node.slot("label")) }
    val content_icon: @Composable () -> Unit = { RenderComposeChildren(node.slot("icon")) }
    val slot_icon = if (node.isNull("icon")) null else content_icon
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("icon")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("elevation")) 16 else 0) +
      (if (node.has("border")) 32 else 0) +
      (if (node.has("interactionSource")) 64 else 0)
    when (mask / 32) {
      0 -> renderSuggestionChipGroup0(node, scope, mask, slot_label, slot_icon)
      1 -> renderSuggestionChipGroup1(node, scope, mask, slot_label, slot_icon)
      2 -> renderSuggestionChipGroup2(node, scope, mask, slot_label, slot_icon)
      3 -> renderSuggestionChipGroup3(node, scope, mask, slot_label, slot_icon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSuggestionChipGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon)
      3 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon)
      4 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      5 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      6 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"))
      7 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"))
      8 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      9 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      10 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      11 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      12 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      13 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      14 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      15 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      16 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      17 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      18 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      19 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      20 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      21 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      22 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      23 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      24 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      25 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      26 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      27 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      28 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      29 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      30 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      31 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSuggestionChipGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      33 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      34 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      35 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      36 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      37 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      38 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      39 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      40 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      41 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      42 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      43 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      44 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      45 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      46 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      47 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      48 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      49 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      50 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      51 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      52 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      53 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      54 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      55 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      56 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      57 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      58 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      59 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      60 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      61 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      62 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      63 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSuggestionChipGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      65 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      66 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      67 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      68 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      69 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      70 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      71 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      72 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      73 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      74 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      75 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      76 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      77 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      78 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      79 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      80 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      81 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      82 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      83 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      84 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      85 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      86 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      87 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      88 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      89 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      90 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      91 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      92 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      93 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      94 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      95 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSuggestionChipGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      97 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      98 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      99 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      100 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      101 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      102 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      103 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      104 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      105 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      106 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      107 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      108 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      109 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      110 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      111 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      112 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      113 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      114 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      115 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      116 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      117 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      118 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      119 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      120 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      121 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      122 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      123 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      124 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      125 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      126 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      127 -> androidx.compose.material3.SuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Surface(modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, color: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, border: androidx.compose.foundation.BorderStroke?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSurface {
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_tonalElevation(node: ComposeNode) = node.number("tonalElevation").dp
  private fun decode_shadowElevation(node: ComposeNode) = node.number("shadowElevation").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("color")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("tonalElevation")) 8 else 0) +
      (if (node.has("shadowElevation")) 16 else 0) +
      (if (node.has("border")) 32 else 0)
    when (mask / 32) {
      0 -> renderSurfaceGroup0(node, scope, mask, renderChildren)
      1 -> renderSurfaceGroup1(node, scope, mask, renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurfaceGroup0(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), content = renderChildren)
      1 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = renderChildren)
      2 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), content = renderChildren)
      3 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), content = renderChildren)
      4 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = renderChildren)
      5 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      6 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      7 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      8 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      9 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      10 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      11 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      12 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      13 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      14 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      15 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      16 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      17 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      18 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      19 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      20 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      21 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      22 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      23 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      24 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      25 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      26 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      27 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      28 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      29 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      30 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      31 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurfaceGroup1(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      33 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      34 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      35 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      36 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      37 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      38 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      39 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      40 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      41 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      42 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      43 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      44 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      45 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      46 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      47 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      48 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      49 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      50 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      51 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      52 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      53 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      54 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      55 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      56 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      57 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      58 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      59 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      60 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      61 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      62 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      63 -> androidx.compose.material3.Surface(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Surface(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, color: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSurface_1 {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_tonalElevation(node: ComposeNode) = node.number("tonalElevation").dp
  private fun decode_shadowElevation(node: ComposeNode) = node.number("shadowElevation").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("color")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("tonalElevation")) 16 else 0) +
      (if (node.has("shadowElevation")) 32 else 0) +
      (if (node.has("border")) 64 else 0) +
      (if (node.has("interactionSource")) 128 else 0)
    when (mask / 32) {
      0 -> renderSurface_1Group0(node, scope, mask, renderChildren)
      1 -> renderSurface_1Group1(node, scope, mask, renderChildren)
      2 -> renderSurface_1Group2(node, scope, mask, renderChildren)
      4 -> renderSurface_1Group4(node, scope, mask, renderChildren)
      5 -> renderSurface_1Group5(node, scope, mask, renderChildren)
      7 -> renderSurface_1Group7(node, scope, mask, renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group0(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = renderChildren)
      1 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = renderChildren)
      2 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = renderChildren)
      3 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = renderChildren)
      4 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), content = renderChildren)
      5 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), content = renderChildren)
      6 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), content = renderChildren)
      7 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), content = renderChildren)
      8 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = renderChildren)
      9 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      10 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      11 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      12 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      13 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      14 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      15 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      16 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      17 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      18 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      19 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      20 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      21 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      22 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      23 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      24 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      25 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      26 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      27 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      28 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      29 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      30 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      31 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group1(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      33 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      34 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      35 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      36 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      37 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      38 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      39 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      40 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      41 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      42 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      43 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      44 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      45 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      46 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      47 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      48 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      49 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      50 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      51 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      52 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      53 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      54 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      55 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      56 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      57 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      58 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      59 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      60 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      61 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      62 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      63 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group2(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      65 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      68 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      69 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      72 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      73 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      76 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      77 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      80 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      81 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      84 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      85 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      88 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      89 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      92 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      93 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group4(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      128 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      129 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      130 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      131 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      132 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      133 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      134 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      135 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      136 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      137 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      138 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      139 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      140 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      141 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      142 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      143 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      144 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      145 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      146 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      147 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      148 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      149 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      150 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      151 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      152 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      153 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      154 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      155 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      156 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      157 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      158 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      159 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group5(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      160 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      161 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      162 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      163 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      164 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      165 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      166 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      167 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      168 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      169 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      170 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      171 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      172 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      173 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      174 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      175 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      176 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      177 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      178 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      179 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      180 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      181 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      182 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      183 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      184 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      185 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      186 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      187 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      188 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      189 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      190 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      191 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group7(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      255 -> androidx.compose.material3.Surface(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Surface(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, color: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSurface_2 {
  private fun decode_checked(node: ComposeNode) = node.boolean("checked")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_tonalElevation(node: ComposeNode) = node.number("tonalElevation").dp
  private fun decode_shadowElevation(node: ComposeNode) = node.number("shadowElevation").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("color")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("tonalElevation")) 16 else 0) +
      (if (node.has("shadowElevation")) 32 else 0) +
      (if (node.has("border")) 64 else 0) +
      (if (node.has("interactionSource")) 128 else 0)
    when (mask / 32) {
      0 -> renderSurface_2Group0(node, scope, mask, renderChildren)
      1 -> renderSurface_2Group1(node, scope, mask, renderChildren)
      2 -> renderSurface_2Group2(node, scope, mask, renderChildren)
      4 -> renderSurface_2Group4(node, scope, mask, renderChildren)
      5 -> renderSurface_2Group5(node, scope, mask, renderChildren)
      7 -> renderSurface_2Group7(node, scope, mask, renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group0(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), content = renderChildren)
      1 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = renderChildren)
      2 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = renderChildren)
      3 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = renderChildren)
      4 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), content = renderChildren)
      5 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), content = renderChildren)
      6 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), content = renderChildren)
      7 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), content = renderChildren)
      8 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = renderChildren)
      9 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      10 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      11 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      12 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      13 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      14 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      15 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      16 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      17 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      18 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      19 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      20 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      21 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      22 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      23 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      24 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      25 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      26 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      27 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      28 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      29 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      30 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      31 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group1(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      33 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      34 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      35 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      36 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      37 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      38 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      39 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      40 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      41 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      42 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      43 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      44 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      45 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      46 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      47 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      48 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      49 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      50 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      51 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      52 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      53 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      54 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      55 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      56 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      57 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      58 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      59 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      60 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      61 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      62 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      63 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group2(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      65 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      68 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      69 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      72 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      73 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      76 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      77 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      80 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      81 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      84 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      85 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      88 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      89 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      92 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      93 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group4(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      128 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      129 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      130 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      131 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      132 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      133 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      134 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      135 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      136 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      137 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      138 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      139 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      140 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      141 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      142 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      143 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      144 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      145 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      146 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      147 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      148 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      149 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      150 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      151 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      152 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      153 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      154 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      155 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      156 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      157 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      158 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      159 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group5(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      160 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      161 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      162 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      163 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      164 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      165 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      166 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      167 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      168 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      169 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      170 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      171 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      172 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      173 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      174 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      175 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      176 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      177 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      178 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      179 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      180 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      181 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      182 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      183 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      184 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      185 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      186 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      187 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      188 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      189 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      190 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      191 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group7(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      255 -> androidx.compose.material3.Surface(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Surface(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, color: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSurface_3 {
  private fun decode_selected(node: ComposeNode) = node.boolean("selected")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_tonalElevation(node: ComposeNode) = node.number("tonalElevation").dp
  private fun decode_shadowElevation(node: ComposeNode) = node.number("shadowElevation").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("color")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("tonalElevation")) 16 else 0) +
      (if (node.has("shadowElevation")) 32 else 0) +
      (if (node.has("border")) 64 else 0) +
      (if (node.has("interactionSource")) 128 else 0)
    when (mask / 32) {
      0 -> renderSurface_3Group0(node, scope, mask, renderChildren)
      1 -> renderSurface_3Group1(node, scope, mask, renderChildren)
      2 -> renderSurface_3Group2(node, scope, mask, renderChildren)
      4 -> renderSurface_3Group4(node, scope, mask, renderChildren)
      5 -> renderSurface_3Group5(node, scope, mask, renderChildren)
      7 -> renderSurface_3Group7(node, scope, mask, renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group0(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = renderChildren)
      1 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = renderChildren)
      2 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = renderChildren)
      3 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = renderChildren)
      4 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), content = renderChildren)
      5 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), content = renderChildren)
      6 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), content = renderChildren)
      7 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), content = renderChildren)
      8 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = renderChildren)
      9 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      10 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      11 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      12 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      13 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      14 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      15 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      16 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      17 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      18 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      19 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      20 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      21 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      22 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      23 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      24 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      25 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      26 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      27 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      28 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      29 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      30 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      31 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group1(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      33 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      34 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      35 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      36 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      37 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      38 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      39 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      40 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      41 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      42 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      43 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      44 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      45 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      46 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      47 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      48 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      49 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      50 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      51 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      52 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      53 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      54 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      55 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      56 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      57 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      58 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      59 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      60 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      61 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      62 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      63 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group2(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      65 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      68 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      69 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      72 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      73 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      76 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      77 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      80 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      81 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      84 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      85 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      88 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      89 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      92 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      93 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group4(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      128 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      129 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      130 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      131 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      132 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      133 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      134 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      135 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      136 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      137 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      138 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      139 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      140 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      141 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      142 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      143 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      144 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      145 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      146 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      147 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      148 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      149 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      150 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      151 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      152 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      153 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      154 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      155 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      156 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      157 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      158 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      159 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group5(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      160 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      161 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      162 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      163 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      164 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      165 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      166 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      167 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      168 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      169 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      170 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      171 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      172 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      173 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      174 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      175 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      176 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      177 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      178 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      179 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      180 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      181 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      182 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      183 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      184 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      185 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      186 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      187 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      188 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      189 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      190 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      191 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group7(node: ComposeNode, scope: Any?, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      255 -> androidx.compose.material3.Surface(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `color` = decode_color(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SwipeToDismissBox(state: androidx.compose.material3.SwipeToDismissBoxState, backgroundContent: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enableDismissFromStartToEnd: kotlin.Boolean, enableDismissFromEndToStart: kotlin.Boolean, gesturesEnabled: kotlin.Boolean, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererSwipeToDismissBox {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeSwipeToDismissState() else null
    val mask = (if (node.has("enableDismissFromStartToEnd")) 1 else 0) +
      (if (node.has("enableDismissFromEndToStart")) 2 else 0) +
      (if (node.has("gesturesEnabled")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromStartToEnd` = node.boolean("enableDismissFromStartToEnd"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromEndToStart` = node.boolean("enableDismissFromEndToStart"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromStartToEnd` = node.boolean("enableDismissFromStartToEnd"),
        `enableDismissFromEndToStart` = node.boolean("enableDismissFromEndToStart"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromStartToEnd` = node.boolean("enableDismissFromStartToEnd"),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromEndToStart` = node.boolean("enableDismissFromEndToStart"),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromStartToEnd` = node.boolean("enableDismissFromStartToEnd"),
        `enableDismissFromEndToStart` = node.boolean("enableDismissFromEndToStart"),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
