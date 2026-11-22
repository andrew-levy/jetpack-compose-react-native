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

// androidx.compose.material3.SliderDefaults.Thumb(interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.SliderColors, enabled: kotlin.Boolean, thumbSize: androidx.compose.ui.unit.DpSize)
internal object RendererThumb {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("colors")) 1 else 0) +
      (if (node.has("enabled")) 2 else 0) +
      (if (node.has("thumbSize")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      2 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      3 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `enabled` = node.boolean("enabled"),
      )
      4 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `thumbSize` = node.jsonObject("thumbSize").toDpSize(),
      )
      5 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbSize` = node.jsonObject("thumbSize").toDpSize(),
      )
      6 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbSize` = node.jsonObject("thumbSize").toDpSize(),
      )
      7 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `enabled` = node.boolean("enabled"),
        `thumbSize` = node.jsonObject("thumbSize").toDpSize(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SliderDefaults.Thumb(interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource, sliderState: androidx.compose.material3.SliderState, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.SliderColors, enabled: kotlin.Boolean, thumbSize: androidx.compose.ui.unit.DpSize)
internal object RendererThumb_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("colors")) 1 else 0) +
      (if (node.has("enabled")) 2 else 0) +
      (if (node.has("thumbSize")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      2 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      3 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `enabled` = node.boolean("enabled"),
      )
      4 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbSize` = node.jsonObject("thumbSize").toDpSize(),
      )
      5 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbSize` = node.jsonObject("thumbSize").toDpSize(),
      )
      6 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbSize` = node.jsonObject("thumbSize").toDpSize(),
      )
      7 -> androidx.compose.material3.SliderDefaults.Thumb(
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `enabled` = node.boolean("enabled"),
        `thumbSize` = node.jsonObject("thumbSize").toDpSize(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TimeInput(state: androidx.compose.material3.TimePickerState, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.TimePickerColors)
internal object RendererTimeInput {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTimePickerState() else null
    androidx.compose.material3.TimeInput(
      `state` = requireNotNull(stateValue),
      `modifier` = node.modifier("modifier", scope),
    )
  }
}

// androidx.compose.material3.TimePicker(state: androidx.compose.material3.TimePickerState, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.TimePickerColors, layoutType: androidx.compose.material3.TimePickerLayoutType)
internal object RendererTimePicker {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTimePickerState() else null
    androidx.compose.material3.TimePicker(
      `state` = requireNotNull(stateValue),
      `modifier` = node.modifier("modifier", scope),
    )
  }
}

// androidx.compose.material3.TimePickerDialog(onDismissRequest: kotlin.Function0<kotlin.Unit>, confirmButton: kotlin.Function0<kotlin.Unit>, title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, properties: androidx.compose.ui.window.DialogProperties, modeToggleButton: kotlin.Function0<kotlin.Unit>?, dismissButton: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererTimePickerDialog {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("modeToggleButton")) 1 else 0) +
      (if (node.has("dismissButton")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("containerColor")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.TimePickerDialog(
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `modeToggleButton` = if (node.isNull("modeToggleButton")) null else ({ RenderComposeChildren(node.slot("modeToggleButton")) }),
        `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TimePickerDialogDefaults.Title(displayMode: androidx.compose.material3.TimePickerDisplayMode, modifier: androidx.compose.ui.Modifier)
internal object RendererTitle {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.material3.TimePickerDialogDefaults.Title(
      `displayMode` = toComposeTimePickerDisplayMode(node.string("displayMode")),
      `modifier` = node.modifier("modifier", scope),
    )
  }
}

// androidx.compose.material3.ToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.ToggleButtonShapes, colors: androidx.compose.material3.ToggleButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererToggleButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.ToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.ToggleButton(
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

