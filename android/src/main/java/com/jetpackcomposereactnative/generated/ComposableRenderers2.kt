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

// androidx.compose.foundation.text.BasicTextField(value: kotlin.String, onValueChange: kotlin.Function1<kotlin.String, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, keyboardActions: androidx.compose.foundation.text.KeyboardActions, singleLine: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, visualTransformation: androidx.compose.ui.text.input.VisualTransformation, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, cursorBrush: androidx.compose.ui.graphics.Brush, decorationBox: kotlin.Function1<kotlin.Function0<kotlin.Unit>, kotlin.Unit>)
internal object RendererBasicTextField_2 {
  private fun decode_value(node: ComposeNode) = node.string("value")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_readOnly(node: ComposeNode) = node.boolean("readOnly")
  private fun decode_singleLine(node: ComposeNode) = node.boolean("singleLine")
  private fun decode_maxLines(node: ComposeNode) = node.number("maxLines").toInt()
  private fun decode_minLines(node: ComposeNode) = node.number("minLines").toInt()

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
      (if (node.has("onTextLayout")) 512 else 0) +
      (if (node.has("interactionSource")) 1024 else 0) +
      (if (node.has("cursorBrush")) 2048 else 0) +
      (if (node.has("decorationBox")) 4096 else 0)
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
      32 -> renderBasicTextField_2Group32(node, scope, mask)
      33 -> renderBasicTextField_2Group33(node, scope, mask)
      34 -> renderBasicTextField_2Group34(node, scope, mask)
      35 -> renderBasicTextField_2Group35(node, scope, mask)
      36 -> renderBasicTextField_2Group36(node, scope, mask)
      37 -> renderBasicTextField_2Group37(node, scope, mask)
      38 -> renderBasicTextField_2Group38(node, scope, mask)
      39 -> renderBasicTextField_2Group39(node, scope, mask)
      64 -> renderBasicTextField_2Group64(node, scope, mask)
      65 -> renderBasicTextField_2Group65(node, scope, mask)
      66 -> renderBasicTextField_2Group66(node, scope, mask)
      67 -> renderBasicTextField_2Group67(node, scope, mask)
      68 -> renderBasicTextField_2Group68(node, scope, mask)
      69 -> renderBasicTextField_2Group69(node, scope, mask)
      70 -> renderBasicTextField_2Group70(node, scope, mask)
      71 -> renderBasicTextField_2Group71(node, scope, mask)
      96 -> renderBasicTextField_2Group96(node, scope, mask)
      97 -> renderBasicTextField_2Group97(node, scope, mask)
      98 -> renderBasicTextField_2Group98(node, scope, mask)
      99 -> renderBasicTextField_2Group99(node, scope, mask)
      100 -> renderBasicTextField_2Group100(node, scope, mask)
      101 -> renderBasicTextField_2Group101(node, scope, mask)
      102 -> renderBasicTextField_2Group102(node, scope, mask)
      103 -> renderBasicTextField_2Group103(node, scope, mask)
      111 -> renderBasicTextField_2Group111(node, scope, mask)
      127 -> renderBasicTextField_2Group127(node, scope, mask)
      128 -> renderBasicTextField_2Group128(node, scope, mask)
      129 -> renderBasicTextField_2Group129(node, scope, mask)
      130 -> renderBasicTextField_2Group130(node, scope, mask)
      131 -> renderBasicTextField_2Group131(node, scope, mask)
      144 -> renderBasicTextField_2Group144(node, scope, mask)
      239 -> renderBasicTextField_2Group239(node, scope, mask)
      255 -> renderBasicTextField_2Group255(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node))
      3 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node))
      4 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      5 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      6 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      7 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      8 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      9 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      10 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      11 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      16 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()))
      17 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()))
      18 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()))
      19 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()))
      24 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node))
      33 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node))
      34 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node))
      35 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node))
      36 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node))
      37 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node))
      38 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node))
      39 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node))
      40 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node))
      41 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node))
      42 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node))
      43 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node))
      48 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node))
      49 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node))
      50 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node))
      51 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node))
      65 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node))
      66 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node))
      67 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node))
      68 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node))
      69 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node))
      70 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node))
      71 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node))
      72 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `maxLines` = decode_maxLines(node))
      73 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `maxLines` = decode_maxLines(node))
      74 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `maxLines` = decode_maxLines(node))
      75 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `maxLines` = decode_maxLines(node))
      80 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `maxLines` = decode_maxLines(node))
      81 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `maxLines` = decode_maxLines(node))
      82 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `maxLines` = decode_maxLines(node))
      83 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      97 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      98 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      99 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      100 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      101 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      102 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      103 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      104 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      105 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      106 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      107 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      112 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      113 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      114 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      115 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node))
      129 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `minLines` = decode_minLines(node))
      130 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node))
      131 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node))
      132 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node))
      133 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node))
      134 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node))
      135 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      161 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      162 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      163 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      164 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      165 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      166 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      167 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      193 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      194 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      195 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      196 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      197 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      198 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      199 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      225 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      226 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      227 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      228 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      229 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      230 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      231 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group8(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      256 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      257 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      264 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      265 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      272 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      273 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      280 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      281 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group9(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      288 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      289 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      296 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      297 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      304 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      305 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      312 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      313 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group16(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      512 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      513 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      514 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      515 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      516 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      517 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      518 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      519 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      544 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      545 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      546 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      547 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      548 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      549 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      550 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      551 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group18(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      576 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      577 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      578 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      579 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      580 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      581 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      582 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      583 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group19(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      608 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      609 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      610 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      611 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      612 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      613 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      614 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      615 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1024 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1025 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1026 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1027 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1028 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1029 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1030 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1031 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group33(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1056 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1057 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1058 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1059 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1060 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1061 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1062 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1063 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group34(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1088 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1089 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1090 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1091 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1092 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1093 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1094 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1095 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group35(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1120 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1121 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1122 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1123 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1124 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1125 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1126 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1127 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group36(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1152 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1153 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1154 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1155 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1156 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1157 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1158 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1159 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group37(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1184 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1185 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1186 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1187 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1188 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1189 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1190 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1191 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group38(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1216 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1217 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1218 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1219 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1220 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1221 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1222 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1223 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group39(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1248 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1249 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1250 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1251 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1252 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1253 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1254 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      1255 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group64(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2048 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2049 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2050 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2051 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2052 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2053 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2054 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2055 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group65(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2080 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2081 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2082 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2083 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2084 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2085 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2086 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2087 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group66(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2112 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2113 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2114 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2115 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2116 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2117 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2118 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2119 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group67(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2144 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2145 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2146 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2147 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2148 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2149 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2150 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2151 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group68(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2176 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2177 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2178 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2179 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2180 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2181 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2182 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2183 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group69(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2208 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2209 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2210 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2211 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2212 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2213 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2214 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2215 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group70(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2240 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2241 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2242 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2243 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2244 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2245 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2246 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2247 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group71(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2272 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2273 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2274 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2275 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2276 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2277 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2278 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      2279 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group96(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3072 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3073 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3074 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3075 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3076 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3077 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3078 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3079 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group97(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3104 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3105 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3106 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3107 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3108 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3109 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3110 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3111 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group98(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3136 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3137 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3138 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3139 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3140 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3141 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3142 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3143 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group99(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3168 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3169 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3170 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3171 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3172 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3173 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3174 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3175 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group100(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3200 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3201 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3202 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3203 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3204 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3205 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3206 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3207 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group101(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3232 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3233 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3234 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3235 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3236 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3237 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3238 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3239 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group102(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3264 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3265 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3266 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3267 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3268 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3269 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3270 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3271 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group103(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3296 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3297 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3298 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3299 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3300 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3301 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3302 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3303 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3311 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3319 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      3327 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group111(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3583 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group127(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4095 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group128(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4096 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4097 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4098 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4099 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4100 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4101 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4102 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4103 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group129(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4128 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4129 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4130 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4131 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4132 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4133 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4134 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4135 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group130(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4160 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4161 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4162 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4163 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4164 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4165 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4166 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4167 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group131(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4192 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4193 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4194 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4195 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4196 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4197 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4198 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      4199 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group144(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4608 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group239(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7679 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBasicTextField_2Group255(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8191 -> androidx.compose.foundation.text.BasicTextField(`value` = decode_value(node), `onValueChange` = { value: String -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `readOnly` = decode_readOnly(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()), `singleLine` = decode_singleLine(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `cursorBrush` = node.arguments().brush("cursorBrush"), `decorationBox` = { inner -> RenderComposeDecoration(node.slot("decorationBox"), inner) })
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
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_tonalElevation(node: ComposeNode) = node.number("tonalElevation").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val content_floatingActionButton: @Composable () -> Unit = { RenderComposeChildren(node.slot("floatingActionButton")) }
    val slot_floatingActionButton = if (node.isNull("floatingActionButton")) null else content_floatingActionButton
    val mask = (if (node.has("floatingActionButton")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("tonalElevation")) 8 else 0) +
      (if (node.has("contentPadding")) 16 else 0) +
      (if (node.has("windowInsets")) 32 else 0)
    when (mask / 32) {
      0 -> renderBottomAppBar_1Group0(node, scope, mask, slot_floatingActionButton)
      1 -> renderBottomAppBar_1Group1(node, scope, mask, slot_floatingActionButton)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBottomAppBar_1Group0(node: ComposeNode, scope: Any?, mask: Int, slot_floatingActionButton: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton)
      2 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node))
      3 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node))
      4 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node))
      5 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node))
      6 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      7 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node))
      8 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node))
      9 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `tonalElevation` = decode_tonalElevation(node))
      10 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node))
      11 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node))
      12 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node))
      13 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node))
      14 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node))
      15 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node))
      16 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      17 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      18 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      19 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      20 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      21 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      22 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      23 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      24 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      25 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      26 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      27 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      28 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      29 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      30 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      31 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderBottomAppBar_1Group1(node: ComposeNode, scope: Any?, mask: Int, slot_floatingActionButton: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      33 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      34 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      35 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      36 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      37 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      38 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      39 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      40 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      41 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `tonalElevation` = decode_tonalElevation(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      42 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      43 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      44 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      45 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      46 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      47 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      48 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      49 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      50 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      51 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      52 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      53 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      54 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      55 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      56 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      57 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      58 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      59 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      60 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      61 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      62 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      63 -> androidx.compose.material3.BottomAppBar(`actions` = { RenderComposeChildren(node.slot("actions"), this) }, `modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tonalElevation` = decode_tonalElevation(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.BottomSheetScaffold(sheetContent: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, scaffoldState: androidx.compose.material3.BottomSheetScaffoldState, sheetPeekHeight: androidx.compose.ui.unit.Dp, sheetMaxWidth: androidx.compose.ui.unit.Dp, sheetShape: androidx.compose.ui.graphics.Shape, sheetContainerColor: androidx.compose.ui.graphics.Color, sheetContentColor: androidx.compose.ui.graphics.Color, sheetTonalElevation: androidx.compose.ui.unit.Dp, sheetShadowElevation: androidx.compose.ui.unit.Dp, sheetDragHandle: kotlin.Function0<kotlin.Unit>?, sheetSwipeEnabled: kotlin.Boolean, topBar: kotlin.Function0<kotlin.Unit>?, snackbarHost: kotlin.Function1<androidx.compose.material3.SnackbarHostState, kotlin.Unit>, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, content: kotlin.Function1<androidx.compose.foundation.layout.PaddingValues, kotlin.Unit>)
internal object RendererBottomSheetScaffold {
  private fun decode_sheetPeekHeight(node: ComposeNode) = node.number("sheetPeekHeight").dp
  private fun decode_sheetMaxWidth(node: ComposeNode) = node.number("sheetMaxWidth").dp
  private fun decode_sheetContainerColor(node: ComposeNode) = node.color("sheetContainerColor")
  private fun decode_sheetContentColor(node: ComposeNode) = node.color("sheetContentColor")
  private fun decode_sheetTonalElevation(node: ComposeNode) = node.number("sheetTonalElevation").dp
  private fun decode_sheetShadowElevation(node: ComposeNode) = node.number("sheetShadowElevation").dp
  private fun decode_sheetSwipeEnabled(node: ComposeNode) = node.boolean("sheetSwipeEnabled")
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scaffoldStateValue = if (node.has("scaffoldState") && !node.isNull("scaffoldState")) node.jsonObject("scaffoldState").rememberComposeBottomSheetScaffoldState(node.arguments()) else null
    val content_sheetDragHandle: @Composable () -> Unit = { RenderComposeChildren(node.slot("sheetDragHandle")) }
    val slot_sheetDragHandle = if (node.isNull("sheetDragHandle")) null else content_sheetDragHandle
    val content_topBar: @Composable () -> Unit = { RenderComposeChildren(node.slot("topBar")) }
    val slot_topBar = if (node.isNull("topBar")) null else content_topBar
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
      0 -> renderBottomSheetScaffoldGroup0(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      1 -> renderBottomSheetScaffoldGroup1(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      2 -> renderBottomSheetScaffoldGroup2(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      3 -> renderBottomSheetScaffoldGroup3(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      4 -> renderBottomSheetScaffoldGroup4(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      5 -> renderBottomSheetScaffoldGroup5(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      8 -> renderBottomSheetScaffoldGroup8(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      9 -> renderBottomSheetScaffoldGroup9(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      16 -> renderBottomSheetScaffoldGroup16(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      17 -> renderBottomSheetScaffoldGroup17(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      32 -> renderBottomSheetScaffoldGroup32(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      33 -> renderBottomSheetScaffoldGroup33(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      64 -> renderBottomSheetScaffoldGroup64(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      65 -> renderBottomSheetScaffoldGroup65(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      128 -> renderBottomSheetScaffoldGroup128(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      129 -> renderBottomSheetScaffoldGroup129(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      255 -> renderBottomSheetScaffoldGroup255(node, scope, mask, scaffoldStateValue, slot_sheetDragHandle, slot_topBar)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup0(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      3 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetPeekHeight` = decode_sheetPeekHeight(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      5 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetMaxWidth` = decode_sheetMaxWidth(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      6 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      7 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      8 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetShape` = node.arguments().shape("sheetShape"), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      10 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetShape` = node.arguments().shape("sheetShape"), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      12 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetShape` = node.arguments().shape("sheetShape"), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      14 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetShape` = node.arguments().shape("sheetShape"), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      16 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      17 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      18 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      19 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      20 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      21 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      22 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      23 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      24 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      26 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      28 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      30 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContainerColor` = decode_sheetContainerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup1(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      33 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      34 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      35 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      36 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      37 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      38 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      39 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      40 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      42 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      44 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      46 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      48 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      49 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      50 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      51 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      52 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      53 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      54 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      55 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      56 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      58 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      60 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      62 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup2(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      66 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      68 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      70 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      80 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      82 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      84 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      86 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup3(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContentColor` = decode_sheetContentColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      98 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      100 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      102 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      112 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      114 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      116 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      118 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup4(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      130 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      132 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      134 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      144 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      146 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      148 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      150 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup5(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      160 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContentColor` = decode_sheetContentColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      162 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      164 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      166 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      176 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      178 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      180 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      182 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup8(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      256 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      258 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      260 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      262 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      272 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      274 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      276 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      278 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup9(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      288 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContentColor` = decode_sheetContentColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      290 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      292 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      294 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      304 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      306 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      308 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      310 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetDragHandle` = slot_sheetDragHandle, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup16(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      512 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      514 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      516 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      518 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      528 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      530 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      532 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      534 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup17(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      544 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContentColor` = decode_sheetContentColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      546 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      548 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      550 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      560 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      562 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      564 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      566 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup32(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      1024 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1026 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1028 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1030 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1040 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1042 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1044 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1046 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup33(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      1056 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContentColor` = decode_sheetContentColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1058 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContentColor` = decode_sheetContentColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1060 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1062 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1072 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1074 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1076 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1078 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup64(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      2048 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2050 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2052 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2054 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2064 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2066 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2068 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2070 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup65(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      2080 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContentColor` = decode_sheetContentColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2082 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContentColor` = decode_sheetContentColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2084 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2086 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2096 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2098 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2100 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2102 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup128(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      4096 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4098 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4100 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4102 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4112 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4114 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4116 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4118 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup129(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      4128 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContentColor` = decode_sheetContentColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4130 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContentColor` = decode_sheetContentColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4132 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4134 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContentColor` = decode_sheetContentColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4144 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4146 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4148 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4150 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderBottomSheetScaffoldGroup255(node: ComposeNode, scope: Any?, mask: Int, scaffoldStateValue: androidx.compose.material3.BottomSheetScaffoldState?, slot_sheetDragHandle: (@Composable () -> Unit)?, slot_topBar: (@Composable () -> Unit)?) {
    when (mask) {
      8191 -> androidx.compose.material3.BottomSheetScaffold(`sheetContent` = { RenderComposeChildren(node.slot("sheetContent"), this) }, `modifier` = node.modifier("modifier", scope), `scaffoldState` = requireNotNull(scaffoldStateValue), `sheetPeekHeight` = decode_sheetPeekHeight(node), `sheetMaxWidth` = decode_sheetMaxWidth(node), `sheetShape` = node.arguments().shape("sheetShape"), `sheetContainerColor` = decode_sheetContainerColor(node), `sheetContentColor` = decode_sheetContentColor(node), `sheetTonalElevation` = decode_sheetTonalElevation(node), `sheetShadowElevation` = decode_sheetShadowElevation(node), `sheetDragHandle` = slot_sheetDragHandle, `sheetSwipeEnabled` = decode_sheetSwipeEnabled(node), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
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
      (if (node.has("border")) 4 else 0)
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
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.Card(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
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
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
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
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.Card(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
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
