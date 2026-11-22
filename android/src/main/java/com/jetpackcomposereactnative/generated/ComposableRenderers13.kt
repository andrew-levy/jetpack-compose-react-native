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

// androidx.compose.material3.OutlinedToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.ToggleButtonShapes, colors: androidx.compose.material3.ToggleButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererOutlinedToggleButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.OutlinedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererOutlinedTrailingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
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

// androidx.compose.material3.PermanentDrawerSheet(modifier: androidx.compose.ui.Modifier, drawerShape: androidx.compose.ui.graphics.Shape, drawerContainerColor: androidx.compose.ui.graphics.Color, drawerContentColor: androidx.compose.ui.graphics.Color, drawerTonalElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererPermanentDrawerSheet {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("drawerShape")) 1 else 0) +
      (if (node.has("drawerContainerColor")) 2 else 0) +
      (if (node.has("drawerContentColor")) 4 else 0) +
      (if (node.has("drawerTonalElevation")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.PermanentDrawerSheet(
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.PermanentDrawerSheet(
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

// androidx.compose.material3.PermanentNavigationDrawer(drawerContent: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, content: kotlin.Function0<kotlin.Unit>)
internal object RendererPermanentNavigationDrawer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.material3.PermanentNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.material3.PlainTooltip [receiver: androidx.compose.material3.TooltipScope](modifier: androidx.compose.ui.Modifier, caretSize: androidx.compose.ui.unit.DpSize, maxWidth: androidx.compose.ui.unit.Dp, shape: androidx.compose.ui.graphics.Shape, contentColor: androidx.compose.ui.graphics.Color, containerColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, content: kotlin.Function0<kotlin.Unit>)
internal object RendererPlainTooltip {
  private fun decode_maxWidth(node: ComposeNode) = node.number("maxWidth").dp
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_tonalElevation(node: ComposeNode) = node.number("tonalElevation").dp
  private fun decode_shadowElevation(node: ComposeNode) = node.number("shadowElevation").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.TooltipScope) {
    val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }
    val mask = (if (node.has("caretSize")) 1 else 0) +
      (if (node.has("maxWidth")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("containerColor")) 16 else 0) +
      (if (node.has("tonalElevation")) 32 else 0) +
      (if (node.has("shadowElevation")) 64 else 0)
    when (mask / 32) {
      0 -> renderPlainTooltipGroup0(node, scope, mask, renderChildren)
      1 -> renderPlainTooltipGroup1(node, scope, mask, renderChildren)
      2 -> renderPlainTooltipGroup2(node, scope, mask, renderChildren)
      3 -> renderPlainTooltipGroup3(node, scope, mask, renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderPlainTooltipGroup0(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      0 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), content = renderChildren)
      1 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), content = renderChildren)
      2 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), content = renderChildren)
      3 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), content = renderChildren)
      4 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = renderChildren)
      5 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), content = renderChildren)
      6 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), content = renderChildren)
      7 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), content = renderChildren)
      8 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = renderChildren)
      9 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `contentColor` = decode_contentColor(node), content = renderChildren)
      10 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      11 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), content = renderChildren)
      12 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      13 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      14 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      15 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), content = renderChildren)
      16 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = renderChildren)
      17 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `containerColor` = decode_containerColor(node), content = renderChildren)
      18 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      19 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      20 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      21 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      22 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      23 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = renderChildren)
      24 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      25 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      26 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      27 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      28 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      29 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      30 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      31 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderPlainTooltipGroup1(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      32 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      33 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      34 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      35 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      36 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      37 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      38 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      39 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      40 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      41 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      42 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      43 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      44 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      45 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      46 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      47 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      48 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      49 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      50 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      51 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      52 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      53 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      54 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      55 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      56 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      57 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      58 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      59 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      60 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      61 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      62 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      63 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderPlainTooltipGroup2(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      64 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      65 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      66 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      67 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      68 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      69 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      70 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      71 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      72 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      73 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      74 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      75 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      76 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      77 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      78 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      79 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      80 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      81 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      82 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      83 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      84 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      85 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      86 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      87 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      88 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      89 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      90 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      91 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      92 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      93 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      94 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      95 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderPlainTooltipGroup3(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, renderChildren: @Composable () -> Unit) {
    when (mask) {
      96 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      97 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      98 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      99 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      100 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      101 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      102 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      103 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      104 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      105 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      106 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      107 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      108 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      109 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      110 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      111 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      112 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      113 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      114 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      115 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      116 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      117 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      118 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      119 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      120 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      121 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      122 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      123 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      124 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      125 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      126 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      127 -> scope.composeScoped2(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `contentColor` = decode_contentColor(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.ui.window.Popup(alignment: androidx.compose.ui.Alignment, offset: androidx.compose.ui.unit.IntOffset, onDismissRequest: kotlin.Function0<kotlin.Unit>?, properties: androidx.compose.ui.window.PopupProperties, content: kotlin.Function0<kotlin.Unit>)
internal object RendererPopup {
  @Composable
  fun render(node: ComposeNode) {
    val mask = (if (node.has("alignment")) 1 else 0) +
      (if (node.has("offset")) 2 else 0) +
      (if (node.has("onDismissRequest")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.ui.window.Popup(
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.ui.window.Popup(
        `alignment` = toComposeAlignment(node.string("alignment")),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.ui.window.Popup(
        `offset` = node.jsonObject("offset").decodeComposeIntOffset(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.ui.window.Popup(
        `alignment` = toComposeAlignment(node.string("alignment")),
        `offset` = node.jsonObject("offset").decodeComposeIntOffset(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.ui.window.Popup(
        `onDismissRequest` = if (node.isNull("onDismissRequest")) null else ({ node.emit("onDismissRequest") }),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.ui.window.Popup(
        `alignment` = toComposeAlignment(node.string("alignment")),
        `onDismissRequest` = if (node.isNull("onDismissRequest")) null else ({ node.emit("onDismissRequest") }),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.ui.window.Popup(
        `offset` = node.jsonObject("offset").decodeComposeIntOffset(),
        `onDismissRequest` = if (node.isNull("onDismissRequest")) null else ({ node.emit("onDismissRequest") }),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.ui.window.Popup(
        `alignment` = toComposeAlignment(node.string("alignment")),
        `offset` = node.jsonObject("offset").decodeComposeIntOffset(),
        `onDismissRequest` = if (node.isNull("onDismissRequest")) null else ({ node.emit("onDismissRequest") }),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.ui.window.Popup(popupPositionProvider: androidx.compose.ui.window.PopupPositionProvider, onDismissRequest: kotlin.Function0<kotlin.Unit>?, properties: androidx.compose.ui.window.PopupProperties, content: kotlin.Function0<kotlin.Unit>)
internal object RendererPopup_1 {
  @Composable
  fun render(node: ComposeNode) {
    val popupPositionProviderValue = if (node.has("popupPositionProvider") && !node.isNull("popupPositionProvider")) node.jsonObject("popupPositionProvider").rememberComposePopupPosition() else null
    val mask = (if (node.has("onDismissRequest")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.ui.window.Popup(
        `popupPositionProvider` = requireNotNull(popupPositionProviderValue),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.ui.window.Popup(
        `popupPositionProvider` = requireNotNull(popupPositionProviderValue),
        `onDismissRequest` = if (node.isNull("onDismissRequest")) null else ({ node.emit("onDismissRequest") }),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TabRowDefaults.PrimaryIndicator(modifier: androidx.compose.ui.Modifier, width: androidx.compose.ui.unit.Dp, height: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color, shape: androidx.compose.ui.graphics.Shape)
internal object RendererPrimaryIndicator {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("width")) 1 else 0) +
      (if (node.has("height")) 2 else 0) +
      (if (node.has("color")) 4 else 0) +
      (if (node.has("shape")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
      )
      2 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
      )
      3 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
      )
      4 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      5 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `color` = node.color("color"),
      )
      6 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `color` = node.color("color"),
      )
      7 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
        `color` = node.color("color"),
      )
      8 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      9 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `shape` = node.arguments().shape("shape"),
      )
      10 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `shape` = node.arguments().shape("shape"),
      )
      11 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
        `shape` = node.arguments().shape("shape"),
      )
      12 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `shape` = node.arguments().shape("shape"),
      )
      13 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `color` = node.color("color"),
        `shape` = node.arguments().shape("shape"),
      )
      14 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `color` = node.color("color"),
        `shape` = node.arguments().shape("shape"),
      )
      15 -> androidx.compose.material3.TabRowDefaults.PrimaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `width` = node.number("width").dp,
        `height` = node.number("height").dp,
        `color` = node.color("color"),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.PrimaryScrollableTabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, scrollState: androidx.compose.foundation.ScrollState, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, edgePadding: androidx.compose.ui.unit.Dp, indicator: kotlin.Function1<androidx.compose.material3.TabIndicatorScope, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, minTabWidth: androidx.compose.ui.unit.Dp, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererPrimaryScrollableTabRow {
  private fun decode_selectedTabIndex(node: ComposeNode) = node.number("selectedTabIndex").toInt()
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_edgePadding(node: ComposeNode) = node.number("edgePadding").dp
  private fun decode_minTabWidth(node: ComposeNode) = node.number("minTabWidth").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_divider: @Composable () -> Unit = { RenderComposeChildren(node.slot("divider")) }
    val slot_tabs: @Composable () -> Unit = { RenderComposeChildren(node.slot("tabs")) }
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("edgePadding")) 4 else 0) +
      (if (node.has("indicator")) 8 else 0) +
      (if (node.has("divider")) 16 else 0) +
      (if (node.has("minTabWidth")) 32 else 0)
    when (mask / 32) {
      0 -> renderPrimaryScrollableTabRowGroup0(node, scope, mask, slot_divider, slot_tabs)
      1 -> renderPrimaryScrollableTabRowGroup1(node, scope, mask, slot_divider, slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderPrimaryScrollableTabRowGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `tabs` = slot_tabs)
      1 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tabs` = slot_tabs)
      2 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      3 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      4 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      5 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      6 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      7 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      8 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      9 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      10 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      11 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      12 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      13 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      14 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      15 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      16 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `divider` = slot_divider, `tabs` = slot_tabs)
      17 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      18 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      19 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      20 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      21 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      22 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      23 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      24 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      25 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      26 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      27 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      28 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      29 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      30 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      31 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderPrimaryScrollableTabRowGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      33 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      34 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      35 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      36 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      37 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      38 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      39 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      40 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      41 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      42 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      43 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      44 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      45 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      46 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      47 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      48 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      49 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      50 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      51 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      52 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      53 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      54 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      55 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      56 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      57 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      58 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      59 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      60 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      61 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      62 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      63 -> androidx.compose.material3.PrimaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.PrimaryTabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, indicator: kotlin.Function1<androidx.compose.material3.TabIndicatorScope, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererPrimaryTabRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("indicator")) 4 else 0) +
      (if (node.has("divider")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      1 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      2 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      3 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      4 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      5 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      6 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      7 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      8 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      9 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      10 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      11 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      12 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      13 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      14 -> androidx.compose.material3.PrimaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      15 -> androidx.compose.material3.PrimaryTabRow(
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

// androidx.compose.material3.ProvideTextStyle(value: androidx.compose.ui.text.TextStyle, content: kotlin.Function0<kotlin.Unit>)
internal object RendererProvideTextStyle {
  @Composable
  fun render(node: ComposeNode) {
    androidx.compose.material3.ProvideTextStyle(
      `value` = node.jsonObject("value").toTextStyle(),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.material3.pulltorefresh.PullToRefreshBox(isRefreshing: kotlin.Boolean, onRefresh: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, state: androidx.compose.material3.pulltorefresh.PullToRefreshState, contentAlignment: androidx.compose.ui.Alignment, indicator: kotlin.Function1<androidx.compose.foundation.layout.BoxScope, kotlin.Unit>, content: kotlin.Function1<androidx.compose.foundation.layout.BoxScope, kotlin.Unit>)
internal object RendererPullToRefreshBox {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("contentAlignment")) 2 else 0) +
      (if (node.has("indicator")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.pulltorefresh.PullToRefreshBox(
        `isRefreshing` = node.boolean("isRefreshing"),
        `onRefresh` = { node.emit("onRefresh") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.pulltorefresh.PullToRefreshBox(
        `isRefreshing` = node.boolean("isRefreshing"),
        `onRefresh` = { node.emit("onRefresh") },
        `modifier` = node.modifier("modifier", scope),
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.pulltorefresh.PullToRefreshBox(
        `isRefreshing` = node.boolean("isRefreshing"),
        `onRefresh` = { node.emit("onRefresh") },
        `modifier` = node.modifier("modifier", scope),
        `contentAlignment` = toComposeAlignment(node.string("contentAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.pulltorefresh.PullToRefreshBox(
        `isRefreshing` = node.boolean("isRefreshing"),
        `onRefresh` = { node.emit("onRefresh") },
        `modifier` = node.modifier("modifier", scope),
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `contentAlignment` = toComposeAlignment(node.string("contentAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.pulltorefresh.PullToRefreshBox(
        `isRefreshing` = node.boolean("isRefreshing"),
        `onRefresh` = { node.emit("onRefresh") },
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.pulltorefresh.PullToRefreshBox(
        `isRefreshing` = node.boolean("isRefreshing"),
        `onRefresh` = { node.emit("onRefresh") },
        `modifier` = node.modifier("modifier", scope),
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.pulltorefresh.PullToRefreshBox(
        `isRefreshing` = node.boolean("isRefreshing"),
        `onRefresh` = { node.emit("onRefresh") },
        `modifier` = node.modifier("modifier", scope),
        `contentAlignment` = toComposeAlignment(node.string("contentAlignment")),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.pulltorefresh.PullToRefreshBox(
        `isRefreshing` = node.boolean("isRefreshing"),
        `onRefresh` = { node.emit("onRefresh") },
        `modifier` = node.modifier("modifier", scope),
        `state` = node.jsonObject("state").rememberComposePullToRefreshHandle(),
        `contentAlignment` = toComposeAlignment(node.string("contentAlignment")),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.RadioButton(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>?, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.RadioButtonColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererRadioButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.RadioButton(
        `selected` = node.boolean("selected"),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.RadioButton(
        `selected` = node.boolean("selected"),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.RadioButton(
        `selected` = node.boolean("selected"),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeRadioButtonColorsValue(),
      )
      3 -> androidx.compose.material3.RadioButton(
        `selected` = node.boolean("selected"),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeRadioButtonColorsValue(),
      )
      4 -> androidx.compose.material3.RadioButton(
        `selected` = node.boolean("selected"),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      5 -> androidx.compose.material3.RadioButton(
        `selected` = node.boolean("selected"),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      6 -> androidx.compose.material3.RadioButton(
        `selected` = node.boolean("selected"),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeRadioButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      7 -> androidx.compose.material3.RadioButton(
        `selected` = node.boolean("selected"),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeRadioButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.RangeSlider(state: androidx.compose.material3.RangeSliderState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, startInteractionSource: androidx.compose.foundation.interaction.MutableInteractionSource, endInteractionSource: androidx.compose.foundation.interaction.MutableInteractionSource, startThumb: kotlin.Function1<androidx.compose.material3.RangeSliderState, kotlin.Unit>, endThumb: kotlin.Function1<androidx.compose.material3.RangeSliderState, kotlin.Unit>, track: kotlin.Function1<androidx.compose.material3.RangeSliderState, kotlin.Unit>)
internal object RendererRangeSlider {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("startInteractionSource")) 4 else 0) +
      (if (node.has("endInteractionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      3 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      4 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      5 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      6 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      7 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      8 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      9 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      10 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      11 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      12 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      13 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      14 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      15 -> androidx.compose.material3.RangeSlider(
        `state` = node.jsonObject("state").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.RangeSlider(value: kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, onValueChange: kotlin.Function1<kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, valueRange: kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, steps: kotlin.Int, onValueChangeFinished: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.SliderColors)
internal object RendererRangeSlider_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("valueRange")) 2 else 0) +
      (if (node.has("steps")) 4 else 0) +
      (if (node.has("onValueChangeFinished")) 8 else 0) +
      (if (node.has("colors")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
      )
      3 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
      )
      4 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `steps` = node.number("steps").toInt(),
      )
      5 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `steps` = node.number("steps").toInt(),
      )
      6 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
      )
      7 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
      )
      8 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      9 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      10 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      11 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      12 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      13 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      14 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      15 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      16 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      17 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      18 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      19 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      20 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `steps` = node.number("steps").toInt(),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      21 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `steps` = node.number("steps").toInt(),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      22 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      23 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      24 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      25 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      26 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      27 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      28 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      29 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      30 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      31 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.RangeSlider(value: kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, onValueChange: kotlin.Function1<kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, valueRange: kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, onValueChangeFinished: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.SliderColors, startInteractionSource: androidx.compose.foundation.interaction.MutableInteractionSource, endInteractionSource: androidx.compose.foundation.interaction.MutableInteractionSource, startThumb: kotlin.Function1<androidx.compose.material3.RangeSliderState, kotlin.Unit>, endThumb: kotlin.Function1<androidx.compose.material3.RangeSliderState, kotlin.Unit>, track: kotlin.Function1<androidx.compose.material3.RangeSliderState, kotlin.Unit>, steps: kotlin.Int)
internal object RendererRangeSlider_2 {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_steps(node: ComposeNode) = node.number("steps").toInt()

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("valueRange")) 2 else 0) +
      (if (node.has("onValueChangeFinished")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("startInteractionSource")) 16 else 0) +
      (if (node.has("endInteractionSource")) 32 else 0) +
      (if (node.has("steps")) 64 else 0)
    when (mask / 32) {
      0 -> renderRangeSlider_2Group0(node, scope, mask)
      1 -> renderRangeSlider_2Group1(node, scope, mask)
      2 -> renderRangeSlider_2Group2(node, scope, mask)
      3 -> renderRangeSlider_2Group3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRangeSlider_2Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      17 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      18 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      19 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      20 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      21 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      22 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      23 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      24 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      25 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      26 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      27 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      28 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      29 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      30 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      31 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRangeSlider_2Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      33 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      34 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      35 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      36 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      37 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      38 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      39 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      40 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      41 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      42 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      43 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      44 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      45 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      46 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      47 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      48 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      49 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      50 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      51 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      52 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      53 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      54 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      55 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      56 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      57 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      58 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      59 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      60 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      61 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      62 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      63 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRangeSlider_2Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      80 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      81 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      82 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      83 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      84 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      85 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      86 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      87 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      88 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      89 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      90 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      91 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      92 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      93 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      94 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      95 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRangeSlider_2Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      97 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      98 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      99 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      100 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      101 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      102 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      103 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      104 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      105 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      106 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      107 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      108 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      109 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      110 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      111 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      112 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      113 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      114 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      115 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      116 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      117 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      118 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      119 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      120 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      121 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      122 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      123 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      124 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      125 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      126 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      127 -> androidx.compose.material3.RangeSlider(`value` = node.arguments().floatRange("value"), `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(), `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(), `steps` = decode_steps(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.runtime.ReusableContentHost(active: kotlin.Boolean, content: kotlin.Function0<kotlin.Unit>)
internal object RendererReusableContentHost {
  @Composable
  fun render(node: ComposeNode) {
    androidx.compose.runtime.ReusableContentHost(
      `active` = node.boolean("active"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

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
      (if (node.has("tonalElevation")) 32 else 0) +
      (if (node.has("shadowElevation")) 64 else 0)
    when (mask / 32) {
      0 -> renderRichTooltipGroup0(node, scope, mask, slot_title, slot_action, slot_text)
      1 -> renderRichTooltipGroup1(node, scope, mask, slot_title, slot_action, slot_text)
      2 -> renderRichTooltipGroup2(node, scope, mask, slot_title, slot_action, slot_text)
      3 -> renderRichTooltipGroup3(node, scope, mask, slot_title, slot_action, slot_text)
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
      32 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      33 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      34 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      35 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      36 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      37 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      38 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      39 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      40 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      41 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      42 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      43 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      44 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      45 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      46 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      47 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      48 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      49 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      50 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      51 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      52 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      53 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      54 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      55 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      56 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      57 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      58 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      59 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      60 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      61 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      62 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      63 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `text` = slot_text)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup2(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, slot_title: (@Composable () -> Unit)?, slot_action: (@Composable () -> Unit)?, slot_text: @Composable () -> Unit) {
    when (mask) {
      64 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      65 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      66 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      67 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      68 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      69 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      70 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      71 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      72 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      73 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      74 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      75 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      76 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      77 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      78 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      79 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      80 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      81 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      82 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      83 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      84 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      85 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      86 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      87 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      88 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      89 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      90 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      91 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      92 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      93 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      94 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      95 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup3(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int, slot_title: (@Composable () -> Unit)?, slot_action: (@Composable () -> Unit)?, slot_text: @Composable () -> Unit) {
    when (mask) {
      96 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      97 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      98 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      99 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      100 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      101 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      102 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      103 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      104 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      105 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      106 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      107 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      108 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      109 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      110 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      111 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      112 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      113 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      114 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      115 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      116 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      117 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      118 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      119 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      120 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      121 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      122 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      123 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      124 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      125 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      126 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
      127 -> scope.composeScoped3(`modifier` = node.modifier("modifier", scope), `title` = slot_title, `action` = slot_action, `caretSize` = node.jsonObject("caretSize").toDpSize(), `maxWidth` = decode_maxWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `text` = slot_text)
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
      (if (node.has("containerColor")) 16 else 0) +
      (if (node.has("contentColor")) 32 else 0) +
      (if (node.has("contentWindowInsets")) 64 else 0)
    when (mask / 32) {
      0 -> renderScaffoldGroup0(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      1 -> renderScaffoldGroup1(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      2 -> renderScaffoldGroup2(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      3 -> renderScaffoldGroup3(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
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
      16 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      17 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      18 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      19 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      20 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      21 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      22 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      23 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      24 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      25 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      26 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      27 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      28 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      29 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      30 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      31 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      33 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      34 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      35 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      36 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      37 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      38 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      39 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      40 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      41 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      42 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      43 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      44 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      45 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      46 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      47 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      48 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      49 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      50 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      51 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      52 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      53 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      54 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      55 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      56 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      57 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      58 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      59 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      60 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      61 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      62 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      63 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      65 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      66 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      67 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      68 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      69 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      70 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      71 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      72 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      73 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      74 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      75 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      76 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      77 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      78 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      79 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      80 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      81 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      82 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      83 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      84 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      85 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      86 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      87 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      88 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      89 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      90 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      91 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      92 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      93 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      94 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      95 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      97 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      98 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      99 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      100 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      101 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      102 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      103 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      104 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      105 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      106 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      107 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      108 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      109 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      110 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      111 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      112 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      113 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      114 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      115 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      116 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      117 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      118 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      119 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      120 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      121 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      122 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      123 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      124 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      125 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      126 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      127 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
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
      (if (node.has("tonalElevation")) 2 else 0) +
      (if (node.has("shadowElevation")) 4 else 0)
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
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      3 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      4 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      5 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      6 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      7 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
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
      (if (node.has("tonalElevation")) 2 else 0) +
      (if (node.has("shadowElevation")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0)
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
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SearchBar(
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
    val slot_divider: @Composable () -> Unit = { RenderComposeChildren(node.slot("divider")) }
    val slot_tabs: @Composable () -> Unit = { RenderComposeChildren(node.slot("tabs")) }
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("edgePadding")) 4 else 0) +
      (if (node.has("indicator")) 8 else 0) +
      (if (node.has("divider")) 16 else 0) +
      (if (node.has("minTabWidth")) 32 else 0)
    when (mask / 32) {
      0 -> renderSecondaryScrollableTabRowGroup0(node, scope, mask, slot_divider, slot_tabs)
      1 -> renderSecondaryScrollableTabRowGroup1(node, scope, mask, slot_divider, slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `tabs` = slot_tabs)
      1 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tabs` = slot_tabs)
      2 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      3 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      4 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      5 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      6 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      7 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      8 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      9 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      10 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      11 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      12 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      13 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      14 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      15 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      16 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `divider` = slot_divider, `tabs` = slot_tabs)
      17 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      18 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      19 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      20 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      21 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      22 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      23 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      24 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      25 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      26 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      27 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      28 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      29 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      30 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      31 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      33 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      34 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      35 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      36 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      37 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      38 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      39 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      40 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      41 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      42 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      43 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      44 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      45 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      46 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      47 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      48 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      49 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      50 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      51 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      52 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      53 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      54 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      55 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      56 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      57 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      58 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      59 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      60 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      61 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      62 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      63 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
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
      0 -> renderSecureTextFieldGroup0(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1 -> renderSecureTextFieldGroup1(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2 -> renderSecureTextFieldGroup2(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      4 -> renderSecureTextFieldGroup4(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8 -> renderSecureTextFieldGroup8(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16 -> renderSecureTextFieldGroup16(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      32 -> renderSecureTextFieldGroup32(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      48 -> renderSecureTextFieldGroup48(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      64 -> renderSecureTextFieldGroup64(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      80 -> renderSecureTextFieldGroup80(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      96 -> renderSecureTextFieldGroup96(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      112 -> renderSecureTextFieldGroup112(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      128 -> renderSecureTextFieldGroup128(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      256 -> renderSecureTextFieldGroup256(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      512 -> renderSecureTextFieldGroup512(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      655 -> renderSecureTextFieldGroup655(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1024 -> renderSecureTextFieldGroup1024(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1025 -> renderSecureTextFieldGroup1025(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1679 -> renderSecureTextFieldGroup1679(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1711 -> renderSecureTextFieldGroup1711(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1743 -> renderSecureTextFieldGroup1743(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1775 -> renderSecureTextFieldGroup1775(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1791 -> renderSecureTextFieldGroup1791(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2047 -> renderSecureTextFieldGroup2047(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
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
      1024 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1025 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1028 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1029 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1032 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1033 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1036 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1037 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1040 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1041 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1044 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1045 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1048 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1049 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1052 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1053 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup48(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      1536 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1537 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1538 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      1539 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup64(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      2048 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2049 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2052 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2053 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2056 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2057 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2060 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2061 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2064 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2065 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2068 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2069 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2072 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2073 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2076 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2077 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup80(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      2560 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2561 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2562 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      2563 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup96(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      3072 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup112(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      3584 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      3585 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      3586 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      3587 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup128(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      4096 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      4097 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      4100 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      4101 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      4104 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      4105 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      4108 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      4109 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      4112 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4113 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4116 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4117 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4120 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4121 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4124 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      4125 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup256(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      8192 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8193 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8194 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8195 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8196 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8197 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8198 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8199 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8200 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8201 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8202 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8203 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8204 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8205 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8206 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8207 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8208 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8209 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8210 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8211 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8212 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8213 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8214 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8215 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8216 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8217 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8218 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8219 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8220 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8221 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8222 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      8223 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup512(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      16384 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16385 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16388 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16389 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16392 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16393 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16396 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16397 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16400 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16401 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16404 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16405 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16408 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16409 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16412 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      16413 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup655(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      20991 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup1024(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32768 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32769 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32770 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32771 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32772 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32773 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32774 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32775 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32776 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32777 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32778 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32779 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32780 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32781 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32782 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32783 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32784 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32785 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32786 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32787 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32788 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32789 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32790 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32791 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32792 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32793 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32794 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32795 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32796 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32797 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32798 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32799 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup1025(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32800 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32801 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32802 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32803 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32804 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32805 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32806 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32807 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32808 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32809 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32810 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32811 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32812 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32813 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32814 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32815 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32816 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32817 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32818 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32819 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32820 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32821 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32822 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32823 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32824 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32825 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32826 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32827 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32828 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32829 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32830 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      32831 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup1679(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      53759 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup1711(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      54783 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup1743(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      55807 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup1775(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      56831 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup1791(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      57343 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup2047(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      65535 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
