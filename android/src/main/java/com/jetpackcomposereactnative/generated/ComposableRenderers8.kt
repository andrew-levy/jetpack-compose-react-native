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

// androidx.compose.material3.OutlinedTextField(value: androidx.compose.ui.text.input.TextFieldValue, onValueChange: kotlin.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, label: kotlin.Function0<kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, isError: kotlin.Boolean, visualTransformation: androidx.compose.ui.text.input.VisualTransformation, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, keyboardActions: androidx.compose.foundation.text.KeyboardActions, singleLine: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors)
internal object RendererOutlinedTextField_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("textStyle")) 4 else 0) +
      (if (node.has("label")) 8 else 0) +
      (if (node.has("placeholder")) 16 else 0) +
      (if (node.has("leadingIcon")) 32 else 0) +
      (if (node.has("trailingIcon")) 64 else 0) +
      (if (node.has("prefix")) 128 else 0) +
      (if (node.has("suffix")) 256 else 0) +
      (if (node.has("supportingText")) 512 else 0) +
      (if (node.has("isError")) 1024 else 0) +
      (if (node.has("visualTransformation")) 2048 else 0) +
      (if (node.has("keyboardOptions")) 4096 else 0) +
      (if (node.has("keyboardActions")) 8192 else 0) +
      (if (node.has("singleLine")) 16384 else 0) +
      (if (node.has("maxLines")) 32768 else 0) +
      (if (node.has("minLines")) 65536 else 0) +
      (if (node.has("interactionSource")) 131072 else 0) +
      (if (node.has("shape")) 262144 else 0)
    when (mask / 32) {
      0 -> renderOutlinedTextField_1Group0(node, scope, mask)
      1 -> renderOutlinedTextField_1Group1(node, scope, mask)
      2 -> renderOutlinedTextField_1Group2(node, scope, mask)
      3 -> renderOutlinedTextField_1Group3(node, scope, mask)
      4 -> renderOutlinedTextField_1Group4(node, scope, mask)
      5 -> renderOutlinedTextField_1Group5(node, scope, mask)
      6 -> renderOutlinedTextField_1Group6(node, scope, mask)
      7 -> renderOutlinedTextField_1Group7(node, scope, mask)
      8 -> renderOutlinedTextField_1Group8(node, scope, mask)
      9 -> renderOutlinedTextField_1Group9(node, scope, mask)
      10 -> renderOutlinedTextField_1Group10(node, scope, mask)
      11 -> renderOutlinedTextField_1Group11(node, scope, mask)
      12 -> renderOutlinedTextField_1Group12(node, scope, mask)
      13 -> renderOutlinedTextField_1Group13(node, scope, mask)
      14 -> renderOutlinedTextField_1Group14(node, scope, mask)
      15 -> renderOutlinedTextField_1Group15(node, scope, mask)
      16 -> renderOutlinedTextField_1Group16(node, scope, mask)
      17 -> renderOutlinedTextField_1Group17(node, scope, mask)
      18 -> renderOutlinedTextField_1Group18(node, scope, mask)
      19 -> renderOutlinedTextField_1Group19(node, scope, mask)
      20 -> renderOutlinedTextField_1Group20(node, scope, mask)
      21 -> renderOutlinedTextField_1Group21(node, scope, mask)
      22 -> renderOutlinedTextField_1Group22(node, scope, mask)
      23 -> renderOutlinedTextField_1Group23(node, scope, mask)
      32 -> renderOutlinedTextField_1Group32(node, scope, mask)
      33 -> renderOutlinedTextField_1Group33(node, scope, mask)
      34 -> renderOutlinedTextField_1Group34(node, scope, mask)
      35 -> renderOutlinedTextField_1Group35(node, scope, mask)
      36 -> renderOutlinedTextField_1Group36(node, scope, mask)
      37 -> renderOutlinedTextField_1Group37(node, scope, mask)
      38 -> renderOutlinedTextField_1Group38(node, scope, mask)
      39 -> renderOutlinedTextField_1Group39(node, scope, mask)
      64 -> renderOutlinedTextField_1Group64(node, scope, mask)
      128 -> renderOutlinedTextField_1Group128(node, scope, mask)
      192 -> renderOutlinedTextField_1Group192(node, scope, mask)
      256 -> renderOutlinedTextField_1Group256(node, scope, mask)
      320 -> renderOutlinedTextField_1Group320(node, scope, mask)
      384 -> renderOutlinedTextField_1Group384(node, scope, mask)
      448 -> renderOutlinedTextField_1Group448(node, scope, mask)
      512 -> renderOutlinedTextField_1Group512(node, scope, mask)
      513 -> renderOutlinedTextField_1Group513(node, scope, mask)
      514 -> renderOutlinedTextField_1Group514(node, scope, mask)
      515 -> renderOutlinedTextField_1Group515(node, scope, mask)
      516 -> renderOutlinedTextField_1Group516(node, scope, mask)
      517 -> renderOutlinedTextField_1Group517(node, scope, mask)
      518 -> renderOutlinedTextField_1Group518(node, scope, mask)
      519 -> renderOutlinedTextField_1Group519(node, scope, mask)
      576 -> renderOutlinedTextField_1Group576(node, scope, mask)
      704 -> renderOutlinedTextField_1Group704(node, scope, mask)
      832 -> renderOutlinedTextField_1Group832(node, scope, mask)
      960 -> renderOutlinedTextField_1Group960(node, scope, mask)
      1024 -> renderOutlinedTextField_1Group1024(node, scope, mask)
      1025 -> renderOutlinedTextField_1Group1025(node, scope, mask)
      1026 -> renderOutlinedTextField_1Group1026(node, scope, mask)
      1027 -> renderOutlinedTextField_1Group1027(node, scope, mask)
      1028 -> renderOutlinedTextField_1Group1028(node, scope, mask)
      1029 -> renderOutlinedTextField_1Group1029(node, scope, mask)
      1030 -> renderOutlinedTextField_1Group1030(node, scope, mask)
      1031 -> renderOutlinedTextField_1Group1031(node, scope, mask)
      2048 -> renderOutlinedTextField_1Group2048(node, scope, mask)
      2049 -> renderOutlinedTextField_1Group2049(node, scope, mask)
      2050 -> renderOutlinedTextField_1Group2050(node, scope, mask)
      2051 -> renderOutlinedTextField_1Group2051(node, scope, mask)
      2052 -> renderOutlinedTextField_1Group2052(node, scope, mask)
      2053 -> renderOutlinedTextField_1Group2053(node, scope, mask)
      2054 -> renderOutlinedTextField_1Group2054(node, scope, mask)
      2055 -> renderOutlinedTextField_1Group2055(node, scope, mask)
      4096 -> renderOutlinedTextField_1Group4096(node, scope, mask)
      4097 -> renderOutlinedTextField_1Group4097(node, scope, mask)
      8192 -> renderOutlinedTextField_1Group8192(node, scope, mask)
      8193 -> renderOutlinedTextField_1Group8193(node, scope, mask)
      8194 -> renderOutlinedTextField_1Group8194(node, scope, mask)
      8195 -> renderOutlinedTextField_1Group8195(node, scope, mask)
      8196 -> renderOutlinedTextField_1Group8196(node, scope, mask)
      8197 -> renderOutlinedTextField_1Group8197(node, scope, mask)
      8198 -> renderOutlinedTextField_1Group8198(node, scope, mask)
      8199 -> renderOutlinedTextField_1Group8199(node, scope, mask)
      11839 -> renderOutlinedTextField_1Group11839(node, scope, mask)
      15935 -> renderOutlinedTextField_1Group15935(node, scope, mask)
      16063 -> renderOutlinedTextField_1Group16063(node, scope, mask)
      16191 -> renderOutlinedTextField_1Group16191(node, scope, mask)
      16319 -> renderOutlinedTextField_1Group16319(node, scope, mask)
      16383 -> renderOutlinedTextField_1Group16383(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
      )
      3 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
      )
      4 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      5 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      6 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      7 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      8 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      9 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      10 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      11 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      12 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      13 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      14 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      15 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      16 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      17 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      18 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      19 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      20 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      21 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      22 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      23 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      24 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      25 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      26 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      27 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      28 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      29 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      30 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      31 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      33 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      34 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      35 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      36 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      37 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      38 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      39 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      40 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      41 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      42 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      43 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      44 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      45 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      46 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      47 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      48 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      49 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      50 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      51 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      52 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      53 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      54 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      55 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      56 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      57 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      58 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      59 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      60 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      61 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      62 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      63 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      65 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      66 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      67 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      68 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      69 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      70 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      71 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      72 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      73 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      74 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      75 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      76 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      77 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      78 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      79 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      80 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      81 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      82 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      83 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      84 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      85 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      86 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      87 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      88 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      89 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      90 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      91 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      92 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      93 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      94 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      95 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      97 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      98 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      99 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      100 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      101 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      102 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      103 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      104 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      105 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      106 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      107 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      108 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      109 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      110 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      111 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      112 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      113 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      114 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      115 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      116 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      117 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      118 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      119 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      120 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      121 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      122 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      123 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      124 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      125 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      126 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      127 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      129 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      130 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      131 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      132 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      133 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      134 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      135 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      136 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      137 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      138 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      139 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      140 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      141 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      142 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      143 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      144 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      145 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      146 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      147 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      148 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      149 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      150 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      151 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      152 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      153 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      154 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      155 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      156 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      157 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      158 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      159 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      161 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      162 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      163 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      164 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      165 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      166 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      167 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      168 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      169 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      170 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      171 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      172 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      173 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      174 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      175 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      176 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      177 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      178 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      179 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      180 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      181 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      182 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      183 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      184 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      185 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      186 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      187 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      188 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      189 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      190 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      191 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      193 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      194 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      195 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      196 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      197 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      198 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      199 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      200 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      201 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      202 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      203 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      204 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      205 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      206 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      207 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      208 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      209 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      210 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      211 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      212 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      213 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      214 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      215 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      216 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      217 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      218 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      219 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      220 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      221 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      222 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      223 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      225 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      226 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      227 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      228 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      229 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      230 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      231 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      232 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      233 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      234 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      235 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      236 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      237 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      238 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      239 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      240 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      241 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      242 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      243 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      244 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      245 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      246 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      247 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      248 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      249 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      250 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      251 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      252 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      253 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      254 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      255 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group8(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      256 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      257 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      258 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      259 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      264 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      265 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      266 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      267 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      272 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      273 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      274 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      275 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      280 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      281 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      282 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      283 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group9(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      288 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      289 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      290 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      291 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      296 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      297 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      298 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      299 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      304 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      305 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      306 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      307 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      312 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      313 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      314 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      315 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group10(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      320 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      321 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      322 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      323 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      328 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      329 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      330 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      331 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      336 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      337 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      338 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      339 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      344 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      345 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      346 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      347 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group11(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      352 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      353 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      354 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      355 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      360 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      361 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      362 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      363 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      368 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      369 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      370 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      371 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      376 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      377 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      378 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      379 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group12(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      384 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      385 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      386 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      387 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      392 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      393 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      394 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      395 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      400 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      401 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      402 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      403 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      408 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      409 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      410 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      411 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group13(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      416 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      417 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      418 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      419 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      424 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      425 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      426 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      427 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      432 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      433 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      434 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      435 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      440 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      441 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      442 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      443 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group14(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      448 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      449 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      450 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      451 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      456 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      457 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      458 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      459 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      464 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      465 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      466 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      467 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      472 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      473 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      474 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      475 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group15(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      480 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      481 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      482 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      483 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      488 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      489 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      490 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      491 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      496 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      497 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      498 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      499 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      504 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      505 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      506 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      507 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group16(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      512 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      513 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      514 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      515 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      520 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      521 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      522 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      523 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      528 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      529 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      530 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      531 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      536 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      537 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      538 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      539 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      544 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      545 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      546 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      547 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      552 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      553 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      554 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      555 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      560 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      561 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      562 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      563 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      568 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      569 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      570 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      571 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group18(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      576 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      577 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      578 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      579 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      584 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      585 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      586 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      587 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      592 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      593 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      594 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      595 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      600 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      601 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      602 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      603 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group19(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      608 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      609 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      610 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      611 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      616 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      617 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      618 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      619 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      624 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      625 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      626 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      627 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      632 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      633 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      634 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      635 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group20(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      640 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      641 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      642 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      643 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      648 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      649 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      650 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      651 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      656 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      657 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      658 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      659 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      664 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      665 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      666 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      667 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group21(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      672 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      673 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      674 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      675 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      680 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      681 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      682 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      683 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      688 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      689 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      690 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      691 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      696 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      697 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      698 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      699 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group22(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      704 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      705 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      706 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      707 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      712 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      713 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      714 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      715 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      720 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      721 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      722 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      723 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      728 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      729 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      730 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      731 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group23(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      736 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      737 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      738 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      739 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      744 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      745 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      746 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      747 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      752 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      753 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      754 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      755 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      760 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      761 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      762 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      763 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1024 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `isError` = node.boolean("isError"),
      )
      1025 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
      )
      1026 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `isError` = node.boolean("isError"),
      )
      1027 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `isError` = node.boolean("isError"),
      )
      1032 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `isError` = node.boolean("isError"),
      )
      1033 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `isError` = node.boolean("isError"),
      )
      1034 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `isError` = node.boolean("isError"),
      )
      1035 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `isError` = node.boolean("isError"),
      )
      1040 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1041 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1042 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1043 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1048 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1049 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1050 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      1051 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group33(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1056 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1057 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1058 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1059 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1064 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1065 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1066 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1067 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1072 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1073 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1074 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1075 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1080 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1081 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1082 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1083 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group34(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1088 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1089 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1090 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1091 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1096 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1097 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1098 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1099 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1104 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1105 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1106 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1107 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1112 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1113 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1114 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1115 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group35(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1120 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1121 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1122 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1123 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1128 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1129 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1130 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1131 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1136 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1137 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1138 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1139 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1144 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1145 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1146 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      1147 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group36(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1152 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1153 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1154 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1155 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1160 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1161 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1162 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1163 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1168 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1169 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1170 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1171 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1176 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1177 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1178 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1179 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group37(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1184 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1185 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1186 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1187 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1192 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1193 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1194 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1195 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1200 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1201 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1202 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1203 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1208 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1209 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1210 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1211 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group38(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1216 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1217 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1218 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1219 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1224 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1225 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1226 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1227 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1232 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1233 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1234 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1235 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1240 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1241 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1242 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1243 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group39(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1248 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1249 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1250 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1251 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1256 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1257 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1258 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1259 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1264 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1265 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1266 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1267 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1272 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1273 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1274 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      1275 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `isError` = node.boolean("isError"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group64(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2048 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      2049 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group128(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4096 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4097 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4098 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4099 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4104 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4105 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4106 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4107 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4112 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4113 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4114 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4115 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4120 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4121 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4122 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      4123 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group192(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6144 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      6145 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group256(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8192 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8193 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8194 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8195 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8200 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8201 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8202 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8203 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8208 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8209 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8210 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8211 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8216 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8217 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8218 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      8219 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group320(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      10240 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      10241 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group384(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      12288 -> androidx.compose.material3.OutlinedTextField(
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
  private fun renderOutlinedTextField_1Group448(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      14336 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      14337 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group512(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16384 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `singleLine` = node.boolean("singleLine"),
      )
      16385 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `singleLine` = node.boolean("singleLine"),
      )
      16386 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
      )
      16387 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `singleLine` = node.boolean("singleLine"),
      )
      16392 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16393 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16394 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16395 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16400 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16401 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16402 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16403 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16408 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16409 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16410 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16411 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group513(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16416 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16417 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16418 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16419 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16424 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16425 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16426 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16427 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16432 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16433 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16434 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16435 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16440 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16441 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16442 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16443 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group514(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16448 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16449 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16450 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16451 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16456 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16457 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16458 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16459 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16464 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16465 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16466 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16467 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16472 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16473 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16474 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16475 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group515(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16480 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16481 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16482 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16483 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16488 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16489 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16490 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16491 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16496 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16497 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16498 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16499 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16504 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16505 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16506 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16507 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group516(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16512 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16513 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16514 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16515 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16520 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16521 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16522 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16523 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16528 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16529 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16530 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16531 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16536 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16537 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16538 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16539 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group517(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16544 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16545 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16546 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16547 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16552 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16553 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16554 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16555 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16560 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16561 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16562 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16563 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16568 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16569 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16570 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16571 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group518(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16576 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16577 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16578 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16579 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16584 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16585 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16586 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16587 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16592 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16593 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16594 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16595 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16600 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16601 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16602 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16603 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group519(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16608 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16609 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16610 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16611 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16616 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16617 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16618 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16619 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16624 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16625 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16626 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16627 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16632 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16633 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16634 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      16635 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group576(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18432 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `singleLine` = node.boolean("singleLine"),
      )
      18433 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group704(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22528 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
      )
      22529 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group832(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      26624 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      26625 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group960(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      30720 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      30721 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group1024(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32768 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32769 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32770 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32771 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32776 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32777 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32778 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32779 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32784 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32785 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32786 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32787 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32792 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32793 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32794 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32795 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group1025(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32800 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32801 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32802 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32803 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32808 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32809 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32810 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32811 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32816 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32817 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32818 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32819 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32824 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32825 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32826 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32827 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group1026(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32832 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32833 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32834 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32835 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32840 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32841 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32842 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32843 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32848 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32849 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32850 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32851 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32856 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32857 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32858 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32859 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group1027(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32864 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32865 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32866 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32867 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32872 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32873 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32874 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32875 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32880 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32881 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32882 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32883 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32888 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32889 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32890 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32891 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group1028(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32896 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32897 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32898 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32899 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32904 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32905 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32906 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32907 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32912 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32913 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32914 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32915 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32920 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32921 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32922 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32923 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group1029(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32928 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32929 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32930 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32931 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32936 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32937 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32938 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32939 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32944 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32945 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32946 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32947 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32952 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32953 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32954 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32955 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group1030(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32960 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32961 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32962 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32963 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32968 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32969 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32970 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32971 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32976 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32977 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32978 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32979 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32984 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32985 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32986 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32987 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group1031(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32992 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32993 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32994 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      32995 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33000 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33001 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33002 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33003 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33008 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33009 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33010 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33011 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33016 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33017 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33018 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      33019 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group2048(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65536 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
      )
      65537 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `minLines` = node.number("minLines").toInt(),
      )
      65538 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
      )
      65539 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `minLines` = node.number("minLines").toInt(),
      )
      65544 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65545 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65546 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65547 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65552 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65553 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65554 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65555 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65560 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65561 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65562 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65563 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group2049(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65568 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65569 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65570 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65571 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65576 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65577 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65578 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65579 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65584 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65585 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65586 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65587 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65592 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65593 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65594 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65595 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group2050(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65600 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65601 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65602 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65603 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65608 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65609 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65610 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65611 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65616 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65617 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65618 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65619 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65624 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65625 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65626 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65627 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group2051(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65632 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65633 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65634 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65635 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65640 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65641 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65642 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65643 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65648 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65649 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65650 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65651 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65656 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65657 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65658 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65659 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group2052(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65664 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65665 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65666 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65667 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65672 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65673 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65674 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65675 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65680 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65681 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65682 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65683 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65688 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65689 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65690 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65691 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group2053(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65696 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65697 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65698 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65699 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65704 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65705 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65706 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65707 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65712 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65713 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65714 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65715 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65720 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65721 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65722 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65723 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group2054(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65728 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65729 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65730 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65731 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65736 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65737 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65738 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65739 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65744 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65745 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65746 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65747 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65752 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65753 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65754 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65755 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group2055(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65760 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65761 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65762 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65763 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65768 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65769 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65770 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65771 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65776 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65777 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65778 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65779 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65784 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65785 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65786 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      65787 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group4096(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      131072 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131073 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131074 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131075 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131076 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131077 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131078 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131079 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131080 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131081 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131082 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131083 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131084 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131085 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131086 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131087 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131088 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131089 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131090 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131091 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131092 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131093 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131094 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131095 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131096 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131097 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131098 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131099 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131100 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131101 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131102 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131103 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group4097(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      131104 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131105 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131106 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131107 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131108 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131109 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131110 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131111 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131112 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131113 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131114 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131115 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131116 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131117 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131118 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131119 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131120 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131121 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131122 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131123 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131124 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131125 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131126 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131127 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131128 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131129 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131130 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131131 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131132 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131133 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131134 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      131135 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group8192(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      262144 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      262145 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      262146 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      262147 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      262152 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262153 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262154 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262155 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262160 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262161 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262162 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262163 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262168 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262169 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262170 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262171 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group8193(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      262176 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262177 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262178 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262179 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262184 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262185 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262186 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262187 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262192 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262193 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262194 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262195 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262200 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262201 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262202 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262203 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group8194(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      262208 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262209 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262210 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262211 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262216 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262217 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262218 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262219 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262224 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262225 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262226 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262227 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262232 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262233 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262234 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262235 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group8195(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      262240 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262241 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262242 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262243 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262248 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262249 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262250 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262251 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262256 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262257 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262258 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262259 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262264 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262265 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262266 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262267 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group8196(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      262272 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262273 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262274 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262275 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262280 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262281 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262282 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262283 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262288 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262289 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262290 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262291 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262296 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262297 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262298 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262299 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group8197(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      262304 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262305 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262306 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262307 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262312 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262313 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262314 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262315 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262320 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262321 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262322 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262323 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262328 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262329 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262330 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262331 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group8198(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      262336 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262337 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262338 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262339 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262344 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262345 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262346 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262347 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262352 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262353 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262354 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262355 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262360 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262361 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262362 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262363 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group8199(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      262368 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262369 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262370 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262371 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262376 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262377 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262378 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262379 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262384 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262385 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262386 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262387 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262392 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262393 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262394 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      262395 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group11839(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      378875 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `shape` = node.arguments().shape("shape"),
      )
      378879 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group15935(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      509951 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group16063(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      514047 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group16191(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      518143 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group16319(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      522239 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedTextField_1Group16383(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      524287 -> androidx.compose.material3.OutlinedTextField(
        `value` = node.jsonObject("value").toComposeTextFieldValue(),
        `onValueChange` = { value: androidx.compose.ui.text.input.TextFieldValue -> node.emit("onValueChange", value.toComposeSnapshot()) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `visualTransformation` = node.jsonObject("visualTransformation").toComposeVisualTransformation(),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `keyboardActions` = node.jsonObject("keyboardActions").toComposeKeyboardActions(node.arguments()),
        `singleLine` = node.boolean("singleLine"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
