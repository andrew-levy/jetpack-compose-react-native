// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.animation.AnimatedVisibility as composeScoped0
import androidx.compose.material3.FloatingActionButtonMenuItem as composeScoped1
import androidx.compose.material3.NavigationBarItem as composeScoped2
import androidx.compose.material3.PlainTooltip as composeScoped3
import androidx.compose.material3.RichTooltip as composeScoped4
import androidx.compose.material3.SegmentedButton as composeScoped5

// androidx.compose.material3.OutlinedTextField(state: androidx.compose.foundation.text.input.TextFieldState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, labelPosition: androidx.compose.material3.TextFieldLabelPosition, label: kotlin.Function1<androidx.compose.material3.TextFieldLabelScope, kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, isError: kotlin.Boolean, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, outputTransformation: androidx.compose.foundation.text.input.OutputTransformation?, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, onKeyboardAction: androidx.compose.foundation.text.input.KeyboardActionHandler?, lineLimits: androidx.compose.foundation.text.input.TextFieldLineLimits, onTextLayout: kotlin.Function2<androidx.compose.ui.unit.Density, kotlin.Function0<androidx.compose.ui.text.TextLayoutResult?>, kotlin.Unit>?, scrollState: androidx.compose.foundation.ScrollState, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererOutlinedTextField {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTextFieldState() else null
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("textStyle")) 4 else 0) +
      (if (node.has("placeholder")) 8 else 0) +
      (if (node.has("leadingIcon")) 16 else 0) +
      (if (node.has("trailingIcon")) 32 else 0) +
      (if (node.has("prefix")) 64 else 0) +
      (if (node.has("suffix")) 128 else 0) +
      (if (node.has("supportingText")) 256 else 0) +
      (if (node.has("isError")) 512 else 0) +
      (if (node.has("keyboardOptions")) 1024 else 0) +
      (if (node.has("onKeyboardAction")) 2048 else 0) +
      (if (node.has("lineLimits")) 4096 else 0) +
      (if (node.has("shape")) 8192 else 0) +
      (if (node.has("contentPadding")) 16384 else 0) +
      (if (node.has("interactionSource")) 32768 else 0)
    when (mask / 32) {
      0 -> renderOutlinedTextFieldGroup0(node, scope, mask, stateValue)
      1 -> renderOutlinedTextFieldGroup1(node, scope, mask, stateValue)
      2 -> renderOutlinedTextFieldGroup2(node, scope, mask, stateValue)
      4 -> renderOutlinedTextFieldGroup4(node, scope, mask, stateValue)
      8 -> renderOutlinedTextFieldGroup8(node, scope, mask, stateValue)
      16 -> renderOutlinedTextFieldGroup16(node, scope, mask, stateValue)
      32 -> renderOutlinedTextFieldGroup32(node, scope, mask, stateValue)
      64 -> renderOutlinedTextFieldGroup64(node, scope, mask, stateValue)
      96 -> renderOutlinedTextFieldGroup96(node, scope, mask, stateValue)
      128 -> renderOutlinedTextFieldGroup128(node, scope, mask, stateValue)
      160 -> renderOutlinedTextFieldGroup160(node, scope, mask, stateValue)
      192 -> renderOutlinedTextFieldGroup192(node, scope, mask, stateValue)
      256 -> renderOutlinedTextFieldGroup256(node, scope, mask, stateValue)
      512 -> renderOutlinedTextFieldGroup512(node, scope, mask, stateValue)
      799 -> renderOutlinedTextFieldGroup799(node, scope, mask, stateValue)
      1024 -> renderOutlinedTextFieldGroup1024(node, scope, mask, stateValue)
      1025 -> renderOutlinedTextFieldGroup1025(node, scope, mask, stateValue)
      1823 -> renderOutlinedTextFieldGroup1823(node, scope, mask, stateValue)
      1855 -> renderOutlinedTextFieldGroup1855(node, scope, mask, stateValue)
      1887 -> renderOutlinedTextFieldGroup1887(node, scope, mask, stateValue)
      1951 -> renderOutlinedTextFieldGroup1951(node, scope, mask, stateValue)
      2047 -> renderOutlinedTextFieldGroup2047(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
      )
      3 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
      )
      4 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      5 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      6 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      7 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      8 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      9 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      10 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      11 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      12 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      13 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      14 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      15 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      16 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      17 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      18 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      19 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      20 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      21 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      22 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      23 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      24 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      25 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      26 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      27 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      28 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      29 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      30 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      31 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      33 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      34 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      35 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      40 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      41 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      42 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      43 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      48 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      49 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      50 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      51 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      56 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      57 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      58 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      59 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      64 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      65 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      66 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      67 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      72 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      73 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      74 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      75 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      80 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      81 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      82 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      83 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      88 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      89 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      90 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      91 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      128 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      129 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      130 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      131 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      136 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      137 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      138 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      139 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      144 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      145 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      146 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      147 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      152 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      153 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      154 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      155 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      256 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      257 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      258 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      259 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      264 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      265 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      266 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      267 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      272 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      273 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      274 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      275 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      280 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      281 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      282 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      283 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      512 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `isError` = node.boolean("isError"),
      )
      513 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
      )
      514 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `isError` = node.boolean("isError"),
      )
      515 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `isError` = node.boolean("isError"),
      )
      520 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      521 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      522 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      523 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      528 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      529 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      530 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      531 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      536 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      537 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      538 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      539 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup32(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      1024 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1025 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1026 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1027 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1032 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1033 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1034 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1035 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1040 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1041 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1042 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1043 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1048 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1049 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1050 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      1051 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup64(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      2048 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2049 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2050 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2051 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2056 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2057 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2058 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2059 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2064 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2065 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2066 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2067 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2072 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2073 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2074 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      2075 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup96(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      3072 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup128(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      4096 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4097 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4098 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4099 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4104 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4105 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4106 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4107 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4112 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4113 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4114 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4115 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4120 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4121 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4122 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      4123 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup160(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      5120 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup192(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      6144 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup256(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      8192 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      8193 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      8194 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      8195 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      8200 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8201 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8202 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8203 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8208 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8209 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8210 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8211 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8216 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8217 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8218 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8219 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup512(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      16384 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16385 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16386 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16387 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16392 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16393 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16394 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16395 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16400 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16401 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16402 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16403 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16408 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16409 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16410 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16411 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup799(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      25599 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup1024(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      32768 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32769 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32770 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32771 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32772 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32773 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32774 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32775 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32776 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32777 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32778 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32779 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32780 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32781 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32782 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32783 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32784 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32785 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32786 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32787 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32788 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32789 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32790 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32791 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32792 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32793 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32794 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32795 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32796 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32797 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32798 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32799 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup1025(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      32800 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32801 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32802 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32803 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32804 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32805 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32806 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32807 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32808 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32809 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32810 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32811 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32812 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32813 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32814 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32815 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32816 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32817 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32818 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32819 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32820 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32821 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32822 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32823 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32824 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32825 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32826 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32827 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32828 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32829 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32830 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      32831 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup1823(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      58367 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup1855(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      59391 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup1887(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      60415 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup1951(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      62463 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextFieldGroup2047(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      65535 -> androidx.compose.material3.OutlinedTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
        `lineLimits` = node.jsonObject("lineLimits").toComposeTextFieldLineLimits(),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
