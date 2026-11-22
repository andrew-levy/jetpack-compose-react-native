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

// androidx.compose.foundation.text.BasicTextField(value: androidx.compose.ui.text.input.TextFieldValue, onValueChange: kotlin.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, keyboardActions: androidx.compose.foundation.text.KeyboardActions, singleLine: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, visualTransformation: androidx.compose.ui.text.input.VisualTransformation, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, cursorBrush: androidx.compose.ui.graphics.Brush, decorationBox: kotlin.Function1<kotlin.Function0<kotlin.Unit>, kotlin.Unit>)
internal object RendererBasicTextField_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("textStyle")) 4 else 0) +
      (if (node.has("keyboardOptions")) 8 else 0) +
      (if (node.has("keyboardActions")) 16 else 0) +
      (if (node.has("singleLine")) 32 else 0) +
      (if (node.has("maxLines")) 64 else 0) +
      (if (node.has("minLines")) 128 else 0) +
      (if (node.has("visualTransformation")) 256 else 0) +
      (if (node.has("interactionSource")) 512 else 0) +
      (if (node.has("cursorBrush")) 1024 else 0)
    when (mask / 32) {
      0 -> renderBasicTextField_1Group0(node, scope, mask)
      1 -> renderBasicTextField_1Group1(node, scope, mask)
      2 -> renderBasicTextField_1Group2(node, scope, mask)
      3 -> renderBasicTextField_1Group3(node, scope, mask)
      4 -> renderBasicTextField_1Group4(node, scope, mask)
      5 -> renderBasicTextField_1Group5(node, scope, mask)
      6 -> renderBasicTextField_1Group6(node, scope, mask)
      7 -> renderBasicTextField_1Group7(node, scope, mask)
      8 -> renderBasicTextField_1Group8(node, scope, mask)
      9 -> renderBasicTextField_1Group9(node, scope, mask)
      16 -> renderBasicTextField_1Group16(node, scope, mask)
      17 -> renderBasicTextField_1Group17(node, scope, mask)
      18 -> renderBasicTextField_1Group18(node, scope, mask)
      19 -> renderBasicTextField_1Group19(node, scope, mask)
      20 -> renderBasicTextField_1Group20(node, scope, mask)
      21 -> renderBasicTextField_1Group21(node, scope, mask)
      22 -> renderBasicTextField_1Group22(node, scope, mask)
      23 -> renderBasicTextField_1Group23(node, scope, mask)
      32 -> renderBasicTextField_1Group32(node, scope, mask)
      33 -> renderBasicTextField_1Group33(node, scope, mask)
      34 -> renderBasicTextField_1Group34(node, scope, mask)
      35 -> renderBasicTextField_1Group35(node, scope, mask)
      36 -> renderBasicTextField_1Group36(node, scope, mask)
      37 -> renderBasicTextField_1Group37(node, scope, mask)
      38 -> renderBasicTextField_1Group38(node, scope, mask)
      39 -> renderBasicTextField_1Group39(node, scope, mask)
      48 -> renderBasicTextField_1Group48(node, scope, mask)
      49 -> renderBasicTextField_1Group49(node, scope, mask)
      50 -> renderBasicTextField_1Group50(node, scope, mask)
      51 -> renderBasicTextField_1Group51(node, scope, mask)
      52 -> renderBasicTextField_1Group52(node, scope, mask)
      53 -> renderBasicTextField_1Group53(node, scope, mask)
      54 -> renderBasicTextField_1Group54(node, scope, mask)
      55 -> renderBasicTextField_1Group55(node, scope, mask)
      63 -> renderBasicTextField_1Group63(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
      )
      3 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
      )
      4 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      5 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      6 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      7 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      8 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      9 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      10 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      11 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      16 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      17 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      18 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      19 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      24 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
      )
      33 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
      )
      34 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
      )
      35 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
      )
      36 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      37 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      38 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      39 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      40 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
      )
      41 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
      )
      42 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
      )
      43 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
      )
      48 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      49 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      50 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      51 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
      )
      65 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      66 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      67 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      68 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      69 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      70 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      71 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      72 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      73 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      74 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      75 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      80 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `maxLines` = node.number("maxLines").toInt(),
      )
      81 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `maxLines` = node.number("maxLines").toInt(),
      )
      82 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `maxLines` = node.number("maxLines").toInt(),
      )
      83 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      97 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      98 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      99 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      100 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      101 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      102 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      103 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      104 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      105 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      106 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      107 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      112 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      113 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      114 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      115 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
      )
      129 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
      )
      130 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
      )
      131 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
      )
      132 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      133 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      134 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      135 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      161 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      162 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      163 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      164 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      165 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      166 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      167 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      193 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      194 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      195 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      196 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      197 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      198 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      199 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      225 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      226 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      227 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      228 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      229 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      230 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      231 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group8(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      256 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      257 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      264 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      265 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      272 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      273 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      280 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      281 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group9(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      288 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      289 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      296 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      297 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      304 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      305 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      312 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      313 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group16(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      512 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      513 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      514 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      515 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      516 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      517 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      518 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      519 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      544 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      545 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      546 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      547 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      548 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      549 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      550 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      551 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group18(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      576 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      577 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      578 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      579 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      580 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      581 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      582 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      583 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group19(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      608 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      609 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      610 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      611 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      612 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      613 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      614 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      615 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group20(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      640 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      641 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      642 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      643 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      644 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      645 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      646 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      647 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group21(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      672 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      673 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      674 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      675 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      676 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      677 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      678 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      679 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group22(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      704 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      705 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      706 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      707 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      708 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      709 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      710 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      711 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group23(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      736 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      737 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      738 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      739 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      740 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      741 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      742 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      743 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1024 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1025 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1026 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1027 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1028 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1029 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1030 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1031 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group33(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1056 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1057 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1058 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1059 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1060 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1061 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1062 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1063 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group34(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1088 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1089 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1090 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1091 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1092 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1093 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1094 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1095 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group35(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1120 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1121 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1122 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1123 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1124 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1125 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1126 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1127 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group36(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1152 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1153 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1154 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1155 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1156 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1157 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1158 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1159 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group37(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1184 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1185 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1186 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1187 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1188 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1189 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1190 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1191 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group38(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1216 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1217 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1218 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1219 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1220 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1221 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1222 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1223 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group39(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1248 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1249 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1250 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1251 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1252 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1253 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1254 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1255 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group48(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1536 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1537 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1538 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1539 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1540 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1541 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1542 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1543 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group49(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1568 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1569 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1570 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1571 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1572 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1573 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1574 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1575 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group50(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1600 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1601 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1602 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1603 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1604 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1605 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1606 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1607 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group51(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1632 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1633 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1634 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1635 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1636 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1637 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1638 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1639 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group52(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1664 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1665 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1666 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1667 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1668 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1669 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1670 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1671 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group53(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1696 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1697 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1698 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1699 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1700 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1701 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1702 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1703 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group54(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1728 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1729 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1730 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1731 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1732 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1733 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1734 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1735 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group55(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1760 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1761 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1762 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1763 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1764 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1765 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1766 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1767 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1775 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1783 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1791 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_1Group63(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2047 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.BasicTextField(value: kotlin.String, onValueChange: kotlin.Function1<kotlin.String, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, keyboardActions: androidx.compose.foundation.text.KeyboardActions, singleLine: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, visualTransformation: androidx.compose.ui.text.input.VisualTransformation, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, cursorBrush: androidx.compose.ui.graphics.Brush, decorationBox: kotlin.Function1<kotlin.Function0<kotlin.Unit>, kotlin.Unit>)
internal object RendererBasicTextField_2 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("textStyle")) 4 else 0) +
      (if (node.has("keyboardOptions")) 8 else 0) +
      (if (node.has("keyboardActions")) 16 else 0) +
      (if (node.has("singleLine")) 32 else 0) +
      (if (node.has("maxLines")) 64 else 0) +
      (if (node.has("minLines")) 128 else 0) +
      (if (node.has("visualTransformation")) 256 else 0) +
      (if (node.has("interactionSource")) 512 else 0) +
      (if (node.has("cursorBrush")) 1024 else 0)
    when (mask / 32) {
      0 -> renderBasicTextField_2Group0(node, scope, mask)
      1 -> renderBasicTextField_2Group1(node, scope, mask)
      2 -> renderBasicTextField_2Group2(node, scope, mask)
      3 -> renderBasicTextField_2Group3(node, scope, mask)
      4 -> renderBasicTextField_2Group4(node, scope, mask)
      5 -> renderBasicTextField_2Group5(node, scope, mask)
      6 -> renderBasicTextField_2Group6(node, scope, mask)
      7 -> renderBasicTextField_2Group7(node, scope, mask)
      8 -> renderBasicTextField_2Group8(node, scope, mask)
      9 -> renderBasicTextField_2Group9(node, scope, mask)
      16 -> renderBasicTextField_2Group16(node, scope, mask)
      17 -> renderBasicTextField_2Group17(node, scope, mask)
      18 -> renderBasicTextField_2Group18(node, scope, mask)
      19 -> renderBasicTextField_2Group19(node, scope, mask)
      20 -> renderBasicTextField_2Group20(node, scope, mask)
      21 -> renderBasicTextField_2Group21(node, scope, mask)
      22 -> renderBasicTextField_2Group22(node, scope, mask)
      23 -> renderBasicTextField_2Group23(node, scope, mask)
      32 -> renderBasicTextField_2Group32(node, scope, mask)
      33 -> renderBasicTextField_2Group33(node, scope, mask)
      34 -> renderBasicTextField_2Group34(node, scope, mask)
      35 -> renderBasicTextField_2Group35(node, scope, mask)
      36 -> renderBasicTextField_2Group36(node, scope, mask)
      37 -> renderBasicTextField_2Group37(node, scope, mask)
      38 -> renderBasicTextField_2Group38(node, scope, mask)
      39 -> renderBasicTextField_2Group39(node, scope, mask)
      48 -> renderBasicTextField_2Group48(node, scope, mask)
      49 -> renderBasicTextField_2Group49(node, scope, mask)
      50 -> renderBasicTextField_2Group50(node, scope, mask)
      51 -> renderBasicTextField_2Group51(node, scope, mask)
      52 -> renderBasicTextField_2Group52(node, scope, mask)
      53 -> renderBasicTextField_2Group53(node, scope, mask)
      54 -> renderBasicTextField_2Group54(node, scope, mask)
      55 -> renderBasicTextField_2Group55(node, scope, mask)
      63 -> renderBasicTextField_2Group63(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
      )
      3 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
      )
      4 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      5 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      6 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      7 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      8 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      9 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      10 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      11 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      16 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      17 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      18 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      19 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      24 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
      )
      33 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
      )
      34 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
      )
      35 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
      )
      36 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      37 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      38 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      39 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
      )
      40 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
      )
      41 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
      )
      42 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
      )
      43 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
      )
      48 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      49 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      50 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      51 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
      )
      65 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      66 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      67 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      68 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      69 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      70 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      71 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      72 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      73 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      74 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      75 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `maxLines` = node.number("maxLines").toInt(),
      )
      80 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `maxLines` = node.number("maxLines").toInt(),
      )
      81 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `maxLines` = node.number("maxLines").toInt(),
      )
      82 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `maxLines` = node.number("maxLines").toInt(),
      )
      83 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      97 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      98 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      99 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      100 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      101 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      102 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      103 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      104 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      105 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      106 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      107 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      112 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      113 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      114 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      115 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
      )
      129 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
      )
      130 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
      )
      131 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
      )
      132 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      133 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      134 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      135 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      161 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      162 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      163 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      164 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      165 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      166 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      167 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      193 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      194 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      195 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      196 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      197 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      198 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      199 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      225 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      226 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      227 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      228 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      229 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      230 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      231 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group8(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      256 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      257 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      264 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      265 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      272 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      273 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      280 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      281 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group9(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      288 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      289 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      296 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      297 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      304 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      305 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      312 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      313 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group16(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      512 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      513 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      514 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      515 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      516 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      517 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      518 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      519 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      544 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      545 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      546 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      547 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      548 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      549 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      550 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      551 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group18(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      576 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      577 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      578 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      579 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      580 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      581 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      582 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      583 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group19(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      608 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      609 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      610 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      611 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      612 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      613 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      614 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      615 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group20(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      640 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      641 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      642 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      643 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      644 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      645 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      646 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      647 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group21(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      672 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      673 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      674 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      675 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      676 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      677 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      678 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      679 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group22(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      704 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      705 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      706 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      707 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      708 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      709 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      710 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      711 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group23(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      736 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      737 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      738 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      739 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      740 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      741 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      742 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      743 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1024 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1025 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1026 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1027 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1028 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1029 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1030 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1031 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group33(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1056 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1057 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1058 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1059 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1060 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1061 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1062 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1063 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group34(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1088 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1089 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1090 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1091 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1092 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1093 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1094 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1095 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group35(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1120 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1121 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1122 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1123 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1124 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1125 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1126 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1127 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group36(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1152 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1153 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1154 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1155 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1156 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1157 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1158 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1159 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group37(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1184 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1185 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1186 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1187 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1188 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1189 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1190 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1191 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group38(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1216 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1217 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1218 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1219 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1220 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1221 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1222 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1223 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group39(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1248 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1249 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1250 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1251 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1252 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1253 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1254 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1255 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group48(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1536 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1537 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1538 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1539 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1540 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1541 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1542 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1543 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group49(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1568 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1569 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1570 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1571 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1572 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1573 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1574 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1575 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group50(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1600 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1601 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1602 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1603 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1604 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1605 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1606 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1607 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group51(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1632 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1633 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1634 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1635 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1636 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1637 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1638 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1639 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group52(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1664 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1665 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1666 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1667 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1668 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1669 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1670 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1671 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group53(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1696 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1697 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1698 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1699 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1700 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1701 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1702 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1703 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group54(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1728 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1729 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1730 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1731 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1732 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1733 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1734 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1735 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group55(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1760 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1761 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1762 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1763 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1764 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1765 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1766 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1767 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1775 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1783 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      1791 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group63(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2047 -> androidx.compose.foundation.text.BasicTextField(
        `value` = node.string("value"),
        `onValueChange` = { value: String -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `cursorBrush` = node.arguments().brush("cursorBrush"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.BasicTooltipBox(positionProvider: androidx.compose.ui.window.PopupPositionProvider, tooltip: kotlin.Function0<kotlin.Unit>, state: androidx.compose.foundation.BasicTooltipState, modifier: androidx.compose.ui.Modifier, focusable: kotlin.Boolean, enableUserInput: kotlin.Boolean, propagateMinConstraints: kotlin.Boolean, content: kotlin.Function0<kotlin.Unit>)
internal object RendererBasicTooltipBox {
  @OptIn(androidx.compose.foundation.ExperimentalFoundationApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val positionProviderValue = if (node.has("positionProvider") && !node.isNull("positionProvider")) node.jsonObject("positionProvider").rememberComposePopupPosition() else null
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeBasicTooltipState() else null
    val mask = (if (node.has("focusable")) 1 else 0) +
      (if (node.has("enableUserInput")) 2 else 0) +
      (if (node.has("propagateMinConstraints")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.BasicTooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip")) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.foundation.BasicTooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip")) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `focusable` = node.boolean("focusable"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.foundation.BasicTooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip")) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enableUserInput` = node.boolean("enableUserInput"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.foundation.BasicTooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip")) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `focusable` = node.boolean("focusable"),
        `enableUserInput` = node.boolean("enableUserInput"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.foundation.BasicTooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip")) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `propagateMinConstraints` = node.boolean("propagateMinConstraints"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.foundation.BasicTooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip")) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `focusable` = node.boolean("focusable"),
        `propagateMinConstraints` = node.boolean("propagateMinConstraints"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.foundation.BasicTooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip")) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enableUserInput` = node.boolean("enableUserInput"),
        `propagateMinConstraints` = node.boolean("propagateMinConstraints"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.foundation.BasicTooltipBox(
        `positionProvider` = requireNotNull(positionProviderValue),
        `tooltip` = { RenderComposeChildren(node.slot("tooltip")) },
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `focusable` = node.boolean("focusable"),
        `enableUserInput` = node.boolean("enableUserInput"),
        `propagateMinConstraints` = node.boolean("propagateMinConstraints"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.BottomAppBar(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, contentPadding: androidx.compose.foundation.layout.PaddingValues, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererBottomAppBar {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.BottomAppBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.BottomAppBar(actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, floatingActionButton: kotlin.Function0<kotlin.Unit>?, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, contentPadding: androidx.compose.foundation.layout.PaddingValues, windowInsets: androidx.compose.foundation.layout.WindowInsets)
internal object RendererBottomAppBar_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("floatingActionButton")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("tonalElevation")) 8 else 0) +
      (if (node.has("contentPadding")) 16 else 0) +
      (if (node.has("windowInsets")) 32 else 0)
    when (mask / 32) {
      0 -> renderBottomAppBar_1Group0(node, scope, mask)
      1 -> renderBottomAppBar_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBottomAppBar_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
      )
      2 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      3 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
      )
      4 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      5 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `contentColor` = node.color("contentColor"),
      )
      6 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      7 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      8 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      9 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      10 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      11 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      12 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      13 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      14 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      15 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      16 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      17 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      18 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      19 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      20 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      21 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      22 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      23 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      24 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      25 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      26 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      27 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      28 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      29 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      30 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      31 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBottomAppBar_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      33 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      34 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      35 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      36 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      37 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      38 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      39 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      40 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      41 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      42 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      43 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      44 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      45 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      46 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      47 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      48 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      49 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      50 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      51 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      52 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      53 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      54 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      55 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      56 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      57 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      58 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      59 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      60 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      61 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      62 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      63 -> androidx.compose.material3.BottomAppBar(
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = if (node.isNull("floatingActionButton")) null else ({ RenderComposeChildren(node.slot("floatingActionButton")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.BottomSheetScaffold(sheetContent: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, scaffoldState: androidx.compose.material3.BottomSheetScaffoldState, sheetPeekHeight: androidx.compose.ui.unit.Dp, sheetMaxWidth: androidx.compose.ui.unit.Dp, sheetShape: androidx.compose.ui.graphics.Shape, sheetContainerColor: androidx.compose.ui.graphics.Color, sheetContentColor: androidx.compose.ui.graphics.Color, sheetTonalElevation: androidx.compose.ui.unit.Dp, sheetShadowElevation: androidx.compose.ui.unit.Dp, sheetDragHandle: kotlin.Function0<kotlin.Unit>?, sheetSwipeEnabled: kotlin.Boolean, topBar: kotlin.Function0<kotlin.Unit>?, snackbarHost: kotlin.Function1<androidx.compose.material3.SnackbarHostState, kotlin.Unit>, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, content: kotlin.Function1<androidx.compose.foundation.layout.PaddingValues, kotlin.Unit>)
internal object RendererBottomSheetScaffold {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scaffoldStateValue = if (node.has("scaffoldState") && !node.isNull("scaffoldState")) node.jsonObject("scaffoldState").rememberComposeBottomSheetScaffoldState() else null
    val mask = (if (node.has("scaffoldState")) 1 else 0) +
      (if (node.has("sheetPeekHeight")) 2 else 0) +
      (if (node.has("sheetMaxWidth")) 4 else 0) +
      (if (node.has("sheetShape")) 8 else 0) +
      (if (node.has("sheetContainerColor")) 16 else 0) +
      (if (node.has("sheetContentColor")) 32 else 0) +
      (if (node.has("sheetTonalElevation")) 64 else 0) +
      (if (node.has("sheetShadowElevation")) 128 else 0) +
      (if (node.has("sheetDragHandle")) 256 else 0) +
      (if (node.has("sheetSwipeEnabled")) 512 else 0) +
      (if (node.has("topBar")) 1024 else 0) +
      (if (node.has("containerColor")) 2048 else 0) +
      (if (node.has("contentColor")) 4096 else 0)
    when (mask / 32) {
      0 -> renderBottomSheetScaffoldGroup0(node, scope, mask, scaffoldStateValue)
      1 -> renderBottomSheetScaffoldGroup1(node, scope, mask, scaffoldStateValue)
      2 -> renderBottomSheetScaffoldGroup2(node, scope, mask, scaffoldStateValue)
      3 -> renderBottomSheetScaffoldGroup3(node, scope, mask, scaffoldStateValue)
      4 -> renderBottomSheetScaffoldGroup4(node, scope, mask, scaffoldStateValue)
      5 -> renderBottomSheetScaffoldGroup5(node, scope, mask, scaffoldStateValue)
      8 -> renderBottomSheetScaffoldGroup8(node, scope, mask, scaffoldStateValue)
      9 -> renderBottomSheetScaffoldGroup9(node, scope, mask, scaffoldStateValue)
      16 -> renderBottomSheetScaffoldGroup16(node, scope, mask, scaffoldStateValue)
      17 -> renderBottomSheetScaffoldGroup17(node, scope, mask, scaffoldStateValue)
      32 -> renderBottomSheetScaffoldGroup32(node, scope, mask, scaffoldStateValue)
      33 -> renderBottomSheetScaffoldGroup33(node, scope, mask, scaffoldStateValue)
      64 -> renderBottomSheetScaffoldGroup64(node, scope, mask, scaffoldStateValue)
      65 -> renderBottomSheetScaffoldGroup65(node, scope, mask, scaffoldStateValue)
      128 -> renderBottomSheetScaffoldGroup128(node, scope, mask, scaffoldStateValue)
      129 -> renderBottomSheetScaffoldGroup129(node, scope, mask, scaffoldStateValue)
      255 -> renderBottomSheetScaffoldGroup255(node, scope, mask, scaffoldStateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup0(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      0 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      3 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      5 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      6 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      7 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      8 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetShape` = node.arguments().shape("sheetShape"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      10 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      12 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      14 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      16 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      17 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      18 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      19 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      20 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      21 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      22 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      23 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      24 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      26 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      28 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      30 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup1(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      32 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      33 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      34 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      35 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      36 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      37 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      38 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      39 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      40 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      42 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      44 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      46 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      48 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      49 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      50 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      51 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      52 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      53 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      54 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      55 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      56 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      58 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      60 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      62 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup2(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      64 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      66 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      68 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      70 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      80 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      82 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      84 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      86 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup3(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      96 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      98 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      100 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      102 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      112 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      114 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      116 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      118 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup4(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      128 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      130 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      132 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      134 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      144 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      146 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      148 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      150 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup5(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      160 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      162 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      164 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      166 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      176 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      178 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      180 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      182 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup8(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      256 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      258 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      260 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      262 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      272 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      274 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      276 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      278 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup9(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      288 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      290 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      292 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      294 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      304 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      306 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      308 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      310 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup16(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      512 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      514 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      516 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      518 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      528 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      530 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      532 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      534 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup17(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      544 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      546 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      548 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      550 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      560 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      562 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      564 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      566 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup32(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      1024 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1026 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1028 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1030 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1040 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1042 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1044 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1046 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup33(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      1056 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContentColor` = node.color("sheetContentColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1058 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1060 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1062 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1072 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1074 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1076 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1078 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup64(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      2048 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2050 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2052 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2054 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2064 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2066 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2068 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2070 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup65(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      2080 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContentColor` = node.color("sheetContentColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2082 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2084 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2086 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2096 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2098 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2100 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2102 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup128(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      4096 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4098 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4100 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4102 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4112 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4114 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4116 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4118 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup129(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      4128 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContentColor` = node.color("sheetContentColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4130 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4132 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4134 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContentColor` = node.color("sheetContentColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4144 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4146 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4148 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4150 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup255(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?) {
    when (mask) {
      8191 -> androidx.compose.material3.BottomSheetScaffold(
        `sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `scaffoldState` = requireNotNull(scaffoldStateValue),
        `sheetPeekHeight` = node.number("sheetPeekHeight").dp,
        `sheetMaxWidth` = node.number("sheetMaxWidth").dp,
        `sheetShape` = node.arguments().shape("sheetShape"),
        `sheetContainerColor` = node.color("sheetContainerColor"),
        `sheetContentColor` = node.color("sheetContentColor"),
        `sheetTonalElevation` = node.number("sheetTonalElevation").dp,
        `sheetShadowElevation` = node.number("sheetShadowElevation").dp,
        `sheetDragHandle` = if (node.isNull("sheetDragHandle")) null else ({ RenderComposeChildren(node.slot("sheetDragHandle")) }),
        `sheetSwipeEnabled` = node.boolean("sheetSwipeEnabled"),
        `topBar` = if (node.isNull("topBar")) null else ({ RenderComposeChildren(node.slot("topBar")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.Box(modifier: androidx.compose.ui.Modifier, contentAlignment: androidx.compose.ui.Alignment, propagateMinConstraints: kotlin.Boolean, content: kotlin.Function1<androidx.compose.foundation.layout.BoxScope, kotlin.Unit>)
internal object RendererBox {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentAlignment")) 1 else 0) +
      (if (node.has("propagateMinConstraints")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.layout.Box(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.foundation.layout.Box(
        `modifier` = node.modifier("modifier", scope),
        `contentAlignment` = toComposeAlignment(node.string("contentAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.foundation.layout.Box(
        `modifier` = node.modifier("modifier", scope),
        `propagateMinConstraints` = node.boolean("propagateMinConstraints"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.foundation.layout.Box(
        `modifier` = node.modifier("modifier", scope),
        `contentAlignment` = toComposeAlignment(node.string("contentAlignment")),
        `propagateMinConstraints` = node.boolean("propagateMinConstraints"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.Box(modifier: androidx.compose.ui.Modifier)
internal object RendererBox_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.foundation.layout.Box(
      `modifier` = node.modifier("modifier", scope),
    )
  }
}

// androidx.compose.foundation.layout.BoxWithConstraints(modifier: androidx.compose.ui.Modifier, contentAlignment: androidx.compose.ui.Alignment, propagateMinConstraints: kotlin.Boolean, content: kotlin.Function1<androidx.compose.foundation.layout.BoxWithConstraintsScope, kotlin.Unit>)
internal object RendererBoxWithConstraints {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("contentAlignment")) 1 else 0) +
      (if (node.has("propagateMinConstraints")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.layout.BoxWithConstraints(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.foundation.layout.BoxWithConstraints(
        `modifier` = node.modifier("modifier", scope),
        `contentAlignment` = toComposeAlignment(node.string("contentAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.foundation.layout.BoxWithConstraints(
        `modifier` = node.modifier("modifier", scope),
        `propagateMinConstraints` = node.boolean("propagateMinConstraints"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.foundation.layout.BoxWithConstraints(
        `modifier` = node.modifier("modifier", scope),
        `contentAlignment` = toComposeAlignment(node.string("contentAlignment")),
        `propagateMinConstraints` = node.boolean("propagateMinConstraints"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Button(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.Button(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
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
      (if (node.has("border")) 2 else 0)
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
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Card(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererCard_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.CenterAlignedTopAppBar(title: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, navigationIcon: kotlin.Function0<kotlin.Unit>, actions: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, expandedHeight: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, colors: androidx.compose.material3.TopAppBarColors, scrollBehavior: androidx.compose.material3.TopAppBarScrollBehavior?)
internal object RendererCenterAlignedTopAppBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("navigationIcon")) 1 else 0) +
      (if (node.has("actions")) 2 else 0) +
      (if (node.has("expandedHeight")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
      )
      2 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      3 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
      )
      4 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      5 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      6 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      7 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
      )
      8 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      9 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      10 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      11 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      12 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      13 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      14 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
      15 -> androidx.compose.material3.CenterAlignedTopAppBar(
        `title` = { RenderComposeChildren(node.slot("title")) },
        `modifier` = node.modifier("modifier", scope),
        `navigationIcon` = { RenderComposeChildren(node.slot("navigationIcon")) },
        `actions` = { RenderComposeChildren(node.slot("actions"), this) },
        `expandedHeight` = node.number("expandedHeight").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
      )
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
      (if (node.has("thumbTrackGapSize")) 2 else 0) +
      (if (node.has("trackInsideCornerSize")) 4 else 0) +
      (if (node.has("trackCornerSize")) 8 else 0)
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
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      3 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
      )
      4 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      5 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      6 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      7 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
      )
      8 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      9 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      10 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      11 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      12 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      13 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      14 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `thumbTrackGapSize` = node.number("thumbTrackGapSize").dp,
        `trackInsideCornerSize` = node.number("trackInsideCornerSize").dp,
        `trackCornerSize` = node.number("trackCornerSize").dp,
      )
      15 -> androidx.compose.material3.SliderDefaults.CenteredTrack(
        `sliderState` = node.jsonObject("sliderState").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
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
      (if (node.has("interactionSource")) 2 else 0)
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      3 -> androidx.compose.material3.Checkbox(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
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
      (if (node.has("gapSize")) 8 else 0)
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
        `gapSize` = node.number("gapSize").dp,
      )
      9 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      10 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `gapSize` = node.number("gapSize").dp,
      )
      11 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `gapSize` = node.number("gapSize").dp,
      )
      12 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      13 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      14 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      15 -> androidx.compose.material3.CircularProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
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
      (if (node.has("gapSize")) 8 else 0)
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
        `gapSize` = node.number("gapSize").dp,
      )
      9 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      10 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `gapSize` = node.number("gapSize").dp,
      )
      11 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `gapSize` = node.number("gapSize").dp,
      )
      12 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      13 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      14 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      15 -> androidx.compose.material3.CircularProgressIndicator(
        `progress` = { node.number("progress").toFloat() },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `strokeWidth` = node.number("strokeWidth").dp,
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.CircularWavyProgressIndicator(modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, trackColor: androidx.compose.ui.graphics.Color, stroke: androidx.compose.ui.graphics.drawscope.Stroke, trackStroke: androidx.compose.ui.graphics.drawscope.Stroke, gapSize: androidx.compose.ui.unit.Dp, amplitude: kotlin.Float, wavelength: androidx.compose.ui.unit.Dp, waveSpeed: androidx.compose.ui.unit.Dp)
internal object RendererCircularWavyProgressIndicator {
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
      0 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
      )
      3 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
      )
      4 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
      )
      5 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
      )
      6 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      7 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
      )
      8 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      9 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      10 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      11 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
      )
      12 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      13 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      14 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      15 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
      )
      16 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
      )
      17 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
      )
      18 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      19 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
      )
      20 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      21 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      22 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      23 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
      )
      24 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      25 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      26 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      27 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      28 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      29 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      30 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      31 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  private fun renderCircularWavyProgressIndicatorGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      33 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      34 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      35 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      36 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      37 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      38 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      39 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      40 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      41 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      42 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      43 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      44 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      45 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      46 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      47 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      48 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      49 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      50 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      51 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      52 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      53 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      54 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      55 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      56 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      57 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      58 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      59 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      60 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      61 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      62 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
      63 -> androidx.compose.material3.CircularWavyProgressIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `trackColor` = node.color("trackColor"),
        `gapSize` = node.number("gapSize").dp,
        `amplitude` = node.number("amplitude").toFloat(),
        `wavelength` = node.number("wavelength").dp,
        `waveSpeed` = node.number("waveSpeed").dp,
      )
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
      (if (node.has("maxLines")) 8 else 0)
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
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("focusedBorderThickness")) 2 else 0) +
      (if (node.has("unfocusedBorderThickness")) 4 else 0)
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
        `shape` = node.arguments().shape("shape"),
      )
      2 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      3 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      4 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      5 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      6 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      7 -> androidx.compose.material3.OutlinedTextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
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
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("focusedIndicatorLineThickness")) 2 else 0) +
      (if (node.has("unfocusedIndicatorLineThickness")) 4 else 0)
    when (mask) {
      2 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
      )
      3 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
      )
      4 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      5 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      6 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
        `focusedIndicatorLineThickness` = node.number("focusedIndicatorLineThickness").dp,
        `unfocusedIndicatorLineThickness` = node.number("unfocusedIndicatorLineThickness").dp,
      )
      7 -> androidx.compose.material3.TextFieldDefaults.Container(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `modifier` = node.modifier("modifier", scope),
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
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("focusedBorderThickness")) 2 else 0) +
      (if (node.has("unfocusedBorderThickness")) 4 else 0)
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
        `shape` = node.arguments().shape("shape"),
      )
      2 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      3 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `shape` = node.arguments().shape("shape"),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
      )
      4 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      5 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `shape` = node.arguments().shape("shape"),
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      6 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `focusedBorderThickness` = node.number("focusedBorderThickness").dp,
        `unfocusedBorderThickness` = node.number("unfocusedBorderThickness").dp,
      )
      7 -> androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox(
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
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
        `targetState` = node.number("targetState").toInt(),
        `modifier` = node.modifier("modifier", scope),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it) } },
      )
      1 -> androidx.compose.animation.Crossfade(
        `targetState` = node.number("targetState").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it) } },
      )
      2 -> androidx.compose.animation.Crossfade(
        `targetState` = node.number("targetState").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `label` = node.string("label"),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it) } },
      )
      3 -> androidx.compose.animation.Crossfade(
        `targetState` = node.number("targetState").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `animationSpec` = node.jsonObject("animationSpec").toComposeAnimationSpec(),
        `label` = node.string("label"),
        content = { index -> node.children.getOrNull(index)?.let { RenderComposeChild(it) } },
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
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeDatePickerState() else null
    val mask = (if (node.has("dateFormatter")) 1 else 0) +
      (if (node.has("title")) 2 else 0) +
      (if (node.has("headline")) 4 else 0) +
      (if (node.has("showModeToggle")) 8 else 0) +
      (if (node.has("focusRequester")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
      )
      2 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      )
      3 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      )
      4 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
      )
      5 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
      )
      6 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
      )
      7 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
      )
      8 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      9 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      10 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      11 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      12 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      13 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      14 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      15 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      16 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      17 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      18 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      19 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      20 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      21 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      22 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      23 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      24 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      25 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      26 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      27 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      28 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      29 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      30 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      31 -> androidx.compose.material3.DatePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
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
      (if (node.has("tonalElevation")) 4 else 0)
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
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeDateRangePickerState() else null
    val mask = (if (node.has("dateFormatter")) 1 else 0) +
      (if (node.has("title")) 2 else 0) +
      (if (node.has("headline")) 4 else 0) +
      (if (node.has("showModeToggle")) 8 else 0) +
      (if (node.has("focusRequester")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
      )
      2 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      )
      3 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      )
      4 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
      )
      5 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
      )
      6 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
      )
      7 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
      )
      8 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      9 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      10 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      11 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      12 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      13 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      14 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      15 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
      )
      16 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      17 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      18 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      19 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      20 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      21 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      22 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      23 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      24 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      25 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      26 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      27 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      28 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      29 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      30 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
      31 -> androidx.compose.material3.DateRangePicker(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `dateFormatter` = node.jsonObject("dateFormatter").toDatePickerFormatter(),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `headline` = if (node.isNull("headline")) null else ({ RenderComposeChildren(node.slot("headline")) }),
        `showModeToggle` = node.boolean("showModeToggle"),
        `focusRequester` = if (node.isNull("focusRequester")) null else (node.jsonObject("focusRequester").rememberComposeFocusRequester()),
      )
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
      (if (node.has("shape")) 256 else 0) +
      (if (node.has("contentPadding")) 512 else 0) +
      (if (node.has("container")) 1024 else 0)
    when (mask / 32) {
      0 -> renderDecorationBoxGroup0(node, mask)
      1 -> renderDecorationBoxGroup1(node, mask)
      2 -> renderDecorationBoxGroup2(node, mask)
      4 -> renderDecorationBoxGroup4(node, mask)
      8 -> renderDecorationBoxGroup8(node, mask)
      16 -> renderDecorationBoxGroup16(node, mask)
      32 -> renderDecorationBoxGroup32(node, mask)
      63 -> renderDecorationBoxGroup63(node, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup0(node: ComposeNode, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      1 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
      )
      2 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      3 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      4 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      5 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      6 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      7 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      8 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      9 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      10 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      11 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      12 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      13 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      14 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      15 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
      )
      16 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      17 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      18 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      19 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      20 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      21 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      22 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      23 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
      )
      24 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      25 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      26 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      27 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
      )
      28 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      29 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
      )
      30 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
      )
      31 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup1(node: ComposeNode, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      33 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      34 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      35 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      36 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      37 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      38 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      39 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      40 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      41 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      42 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      43 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      44 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      45 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      46 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      47 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup2(node: ComposeNode, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      65 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      66 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      67 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      68 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      69 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      70 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      71 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      72 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      73 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      74 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      75 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      76 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      77 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      78 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      79 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup4(node: ComposeNode, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      129 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      130 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      131 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      132 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      133 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      134 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      135 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      136 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      137 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      138 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      139 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      140 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      141 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      142 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      143 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup8(node: ComposeNode, mask: Int) {
    when (mask) {
      256 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `shape` = node.arguments().shape("shape"),
      )
      257 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `shape` = node.arguments().shape("shape"),
      )
      258 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `shape` = node.arguments().shape("shape"),
      )
      259 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `shape` = node.arguments().shape("shape"),
      )
      260 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      261 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      263 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      264 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      265 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      266 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      267 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      268 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      269 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      270 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      271 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup16(node: ComposeNode, mask: Int) {
    when (mask) {
      512 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      513 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      514 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      515 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      516 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      517 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      518 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      519 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      520 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      521 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      522 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      523 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      524 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      525 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      526 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      527 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup32(node: ComposeNode, mask: Int) {
    when (mask) {
      1024 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1025 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1026 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1027 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1028 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1029 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1030 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1031 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1032 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1033 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1034 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1035 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1036 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1037 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `isError` = node.boolean("isError"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1038 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
        `value` = node.string("value"),
        `innerTextField` = { RenderComposeChildren(node.slot("innerTextField")) },
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      1039 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDecorationBoxGroup63(node: ComposeNode, mask: Int) {
    when (mask) {
      2047 -> androidx.compose.material3.TextFieldDefaults.DecorationBox(
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
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `container` = { RenderComposeChildren(node.slot("container")) },
      )
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
      (if (node.has("contentPadding")) 256 else 0) +
      (if (node.has("container")) 512 else 0)
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
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("offset")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("tonalElevation")) 8 else 0) +
      (if (node.has("shadowElevation")) 16 else 0) +
      (if (node.has("border")) 32 else 0)
    when (mask / 32) {
      0 -> renderDropdownMenuGroup0(node, scope, mask)
      1 -> renderDropdownMenuGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDropdownMenuGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderDropdownMenuGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      33 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      34 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      35 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      36 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      37 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      38 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      39 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      40 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      41 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      42 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      43 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      44 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      45 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      46 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      47 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      48 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      49 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      50 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      51 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      52 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      53 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      54 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      55 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      56 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      57 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      58 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      59 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      60 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      61 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      62 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      63 -> androidx.compose.material3.DropdownMenu(
        `expanded` = node.boolean("expanded"),
        `onDismissRequest` = { node.emit("onDismissRequest") },
        `modifier` = node.modifier("modifier", scope),
        `offset` = node.jsonObject("offset").decodeComposeDpOffset(),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.DropdownMenuItem(text: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, enabled: kotlin.Boolean, colors: androidx.compose.material3.MenuItemColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererDropdownMenuItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("leadingIcon")) 1 else 0) +
      (if (node.has("trailingIcon")) 2 else 0) +
      (if (node.has("enabled")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      2 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      3 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      4 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      5 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `enabled` = node.boolean("enabled"),
      )
      6 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
      )
      7 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
      )
      8 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      9 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      10 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      11 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      12 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      13 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      14 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      15 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      16 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.DropdownMenuItem(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedAssistChip(onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ChipColors, elevation: androidx.compose.material3.ChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererElevatedAssistChip {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("leadingIcon")) 2 else 0) +
      (if (node.has("trailingIcon")) 4 else 0) +
      (if (node.has("shape")) 8 else 0) +
      (if (node.has("border")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderElevatedAssistChipGroup0(node, scope, mask)
      1 -> renderElevatedAssistChipGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedAssistChipGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      3 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      4 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      5 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      6 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      7 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      8 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      9 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      10 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      11 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      12 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      13 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      14 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      15 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      16 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      17 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      18 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      19 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      20 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      21 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      22 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      23 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      24 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      25 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      26 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      27 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      28 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      29 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      30 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      31 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedAssistChipGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      33 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      34 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      35 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      36 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      37 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      38 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      39 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      40 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      41 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      42 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      43 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      44 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      45 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      46 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      47 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      48 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      49 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      50 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      51 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      52 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      53 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      54 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      55 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      56 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      57 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      58 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      59 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      60 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      61 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      62 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      63 -> androidx.compose.material3.ElevatedAssistChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererElevatedButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.ElevatedButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedCard(modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererElevatedCard {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0)
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
      (if (node.has("interactionSource")) 4 else 0)
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ElevatedCard(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ElevatedFilterChip(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SelectableChipColors, elevation: androidx.compose.material3.SelectableChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererElevatedFilterChip {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("leadingIcon")) 2 else 0) +
      (if (node.has("trailingIcon")) 4 else 0) +
      (if (node.has("shape")) 8 else 0) +
      (if (node.has("border")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderElevatedFilterChipGroup0(node, scope, mask)
      1 -> renderElevatedFilterChipGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedFilterChipGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      3 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      4 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      5 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      6 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      7 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      8 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      9 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      10 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      11 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      12 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      13 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      14 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      15 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      16 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      17 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      18 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      19 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      20 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      21 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      22 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      23 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      24 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      25 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      26 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      27 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      28 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      29 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      30 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      31 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderElevatedFilterChipGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      33 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      34 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      35 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      36 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      37 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      38 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      39 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      40 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      41 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      42 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      43 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      44 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      45 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      46 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      47 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      48 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      49 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      50 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      51 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      52 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      53 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      54 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      55 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      56 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      57 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      58 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      59 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      60 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      61 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      62 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      63 -> androidx.compose.material3.ElevatedFilterChip(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
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
      (if (node.has("border")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
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
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
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
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("icon")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      3 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      4 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      5 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      6 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      7 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      9 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      10 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      11 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      12 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      13 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      14 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      15 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      16 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.ElevatedSuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
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
      (if (node.has("border")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
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
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ElevatedToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
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
      (if (node.has("border")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
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
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
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
