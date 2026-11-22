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
      64 -> renderDecorationBoxGroup64(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
      111 -> renderDecorationBoxGroup111(node, mask, slot_innerTextField, slot_label, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText, slot_container)
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
  private fun renderDecorationBoxGroup111(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
      3583 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(`value` = decode_value(node), `innerTextField` = slot_innerTextField, `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(), `isError` = decode_isError(node), `label` = slot_label, `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `container` = slot_container)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup127(node: ComposeNode, mask: Int, slot_innerTextField: @Composable () -> Unit, slot_label: (@Composable () -> Unit)?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?, slot_container: @Composable () -> Unit) {
    when (mask) {
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
      2047 -> androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(
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
    androidx.compose.ui.window.Dialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      content = { RenderComposeChildren(node.children) },
    )
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
      (if (node.has("tonalElevation")) 2 else 0) +
      (if (node.has("shadowElevation")) 4 else 0)
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
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.DockedSearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
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

// androidx.compose.material3.DropdownMenu(expanded: kotlin.Boolean, onDismissRequest: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, offset: androidx.compose.ui.unit.DpOffset, scrollState: androidx.compose.foundation.ScrollState, properties: androidx.compose.ui.window.PopupProperties, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, border: androidx.compose.foundation.BorderStroke?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererDropdownMenu {
  private fun decode_expanded(node: ComposeNode) = node.boolean("expanded")
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_tonalElevation(node: ComposeNode) = node.number("tonalElevation").dp
  private fun decode_shadowElevation(node: ComposeNode) = node.number("shadowElevation").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scrollStateValue = if (node.has("scrollState") && !node.isNull("scrollState")) node.jsonObject("scrollState").rememberComposeScrollState(node.arguments()) else null
    val mask = (if (node.has("offset")) 1 else 0) +
      (if (node.has("scrollState")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("containerColor")) 8 else 0) +
      (if (node.has("tonalElevation")) 16 else 0) +
      (if (node.has("shadowElevation")) 32 else 0) +
      (if (node.has("border")) 64 else 0)
    when (mask / 32) {
      0 -> renderDropdownMenuGroup0(node, scope, mask, scrollStateValue)
      1 -> renderDropdownMenuGroup1(node, scope, mask, scrollStateValue)
      2 -> renderDropdownMenuGroup2(node, scope, mask, scrollStateValue)
      3 -> renderDropdownMenuGroup3(node, scope, mask, scrollStateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDropdownMenuGroup0(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?) {
    when (mask) {
      0 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDropdownMenuGroup1(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?) {
    when (mask) {
      32 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDropdownMenuGroup2(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?) {
    when (mask) {
      64 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDropdownMenuGroup3(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?) {
    when (mask) {
      96 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.DropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `offset` = node.jsonObject("offset").decodeComposeDpOffset(), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DropdownMenuItem(text: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, enabled: kotlin.Boolean, colors: androidx.compose.material3.MenuItemColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererDropdownMenuItem {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_text: @Composable () -> Unit = { RenderComposeChildren(node.slot("text")) }
    val content_leadingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("leadingIcon")) }
    val slot_leadingIcon = if (node.isNull("leadingIcon")) null else content_leadingIcon
    val content_trailingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("trailingIcon")) }
    val slot_trailingIcon = if (node.isNull("trailingIcon")) null else content_trailingIcon
    val mask = (if (node.has("leadingIcon")) 1 else 0) +
      (if (node.has("trailingIcon")) 2 else 0) +
      (if (node.has("enabled")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("contentPadding")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderDropdownMenuItemGroup0(node, scope, mask, slot_text, slot_leadingIcon, slot_trailingIcon)
      1 -> renderDropdownMenuItemGroup1(node, scope, mask, slot_text, slot_leadingIcon, slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDropdownMenuItemGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      2 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon)
      3 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      4 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      5 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node))
      6 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node))
      7 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node))
      8 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue())
      9 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue())
      10 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue())
      11 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue())
      12 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue())
      13 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue())
      14 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue())
      15 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue())
      16 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      17 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      18 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      19 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      20 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      21 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      22 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      23 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      24 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      25 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      26 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      27 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      28 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      29 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      30 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      31 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDropdownMenuItemGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_text: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      33 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      34 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      35 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      36 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      37 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      38 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      39 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      40 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      41 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      42 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      43 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      44 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      45 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      46 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      47 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      48 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      49 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      50 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      51 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      52 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      53 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      54 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      55 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      56 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      57 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      58 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      59 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      60 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      61 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      62 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      63 -> androidx.compose.material3.DropdownMenuItem(`text` = slot_text, `onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeMenuItemColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedAssistChip(onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ChipColors, elevation: androidx.compose.material3.ChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererElevatedAssistChip {
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
      (if (node.has("interactionSource")) 128 else 0)
    when (mask / 32) {
      0 -> renderElevatedAssistChipGroup0(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      1 -> renderElevatedAssistChipGroup1(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      2 -> renderElevatedAssistChipGroup2(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      3 -> renderElevatedAssistChipGroup3(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      4 -> renderElevatedAssistChipGroup4(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      6 -> renderElevatedAssistChipGroup6(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      7 -> renderElevatedAssistChipGroup7(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedAssistChipGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      3 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon)
      4 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon)
      5 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon)
      6 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      7 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      8 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      9 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      10 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      11 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      12 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      13 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      14 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      15 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      16 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      17 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      18 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      19 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      20 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      21 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      22 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      23 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      24 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      25 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      26 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      27 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      28 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      29 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      30 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      31 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedAssistChipGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      33 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      34 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      35 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      36 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      37 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      38 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      39 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      40 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      41 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      42 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      43 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      44 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      45 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      46 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      47 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      48 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedAssistChipGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      65 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      66 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      67 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      68 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      69 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      70 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      71 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      72 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      73 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      74 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      75 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      76 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      77 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      78 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      79 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      80 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      81 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      82 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      83 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      84 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      85 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      86 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      87 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      88 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      89 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      90 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      91 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      92 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      93 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      94 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      95 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedAssistChipGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      97 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      98 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      99 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      100 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      101 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      102 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      103 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      104 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      105 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      106 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      107 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      108 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      109 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      110 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      111 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedAssistChipGroup4(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      129 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      130 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      131 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      132 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      133 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      134 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      135 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      136 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      137 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      138 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      139 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      140 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      141 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      142 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      143 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedAssistChipGroup6(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      192 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      193 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      194 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      195 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      196 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      197 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      198 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      199 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      200 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      201 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      202 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      203 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      204 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      205 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      206 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      207 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedAssistChipGroup7(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      255 -> androidx.compose.material3.ElevatedAssistChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererElevatedButton {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("contentPadding")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderElevatedButtonGroup0(node, scope, mask)
      1 -> renderElevatedButtonGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedButtonGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedButtonGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.ElevatedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedCard(modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererElevatedCard {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ElevatedCard(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ElevatedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ElevatedCard(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ElevatedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedCard(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererElevatedCard_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedFilterChip(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SelectableChipColors, elevation: androidx.compose.material3.SelectableChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererElevatedFilterChip {
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
      (if (node.has("elevation")) 16 else 0) +
      (if (node.has("border")) 32 else 0) +
      (if (node.has("interactionSource")) 64 else 0)
    when (mask / 32) {
      0 -> renderElevatedFilterChipGroup0(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      1 -> renderElevatedFilterChipGroup1(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      2 -> renderElevatedFilterChipGroup2(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      3 -> renderElevatedFilterChipGroup3(node, scope, mask, slot_label, slot_leadingIcon, slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedFilterChipGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      3 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon)
      4 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon)
      5 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon)
      6 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      7 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      8 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      9 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      10 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      11 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      12 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      13 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      14 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      15 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      16 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      17 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      18 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      19 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      20 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      21 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      22 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      23 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      24 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      25 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      26 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      27 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      28 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      29 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      30 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      31 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedFilterChipGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      33 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      34 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      35 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      36 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      37 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      38 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      39 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      40 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      41 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      42 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      43 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      44 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      45 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      46 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      47 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      48 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      49 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      50 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      51 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      52 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      53 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      54 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      55 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      56 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      57 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      58 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      59 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      60 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      61 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      62 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      63 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedFilterChipGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      65 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      66 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      67 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      68 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      69 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      70 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      71 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      72 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      73 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      74 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      75 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      76 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      77 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      78 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      79 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      80 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      81 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      82 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      83 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      84 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      85 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      86 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      87 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      88 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      89 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      90 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      91 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      92 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      93 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      94 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      95 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedFilterChipGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      97 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      98 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      99 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      100 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      101 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      102 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      103 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      104 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      105 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      106 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      107 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      108 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      109 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      110 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      111 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      112 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      113 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      114 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      115 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      116 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      117 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      118 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      119 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      120 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      121 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      122 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      123 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      124 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      125 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      126 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      127 -> androidx.compose.material3.ElevatedFilterChip(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeSelectableChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererElevatedLeadingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
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

// androidx.compose.material3.ElevatedSuggestionChip(onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, icon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ChipColors, elevation: androidx.compose.material3.ChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererElevatedSuggestionChip {
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
      0 -> renderElevatedSuggestionChipGroup0(node, scope, mask, slot_label, slot_icon)
      1 -> renderElevatedSuggestionChipGroup1(node, scope, mask, slot_label, slot_icon)
      2 -> renderElevatedSuggestionChipGroup2(node, scope, mask, slot_label, slot_icon)
      3 -> renderElevatedSuggestionChipGroup3(node, scope, mask, slot_label, slot_icon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedSuggestionChipGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon)
      3 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon)
      4 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      5 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      6 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"))
      7 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"))
      8 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      9 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      10 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      11 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      12 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      13 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      14 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      15 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue())
      16 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      17 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      18 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      19 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      20 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      21 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      22 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      23 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      24 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      25 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      26 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      27 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      28 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      29 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      30 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      31 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedSuggestionChipGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      33 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      34 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      35 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      36 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      37 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      38 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      39 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      40 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      41 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      42 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      43 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      44 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      45 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      46 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      47 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      48 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      49 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      50 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      51 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      52 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      53 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      54 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      55 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      56 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      57 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      58 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      59 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      60 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      61 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      62 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      63 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedSuggestionChipGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      65 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      66 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      67 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      68 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      69 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      70 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      71 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      72 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      73 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      74 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      75 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      76 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      77 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      78 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      79 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      80 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      81 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      82 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      83 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      84 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      85 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      86 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      87 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      88 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      89 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      90 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      91 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      92 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      93 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      94 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      95 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedSuggestionChipGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_label: @Composable () -> Unit, slot_icon: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      97 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      98 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      99 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      100 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      101 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      102 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      103 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      104 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      105 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      106 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      107 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      108 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      109 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      110 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      111 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      112 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      113 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      114 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      115 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      116 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      117 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      118 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      119 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      120 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      121 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      122 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      123 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      124 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      125 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      126 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      127 -> androidx.compose.material3.ElevatedSuggestionChip(`onClick` = { node.emit("onClick") }, `label` = slot_label, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeChipColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeChipElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.ToggleButtonShapes, colors: androidx.compose.material3.ToggleButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererElevatedToggleButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.ElevatedToggleButton(
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

// androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shapes: androidx.compose.material3.SplitButtonShapes, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererElevatedTrailingButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
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

// androidx.compose.material3.ExpandedDockedSearchBar(state: androidx.compose.material3.SearchBarState, inputField: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, properties: androidx.compose.ui.window.PopupProperties, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererExpandedDockedSearchBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeSearchBarState() else null
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("tonalElevation")) 2 else 0) +
      (if (node.has("shadowElevation")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ExpandedDockedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ExpandedDockedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ExpandedDockedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ExpandedDockedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ExpandedDockedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ExpandedDockedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ExpandedDockedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ExpandedDockedSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ExpandedFullScreenSearchBar(state: androidx.compose.material3.SearchBarState, inputField: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, collapsedShape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, windowInsets: kotlin.Function0<androidx.compose.foundation.layout.WindowInsets>, properties: androidx.compose.ui.window.DialogProperties, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererExpandedFullScreenSearchBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeSearchBarState() else null
    val mask = (if (node.has("collapsedShape")) 1 else 0) +
      (if (node.has("tonalElevation")) 2 else 0) +
      (if (node.has("shadowElevation")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0)
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
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = { node.jsonObject("windowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `windowInsets` = { node.jsonObject("windowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = { node.jsonObject("windowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = { node.jsonObject("windowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = { node.jsonObject("windowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = { node.jsonObject("windowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = { node.jsonObject("windowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ExpandedFullScreenSearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `collapsedShape` = node.arguments().shape("collapsedShape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = { node.jsonObject("windowInsets").toWindowInsets() },
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu(expanded: kotlin.Boolean, onDismissRequest: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, scrollState: androidx.compose.foundation.ScrollState, matchAnchorWidth: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, border: androidx.compose.foundation.BorderStroke?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererExposedDropdownMenu {
  private fun decode_expanded(node: ComposeNode) = node.boolean("expanded")
  private fun decode_matchAnchorWidth(node: ComposeNode) = node.boolean("matchAnchorWidth")
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_tonalElevation(node: ComposeNode) = node.number("tonalElevation").dp
  private fun decode_shadowElevation(node: ComposeNode) = node.number("shadowElevation").dp

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.ExposedDropdownMenuBoxScope) {
    val scrollStateValue = if (node.has("scrollState") && !node.isNull("scrollState")) node.jsonObject("scrollState").rememberComposeScrollState(node.arguments()) else null
    val mask = (if (node.has("scrollState")) 1 else 0) +
      (if (node.has("matchAnchorWidth")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("containerColor")) 8 else 0) +
      (if (node.has("tonalElevation")) 16 else 0) +
      (if (node.has("shadowElevation")) 32 else 0) +
      (if (node.has("border")) 64 else 0)
    when (mask / 32) {
      0 -> renderExposedDropdownMenuGroup0(node, scope, mask, scrollStateValue)
      1 -> renderExposedDropdownMenuGroup1(node, scope, mask, scrollStateValue)
      2 -> renderExposedDropdownMenuGroup2(node, scope, mask, scrollStateValue)
      3 -> renderExposedDropdownMenuGroup3(node, scope, mask, scrollStateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderExposedDropdownMenuGroup0(node: ComposeNode, scope: androidx.compose.material3.ExposedDropdownMenuBoxScope, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?) {
    when (mask) {
      0 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), content = { RenderComposeChildren(node.children, this) })
      2 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), content = { RenderComposeChildren(node.children, this) })
      3 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), content = { RenderComposeChildren(node.children, this) })
      4 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      5 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      6 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      7 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      8 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      9 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      10 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      11 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      12 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      13 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      14 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      15 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), content = { RenderComposeChildren(node.children, this) })
      16 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      17 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      18 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      19 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      20 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      21 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      22 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      23 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      24 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      25 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      26 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      27 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      28 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      29 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      30 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      31 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderExposedDropdownMenuGroup1(node: ComposeNode, scope: androidx.compose.material3.ExposedDropdownMenuBoxScope, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?) {
    when (mask) {
      32 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      33 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      34 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      35 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      36 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      37 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      38 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      39 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      40 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      41 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      42 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      43 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      44 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      45 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      46 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      47 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      48 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      49 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      50 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      51 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      52 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      53 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      54 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      55 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      56 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      57 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      58 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      59 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      60 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      61 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      62 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      63 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderExposedDropdownMenuGroup2(node: ComposeNode, scope: androidx.compose.material3.ExposedDropdownMenuBoxScope, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?) {
    when (mask) {
      64 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      65 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      66 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      67 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      68 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      69 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      70 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      71 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      72 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      73 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      74 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      75 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      76 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      77 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      78 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      79 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      80 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      81 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      82 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      83 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      84 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      85 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      86 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      87 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      88 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      89 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      90 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      91 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      92 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      93 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      94 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      95 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderExposedDropdownMenuGroup3(node: ComposeNode, scope: androidx.compose.material3.ExposedDropdownMenuBoxScope, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?) {
    when (mask) {
      96 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      97 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      98 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      99 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      100 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      101 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      102 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      103 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      104 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      105 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      106 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      107 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      108 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      109 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      110 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      111 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      112 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      113 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      114 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      115 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      116 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      117 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      118 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      119 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      120 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      121 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      122 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      123 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      124 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      125 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      126 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      127 -> scope.ExposedDropdownMenu(`expanded` = decode_expanded(node), `onDismissRequest` = { node.emit("onDismissRequest") }, `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `matchAnchorWidth` = decode_matchAnchorWidth(node), `shape` = node.arguments().shape("shape"), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `shadowElevation` = decode_shadowElevation(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ExposedDropdownMenuBox(expanded: kotlin.Boolean, onExpandedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, content: kotlin.Function1<androidx.compose.material3.ExposedDropdownMenuBoxScope, kotlin.Unit>)
internal object RendererExposedDropdownMenuBox {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
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
      (if (node.has("interactionSource")) 8 else 0)
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ExtendedFloatingActionButton(
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

// androidx.compose.material3.ExtendedFloatingActionButton(text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, expanded: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererExtendedFloatingActionButton_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("expanded")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
      )
      2 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      3 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
      )
      4 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      5 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
      )
      6 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      7 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      8 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      9 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
      )
      10 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      11 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      12 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      13 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      14 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      15 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      16 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.ExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.ExtendedFloatingActionButton(
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