// androidx.compose.material3.ToggleFloatingActionButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, containerColor: kotlin.Function1<kotlin.Float, androidx.compose.ui.graphics.Color>, contentAlignment: androidx.compose.ui.Alignment, containerSize: kotlin.Function1<kotlin.Float, androidx.compose.ui.unit.Dp>, containerCornerRadius: kotlin.Function1<kotlin.Float, androidx.compose.ui.unit.Dp>, content: kotlin.Function1<androidx.compose.material3.ToggleFloatingActionButtonScope, kotlin.Unit>)
internal object RendererToggleFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentAlignment")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ToggleFloatingActionButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ToggleFloatingActionButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentAlignment` = toComposeAlignment(node.string("contentAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererTonalLeadingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton(
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

// androidx.compose.material3.TonalToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.ToggleButtonShapes, colors: androidx.compose.material3.ToggleButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererTonalToggleButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.TonalToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.TonalToggleButton(
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

// androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererTonalTrailingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton(
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

// androidx.compose.material3.TooltipBox(positionProvider: androidx.compose.ui.window.PopupPositionProvider, tooltip: kotlin.Function1<androidx.compose.material3.TooltipScope, kotlin.Unit>, state: androidx.compose.material3.TooltipState, modifier: androidx.compose.ui.Modifier, onDismissRequest: kotlin.Function0<kotlin.Unit>?, focusable: kotlin.Boolean, enableUserInput: kotlin.Boolean, content: kotlin.Function0<kotlin.Unit>)
internal object RendererTooltipBox {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val positionProviderValue = if (node.has("positionProvider") && !node.isNull("positionProvider")) node.jsonObject("positionProvider").rememberComposePopupPosition() else null
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTooltipState() else null
    val mask = (if (node.has("onDismissRequest")) 1 else 0) +
      (if (node.has("focusable")) 2 else 0) +
      (if (node.has("enableUserInput")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip"), this) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.TooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip"), this) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `onDismissRequest` = if (node.isNull("onDismissRequest")) null else ({ node.emit("onDismissRequest") }),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.TooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip"), this) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `focusable` = node.boolean("focusable"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.TooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip"), this) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `onDismissRequest` = if (node.isNull("onDismissRequest")) null else ({ node.emit("onDismissRequest") }),
        `focusable` = node.boolean("focusable"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.TooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip"), this) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enableUserInput` = node.boolean("enableUserInput"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.TooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip"), this) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `onDismissRequest` = if (node.isNull("onDismissRequest")) null else ({ node.emit("onDismissRequest") }),
        `enableUserInput` = node.boolean("enableUserInput"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.TooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip"), this) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `focusable` = node.boolean("focusable"),
        `enableUserInput` = node.boolean("enableUserInput"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.TooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip"), this) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `onDismissRequest` = if (node.isNull("onDismissRequest")) null else ({ node.emit("onDismissRequest") }),
        `focusable` = node.boolean("focusable"),
        `enableUserInput` = node.boolean("enableUserInput"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererTopAppBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scrollBehaviorValue = if (node.has("scrollBehavior") && !node.isNull("scrollBehavior")) node.jsonObject("scrollBehavior").rememberComposeTopAppBarScrollBehavior() else null
    val mask = (if (node.has("navigationIcon")) 1 else 0) +
      (if (node.has("actions")) 2 else 0) +
      (if (node.has("expandedHeight")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0) +
      (if (node.has("scrollBehavior")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      2 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      3 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      4 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      5 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      6 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      7 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      8 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      9 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      10 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      11 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      12 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      13 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      14 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      15 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      16 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      17 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      18 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      19 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      20 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      21 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      22 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      23 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      24 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      25 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      26 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      27 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      28 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      29 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      30 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      31 -> androidx.compose.material3.TopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TopAppBar(title: kotlin.Function0<kotlin.Unit>, subtitle: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, titleHorizontalAlignment: androidx.compose.ui.Alignment.Horizontal, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererTopAppBar_1 {
  private fun decode_expandedHeight(node: ComposeNode) = node.number("expandedHeight").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scrollBehaviorValue = if (node.has("scrollBehavior") && !node.isNull("scrollBehavior")) node.jsonObject("scrollBehavior").rememberComposeTopAppBarScrollBehavior() else null
    val slot_title: @Composable () -> Unit = { RenderComposeChildren(node.slot("title")) }
    val slot_subtitle: @Composable () -> Unit = { RenderComposeChildren(node.slot("subtitle")) }
    val slot_navigationIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("navigationIcon")) }
    val mask = (if (node.has("navigationIcon")) 1 else 0) +
      (if (node.has("actions")) 2 else 0) +
      (if (node.has("titleHorizontalAlignment")) 4 else 0) +
      (if (node.has("expandedHeight")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0) +
      (if (node.has("scrollBehavior")) 32 else 0)
    when (mask / 32) {
      0 -> renderTopAppBar_1Group0(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      1 -> renderTopAppBar_1Group1(node, scope, mask, scrollBehaviorValue, slot_title, slot_subtitle, slot_navigationIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderTopAppBar_1Group0(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon)
      2 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      3 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) })
      4 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      5 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      6 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      7 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")))
      8 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node))
      9 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node))
      10 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      11 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node))
      12 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      13 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      14 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      15 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node))
      16 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      17 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      18 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      19 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      20 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      21 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      22 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      23 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      24 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      25 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      26 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      27 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      28 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      29 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      30 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      31 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderTopAppBar_1Group1(node: ComposeNode, scope: Any?, mask: Int, scrollBehaviorValue: androidx.compose.material3.TopAppBarScrollBehavior?, slot_title: @Composable () -> Unit, slot_subtitle: @Composable () -> Unit, slot_navigationIcon: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      33 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      34 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      35 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      36 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      37 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      38 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      39 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      40 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      41 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      42 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      43 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      44 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      45 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      46 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      47 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      48 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      49 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      50 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      51 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      52 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      53 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      54 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      55 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      56 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      57 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      58 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      59 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      60 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      61 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      62 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      63 -> androidx.compose.material3.TopAppBar(`title` = slot_title, `subtitle` = slot_subtitle, `modifier` = node.modifier("modifier", scope), `navigationIcon` = slot_navigationIcon, `actions` = { RenderComposeChildren(node.slot("actions"), this) }, `titleHorizontalAlignment` = toComposeHorizontalAlignment(node.string("titleHorizontalAlignment")), `expandedHeight` = decode_expandedHeight(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `scrollBehavior` = if (node.isNull("scrollBehavior")) null else (requireNotNull(scrollBehaviorValue)))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TopSearchBar(state: androidx.compose.material3.SearchBarState, inputField: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, scrollBehavior: androidx.compose.material3.SearchBarScrollBehavior?)
internal object RendererTopSearchBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeSearchBarState() else null
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("tonalElevation")) 2 else 0) +
      (if (node.has("shadowElevation")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      2 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      3 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      4 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      5 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      6 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      7 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      8 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      9 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      10 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      11 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      12 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      13 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      14 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      15 -> androidx.compose.material3.TopSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SliderDefaults.Track(rangeSliderState: androidx.compose.material3.RangeSliderState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, drawStopIndicator: kotlin.Function2<androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.geometry.Offset, kotlin.Unit>?, drawTick: kotlin.Function3<androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.geometry.Offset, androidx.compose.ui.graphics.Color, kotlin.Unit>, thumbTrackGapSize: androidx.compose.ui.unit.Dp, trackInsideCornerSize: androidx.compose.ui.unit.Dp)
internal object RendererTrack {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("thumbTrackGapSize")) 4 else 0) +
      (if (node.has("trackInsideCornerSize")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      3 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      4 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      5 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      6 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      7 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      8 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      9 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      10 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      11 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      12 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      13 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      14 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      15 -> androidx.compose.material3.SliderDefaults.Track(
        `rangeSliderState` = node.jsonObject("rangeSliderState").rememberComposeRangeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SliderDefaults.Track(sliderState: androidx.compose.material3.SliderState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, drawStopIndicator: kotlin.Function2<androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.geometry.Offset, kotlin.Unit>?, drawTick: kotlin.Function3<androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.geometry.Offset, androidx.compose.ui.graphics.Color, kotlin.Unit>, thumbTrackGapSize: androidx.compose.ui.unit.Dp, trackInsideCornerSize: androidx.compose.ui.unit.Dp)
internal object RendererTrack_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("thumbTrackGapSize")) 4 else 0) +
      (if (node.has("trackInsideCornerSize")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      3 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      4 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      5 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      6 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      7 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      8 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      9 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      10 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      11 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      12 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      13 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      14 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      15 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SliderDefaults.Track(sliderState: androidx.compose.material3.SliderState, trackCornerSize: androidx.compose.ui.unit.Dp, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, drawStopIndicator: kotlin.Function2<androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.geometry.Offset, kotlin.Unit>?, drawTick: kotlin.Function3<androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.geometry.Offset, androidx.compose.ui.graphics.Color, kotlin.Unit>, thumbTrackGapSize: androidx.compose.ui.unit.Dp, trackInsideCornerSize: androidx.compose.ui.unit.Dp)
internal object RendererTrack_2 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("thumbTrackGapSize")) 4 else 0) +
      (if (node.has("trackInsideCornerSize")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      3 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      4 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      5 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      6 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      7 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      8 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      9 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      10 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      11 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      12 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      13 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      14 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      15 -> androidx.compose.material3.SliderDefaults.Track(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `trackCornerSize` = node.number("trackCornerSize").dp,
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SplitButtonDefaults.TrailingButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererTrailingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
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

// androidx.compose.material3.SplitButtonDefaults.TrailingButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererTrailingButton_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SplitButtonDefaults.TrailingButton(
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

// androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon(expanded: kotlin.Boolean, modifier: androidx.compose.ui.Modifier)
internal object RendererTrailingIcon {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon(
      `expanded` = node.boolean("expanded"),
      `modifier` = node.modifier("modifier", scope),
    )
  }
}

// androidx.compose.material3.TriStateCheckbox(state: androidx.compose.ui.state.ToggleableState, onClick: kotlin.Function0<kotlin.Unit>?, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.CheckboxColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererTriStateCheckbox {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TriStateCheckbox(
        `state` = toComposeToggleableState(node.string("state")),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.TriStateCheckbox(
        `state` = toComposeToggleableState(node.string("state")),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.TriStateCheckbox(
        `state` = toComposeToggleableState(node.string("state")),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
      )
      3 -> androidx.compose.material3.TriStateCheckbox(
        `state` = toComposeToggleableState(node.string("state")),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
      )
      4 -> androidx.compose.material3.TriStateCheckbox(
        `state` = toComposeToggleableState(node.string("state")),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      5 -> androidx.compose.material3.TriStateCheckbox(
        `state` = toComposeToggleableState(node.string("state")),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      6 -> androidx.compose.material3.TriStateCheckbox(
        `state` = toComposeToggleableState(node.string("state")),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      7 -> androidx.compose.material3.TriStateCheckbox(
        `state` = toComposeToggleableState(node.string("state")),
        `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCheckboxColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.VerticalDivider(modifier: androidx.compose.ui.Modifier, thickness: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color)
internal object RendererVerticalDivider {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("thickness")) 1 else 0) +
      (if (node.has("color")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.VerticalDivider(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.VerticalDivider(
        `modifier` = node.modifier("modifier", scope),
        `thickness` = node.number("thickness").dp,
      )
      2 -> androidx.compose.material3.VerticalDivider(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.VerticalDivider(
        `modifier` = node.modifier("modifier", scope),
        `thickness` = node.number("thickness").dp,
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.VerticalDragHandle(modifier: androidx.compose.ui.Modifier, sizes: androidx.compose.material3.DragHandleSizes, colors: androidx.compose.material3.DragHandleColors, shapes: androidx.compose.material3.DragHandleShapes, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererVerticalDragHandle {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("colors")) 1 else 0) +
      (if (node.has("interactionSource")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.VerticalDragHandle(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.VerticalDragHandle(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeDragHandleColorsValue(),
      )
      2 -> androidx.compose.material3.VerticalDragHandle(
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      3 -> androidx.compose.material3.VerticalDragHandle(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeDragHandleColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.VerticalFloatingToolbar(expanded: kotlin.Boolean, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.FloatingToolbarColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, scrollBehavior: androidx.compose.material3.FloatingToolbarScrollBehavior?, shape: androidx.compose.ui.graphics.Shape, leadingContent: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>?, trailingContent: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>?, expandedShadowElevation: androidx.compose.ui.unit.Dp, collapsedShadowElevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererVerticalFloatingToolbar {
  private fun decode_expanded(node: ComposeNode) = node.boolean("expanded")
  private fun decode_expandedShadowElevation(node: ComposeNode) = node.number("expandedShadowElevation").dp
  private fun decode_collapsedShadowElevation(node: ComposeNode) = node.number("collapsedShadowElevation").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentPadding")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("leadingContent")) 4 else 0) +
      (if (node.has("trailingContent")) 8 else 0) +
      (if (node.has("expandedShadowElevation")) 16 else 0) +
      (if (node.has("collapsedShadowElevation")) 32 else 0)
    when (mask / 32) {
      0 -> renderVerticalFloatingToolbarGroup0(node, scope, mask)
      1 -> renderVerticalFloatingToolbarGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderVerticalFloatingToolbarGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderVerticalFloatingToolbarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.VerticalFloatingToolbar(`expanded` = decode_expanded(node), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `shape` = node.arguments().shape("shape"), `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent"), this) }), `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent"), this) }), `expandedShadowElevation` = decode_expandedShadowElevation(node), `collapsedShadowElevation` = decode_collapsedShadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.VerticalFloatingToolbar(expanded: kotlin.Boolean, floatingActionButton: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, colors: androidx.compose.material3.FloatingToolbarColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, scrollBehavior: androidx.compose.material3.FloatingToolbarScrollBehavior?, shape: androidx.compose.ui.graphics.Shape, floatingActionButtonPosition: androidx.compose.material3.FloatingToolbarVerticalFabPosition, animationSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>, expandedShadowElevation: androidx.compose.ui.unit.Dp, collapsedShadowElevation: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererVerticalFloatingToolbar_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentPadding")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("animationSpec")) 4 else 0) +
      (if (node.has("expandedShadowElevation")) 8 else 0) +
      (if (node.has("collapsedShadowElevation")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.VerticalFloatingToolbar(
        `expanded` = node.boolean("expanded"),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `shape` = node.arguments().shape("shape"),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `expandedShadowElevation` = node.number("expandedShadowElevation").dp,
        `collapsedShadowElevation` = node.number("collapsedShadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.pager.VerticalPager(state: androidx.compose.foundation.pager.PagerState, modifier: androidx.compose.ui.Modifier, contentPadding: androidx.compose.foundation.layout.PaddingValues, pageSize: androidx.compose.foundation.pager.PageSize, beyondViewportPageCount: kotlin.Int, pageSpacing: androidx.compose.ui.unit.Dp, horizontalAlignment: androidx.compose.ui.Alignment.Horizontal, flingBehavior: androidx.compose.foundation.gestures.TargetedFlingBehavior, userScrollEnabled: kotlin.Boolean, reverseLayout: kotlin.Boolean, key: kotlin.Function1<kotlin.Int, kotlin.Any>?, pageNestedScrollConnection: androidx.compose.ui.input.nestedscroll.NestedScrollConnection, snapPosition: androidx.compose.foundation.gestures.snapping.SnapPosition, overscrollEffect: androidx.compose.foundation.OverscrollEffect?, pageContent: kotlin.Function2<androidx.compose.foundation.pager.PagerScope, kotlin.Int, kotlin.Unit>)
internal object RendererVerticalPager {
  private fun decode_beyondViewportPageCount(node: ComposeNode) = node.number("beyondViewportPageCount").toInt()
  private fun decode_pageSpacing(node: ComposeNode) = node.number("pageSpacing").dp
  private fun decode_userScrollEnabled(node: ComposeNode) = node.boolean("userScrollEnabled")
  private fun decode_reverseLayout(node: ComposeNode) = node.boolean("reverseLayout")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposePagerState(node) else null
    val mask = (if (node.has("contentPadding")) 1 else 0) +
      (if (node.has("pageSize")) 2 else 0) +
      (if (node.has("beyondViewportPageCount")) 4 else 0) +
      (if (node.has("pageSpacing")) 8 else 0) +
      (if (node.has("horizontalAlignment")) 16 else 0) +
      (if (node.has("userScrollEnabled")) 32 else 0) +
      (if (node.has("reverseLayout")) 64 else 0) +
      (if (node.has("pageNestedScrollConnection")) 128 else 0) +
      (if (node.has("snapPosition")) 256 else 0) +
      (if (node.has("overscrollEffect")) 512 else 0)
    when (mask / 32) {
      0 -> renderVerticalPagerGroup0(node, scope, mask, stateValue)
      1 -> renderVerticalPagerGroup1(node, scope, mask, stateValue)
      2 -> renderVerticalPagerGroup2(node, scope, mask, stateValue)
      3 -> renderVerticalPagerGroup3(node, scope, mask, stateValue)
      4 -> renderVerticalPagerGroup4(node, scope, mask, stateValue)
      5 -> renderVerticalPagerGroup5(node, scope, mask, stateValue)
      6 -> renderVerticalPagerGroup6(node, scope, mask, stateValue)
      7 -> renderVerticalPagerGroup7(node, scope, mask, stateValue)
      8 -> renderVerticalPagerGroup8(node, scope, mask, stateValue)
      9 -> renderVerticalPagerGroup9(node, scope, mask, stateValue)
      10 -> renderVerticalPagerGroup10(node, scope, mask, stateValue)
      11 -> renderVerticalPagerGroup11(node, scope, mask, stateValue)
      15 -> renderVerticalPagerGroup15(node, scope, mask, stateValue)
      16 -> renderVerticalPagerGroup16(node, scope, mask, stateValue)
      17 -> renderVerticalPagerGroup17(node, scope, mask, stateValue)
      18 -> renderVerticalPagerGroup18(node, scope, mask, stateValue)
      19 -> renderVerticalPagerGroup19(node, scope, mask, stateValue)
      23 -> renderVerticalPagerGroup23(node, scope, mask, stateValue)
      24 -> renderVerticalPagerGroup24(node, scope, mask, stateValue)
      31 -> renderVerticalPagerGroup31(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      0 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      1 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      2 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      4 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      5 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      6 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      8 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      9 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      10 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      12 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      13 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      14 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      16 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      17 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      20 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      21 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      24 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      25 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      28 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      29 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      32 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      33 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      34 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      36 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      37 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      38 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      40 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      41 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      42 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      44 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      45 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      46 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      48 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      49 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      52 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      53 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      56 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      57 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      60 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      61 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      64 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      65 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      66 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      68 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      69 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      70 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      72 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      73 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      74 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      76 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      77 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      78 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      80 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      81 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      84 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      85 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      88 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      89 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      92 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      93 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      96 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      97 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      98 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      100 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      101 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      102 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      104 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      105 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      106 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      108 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      109 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      110 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      112 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      113 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      116 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      117 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      120 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      121 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      124 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      125 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      128 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      129 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      132 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      133 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      136 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      137 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      140 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      141 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      144 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      145 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      148 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      149 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      152 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      153 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      156 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      157 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      160 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      161 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      164 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      165 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      168 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      169 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      172 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      173 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      176 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      177 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      180 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      181 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      184 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      185 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      188 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      189 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      192 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      193 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      196 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      197 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      200 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      201 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      204 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      205 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      208 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      209 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      212 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      213 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      216 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      217 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      220 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      221 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      224 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      225 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      228 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      229 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      232 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      233 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      236 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      237 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      240 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      241 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      244 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      245 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      248 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      249 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      252 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      253 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      255 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      256 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      258 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      260 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      264 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      268 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup9(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      288 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      292 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      296 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      300 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup10(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      320 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      324 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      328 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      332 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup11(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      352 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      356 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      360 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      364 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup15(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      509 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      512 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      514 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      516 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      520 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      524 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup17(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      544 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      548 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      552 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      556 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup18(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      576 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      580 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      584 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      588 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup19(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      608 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      612 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      616 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      620 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup23(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      765 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup24(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      768 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderVerticalPagerGroup31(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.pager.PagerState?) {
    when (mask) {
      1023 -> androidx.compose.foundation.pager.VerticalPager(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `pageSize` = node.jsonObject("pageSize").toComposePageSize(), `beyondViewportPageCount` = decode_beyondViewportPageCount(node), `pageSpacing` = decode_pageSpacing(node), `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")), `userScrollEnabled` = decode_userScrollEnabled(node), `reverseLayout` = decode_reverseLayout(node), `pageNestedScrollConnection` = node.jsonObject("pageNestedScrollConnection").rememberComposeNestedScrollConnection(), `snapPosition` = toComposeSnapPosition(node.string("snapPosition")), `overscrollEffect` = if (node.isNull("overscrollEffect")) null else (node.jsonObject("overscrollEffect").rememberComposeOverscrollEffect()), pageContent = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it, this) } })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.VerticalSlider(state: androidx.compose.material3.SliderState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, reverseDirection: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource, thumb: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>, track: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>)
internal object RendererVerticalSlider {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("reverseDirection")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `reverseDirection` = node.boolean("reverseDirection"),
      )
      3 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `reverseDirection` = node.boolean("reverseDirection"),
      )
      4 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      5 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      6 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `reverseDirection` = node.boolean("reverseDirection"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      7 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `reverseDirection` = node.boolean("reverseDirection"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      8 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      9 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      10 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `reverseDirection` = node.boolean("reverseDirection"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      11 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `reverseDirection` = node.boolean("reverseDirection"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      12 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      13 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      14 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `reverseDirection` = node.boolean("reverseDirection"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      15 -> androidx.compose.material3.VerticalSlider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `reverseDirection` = node.boolean("reverseDirection"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererVibrantFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton(
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

// androidx.compose.material3.WideNavigationRail(modifier: androidx.compose.ui.Modifier, state: androidx.compose.material3.WideNavigationRailState, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.WideNavigationRailColors, header: kotlin.Function0<kotlin.Unit>?, windowInsets: androidx.compose.foundation.layout.WindowInsets, arrangement: androidx.compose.foundation.layout.Arrangement.Vertical, content: kotlin.Function0<kotlin.Unit>)
internal object RendererWideNavigationRail {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("header")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0) +
      (if (node.has("arrangement")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.WideNavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeVerticalArrangement(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.WideNavigationRailItem(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>?, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, railExpanded: kotlin.Boolean, iconPosition: androidx.compose.material3.NavigationItemIconPosition, colors: androidx.compose.material3.NavigationItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererWideNavigationRailItem {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("railExpanded")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `railExpanded` = node.boolean("railExpanded"),
      )
      3 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `railExpanded` = node.boolean("railExpanded"),
      )
      4 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      5 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      6 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `railExpanded` = node.boolean("railExpanded"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      7 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `railExpanded` = node.boolean("railExpanded"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      8 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      9 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      10 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `railExpanded` = node.boolean("railExpanded"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      11 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `railExpanded` = node.boolean("railExpanded"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      12 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      13 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      14 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `railExpanded` = node.boolean("railExpanded"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      15 -> androidx.compose.material3.WideNavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `railExpanded` = node.boolean("railExpanded"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
